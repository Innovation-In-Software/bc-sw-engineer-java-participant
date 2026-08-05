# Lab 17 — Detailed solution (instructor / shared after class)

> **Audience:** Instructors and participants when the instructor releases `solution/`.  
> **Do not open this during the timed path** unless your instructor says so.  
> Timed starter card: [`../starter/README.md`](../starter/README.md) · Full steps: [`../LAB-17-GUIDE.md`](../LAB-17-GUIDE.md)

## Goal

**JUnit suite + JaCoCo gate**

## What you should end with

| Check | Expected |
| --- | --- |
| Verify command | `mvn -B clean verify` |
| Suite / smoke | Tests run: 19 (6 + 2 + 11); JaCoCo on com.northstar.crm.service |
| Workspace copy (optional) | `%USERPROFILE%\java-bootcamp\examples\lab17-crm` from this `solution/` |

## Solution tree (key files)

### Java / sources
- `src/main/java/com/northstar/crm/Main.java`
- `src/main/java/com/northstar/crm/entity/Customer.java`
- `src/main/java/com/northstar/crm/entity/CustomerStatus.java`
- `src/main/java/com/northstar/crm/dto/CustomerMapper.java`
- `src/main/java/com/northstar/crm/dto/CustomerRequestDTO.java`
- `src/main/java/com/northstar/crm/dto/CustomerResponseDTO.java`
- `src/main/java/com/northstar/crm/exception/BusinessException.java`
- `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java`
- `src/main/java/com/northstar/crm/exception/ErrorResponse.java`
- `src/main/java/com/northstar/crm/exception/GlobalExceptionHandler.java`
- `src/main/java/com/northstar/crm/config/AppConfig.java`
- `src/main/java/com/northstar/crm/repository/CustomerRepository.java`
- `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/main/java/com/northstar/crm/service/CustomerValidator.java`
- `src/main/java/com/northstar/crm/service/DefaultCustomerService.java`
- `src/main/java/com/northstar/crm/api/ApiResult.java`
- `src/main/java/com/northstar/crm/api/CustomerApiFacade.java`
- `src/test/java/com/northstar/crm/exception/GlobalExceptionHandlerTest.java`
- `src/test/java/com/northstar/crm/service/CustomerServiceTests.java`
- `src/test/java/com/northstar/crm/service/CustomerValidatorParameterizedTest.java`

### Docs / contracts
- `junit-runbook.md`

## How this maps to the GUIDE

1. Copy `starter/` → `examples/lab17-crm` (timed path) **or** use this `solution/` as the completed reference.
2. Every `// TODO` in the starter has a filled implementation here — compare file-by-file with your work.
3. Run the verify command above from the project root (this folder or your `lab17-crm` copy).
4. Keep `docs/` notes that the GUIDE names (smells, isolation policy, monitoring report, etc.).

## Instructor notes (short)

# Lab 17 solution notes

## What / why

