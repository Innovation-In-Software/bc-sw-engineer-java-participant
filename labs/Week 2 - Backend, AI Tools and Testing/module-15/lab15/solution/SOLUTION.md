# Lab 15 — Complete reference solution

> **Finished project** — every source file below is the completed answer (not a smoke checklist).
>
> Attempt [`../starter/`](../starter/) first. Guide: [`../LAB-15-GUIDE.md`](../LAB-15-GUIDE.md)

## Goal

**Repository + validator transitions + DefaultCustomerService**

## Run the finished project

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab15-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab15-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab15-crm
mvn -B clean test
```

**Expected:** Tests run: 3

## File index (17 files)

| # | Path |
|---|------|
| 1 | `src/main/java/com/northstar/crm/api/CustomerApiFacade.java` |
| 2 | `src/main/java/com/northstar/crm/config/AppConfig.java` |
| 3 | `src/main/java/com/northstar/crm/dto/CustomerMapper.java` |
| 4 | `src/main/java/com/northstar/crm/dto/CustomerRequestDTO.java` |
| 5 | `src/main/java/com/northstar/crm/dto/CustomerResponseDTO.java` |
| 6 | `src/main/java/com/northstar/crm/entity/Customer.java` |
| 7 | `src/main/java/com/northstar/crm/entity/CustomerStatus.java` |
| 8 | `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java` |
| 9 | `src/main/java/com/northstar/crm/Main.java` |
| 10 | `src/main/java/com/northstar/crm/repository/CustomerRepository.java` |
| 11 | `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java` |
| 12 | `src/main/java/com/northstar/crm/service/CustomerService.java` |
| 13 | `src/main/java/com/northstar/crm/service/CustomerValidator.java` |
| 14 | `src/main/java/com/northstar/crm/service/DefaultCustomerService.java` |
| 15 | `src/test/java/com/northstar/crm/service/CustomerValidatorTest.java` |
| 16 | `pom.xml` |
| 17 | `docs/service-layer-notes.md` |

## Full source

### `src/main/java/com/northstar/crm/api/CustomerApiFacade.java`

```java
package com.northstar.crm.api;

import com.northstar.crm.dto.CustomerMapper;
import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.service.CustomerService;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.Set;
import java.util.stream.Collectors;

/** Lab 14 facade adapted to Lab 15 CustomerService interface. */
public class CustomerApiFacade {
    private final CustomerService service;
    private final Validator validator;

    public CustomerApiFacade(CustomerService service) {
        this.service = service;
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    public CustomerResponseDTO create(CustomerRequestDTO request, String correlationId) {
        validateOrThrow(request, correlationId);
        var saved = service.addCustomer(CustomerMapper.toEntity(request));
        return CustomerMapper.toResponse(saved);
    }

    public CustomerResponseDTO get(String customerId, String correlationId) {
        return service.findById(customerId)
                .map(CustomerMapper::toResponse)
                .orElseThrow(() -> new IllegalArgumentException(
                        "[" + correlationId + "] Customer not found: " + customerId));
    }

    private void validateOrThrow(CustomerRequestDTO request, String correlationId) {
        Set<ConstraintViolation<CustomerRequestDTO>> violations = validator.validate(request);
        if (!violations.isEmpty()) {
            String msg = violations.stream()
                    .map(v -> v.getPropertyPath() + ": " + v.getMessage())
                    .collect(Collectors.joining("; "));
            throw new IllegalArgumentException("[" + correlationId + "] " + msg);
        }
    }
}
```

### `src/main/java/com/northstar/crm/config/AppConfig.java`

```java
package com.northstar.crm.config;

public final class AppConfig {
    public static final String CORRELATION_ID = "lab-request-001";
    private AppConfig() {}
}
```

### `src/main/java/com/northstar/crm/dto/CustomerMapper.java`

```java
package com.northstar.crm.dto;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import java.time.LocalDateTime;

public final class CustomerMapper {
    private CustomerMapper() {}

