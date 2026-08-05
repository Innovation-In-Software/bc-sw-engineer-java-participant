# Lab 20 — Detailed solution (instructor / shared after class)

> **Audience:** Instructors and participants when the instructor releases `solution/`.  
> **Do not open this during the timed path** unless your instructor says so.  
> Timed starter card: [`../starter/README.md`](../starter/README.md) · Full steps: [`../LAB-20-GUIDE.md`](../LAB-20-GUIDE.md)

## Goal

**SLF4J / MDC correlation**

## What you should end with

| Check | Expected |
| --- | --- |
| Verify command | `mvn -B clean test` |
| Suite / smoke | Tests run: 1 (CustomerLoggingIT) |
| Workspace copy (optional) | `%USERPROFILE%\java-bootcamp\examples\lab20-crm` from this `solution/` |

## Solution tree (key files)

### Java / sources
- `src/main/java/com/northstar/crm/CrmApplication.java`
- `src/main/java/com/northstar/crm/model/Customer.java`
- `src/main/java/com/northstar/crm/repository/CustomerRepository.java`
- `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/main/java/com/northstar/crm/api/CustomerController.java`
- `src/main/java/com/northstar/crm/logging/CorrelationFilter.java`
- `src/test/java/com/northstar/crm/logging/CustomerLoggingIT.java`

### Docs / contracts
- `logging.md`

## How this maps to the GUIDE

1. Copy `starter/` → `examples/lab20-crm` (timed path) **or** use this `solution/` as the completed reference.
2. Every `// TODO` in the starter has a filled implementation here — compare file-by-file with your work.
3. Run the verify command above from the project root (this folder or your `lab20-crm` copy).
4. Keep `docs/` notes that the GUIDE names (smells, isolation policy, monitoring report, etc.).

## Instructor notes (short)

# Lab 20 solution notes

## What / why

Structured Logback pattern with MDC keys `corr` / `cust` / `op`, `CorrelationFilter` that defaults and echoes `X-Correlation-Id` and clears MDC in `finally`, plus PII-free service INFO lines. Verified by `CustomerLoggingIT`.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-20\lab20\solution"
mvn -B -Dtest=CustomerLoggingIT test
```

No Docker required.

## Pitfalls

- Missing `MDC.clear()` leaks corr/cust across Tomcat threads.
- Logging fullName/email fails the IT and the PII checklist.
- Competing `logback.xml` can override `logback-spring.xml`.


## Step-by-step fill guide (participant walkthrough)

### A. Scaffold
- Open IntelliJ on `%USERPROFILE%\java-bootcamp`.
- Prefer timed path: copy `starter/*` into `examples\lab20-crm`.
- Confirm JDK **21** and Maven **3.9+** (`java -version`, `mvn -version`).

### B. Implement TODOs in GUIDE order
- Follow [`../LAB-20-GUIDE.md`](../LAB-20-GUIDE.md) Steps top-to-bottom.
- When stuck, open the matching file under this `solution/src` (or `contracts/` / `docs/`) and compare **behavior**, not just names.
- Do not paste blindly — check package names (especially Lab 14 `com.northstar.crm.mapper`).

### C. Verify on Windows (this machine baseline)
```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab20-crm
# Or from the repo solution folder:
# cd "...\module-20\lab20\solution"
mvn -B clean test
```

### D. Common pitfalls for Lab 20
- Wrong **Tests run** count usually means a missing test class/method shell or leftover `PlaceholderTest`.
- Package / import drift vs GUIDE samples → fix imports to match solution packages.
- Never commit `target/`.

## Verified on instructor machine

**Date:** Tuesday, August 4, 2026  
**JDK:** Temurin OpenJDK **21.0.11**  
**Maven:** **3.9.9**  
**Result:** Solution suite/smoke **PASS** under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab20-solution`.



## Reference implementation — CorrelationFilter try/finally

Path: `src/main/java/com/northstar/crm/logging/CorrelationFilter.java`

```java
package com.northstar.crm.logging;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class CorrelationFilter extends OncePerRequestFilter {
    public static final String HEADER = "X-Correlation-Id";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String cid = request.getHeader(HEADER);
        if (cid == null || cid.isBlank()) {
            cid = "lab-request-001";
        }
        MDC.put("corr", cid);
        response.setHeader(HEADER, cid);
        try {
            filterChain.doFilter(request, response);
        } finally {
            MDC.clear();
        }
    }
}

```

