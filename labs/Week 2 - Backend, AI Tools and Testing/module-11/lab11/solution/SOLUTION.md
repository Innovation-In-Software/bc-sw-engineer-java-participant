# Lab 11 — Complete reference solution

> **Finished project** — every source file below is the completed answer (not a smoke checklist).
>
> Attempt [`../starter/`](../starter/) first. Guide: [`../LAB-11-GUIDE.md`](../LAB-11-GUIDE.md)

## Goal

**JUnit 5 suite + CustomerNotifier Mockito extract**

## Run the finished project

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab11-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab11-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab11-crm
mvn -B clean test
```

**Expected:** Tests run: 8, Failures: 0

## File index (14 files)

| # | Path |
|---|------|
| 1 | `src/main/java/com/northstar/crm/config/AppConfig.java` |
| 2 | `src/main/java/com/northstar/crm/dto/CustomerRequest.java` |
| 3 | `src/main/java/com/northstar/crm/dto/CustomerResponse.java` |
| 4 | `src/main/java/com/northstar/crm/entity/Customer.java` |
| 5 | `src/main/java/com/northstar/crm/entity/CustomerStatus.java` |
| 6 | `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java` |
| 7 | `src/main/java/com/northstar/crm/Main.java` |
| 8 | `src/main/java/com/northstar/crm/service/CustomerNotifier.java` |
| 9 | `src/main/java/com/northstar/crm/service/CustomerService.java` |
| 10 | `src/test/java/com/northstar/crm/entity/CustomerTest.java` |
| 11 | `src/test/java/com/northstar/crm/service/CustomerNotifierMockTest.java` |
| 12 | `src/test/java/com/northstar/crm/service/CustomerServiceTest.java` |
| 13 | `pom.xml` |
| 14 | `copilot-notes/ai-test-refactor-notes.md` |

## Full source

### `src/main/java/com/northstar/crm/config/AppConfig.java`

```java
package com.northstar.crm.config;

public class AppConfig {
}
```

### `src/main/java/com/northstar/crm/dto/CustomerRequest.java`

```java
package com.northstar.crm.dto;

public class CustomerRequest {
}
```

### `src/main/java/com/northstar/crm/dto/CustomerResponse.java`

```java
package com.northstar.crm.dto;

public class CustomerResponse {
}
```

### `src/main/java/com/northstar/crm/entity/Customer.java`

```java
package com.northstar.crm.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Customer {
    private String customerId;
    private String fullName;
    private String email;
    private String phone;
    private CustomerStatus status;
    private LocalDateTime createdAt;

    public Customer() {}

    public Customer(String customerId, String fullName, String email, String phone,
                    CustomerStatus status, LocalDateTime createdAt) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public CustomerStatus getStatus() { return status; }
    public void setStatus(CustomerStatus status) { this.status = status; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer other)) return false;
        return Objects.equals(customerId, other.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }

    @Override
    public String toString() {
        return "Customer{customerId='" + customerId + "', fullName='" + fullName
                + "', status=" + status + "}";
    }
}
```

### `src/main/java/com/northstar/crm/entity/CustomerStatus.java`

```java
package com.northstar.crm.entity;

public enum CustomerStatus {
    PROSPECT,
    ACTIVE,
    SUSPENDED,
    CLOSED
}
```

### `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java`

```java
package com.northstar.crm.exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String customerId) {
        super("Customer not found: " + customerId);
    }
}
```

### `src/main/java/com/northstar/crm/Main.java`

```java
package com.northstar.crm;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.service.CustomerService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        service.addCustomer(new Customer("CUS-1001", "Amina Khan", "amina.khan@example.com",
                "555-0101", CustomerStatus.ACTIVE, LocalDateTime.now()));
        service.addCustomer(new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com",
                "555-0102", CustomerStatus.PROSPECT, LocalDateTime.now()));
        System.out.println("All customers: " + service.listAll());
        service.updateStatus("CUS-1002", CustomerStatus.ACTIVE);
        System.out.println("After activation: " + service.findByCustomerId("CUS-1002"));
    }
}
```

### `src/main/java/com/northstar/crm/service/CustomerNotifier.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.CustomerStatus;

