# Lab 12 — Detailed solution (instructor / shared after class)

> **Audience:** Instructors and participants when the instructor releases `solution/`.  
> **Do not open this during the timed path** unless your instructor says so.  
> Timed starter card: [`../starter/README.md`](../starter/README.md) · Full steps: [`../LAB-12-GUIDE.md`](../LAB-12-GUIDE.md)

## Goal

**Refactor messy CRM service**

## What you should end with

| Check | Expected |
| --- | --- |
| Verify command | `mvn -B clean test` |
| Suite / smoke | Tests run: 8 (CustomerTest 2 + CustomerServiceTest 6) |
| Workspace copy (optional) | `%USERPROFILE%\java-bootcamp\examples\lab12-crm` from this `solution/` |

## Solution tree (key files)

### Java / sources
- `src/main/java/com/northstar/crm/Main.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/main/java/com/northstar/crm/entity/Customer.java`
- `src/main/java/com/northstar/crm/entity/CustomerStatus.java`
- `src/main/java/com/northstar/crm/dto/CustomerRequest.java`
- `src/main/java/com/northstar/crm/dto/CustomerResponse.java`
- `src/main/java/com/northstar/crm/config/AppConfig.java`
- `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java`
- `src/test/java/com/northstar/crm/service/CustomerServiceTest.java`
- `src/test/java/com/northstar/crm/entity/CustomerTest.java`

### Docs / contracts
- `ai-review-notes.md`
- `before-after.md`
- `CODING-STANDARDS-check.md`
- `smells.md`

## How this maps to the GUIDE

1. Copy `starter/` → `examples/lab12-crm` (timed path) **or** use this `solution/` as the completed reference.
2. Every `// TODO` in the starter has a filled implementation here — compare file-by-file with your work.
3. Run the verify command above from the project root (this folder or your `lab12-crm` copy).
4. Keep `docs/` notes that the GUIDE names (smells, isolation policy, monitoring report, etc.).

## Instructor notes (short)

# Lab 12 — Instructor solution notes

## What was implemented

- Frozen messy baseline as `CustomerService.before.java.txt`.
- Refactored `CustomerService` with Map store + target API + correlation-aware exceptions.
- Tests: CustomerTest (2) + CustomerServiceTest (6) = 8.
- Smell / before-after / standards docs.

## How to verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-12\lab12\solution"
mvn -B clean test
java -cp target\classes com.northstar.crm.Main
```

## Pitfalls

- Before snapshot must use `.txt` suffix so Maven does not compile two classes.
- Update tests away from `addCustomer` / `doStuff` after API rename.


## Step-by-step fill guide (participant walkthrough)

### A. Scaffold
- Open IntelliJ on `%USERPROFILE%\java-bootcamp`.
- Prefer timed path: copy `starter/*` into `examples\lab12-crm`.
- Confirm JDK **21** and Maven **3.9+** (`java -version`, `mvn -version`).

### B. Implement TODOs in GUIDE order
- Follow [`../LAB-12-GUIDE.md`](../LAB-12-GUIDE.md) Steps top-to-bottom.
- When stuck, open the matching file under this `solution/src` (or `contracts/` / `docs/`) and compare **behavior**, not just names.
- Do not paste blindly — check package names (especially Lab 14 `com.northstar.crm.mapper`).

### C. Verify on Windows (this machine baseline)
```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab12-crm
# Or from the repo solution folder:
# cd "...\module-12\lab12\solution"
mvn -B clean test
```

### D. Common pitfalls for Lab 12
- Wrong **Tests run** count usually means a missing test class/method shell or leftover `PlaceholderTest`.
- Package / import drift vs GUIDE samples → fix imports to match solution packages.
- Never commit `target/`.

## Verified on instructor machine

**Date:** Tuesday, August 4, 2026  
**JDK:** Temurin OpenJDK **21.0.11**  
**Maven:** **3.9.9**  
**Result:** Solution suite/smoke **PASS** under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab12-solution`.



## Reference implementation — Refactored CustomerService (Map + correlation)

Path: `src/main/java/com/northstar/crm/service/CustomerService.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Refactored Lab 12 API: createCustomer / getCustomer / updateStatus.
 * Correlation ID default: lab-request-001
 */
public class CustomerService {

