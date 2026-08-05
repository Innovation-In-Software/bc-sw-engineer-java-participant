# Lab 14 — Complete reference solution

> **Finished project** — every source file below is the completed answer (not a smoke checklist).
>
> Attempt [`../starter/`](../starter/) first. Guide: [`../LAB-14-GUIDE.md`](../LAB-14-GUIDE.md)

## Goal

**DTO + Bean Validation + CustomerMapper + facade**

## Run the finished project

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab14-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab14-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab14-crm
mvn -B clean test
```

**Expected:** Tests run: 13

## File index (15 files)

| # | Path |
|---|------|
| 1 | `src/main/java/com/northstar/crm/api/CustomerApiFacade.java` |
| 2 | `src/main/java/com/northstar/crm/config/AppConfig.java` |
| 3 | `src/main/java/com/northstar/crm/dto/CustomerRequestDTO.java` |
| 4 | `src/main/java/com/northstar/crm/dto/CustomerResponseDTO.java` |
| 5 | `src/main/java/com/northstar/crm/entity/Customer.java` |
| 6 | `src/main/java/com/northstar/crm/entity/CustomerStatus.java` |
| 7 | `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java` |
| 8 | `src/main/java/com/northstar/crm/Main.java` |
| 9 | `src/main/java/com/northstar/crm/mapper/CustomerMapper.java` |
| 10 | `src/main/java/com/northstar/crm/service/CustomerService.java` |
| 11 | `src/test/java/com/northstar/crm/api/CustomerApiFacadeTest.java` |
| 12 | `src/test/java/com/northstar/crm/dto/CustomerRequestDTOValidationTest.java` |
| 13 | `src/test/java/com/northstar/crm/mapper/CustomerMapperTest.java` |
| 14 | `pom.xml` |
| 15 | `docs/dto-boundary-notes.md` |

## Full source

### `src/main/java/com/northstar/crm/api/CustomerApiFacade.java`

```java
package com.northstar.crm.api;

import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.mapper.CustomerMapper;
import com.northstar.crm.service.CustomerService;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * API edge: validate → map → service → response DTO.
 * Correlation: lab-request-001 on failures.
 */
public class CustomerApiFacade {
    private final CustomerService service;
    private final Validator validator;