public interface CustomerNotifier {
    void notifyStatusChange(String customerId, CustomerStatus oldStatus, CustomerStatus newStatus);
}
```

### `src/main/java/com/northstar/crm/service/CustomerService.java`

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

### `src/test/java/com/northstar/crm/entity/CustomerTest.java`

```java
package com.northstar.crm.entity;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CustomerTest {

    @Test
    void equalsIsBasedOnCustomerIdOnly() {
        Customer a = new Customer("CUS-1001", "Amina Khan", "amina.khan@example.com",
                "555-0101", CustomerStatus.ACTIVE, LocalDateTime.now());
        Customer b = new Customer("CUS-1001", "Different Name", "other@example.com",
                "555-0199", CustomerStatus.CLOSED, LocalDateTime.now());
        assertEquals(a, b, "Customers with the same customerId must be considered equal");
        Customer c = new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com",
                "555-0102", CustomerStatus.PROSPECT, LocalDateTime.now());
        assertNotEquals(a, c);
    }

    @Test
    void toStringIncludesCustomerId() {
        Customer ravi = new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com",
                "555-0102", CustomerStatus.PROSPECT, LocalDateTime.now());
        assertTrue(ravi.toString().contains("CUS-1002"));
    }
}
```

### `src/test/java/com/northstar/crm/service/CustomerNotifierMockTest.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class CustomerNotifierMockTest {

    @Mock
    private CustomerNotifier notifier;

    @Test
    void updateStatusInvokesNotifierWithOldAndNewStatus() {
        CustomerService service = new CustomerService(notifier);
        Customer ravi = new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com",
                "555-0102", CustomerStatus.PROSPECT, LocalDateTime.now());
        service.addCustomer(ravi);

        service.updateStatus("CUS-1002", CustomerStatus.ACTIVE);

        verify(notifier).notifyStatusChange("CUS-1002", CustomerStatus.PROSPECT, CustomerStatus.ACTIVE);
    }
}
```

### `src/test/java/com/northstar/crm/service/CustomerServiceTest.java`

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

### `pom.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.northstar</groupId>
  <artifactId>customer-service</artifactId>
  <version>0.1.0-SNAPSHOT</version>
  <packaging>jar</packaging>
  <name>Northstar Customer Service</name>
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.release>21</maven.compiler.release>
    <junit.version>5.11.4</junit.version>
    <mockito.version>5.14.2</mockito.version>
  </properties>
  <dependencies>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>${junit.version}</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.mockito</groupId>
      <artifactId>mockito-core</artifactId>
      <version>${mockito.version}</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.mockito</groupId>
      <artifactId>mockito-junit-jupiter</artifactId>
      <version>${mockito.version}</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  <build>
    <finalName>customer-service</finalName>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.13.0</version>
        <configuration><release>21</release></configuration>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.5.2</version>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.4.2</version>
        <configuration>
          <archive>
            <manifest>
              <mainClass>com.northstar.crm.Main</mainClass>
            </manifest>
          </archive>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
```

### `copilot-notes/ai-test-refactor-notes.md`

```markdown
## lab11-001 — false-confidence rejection

Rejected weak suggestion:
```java
@Test void serviceIsNotNull() { assertNotNull(service); }
```
Reason: cannot fail while `@BeforeEach` constructs the service. Replaced with `findByStatusReturnsOnlyMatchingCustomers`.

## lab11-002 — smell → refactor

Smell: duplicated blank `customerId` checks + `System.out` side effect.
Refactor: `validateCustomerId()` helper + `CustomerNotifier` called from `updateStatus`.
Proof: `CustomerServiceTest` + `CustomerNotifierMockTest` green.

## lab11-003 — coverage gaps

Covered: equals/toString (entity); add/duplicate/update/unknown/findByStatus; notifier verify.
Gaps acceptable now: exhaustive `listAll` direct asserts; edge cases for SUSPENDED/CLOSED transitions.

## lab11-004 — acceptance guidelines

1. Every assertion must be able to fail.
2. Every refactor backed by tests before/after.
3. No new undeclared dependencies.
4. Author can explain without Copilot.
5. Coverage gaps documented.
```

## Instructor notes

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


