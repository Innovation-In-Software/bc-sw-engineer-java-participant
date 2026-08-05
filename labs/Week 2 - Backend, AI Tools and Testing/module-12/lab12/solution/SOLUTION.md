# Lab 12 — Complete reference solution

> **Finished project** — every source file below is the completed answer (not a smoke checklist).
>
> Attempt [`../starter/`](../starter/) first. Guide: [`../LAB-12-GUIDE.md`](../LAB-12-GUIDE.md)

## Goal

**Refactor messy service to Map + create/get/updateStatus + correlation**

## Run the finished project

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab12-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab12-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab12-crm
mvn -B clean test
```

**Expected:** Tests run: 8, Failures: 0

## File index (16 files)

| # | Path |
|---|------|
| 1 | `src/main/java/com/northstar/crm/config/AppConfig.java` |
| 2 | `src/main/java/com/northstar/crm/dto/CustomerRequest.java` |
| 3 | `src/main/java/com/northstar/crm/dto/CustomerResponse.java` |
| 4 | `src/main/java/com/northstar/crm/entity/Customer.java` |
| 5 | `src/main/java/com/northstar/crm/entity/CustomerStatus.java` |
| 6 | `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java` |
| 7 | `src/main/java/com/northstar/crm/Main.java` |
| 8 | `src/main/java/com/northstar/crm/service/CustomerService.before.java.txt` |
| 9 | `src/main/java/com/northstar/crm/service/CustomerService.java` |
| 10 | `src/test/java/com/northstar/crm/entity/CustomerTest.java` |
| 11 | `src/test/java/com/northstar/crm/service/CustomerServiceTest.java` |
| 12 | `pom.xml` |
| 13 | `docs/ai-review-notes.md` |
| 14 | `docs/before-after.md` |
| 15 | `docs/CODING-STANDARDS-check.md` |
| 16 | `docs/smells.md` |

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

public class Main {
    public static void main(String[] args) {
        CustomerService svc = new CustomerService();
        svc.setCorrelationId("lab-request-001");

        Customer amina = svc.createCustomer(
                "CUS-1001", "Amina Khan", "amina.khan@example.com", "555-0101", CustomerStatus.ACTIVE);
        System.out.println("created " + amina);

        svc.createCustomer("CUS-1002", "Ravi Singh", "ravi.singh@example.com", "555-0102", CustomerStatus.PROSPECT);
        System.out.println("get CUS-1001 -> " + svc.getCustomer("CUS-1001"));
        System.out.println("update CUS-1002 -> " + svc.updateStatus("CUS-1002", CustomerStatus.ACTIVE));

        try {
            svc.createCustomer("CUS-1001", "Other", "x@example.com", null, CustomerStatus.PROSPECT);
        } catch (IllegalStateException ex) {
            System.out.println("duplicate: " + ex.getMessage());
        }
        try {
            svc.getCustomer("CUS-9999");
        } catch (IllegalArgumentException ex) {
            System.out.println("unknown: " + ex.getMessage());
        }
    }
}
```

### `src/main/java/com/northstar/crm/service/CustomerService.before.java.txt`

```text
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/** INTENTIONALLY MESSY — frozen baseline for Lab 12. */
public class CustomerService {
    List data = new ArrayList();

    public Object doStuff(String a, String b, String c, String d, String e) {
        if (a == null || a == "" || b == null || b == "") {
            System.out.println("bad");
            return null;
        }
        for (int i = 0; i < data.size(); i++) {
            Customer x = (Customer) data.get(i);
            if (x.getCustomerId().equals(a)) {
                System.out.println("dup");
                return null;
            }
        }
        Customer x = new Customer();
        x.setCustomerId(a);
        x.setFullName(b);
        x.setEmail(c);
        x.setPhone(d);
        if (e != null && e.equals("ACTIVE")) x.setStatus(CustomerStatus.ACTIVE);
        else if (e != null && e.equals("PROSPECT")) x.setStatus(CustomerStatus.PROSPECT);
        else if (e != null && e.equals("SUSPENDED")) x.setStatus(CustomerStatus.SUSPENDED);
        else if (e != null && e.equals("CLOSED")) x.setStatus(CustomerStatus.CLOSED);
        else x.setStatus(CustomerStatus.PROSPECT);
        x.setCreatedAt(LocalDateTime.now());
        data.add(x);
        System.out.println("ok " + a);
        if (b != null && b.contains("UPDATE")) {
            for (int i = 0; i < data.size(); i++) {
                Customer y = (Customer) data.get(i);
                if (y.getCustomerId().equals(a)) {
                    if (e != null && e.equals("ACTIVE")) y.setStatus(CustomerStatus.ACTIVE);
                    else if (e != null && e.equals("PROSPECT")) y.setStatus(CustomerStatus.PROSPECT);
                    System.out.println("upd");
                }
            }
        }
        return x;
    }

    public Object get(String id) {
        for (int i = 0; i < data.size(); i++) {
            Customer x = (Customer) data.get(i);
            if (x.getCustomerId() == id) {
                return x;
            }
        }
        return null;
    }
}
```

