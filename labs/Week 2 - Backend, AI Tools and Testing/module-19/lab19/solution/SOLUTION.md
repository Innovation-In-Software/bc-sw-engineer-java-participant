# Lab 19 — Detailed solution (instructor / shared after class)

> **Audience:** Instructors and participants when the instructor releases `solution/`.  
> **Do not open this during the timed path** unless your instructor says so.  
> Timed starter card: [`../starter/README.md`](../starter/README.md) · Full steps: [`../LAB-19-GUIDE.md`](../LAB-19-GUIDE.md)

## Goal

**API IT + Selenium UI**

## What you should end with

| Check | Expected |
| --- | --- |
| Verify command | `mvn -B -Dtest=CustomerApiIT,CustomerUiIT test` |
| Suite / smoke | Tests run: 4 (ApiIT 3 + UiIT 1) |
| Workspace copy (optional) | `%USERPROFILE%\java-bootcamp\examples\lab19-crm` from this `solution/` |

## Solution tree (key files)

### Java / sources
- `src/main/java/com/northstar/crm/CrmApplication.java`
- `src/main/java/com/northstar/crm/model/Customer.java`
- `src/main/java/com/northstar/crm/repository/CustomerRepository.java`
- `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/main/java/com/northstar/crm/api/CustomerController.java`
- `src/test/java/com/northstar/crm/integration/CustomerApiIT.java`
- `src/test/java/com/northstar/crm/ui/CustomerUiIT.java`
- `src/test/java/com/northstar/crm/ui/pages/CustomerFormPage.java`

### Docs / contracts
- `regression-notes.md`

## How this maps to the GUIDE

1. Copy `starter/` → `examples/lab19-crm` (timed path) **or** use this `solution/` as the completed reference.
2. Every `// TODO` in the starter has a filled implementation here — compare file-by-file with your work.
3. Run the verify command above from the project root (this folder or your `lab19-crm` copy).
4. Keep `docs/` notes that the GUIDE names (smells, isolation policy, monitoring report, etc.).

## Instructor notes (short)

# Lab 19 solution notes

## What / why

Spring Boot CRM with HTTP create/get, static `customers.html` form using `data-testid`, `CustomerApiIT` for correlation/404, and Selenium Page Object UI IT for `CUS-2001`.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-19\lab19\solution"
mvn -B -Dtest=CustomerApiIT test
mvn -B -Dtest=CustomerUiIT test
```

`CustomerApiIT` needs no Docker. `CustomerUiIT` needs Chrome/Chromium installed (WebDriverManager downloads the driver).

## Pitfalls

- UI timeouts usually mean JS/API failed — green ApiIT first.
- Implicit + explicit waits stacked → prefer explicit only.
- Do not commit `target/` or ChromeDriver binaries.


## Step-by-step fill guide (participant walkthrough)

### A. Scaffold
- Open IntelliJ on `%USERPROFILE%\java-bootcamp`.
- Prefer timed path: copy `starter/*` into `examples\lab19-crm`.
- Confirm JDK **21** and Maven **3.9+** (`java -version`, `mvn -version`).

### B. Implement TODOs in GUIDE order
- Follow [`../LAB-19-GUIDE.md`](../LAB-19-GUIDE.md) Steps top-to-bottom.
- When stuck, open the matching file under this `solution/src` (or `contracts/` / `docs/`) and compare **behavior**, not just names.
- Do not paste blindly — check package names (especially Lab 14 `com.northstar.crm.mapper`).

### C. Verify on Windows (this machine baseline)
```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab19-crm
# Or from the repo solution folder:
# cd "...\module-19\lab19\solution"
mvn -B -Dtest=CustomerApiIT,CustomerUiIT test
```

### D. Common pitfalls for Lab 19
- Wrong **Tests run** count usually means a missing test class/method shell or leftover `PlaceholderTest`.
- Package / import drift vs GUIDE samples → fix imports to match solution packages.
- Never commit `target/`.

## Verified on instructor machine

**Date:** Tuesday, August 4, 2026  
**JDK:** Temurin OpenJDK **21.0.11**  
**Maven:** **3.9.9**  
**Result:** Solution suite/smoke **PASS** under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab19-solution`.



## Reference implementation — CustomerApiIT fixtures

Path: `src/test/java/com/northstar/crm/integration/CustomerApiIT.java`

```java
package com.northstar.crm.integration;

import com.northstar.crm.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerApiIT {

    @LocalServerPort
    int port;

    @Autowired
    TestRestTemplate rest;

    private String url(String path) {
        return "http://localhost:" + port + path;
    }

    @Test
    void getAminaReturns200() {
        ResponseEntity<Customer> res = rest.getForEntity(url("/api/customers/CUS-1001"), Customer.class);
        assertEquals(HttpStatus.OK, res.getStatusCode());
        assertNotNull(res.getBody());
        assertEquals("CUS-1001", res.getBody().getCustomerId());
    }

    @Test
    void createEchoesCorrelationHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Correlation-Id", "lab-request-001");
        headers.setContentType(MediaType.APPLICATION_JSON);
        Customer body = new Customer("CUS-1901", "Lab Nineteen", "lab19@example.com", "PROSPECT");
        ResponseEntity<Customer> created = rest.exchange(
                url("/api/customers"),
                HttpMethod.POST,
                new HttpEntity<>(body, headers),
                Customer.class);
        assertEquals(HttpStatus.CREATED, created.getStatusCode());
        assertEquals("lab-request-001", created.getHeaders().getFirst("X-Correlation-Id"));
        assertNotNull(created.getBody());
        assertEquals("CUS-1901", created.getBody().getCustomerId());
    }

    @Test
    void missingCustomerReturns404() {
        ResponseEntity<Customer> res = rest.getForEntity(url("/api/customers/CUS-9999"), Customer.class);
        assertEquals(HttpStatus.NOT_FOUND, res.getStatusCode());
    }
}

```