    public static Customer toEntity(CustomerRequestDTO dto) {
        CustomerStatus status = CustomerStatus.valueOf(dto.getStatus().trim().toUpperCase());
        return new Customer(dto.getCustomerId(), dto.getFullName(), dto.getEmail(), null,
                status, LocalDateTime.now());
    }

    public static CustomerResponseDTO toResponse(Customer entity) {
        return CustomerResponseDTO.of(
                entity.getCustomerId(),
                entity.getFullName(),
                entity.getEmail(),
                entity.getStatus().name(),
                entity.getCreatedAt());
    }
}
```

### `src/main/java/com/northstar/crm/dto/CustomerRequestDTO.java`

```java
package com.northstar.crm.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/** Lab 14 baseline — Bean Validation on the API edge. */
public class CustomerRequestDTO {

    @NotBlank
    @Size(max = 32)
    private String customerId;

    @NotBlank
    @Size(min = 2, max = 100)
    private String fullName;

    @NotBlank
    @Email
    @Size(max = 254)
    private String email;

    @NotBlank
    private String status;

    public CustomerRequestDTO() {}

    public CustomerRequestDTO(String customerId, String fullName, String email, String status) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.email = email;
        this.status = status;
    }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
```

### `src/main/java/com/northstar/crm/dto/CustomerResponseDTO.java`

```java
package com.northstar.crm.dto;

import java.time.LocalDateTime;

public class CustomerResponseDTO {
    private String customerId;
    private String fullName;
    private String email;
    private String status;
    private LocalDateTime createdAt;

    public static CustomerResponseDTO of(String customerId, String fullName, String email,
                                         String status, LocalDateTime createdAt) {
        CustomerResponseDTO dto = new CustomerResponseDTO();
        dto.customerId = customerId;
        dto.fullName = fullName;
        dto.email = email;
        dto.status = status;
        dto.createdAt = createdAt;
        return dto;
    }

    public String getCustomerId() { return customerId; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getStatus() { return status; }
    public LocalDateTime getCreatedAt() { return createdAt; }
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
    private LocalDateTime updatedAt;

    public Customer() {}

    public Customer(String customerId, String fullName, String email, String phone,
                    CustomerStatus status, LocalDateTime createdAt) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = createdAt;
    }

    public static Customer amina() {
        return new Customer("CUS-1001", "Amina Khan", "amina.khan@example.com", null,
                CustomerStatus.ACTIVE, LocalDateTime.now());
    }

    public static Customer ravi() {
        return new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com", null,
                CustomerStatus.PROSPECT, LocalDateTime.now());
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
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    public void touchUpdatedAt() { this.updatedAt = LocalDateTime.now(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer other)) return false;
        return Objects.equals(customerId, other.customerId);
    }

    @Override
    public int hashCode() { return Objects.hash(customerId); }

    @Override
    public String toString() {
        return "Customer{customerId='" + customerId + "', status=" + status + "}";
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
import com.northstar.crm.repository.CustomerRepository;
import com.northstar.crm.repository.InMemoryCustomerRepository;
import com.northstar.crm.service.CustomerService;
import com.northstar.crm.service.CustomerValidator;
import com.northstar.crm.service.DefaultCustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerRepository repo = new InMemoryCustomerRepository();
        CustomerValidator validator = new CustomerValidator(repo);
        CustomerService service = new DefaultCustomerService(repo, validator);

        service.addCustomer(Customer.amina());
        service.addCustomer(Customer.ravi());

        Customer activated = service.changeStatus(
                "CUS-1002", CustomerStatus.ACTIVE, "lab-request-001");
        System.out.printf("activated %s status=%s%n",
                activated.getCustomerId(), activated.getStatus());

        try {
            service.changeStatus("CUS-1001", CustomerStatus.PROSPECT, "lab-request-001");
        } catch (IllegalStateException ex) {
            System.out.println("expected failure: " + ex.getMessage());
        }
        System.out.println("CUS-1001 still: "
                + service.findById("CUS-1001").orElseThrow().getStatus());
    }
}
```

### `src/main/java/com/northstar/crm/repository/CustomerRepository.java`

```java
package com.northstar.crm.repository;