Formal JUnit 5 suite for Labs 15–16 behavior with AAA isolation (`@BeforeEach` fresh repo), parameterized transition matrix, and JaCoCo ≥80% on `com.northstar.crm.service`.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-17\lab17\solution"
mvn -B clean verify
```

Expect: BUILD SUCCESS; JaCoCo gate passes. Do not commit `target/site/jacoco`.

## Pitfalls

- `mvn test` without `clean` may skip agent application for verify.
- Prefer `assertThrows(BusinessException.class)` over bare `Exception`.
- Shared static service → flaky tests.


## Step-by-step fill guide (participant walkthrough)

### A. Scaffold
- Open IntelliJ on `%USERPROFILE%\java-bootcamp`.
- Prefer timed path: copy `starter/*` into `examples\lab17-crm`.
- Confirm JDK **21** and Maven **3.9+** (`java -version`, `mvn -version`).

### B. Implement TODOs in GUIDE order
- Follow [`../LAB-17-GUIDE.md`](../LAB-17-GUIDE.md) Steps top-to-bottom.
- When stuck, open the matching file under this `solution/src` (or `contracts/` / `docs/`) and compare **behavior**, not just names.
- Do not paste blindly — check package names (especially Lab 14 `com.northstar.crm.mapper`).

### C. Verify on Windows (this machine baseline)
```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab17-crm
# Or from the repo solution folder:
# cd "...\module-17\lab17\solution"
mvn -B clean verify
```

### D. Common pitfalls for Lab 17
- Wrong **Tests run** count usually means a missing test class/method shell or leftover `PlaceholderTest`.
- Package / import drift vs GUIDE samples → fix imports to match solution packages.
- Never commit `target/`.

## Verified on instructor machine

**Date:** Tuesday, August 4, 2026  
**JDK:** Temurin OpenJDK **21.0.11**  
**Maven:** **3.9.9**  
**Result:** Solution suite/smoke **PASS** under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab17-solution`.



## Reference implementation — CustomerServiceTests (6)

Path: `src/test/java/com/northstar/crm/service/CustomerServiceTests.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.repository.InMemoryCustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTests {
    DefaultCustomerService service;
    InMemoryCustomerRepository repo;

    @BeforeEach
    void setUp() {
        repo = new InMemoryCustomerRepository();
        service = new DefaultCustomerService(repo, new CustomerValidator(repo));
    }

    @Test
    void addAndActivateRaviHappyPath() {
        service.addCustomer(Customer.amina());
        service.addCustomer(Customer.ravi());
        var activated = service.changeStatus("CUS-1002", CustomerStatus.ACTIVE, "lab-request-001");
        assertEquals(CustomerStatus.ACTIVE, activated.getStatus());
        assertEquals("CUS-1001", service.findById("CUS-1001").orElseThrow().getCustomerId());
        assertEquals(2, service.listAll().size());
    }

    @Test
    void duplicateIdThrowsConflict() {
        service.addCustomer(Customer.amina());
        BusinessException ex = assertThrows(BusinessException.class,
                () -> service.addCustomer(Customer.amina()));
        assertEquals("BUSINESS_CONFLICT", ex.getCode());
    }

    @Test
    void illegalTransitionThrowsConflict() {
        service.addCustomer(Customer.amina());
        BusinessException ex = assertThrows(BusinessException.class,
                () -> service.changeStatus("CUS-1001", CustomerStatus.PROSPECT, "lab-request-001"));
        assertEquals("BUSINESS_CONFLICT", ex.getCode());
        assertEquals(CustomerStatus.ACTIVE, service.findById("CUS-1001").orElseThrow().getStatus());
    }

    @Test
    void missingCustomerThrowsNotFound() {
        BusinessException ex = assertThrows(BusinessException.class,
                () -> service.changeStatus("CUS-9999", CustomerStatus.ACTIVE, "lab-request-001"));
        assertEquals("CUSTOMER_NOT_FOUND", ex.getCode());
        assertEquals("lab-request-001", ex.getCorrelationId());
    }

    @Test
    void duplicateEmailThrowsConflict() {
        service.addCustomer(Customer.amina());
        Customer clone = new Customer(
                "CUS-3001", "Other Name", "amina.khan@example.com", null,
                CustomerStatus.PROSPECT, java.time.LocalDateTime.now());
        assertThrows(BusinessException.class, () -> service.addCustomer(clone));
    }

    @Test
    void closedToActiveRejected() {
        Customer closed = Customer.amina();
        closed.setStatus(CustomerStatus.CLOSED);
        service.addCustomer(closed);
        assertThrows(BusinessException.class,
                () -> service.changeStatus("CUS-1001", CustomerStatus.ACTIVE, "lab-request-001"));
    }
}

```



## Reference implementation — Parameterized 11 rows

Path: `src/test/java/com/northstar/crm/service/CustomerValidatorParameterizedTest.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.repository.InMemoryCustomerRepository;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CustomerValidatorParameterizedTest {
    CustomerValidator validator = new CustomerValidator(new InMemoryCustomerRepository());

    @ParameterizedTest
    @CsvSource({
            "PROSPECT,ACTIVE",
            "PROSPECT,CLOSED",
            "ACTIVE,SUSPENDED",
            "ACTIVE,CLOSED",
            "SUSPENDED,ACTIVE",
            "SUSPENDED,CLOSED"
    })
    void legalTransitions(CustomerStatus from, CustomerStatus to) {
        assertDoesNotThrow(() ->
                validator.validateTransition(from, to, "lab-request-001"));
    }

    @ParameterizedTest
    @CsvSource({
            "ACTIVE,PROSPECT",
            "CLOSED,ACTIVE",
            "CLOSED,PROSPECT",
            "PROSPECT,SUSPENDED",
            "ACTIVE,ACTIVE"
    })
    void illegalTransitions(CustomerStatus from, CustomerStatus to) {
        assertThrows(BusinessException.class, () ->
                validator.validateTransition(from, to, "lab-request-001"));
    }
}

```