### `src/main/java/com/northstar/crm/service/CustomerService.java`

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

### `src/test/java/com/northstar/crm/entity/CustomerTest.java`

```java
package com.northstar.crm.entity;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void equalsIsBasedOnCustomerIdOnly() {
        Customer a = new Customer("CUS-1001", "Amina Khan", "a@example.com", "1",
                CustomerStatus.ACTIVE, LocalDateTime.now());
        Customer b = new Customer("CUS-1001", "Other", "o@example.com", "2",
                CustomerStatus.CLOSED, LocalDateTime.now());
        assertEquals(a, b);
    }

    @Test
    void toStringIncludesCustomerId() {
        Customer c = new Customer("CUS-1002", "Ravi Singh", "r@example.com", "3",
                CustomerStatus.PROSPECT, LocalDateTime.now());
        assertTrue(c.toString().contains("CUS-1002"));
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
  </properties>
  <dependencies>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>${junit.version}</version>
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

### `docs/ai-review-notes.md`

```markdown
## lab12-001 — manual refactor substitute

- Prompt/choice: extract validation helpers + Map store (manual; Copilot optional)
- Decision: accept-with-edits
- Risk caught: would have reintroduced silent upsert on duplicate — rejected; keep IllegalStateException
```

### `docs/before-after.md`

```markdown
# Before / after (Lab 12)

## Before

- API: `doStuff` / `get`
- Store: raw `List`
- Errors: return `null`
- Lookup bug: `==` on String IDs

## After

- API: `createCustomer` / `getCustomer` / `updateStatus`
- Store: `Map<String, Customer>`
- Errors: `IllegalArgumentException` / `IllegalStateException` with `correlationId=lab-request-001`
- Lookup: Map get works for `new String("CUS-1001")`

## Tests

`mvn -B clean test` → Tests run: 8, Failures: 0
```

### `docs/CODING-STANDARDS-check.md`

```markdown
# Coding standards check (Lab 12)

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Meaningful type and method names | Pass |
| 2 | No raw types in new code | Pass |
| 3 | Validation in clear helpers | Pass |
| 4 | Exceptions instead of null for errors | Pass |
| 5 | No production secrets / only sample emails | Pass |
| 6 | Compiles without Spring/JPA/Kafka | Pass |
```

### `docs/smells.md`

```markdown
# Code smells (Lab 12 baseline)

| # | Smell | CRM impact | Fix applied |
| - | ----- | ---------- | ----------- |
| 1 | Poor naming (`doStuff`, `data`) | Unreadable API for Lab 13+ | `createCustomer` / `getCustomer` / `customersById` |
| 2 | Raw types | ClassCast risk | `Map<String, Customer>` |
| 3 | Long method / mixed responsibilities | Hard to test | Extracted validation helpers |
| 4 | Stringly-typed status | Typo bugs | Typed `CustomerStatus` parameter |
| 5 | Incorrect equality (`==`) | Missed lookups | Map key + `equals` |
| 6 | Null as control flow | NPEs in callers | Exceptions with messages |
| 7 | Side-effect logging | Noisy / uncorrelated | Correlation in exception messages |
| 8 | Magic `"UPDATE"` behavior | Undocumented updates | Removed; use `updateStatus` only |
```

## Instructor notes

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