    public CustomerApiFacade(CustomerService service) {
        this.service = service;
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    public CustomerResponseDTO create(CustomerRequestDTO request, String correlationId) {
        validateOrThrow(request, correlationId);
        var entity = CustomerMapper.toEntity(request);
        var saved = service.createCustomer(
                entity.getCustomerId(),
                entity.getFullName(),
                entity.getEmail(),
                entity.getPhone(),
                entity.getStatus());
        return CustomerMapper.toResponse(saved);
    }

    public CustomerResponseDTO get(String customerId, String correlationId) {
        try {
            return CustomerMapper.toResponse(service.getCustomer(customerId));
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException(
                    "customer not found [" + correlationId + "]: " + customerId, ex);
        }
    }

    private void validateOrThrow(CustomerRequestDTO request, String correlationId) {
        Set<ConstraintViolation<CustomerRequestDTO>> violations = validator.validate(request);
        if (!violations.isEmpty()) {
            String msg = violations.stream()
                    .map(v -> v.getPropertyPath() + ": " + v.getMessage())
                    .collect(Collectors.joining("; "));
            System.out.println("validation failed correlationId=" + correlationId + " detail=" + msg);
            throw new IllegalArgumentException("[" + correlationId + "] " + msg);
        }
    }
}
```

### `src/main/java/com/northstar/crm/config/AppConfig.java`

```java
package com.northstar.crm.config;

public class AppConfig {
}
```

### `src/main/java/com/northstar/crm/dto/CustomerRequestDTO.java`

```java
package com.northstar.crm.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CustomerRequestDTO {

    @NotBlank(message = "customerId is required")
    @Size(max = 32, message = "customerId must be at most 32 characters")
    private String customerId;

    @NotBlank(message = "fullName is required")
    @Size(min = 2, max = 100, message = "fullName must be between 2 and 100 characters")
    private String fullName;

    @NotBlank(message = "email is required")
    @Email(message = "email must be a valid address")
    @Size(max = 254, message = "email must be at most 254 characters")
    private String email;

    @NotBlank(message = "status is required")
    @Size(min = 1, max = 32, message = "status must be between 1 and 32 characters")
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

import java.time.Instant;

public class CustomerResponseDTO {
    private String customerId;
    private String fullName;
    private String email;
    private String status;
    private Instant createdAt;
    private Instant updatedAt;

    public static CustomerResponseDTO of(
            String customerId, String fullName, String email,
            String status, Instant createdAt, Instant updatedAt) {
        CustomerResponseDTO dto = new CustomerResponseDTO();
        dto.customerId = customerId;
        dto.fullName = fullName;
        dto.email = email;
        dto.status = status;
        dto.createdAt = createdAt;
        dto.updatedAt = updatedAt;
        return dto;
    }

    public String getCustomerId() { return customerId; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getStatus() { return status; }
    public Instant getCreatedAt() { return createdAt; }
    public Instant getUpdatedAt() { return updatedAt; }

    @Override
    public String toString() {
        return "CustomerResponseDTO{customerId='" + customerId + "', fullName='" + fullName
                + "', email='" + email + "', status='" + status + "', createdAt=" + createdAt + "}";
    }
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

import com.northstar.crm.api.CustomerApiFacade;
import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.service.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerApiFacade api = new CustomerApiFacade(new CustomerService());
        String correlation = "lab-request-001";

        CustomerRequestDTO amina = new CustomerRequestDTO(
                "CUS-1001", "Amina Khan", "amina.khan@example.com", "ACTIVE");
        CustomerResponseDTO createdAmina = api.create(amina, correlation);
        System.out.println("created: " + createdAmina);

        CustomerRequestDTO ravi = new CustomerRequestDTO(
                "CUS-1002", "Ravi Singh", "ravi.singh@example.com", "PROSPECT");
        CustomerResponseDTO createdRavi = api.create(ravi, correlation);
        System.out.println("created: " + createdRavi);

        System.out.println("get CUS-1001: " + api.get("CUS-1001", correlation));
        System.out.println("get CUS-1002: " + api.get("CUS-1002", correlation));

        try {
            CustomerRequestDTO bad = new CustomerRequestDTO(
                    "CUS-1003", "Bad Email", "not-an-email", "ACTIVE");
            api.create(bad, correlation);
        } catch (IllegalArgumentException ex) {
            System.out.println("invalid email: " + ex.getMessage());
        }

        try {
            api.get("CUS-9999", correlation);
        } catch (IllegalArgumentException ex) {
            System.out.println("unknown id: " + ex.getMessage());
        }
    }
}
```

### `src/main/java/com/northstar/crm/mapper/CustomerMapper.java`

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

### `src/main/java/com/northstar/crm/service/CustomerService.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/** Lab 12-shaped clean API for Lab 14 DTO boundary. */
public class CustomerService {
    private final Map<String, Customer> customersById = new HashMap<>();

    public Customer createCustomer(String customerId, String fullName, String email,
                                   String phone, CustomerStatus status) {
        if (customerId == null || customerId.isBlank() || fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("customerId and fullName are required");
        }
        if (customersById.containsKey(customerId)) {
            throw new IllegalStateException("Duplicate customerId: " + customerId);
        }
        Customer c = new Customer(customerId, fullName, email, phone,
                status != null ? status : CustomerStatus.PROSPECT, LocalDateTime.now());
        customersById.put(customerId, c);
        return c;
    }

    public Customer getCustomer(String customerId) {
        return findByCustomerId(customerId)
                .orElseThrow(() -> new IllegalArgumentException("Customer not found: " + customerId));
    }

    public Optional<Customer> findByCustomerId(String customerId) {
        return Optional.ofNullable(customersById.get(customerId));
    }
}
```

### `src/test/java/com/northstar/crm/api/CustomerApiFacadeTest.java`

```java
package com.northstar.crm.api;

import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.service.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerApiFacadeTest {
    private CustomerApiFacade api;

    @BeforeEach
    void setUp() {
        api = new CustomerApiFacade(new CustomerService());
    }

    @Test
    void createReturnsResponseDtoOnly() {
        CustomerResponseDTO dto = api.create(
                new CustomerRequestDTO("CUS-1001", "Amina Khan", "amina.khan@example.com", "ACTIVE"),
                "lab-request-001");
        assertEquals("CUS-1001", dto.getCustomerId());
        assertEquals("ACTIVE", dto.getStatus());
        assertEquals("Amina Khan", dto.getFullName());
    }

    @Test
    void getReturnsResponseDto() {
        api.create(new CustomerRequestDTO("CUS-1002", "Ravi Singh", "ravi.singh@example.com", "PROSPECT"),
                "lab-request-001");
        CustomerResponseDTO dto = api.get("CUS-1002", "lab-request-001");
        assertEquals("PROSPECT", dto.getStatus());
    }

    @Test
    void invalidEmailIncludesCorrelationId() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                api.create(new CustomerRequestDTO("CUS-1003", "X", "bad", "ACTIVE"), "lab-request-001"));
        assertTrue(ex.getMessage().contains("lab-request-001"));
    }

