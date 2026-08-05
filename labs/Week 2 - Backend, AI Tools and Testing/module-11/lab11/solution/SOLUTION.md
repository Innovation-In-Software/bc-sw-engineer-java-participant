# Lab 11 — Detailed solution (instructor / shared after class)

> **Audience:** Instructors and participants when the instructor releases `solution/`.  
> **Do not open this during the timed path** unless your instructor says so.  
> Timed starter card: [`../starter/README.md`](../starter/README.md) · Full steps: [`../LAB-11-GUIDE.md`](../LAB-11-GUIDE.md)

## Goal

**JUnit 5 + Mockito notifier**

## What you should end with

| Check | Expected |
| --- | --- |
| Verify command | `mvn -B clean test` |
| Suite / smoke | Tests run: 8 (CustomerTest 2 + CustomerServiceTest 5 + CustomerNotifierMockTest 1) |
| Workspace copy (optional) | `%USERPROFILE%\java-bootcamp\examples\lab11-crm` from this `solution/` |

## Solution tree (key files)

### Java / sources
- `src/main/java/com/northstar/crm/Main.java`
- `src/main/java/com/northstar/crm/service/CustomerNotifier.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/main/java/com/northstar/crm/entity/Customer.java`
- `src/main/java/com/northstar/crm/entity/CustomerStatus.java`
- `src/main/java/com/northstar/crm/dto/CustomerRequest.java`
- `src/main/java/com/northstar/crm/dto/CustomerResponse.java`
- `src/main/java/com/northstar/crm/config/AppConfig.java`
- `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java`
- `src/test/java/com/northstar/crm/entity/CustomerTest.java`
- `src/test/java/com/northstar/crm/service/CustomerNotifierMockTest.java`
- `src/test/java/com/northstar/crm/service/CustomerServiceTest.java`

### Docs / contracts
- (see solution tree)

## How this maps to the GUIDE

1. Copy `starter/` → `examples/lab11-crm` (timed path) **or** use this `solution/` as the completed reference.
2. Every `// TODO` in the starter has a filled implementation here — compare file-by-file with your work.
3. Run the verify command above from the project root (this folder or your `lab11-crm` copy).
4. Keep `docs/` notes that the GUIDE names (smells, isolation policy, monitoring report, etc.).

## Instructor notes (short)

# Lab 11 — Instructor solution notes

## What was implemented

- JUnit tests: CustomerTest (2), CustomerServiceTest (5), CustomerNotifierMockTest (1) → **8 tests**.
- Extracted `CustomerNotifier` + `validateCustomerId`; no-arg ctor keeps no-op notifier.
- Review notes `lab11-001`–`004`.