import com.northstar.crm.entity.Customer;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    Customer save(Customer customer);
    Optional<Customer> findById(String customerId);
    boolean existsById(String customerId);
    boolean existsByEmail(String email);
    List<Customer> findAll();
}
```

### `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java`

```java
package com.northstar.crm.repository;

import com.northstar.crm.entity.Customer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/** Map must stay private — anti-leak rule for Lab 15. */
public class InMemoryCustomerRepository implements CustomerRepository {
    private final Map<String, Customer> store = new HashMap<>();

    @Override
    public Customer save(Customer customer) {
        store.put(customer.getCustomerId(), customer);
        return customer;
    }

    @Override
    public Optional<Customer> findById(String customerId) {
        return Optional.ofNullable(store.get(customerId));
    }

    @Override
    public boolean existsById(String customerId) {
        return store.containsKey(customerId);
    }

    @Override
    public boolean existsByEmail(String email) {
        if (email == null) {
            return false;
        }
        return store.values().stream().anyMatch(c -> email.equalsIgnoreCase(c.getEmail()));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(store.values());
    }
}
```

### `src/main/java/com/northstar/crm/service/CustomerService.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer addCustomer(Customer customer);
    Optional<Customer> findById(String customerId);
    List<Customer> listAll();
    Customer changeStatus(String customerId, CustomerStatus newStatus, String correlationId);
}
```

### `src/main/java/com/northstar/crm/service/CustomerValidator.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.repository.CustomerRepository;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class CustomerValidator {
    private static final Map<CustomerStatus, Set<CustomerStatus>> ALLOWED =
            new EnumMap<>(CustomerStatus.class);

    static {
        ALLOWED.put(CustomerStatus.PROSPECT, EnumSet.of(CustomerStatus.ACTIVE, CustomerStatus.CLOSED));
        ALLOWED.put(CustomerStatus.ACTIVE, EnumSet.of(CustomerStatus.SUSPENDED, CustomerStatus.CLOSED));
        ALLOWED.put(CustomerStatus.SUSPENDED, EnumSet.of(CustomerStatus.ACTIVE, CustomerStatus.CLOSED));
        ALLOWED.put(CustomerStatus.CLOSED, EnumSet.noneOf(CustomerStatus.class));
    }

    private final CustomerRepository repository;

    public CustomerValidator(CustomerRepository repository) {
        this.repository = repository;
    }

    public void validateNew(Customer customer) {
        if (customer.getCustomerId() == null || customer.getCustomerId().isBlank()) {
            throw new IllegalArgumentException("customerId is required");
        }
        if (repository.existsById(customer.getCustomerId())) {
            throw new IllegalStateException("duplicate customerId: " + customer.getCustomerId());
        }
        if (customer.getEmail() != null && repository.existsByEmail(customer.getEmail())) {
            throw new IllegalStateException("duplicate email: " + customer.getEmail());
        }
    }

    public void validateTransition(CustomerStatus from, CustomerStatus to, String correlationId) {
        Set<CustomerStatus> allowed = ALLOWED.getOrDefault(from, Set.of());
        if (!allowed.contains(to)) {
            throw new IllegalStateException(
                    "illegal status transition " + from + " -> " + to
                            + " [" + correlationId + "]");
        }
    }
}
```

### `src/main/java/com/northstar/crm/service/DefaultCustomerService.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;

public class DefaultCustomerService implements CustomerService {
    private final CustomerRepository repository;
    private final CustomerValidator validator;

    public DefaultCustomerService(CustomerRepository repository, CustomerValidator validator) {
        this.repository = repository;
        this.validator = validator;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        validator.validateNew(customer);
        return repository.save(customer);
    }

    @Override
    public Optional<Customer> findById(String customerId) {
        return repository.findById(customerId);
    }

    @Override
    public List<Customer> listAll() {
        return List.copyOf(repository.findAll());
    }