    @Test
    void unknownIdIncludesCorrelationId() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                api.get("CUS-9999", "lab-request-001"));
        assertTrue(ex.getMessage().contains("lab-request-001"));
        assertTrue(ex.getMessage().contains("CUS-9999"));
    }

    @Test
    void duplicateCreateThrows() {
        api.create(new CustomerRequestDTO("CUS-1001", "Amina Khan", "amina.khan@example.com", "ACTIVE"),
                "lab-request-001");
        assertThrows(IllegalStateException.class, () ->
                api.create(new CustomerRequestDTO("CUS-1001", "Other", "o@example.com", "ACTIVE"),
                        "lab-request-001"));
    }
}
```

### `src/test/java/com/northstar/crm/dto/CustomerRequestDTOValidationTest.java`

```java
package com.northstar.crm.dto;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRequestDTOValidationTest {
    private Validator validator;

    @BeforeEach
    void setUp() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    void acceptsAminaKhan() {
        CustomerRequestDTO dto = validTemplate();
        dto.setCustomerId("CUS-1001");
        dto.setFullName("Amina Khan");
        dto.setEmail("amina.khan@example.com");
        dto.setStatus("ACTIVE");
        assertTrue(validator.validate(dto).isEmpty());
    }

    @Test
    void rejectsInvalidEmail() {
        CustomerRequestDTO dto = validTemplate();
        dto.setEmail("not-an-email");
        Set<ConstraintViolation<CustomerRequestDTO>> violations = validator.validate(dto);
        assertFalse(violations.isEmpty());
        assertTrue(violations.stream().anyMatch(v -> v.getPropertyPath().toString().equals("email")));
    }

    @Test
    void rejectsBlankFullName() {
        CustomerRequestDTO dto = validTemplate();
        dto.setFullName(" ");
        assertFalse(validator.validate(dto).isEmpty());
    }

    @Test
    void rejectsBlankCustomerId() {
        CustomerRequestDTO dto = validTemplate();
        dto.setCustomerId(" ");
        assertFalse(validator.validate(dto).isEmpty());
    }

    @Test
    void rejectsBlankStatus() {
        CustomerRequestDTO dto = validTemplate();
        dto.setStatus("");
        assertFalse(validator.validate(dto).isEmpty());
    }

    private CustomerRequestDTO validTemplate() {
        CustomerRequestDTO dto = new CustomerRequestDTO();
        dto.setCustomerId("CUS-1002");
        dto.setFullName("Ravi Singh");
        dto.setEmail("ravi.singh@example.com");
        dto.setStatus("PROSPECT");
        return dto;
    }
}
```

### `src/test/java/com/northstar/crm/mapper/CustomerMapperTest.java`

```java
package com.northstar.crm.mapper;

import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerMapperTest {

    @Test
    void toEntityMapsStatusEnum() {
        CustomerRequestDTO req = new CustomerRequestDTO(
                "CUS-1001", "Amina Khan", "amina.khan@example.com", "ACTIVE");
        Customer entity = CustomerMapper.toEntity(req);
        assertEquals("CUS-1001", entity.getCustomerId());
        assertEquals(CustomerStatus.ACTIVE, entity.getStatus());
    }

    @Test
    void toResponseNeverExposesEntityType() {
        Customer entity = CustomerMapper.toEntity(new CustomerRequestDTO(
                "CUS-1002", "Ravi Singh", "ravi.singh@example.com", "PROSPECT"));
        CustomerResponseDTO dto = CustomerMapper.toResponse(entity);
        assertEquals("CUS-1002", dto.getCustomerId());
        assertEquals("PROSPECT", dto.getStatus());
        assertNotNull(dto.getCreatedAt());
    }

    @Test
    void invalidStatusThrowsFromValueOf() {
        assertThrows(IllegalArgumentException.class, () ->
                CustomerMapper.toEntity(new CustomerRequestDTO(
                        "CUS-1001", "A", "a@example.com", "NOT_A_STATUS")));
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

### `docs/dto-boundary-notes.md`

```markdown
# DTO boundary notes (Lab 14)

- API edge returns `CustomerResponseDTO` only — never `Customer` entity.
- Inbound payloads use `CustomerRequestDTO` with Jakarta Bean Validation.
- Mapping lives in `com.northstar.crm.mapper.CustomerMapper`.
- Facade validates first, then maps, then calls `createCustomer` / `getCustomer`.
- Correlation ID `lab-request-001` appears on validation and not-found failures.
- Timestamps: entity `LocalDateTime` → response `Instant` via UTC in the mapper.
```

## Instructor notes

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