    private final Map<String, Customer> customersById = new HashMap<>();
    private String correlationId = "lab-request-001";

    public void setCorrelationId(String correlationId) {
        this.correlationId = Objects.requireNonNullElse(correlationId, "lab-request-001");
    }

    public String correlationId() {
        return correlationId;
    }

    public Customer createCustomer(String customerId, String fullName, String email,
                                   String phone, CustomerStatus status) {
        requireNonBlank(customerId, "customerId");
        requireNonBlank(fullName, "fullName");
        requireUniqueId(customerId);
        Customer customer = new Customer(
                customerId,
                fullName,
                email,
                phone,
                status != null ? status : CustomerStatus.PROSPECT,
                LocalDateTime.now());
        customersById.put(customerId, customer);
        return customer;
    }

    public Customer getCustomer(String customerId) {
        requireNonBlank(customerId, "customerId");
        Customer found = customersById.get(customerId);
        if (found == null) {
            throw new IllegalArgumentException(
                    "Customer not found: " + customerId + " correlationId=" + correlationId());
        }
        return found;
    }

    public Customer updateStatus(String customerId, CustomerStatus newStatus) {
        requireNonBlank(customerId, "customerId");
        if (newStatus == null) {
            throw new IllegalArgumentException("status is required correlationId=" + correlationId());
        }
        Customer customer = requireExisting(customerId);
        customer.setStatus(newStatus);
        return customer;
    }

    private void requireNonBlank(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(fieldName + " must not be blank correlationId=" + correlationId());
        }
    }

    private void requireUniqueId(String customerId) {
        if (customersById.containsKey(customerId)) {
            throw new IllegalStateException(
                    "Duplicate customerId: " + customerId + " correlationId=" + correlationId());
        }
    }

    private Customer requireExisting(String customerId) {
        Customer found = customersById.get(customerId);
        if (found == null) {
            throw new IllegalArgumentException(
                    "Customer not found: " + customerId + " correlationId=" + correlationId());
        }
        return found;
    }
}

```



## Reference implementation — CustomerServiceTest (6)

Path: `src/test/java/com/northstar/crm/service/CustomerServiceTest.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    private CustomerService svc;

    @BeforeEach
    void setUp() {
        svc = new CustomerService();
        svc.setCorrelationId("lab-request-001");
    }

    @Test
    void createAminaKhanThenGetById() {
        Customer created = svc.createCustomer(
                "CUS-1001", "Amina Khan", "amina.khan@example.com", null, CustomerStatus.ACTIVE);
        assertEquals("CUS-1001", created.getCustomerId());
        assertEquals("CUS-1001", svc.getCustomer("CUS-1001").getCustomerId());
        assertEquals("Amina Khan", svc.getCustomer(new String("CUS-1001")).getFullName());
    }

    @Test
    void createRaviProspectThenActivate() {
        svc.createCustomer("CUS-1002", "Ravi Singh", "ravi.singh@example.com", null, CustomerStatus.PROSPECT);
        assertEquals(CustomerStatus.PROSPECT, svc.getCustomer("CUS-1002").getStatus());
        svc.updateStatus("CUS-1002", CustomerStatus.ACTIVE);
        assertEquals(CustomerStatus.ACTIVE, svc.getCustomer("CUS-1002").getStatus());
    }

    @Test
    void unknownIdThrows() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> svc.getCustomer("CUS-9999"));
        assertTrue(ex.getMessage().contains("CUS-9999"));
        assertTrue(ex.getMessage().contains("lab-request-001"));
    }

    @Test
    void duplicateIdThrows() {
        svc.createCustomer("CUS-1001", "Amina Khan", "amina.khan@example.com", null, CustomerStatus.ACTIVE);
        assertThrows(IllegalStateException.class, () ->
                svc.createCustomer("CUS-1001", "Other", "x@example.com", null, CustomerStatus.PROSPECT));
    }

    @Test
    void blankCustomerIdThrows() {
        assertThrows(IllegalArgumentException.class, () ->
                svc.createCustomer(" ", "Name", "n@example.com", null, CustomerStatus.ACTIVE));
    }

    @Test
    void updateUnknownThrowsWithCorrelation() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> svc.updateStatus("CUS-9999", CustomerStatus.ACTIVE));
        assertTrue(ex.getMessage().contains("lab-request-001"));
    }
}

```

