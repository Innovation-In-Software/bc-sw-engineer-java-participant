# Lab 14 — Detailed solution (instructor / shared after class)

> **Audience:** Instructors and participants when the instructor releases `solution/`.  
> **Do not open this during the timed path** unless your instructor says so.  
> Timed starter card: [`../starter/README.md`](../starter/README.md) · Full steps: [`../LAB-14-GUIDE.md`](../LAB-14-GUIDE.md)

## Goal

**DTO + Bean Validation**

## What you should end with

| Check | Expected |
| --- | --- |
| Verify command | `mvn -B clean test` |
| Suite / smoke | Timed: Tests run: 3; Full solution: Tests run: 13 |
| Workspace copy (optional) | `%USERPROFILE%\java-bootcamp\examples\lab14-crm` from this `solution/` |

## Solution tree (key files)

### Java / sources
- `src/main/java/com/northstar/crm/Main.java`
- `src/main/java/com/northstar/crm/entity/Customer.java`
- `src/main/java/com/northstar/crm/entity/CustomerStatus.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/main/java/com/northstar/crm/dto/CustomerRequestDTO.java`
- `src/main/java/com/northstar/crm/dto/CustomerResponseDTO.java`
- `src/main/java/com/northstar/crm/api/CustomerApiFacade.java`
- `src/main/java/com/northstar/crm/config/AppConfig.java`
- `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java`
- `src/main/java/com/northstar/crm/mapper/CustomerMapper.java`
- `src/test/java/com/northstar/crm/dto/CustomerRequestDTOValidationTest.java`
- `src/test/java/com/northstar/crm/api/CustomerApiFacadeTest.java`
- `src/test/java/com/northstar/crm/mapper/CustomerMapperTest.java`

### Docs / contracts
- `dto-boundary-notes.md`

## How this maps to the GUIDE

1. Copy `starter/` → `examples/lab14-crm` (timed path) **or** use this `solution/` as the completed reference.
2. Every `// TODO` in the starter has a filled implementation here — compare file-by-file with your work.
3. Run the verify command above from the project root (this folder or your `lab14-crm` copy).
4. Keep `docs/` notes that the GUIDE names (smells, isolation policy, monitoring report, etc.).

## Instructor notes (short)

# Lab 14 — Instructor solution notes

## What was implemented

- `CustomerRequestDTO` / `CustomerResponseDTO` with Jakarta constraints.
- `CustomerMapper` in package `com.northstar.crm.mapper` (GUIDE naming).
- `CustomerApiFacade` validate → create/get → DTO only.
- Tests: validation (5) + facade (5) + mapper (3) = **13**.
- Renamed/aligned `CustomerRequestDTOValidationTest` with GUIDE.

## How to verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-14\lab14\solution"
mvn -B clean test
```

Expected: Tests run: 13, Failures: 0.

## Pitfalls

- Use `jakarta.validation` (not javax).
- Mapper package is `mapper`, not `dto`.
- Service API is Lab 12 `createCustomer`/`getCustomer` — adapt GUIDE's `addCustomer` examples.
- Running Main needs validation jars on classpath (`dependency:build-classpath` or IntelliJ).


## Step-by-step fill guide (participant walkthrough)

### A. Scaffold
- Open IntelliJ on `%USERPROFILE%\java-bootcamp`.
- Prefer timed path: copy `starter/*` into `examples\lab14-crm`.
- Confirm JDK **21** and Maven **3.9+** (`java -version`, `mvn -version`).

### B. Implement TODOs in GUIDE order
- Follow [`../LAB-14-GUIDE.md`](../LAB-14-GUIDE.md) Steps top-to-bottom.
- When stuck, open the matching file under this `solution/src` (or `contracts/` / `docs/`) and compare **behavior**, not just names.
- Do not paste blindly — check package names (especially Lab 14 `com.northstar.crm.mapper`).

### C. Verify on Windows (this machine baseline)
```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab14-crm
# Or from the repo solution folder:
# cd "...\module-14\lab14\solution"
mvn -B clean test
```

### D. Common pitfalls for Lab 14
- Wrong **Tests run** count usually means a missing test class/method shell or leftover `PlaceholderTest`.
- Package / import drift vs GUIDE samples → fix imports to match solution packages.
- Never commit `target/`.

## Verified on instructor machine

**Date:** Tuesday, August 4, 2026  
**JDK:** Temurin OpenJDK **21.0.11**  
**Maven:** **3.9.9**  
**Result:** Solution suite/smoke **PASS** under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab14-solution`.



## Reference implementation — CustomerMapper in mapper package

Path: `src/main/java/com/northstar/crm/mapper/CustomerMapper.java`

```java
package com.northstar.crm.mapper;

import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public final class CustomerMapper {
    private CustomerMapper() {}

    public static Customer toEntity(CustomerRequestDTO req) {
        return new Customer(
                req.getCustomerId(),
                req.getFullName(),
                req.getEmail(),
                null,
                CustomerStatus.valueOf(req.getStatus()),
                LocalDateTime.now()
        );
    }

    public static CustomerResponseDTO toResponse(Customer entity) {
        Instant createdAt = entity.getCreatedAt() == null
                ? null
                : entity.getCreatedAt().toInstant(ZoneOffset.UTC);
        return CustomerResponseDTO.of(
                entity.getCustomerId(),
                entity.getFullName(),
                entity.getEmail(),
                entity.getStatus().name(),
                createdAt,
                null
        );
    }
}

```