## How to verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-11\lab11\solution"
mvn -q clean test
```

Expected: Tests run: 8, Failures: 0.

## Pitfalls

- Remove Lab 9 `PlaceholderTest` / trivial asserts.
- Keep no-arg `CustomerService()` after notifier extract.
- Package tests under `entity` / `service` as in the GUIDE.


## Step-by-step fill guide (participant walkthrough)

### A. Scaffold
- Open IntelliJ on `%USERPROFILE%\java-bootcamp`.
- Prefer timed path: copy `starter/*` into `examples\lab11-crm`.
- Confirm JDK **21** and Maven **3.9+** (`java -version`, `mvn -version`).

### B. Implement TODOs in GUIDE order
- Follow [`../LAB-11-GUIDE.md`](../LAB-11-GUIDE.md) Steps top-to-bottom.
- When stuck, open the matching file under this `solution/src` (or `contracts/` / `docs/`) and compare **behavior**, not just names.
- Do not paste blindly — check package names (especially Lab 14 `com.northstar.crm.mapper`).

### C. Verify on Windows (this machine baseline)
```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab11-crm
# Or from the repo solution folder:
# cd "...\module-11\lab11\solution"
mvn -B clean test
```

### D. Common pitfalls for Lab 11
- Wrong **Tests run** count usually means a missing test class/method shell or leftover `PlaceholderTest`.
- Package / import drift vs GUIDE samples → fix imports to match solution packages.
- Never commit `target/`.

## Verified on instructor machine

**Date:** Tuesday, August 4, 2026  
**JDK:** Temurin OpenJDK **21.0.11**  
**Maven:** **3.9.9**  
**Result:** Solution suite/smoke **PASS** under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab11-solution`.



## Reference implementation — CustomerServiceTest (8-suite piece)

Path: `src/test/java/com/northstar/crm/service/CustomerServiceTest.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    private CustomerService service;

    @BeforeEach
    void setUp() {
        service = new CustomerService();
    }

    @Test
    void addCustomerStoresNewCustomer() {
        Customer amina = new Customer("CUS-1001", "Amina Khan", "amina.khan@example.com",
                "555-0101", CustomerStatus.ACTIVE, LocalDateTime.now());
        service.addCustomer(amina);
        assertEquals(1, service.listAll().size());
        assertEquals("CUS-1001", service.listAll().get(0).getCustomerId());
        assertTrue(service.findByCustomerId("CUS-1001").isPresent());
    }

    @Test
    void addCustomerRejectsDuplicateId() {
        Customer amina = new Customer("CUS-1001", "Amina Khan", "amina.khan@example.com",
                "555-0101", CustomerStatus.ACTIVE, LocalDateTime.now());
        service.addCustomer(amina);
        Customer duplicate = new Customer("CUS-1001", "Someone Else", "x@example.com",
                "555-0000", CustomerStatus.PROSPECT, LocalDateTime.now());
        assertThrows(IllegalStateException.class, () -> service.addCustomer(duplicate));
    }

    @Test
    void updateStatusChangesExistingCustomer() {
        Customer ravi = new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com",
                "555-0102", CustomerStatus.PROSPECT, LocalDateTime.now());
        service.addCustomer(ravi);
        service.updateStatus("CUS-1002", CustomerStatus.ACTIVE);
        assertEquals(CustomerStatus.ACTIVE,
                service.findByCustomerId("CUS-1002").orElseThrow().getStatus());
    }

    @Test
    void updateStatusThrowsForUnknownCustomer() {
        assertThrows(IllegalArgumentException.class,
                () -> service.updateStatus("CUS-9999", CustomerStatus.ACTIVE));
    }

    @Test
    void findByStatusReturnsOnlyMatchingCustomers() {
        service.addCustomer(new Customer("CUS-1001", "Amina Khan", "amina.khan@example.com",
                "555-0101", CustomerStatus.ACTIVE, LocalDateTime.now()));
        service.addCustomer(new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com",
                "555-0102", CustomerStatus.PROSPECT, LocalDateTime.now()));
        assertEquals(1, service.findByStatus(CustomerStatus.PROSPECT).size());
        assertEquals("CUS-1002", service.findByStatus(CustomerStatus.PROSPECT).get(0).getCustomerId());
    }
}

```



## Reference implementation — CustomerService + notifier

Path: `src/main/java/com/northstar/crm/service/CustomerService.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerService {

    private final List<Customer> customers = new ArrayList<>();
    private final CustomerNotifier notifier;

    public CustomerService() {
        this((customerId, oldStatus, newStatus) -> { /* no-op */ });
    }

    public CustomerService(CustomerNotifier notifier) {
        this.notifier = notifier;
    }

    public Customer addCustomer(Customer customer) {
        validateCustomerId(customer.getCustomerId());
        if (findByCustomerId(customer.getCustomerId()).isPresent()) {
            throw new IllegalStateException("Customer already exists: " + customer.getCustomerId());
        }
        customers.add(customer);
        return customer;
    }

    public Optional<Customer> findByCustomerId(String customerId) {
        return customers.stream()
                .filter(c -> c.getCustomerId().equals(customerId))
                .findFirst();
    }

    public List<Customer> findByStatus(CustomerStatus status) {
        return customers.stream()
                .filter(c -> c.getStatus() == status)
                .toList();
    }

    public Customer updateStatus(String customerId, CustomerStatus newStatus) {
        validateCustomerId(customerId);
        Customer customer = findByCustomerId(customerId)
                .orElseThrow(() -> new IllegalArgumentException("No such customer: " + customerId));
        CustomerStatus oldStatus = customer.getStatus();
        customer.setStatus(newStatus);
        notifier.notifyStatusChange(customerId, oldStatus, newStatus);
        return customer;
    }

    public List<Customer> listAll() {
        return List.copyOf(customers);
    }

    private void validateCustomerId(String customerId) {
        if (customerId == null || customerId.isBlank()) {
            throw new IllegalArgumentException("customerId must not be blank");
        }
    }
}

```

