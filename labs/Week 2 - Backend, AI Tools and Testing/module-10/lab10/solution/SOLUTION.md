# Lab 10 — Complete reference solution

> **Finished project** — every source file below is the completed answer (not a smoke checklist).
>
> Attempt [`../starter/`](../starter/) first. Guide: [`../LAB-10-GUIDE.md`](../LAB-10-GUIDE.md)

## Goal

**Customer domain + in-memory CustomerService (add/find/updateStatus)**

## Run the finished project

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab10-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab10-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab10-crm
mvn -B clean compile; java -cp target/classes com.northstar.crm.Main
```

**Expected:** Main prints CUS-1001 / CUS-1002 demo

## File index (10 files)

| # | Path |
|---|------|
| 1 | `src/main/java/com/northstar/crm/config/AppConfig.java` |
| 2 | `src/main/java/com/northstar/crm/dto/CustomerRequest.java` |
| 3 | `src/main/java/com/northstar/crm/dto/CustomerResponse.java` |
| 4 | `src/main/java/com/northstar/crm/entity/Customer.java` |
| 5 | `src/main/java/com/northstar/crm/entity/CustomerStatus.java` |
| 6 | `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java` |
| 7 | `src/main/java/com/northstar/crm/Main.java` |
| 8 | `src/main/java/com/northstar/crm/service/CustomerService.java` |
| 9 | `pom.xml` |
| 10 | `copilot-notes/ai-review-notes.md` |

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
        System.out.println("Northstar customer service booting");
        CustomerService service = new CustomerService();

        service.addCustomer(new Customer("CUS-1001", "Amina Khan", "amina.khan@example.com",
                "555-0101", CustomerStatus.ACTIVE, LocalDateTime.now()));
        service.addCustomer(new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com",
                "555-0102", CustomerStatus.PROSPECT, LocalDateTime.now()));

        System.out.println("All customers: " + service.listAll());
        System.out.println("PROSPECT customers: " + service.findByStatus(CustomerStatus.PROSPECT));

        service.updateStatus("CUS-1002", CustomerStatus.ACTIVE);
        System.out.println("After activation: " + service.findByCustomerId("CUS-1002"));
    }
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

    public Customer addCustomer(Customer customer) {
        if (customer.getCustomerId() == null || customer.getCustomerId().isBlank()) {
            throw new IllegalArgumentException("customerId must not be blank");
        }
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
        Customer customer = findByCustomerId(customerId)
                .orElseThrow(() -> new IllegalArgumentException("No such customer: " + customerId));
        customer.setStatus(newStatus);
        return customer;
    }

    public List<Customer> listAll() {
        return List.copyOf(customers);
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

### `copilot-notes/ai-review-notes.md`

```markdown
## lab10-001 — weak vs strong (entity)

- Date: 2026-08-03
- Weak prompt used: `// customer class`
- Output summary: Invented Long id / JPA-style fields
- Strong prompt used: named fields, CustomerStatus enum, equals on customerId only, no JPA
- Output summary: Plain POJO matching Lab 10 shape
- Decision: accept-with-edits
- Reason: Rejected phantom JPA; kept String customerId.

## lab10-002 — weak vs strong (addCustomer)

- Date: 2026-08-03
- Weak prompt used: `// add a customer`
- Output summary: Happy path only
- Strong prompt used: blank/duplicate guards with IllegalStateException
- Output summary: Guard clauses present
- Decision: accept
- Reason: Rules match enterprise validation needs.

## lab10-003 — human review checklist

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Imports resolve (no phantom JPA/Spring) | Pass |
| 2 | Blank/duplicate/unknown ID rules present | Pass |
| 3 | equals/hashCode on customerId only | Pass |
| 4 | Explainable without Copilot | Pass |
| 5 | No secrets / real PII | Pass |

Caught/corrected: rejected `@Entity`/`@Id` suggestion for Customer.

## lab10-004 — AI risk awareness

1. Avoided real SSNs/passwords; used CUS-1001 / CUS-1002 sample emails only.
2. If suggestion looks copied from a library, verify license/provenance before accepting.
3. Team rule: no merge of AI code the author cannot explain offline.
```

## Instructor notes

# Lab 10 — Instructor solution notes

## What was implemented

- Plain-Java `Customer` + `CustomerStatus` (no JPA/Spring).
- In-memory `CustomerService` with add/find/updateStatus/listAll/findByStatus.
- `Main` demos CUS-1001 ACTIVE and CUS-1002 PROSPECT→ACTIVE.
- Review log entries `lab10-001`–`lab10-004`.

## How to verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-10\lab10\solution"
mvn -q clean compile
java -cp target\classes com.northstar.crm.Main
```

## Pitfalls

- Reject `@Entity` / `Long id` from Copilot.
- Prefer `java -cp target\classes` over fat JAR for this harness.