    @Override
    public Customer changeStatus(String customerId, CustomerStatus newStatus, String correlationId) {
        Customer existing = repository.findById(customerId)
                .orElseThrow(() -> new IllegalArgumentException(
                        "customer not found [" + correlationId + "]: " + customerId));
        validator.validateTransition(existing.getStatus(), newStatus, correlationId);
        existing.setStatus(newStatus);
        existing.touchUpdatedAt();
        return repository.save(existing);
    }
}
```

### `src/test/java/com/northstar/crm/service/CustomerValidatorTest.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.repository.InMemoryCustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerValidatorTest {
    CustomerValidator validator;
    InMemoryCustomerRepository repo;

    @BeforeEach
    void setUp() {
        repo = new InMemoryCustomerRepository();
        validator = new CustomerValidator(repo);
    }

    @Test
    void prospectToActiveAllowed() {
        assertDoesNotThrow(() ->
                validator.validateTransition(
                        CustomerStatus.PROSPECT, CustomerStatus.ACTIVE, "lab-request-001"));
    }

    @Test
    void activeToProspectRejected() {
        IllegalStateException ex = assertThrows(IllegalStateException.class, () ->
                validator.validateTransition(
                        CustomerStatus.ACTIVE, CustomerStatus.PROSPECT, "lab-request-001"));
        assertTrue(ex.getMessage().contains("lab-request-001"));
        assertTrue(ex.getMessage().contains("ACTIVE"));
        assertTrue(ex.getMessage().contains("PROSPECT"));
    }

    @Test
    void duplicateIdRejected() {
        repo.save(Customer.amina());
        assertThrows(IllegalStateException.class, () -> validator.validateNew(Customer.amina()));
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
  <artifactId>lab15-crm</artifactId>
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
      <groupId>jakarta.validation</groupId>
      <artifactId>jakarta.validation-api</artifactId>
      <version>3.1.0</version>
    </dependency>
    <dependency>
      <groupId>org.hibernate.validator</groupId>
      <artifactId>hibernate-validator</artifactId>
      <version>8.0.2.Final</version>
    </dependency>
    <dependency>
      <groupId>org.glassfish.expressly</groupId>
      <artifactId>expressly</artifactId>
      <version>5.0.0</version>
    </dependency>
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

### `docs/service-layer-notes.md`

```markdown
# Lab 15 — Service layer notes (solution)

## Bean Validation vs CustomerValidator

| Layer | Responsibility |
| --- | --- |
| Lab 14 Bean Validation (DTO) | Shape: non-blank id/name, email format |
| Lab 15 `CustomerValidator` | Meaning: uniqueness + allowed status transitions |

## Allowed transitions

```text
PROSPECT  -> ACTIVE, CLOSED
ACTIVE    -> SUSPENDED, CLOSED
SUSPENDED -> ACTIVE, CLOSED
CLOSED    -> (none)
```

Same-status `changeStatus` is **rejected** (destination must appear in ALLOWED).

## Wiring (shared repository)

```java
CustomerRepository repo = new InMemoryCustomerRepository();
CustomerValidator validator = new CustomerValidator(repo);
CustomerService service = new DefaultCustomerService(repo, validator);
```

Two different repo instances break uniqueness checks.

## Anti-leak

`Map` stays private inside `InMemoryCustomerRepository`. `listAll()` returns `List.copyOf(...)`.
No `HashMap` / JDBC / `EntityManager` in the `service` package.
```

## Instructor notes

# Lab 15 solution notes

## What / why

Instructor key for the service-layer lab: private-Map repository, transition matrix in `CustomerValidator`, constructor-DI `DefaultCustomerService` that validates **before** mutating status. Fixtures: `CUS-1001` Amina ACTIVE, `CUS-1002` Ravi PROSPECT→ACTIVE, correlation `lab-request-001`.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-15\lab15\solution"
mvn -B clean test
mvn -q exec:java -Dexec.mainClass=com.northstar.crm.Main
```

Expect: tests green; Main prints `activated CUS-1002 status=ACTIVE`, illegal transition message with `[lab-request-001]`, Amina still ACTIVE.

## Pitfalls

- Two repo instances → duplicate checks miss existing customers.
- Mutating status before `validateTransition` corrupts state on failure.
- Lab 16 replaces `IllegalStateException` / `IllegalArgumentException` with `BusinessException`.


