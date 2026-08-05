# Lab 18 — Complete reference solution

> **Finished project** — every source file below is the completed answer (not a smoke checklist).
>
> Attempt [`../starter/`](../starter/) first. Guide: [`../LAB-18-GUIDE.md`](../LAB-18-GUIDE.md)

## Goal

**Mockito unit isolation + ArgumentCaptor + BDDMockito**

## Run the finished project

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab18-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab18-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab18-crm
mvn -B clean test
```

**Expected:** Tests run: 6

## File index (23 files)

| # | Path |
|---|------|
| 1 | `src/main/java/com/northstar/crm/api/ApiResult.java` |
| 2 | `src/main/java/com/northstar/crm/api/CustomerApiFacade.java` |
| 3 | `src/main/java/com/northstar/crm/config/AppConfig.java` |
| 4 | `src/main/java/com/northstar/crm/dto/CustomerMapper.java` |
| 5 | `src/main/java/com/northstar/crm/dto/CustomerRequestDTO.java` |
| 6 | `src/main/java/com/northstar/crm/dto/CustomerResponseDTO.java` |
| 7 | `src/main/java/com/northstar/crm/entity/Customer.java` |
| 8 | `src/main/java/com/northstar/crm/entity/CustomerStatus.java` |
| 9 | `src/main/java/com/northstar/crm/exception/BusinessException.java` |
| 10 | `src/main/java/com/northstar/crm/exception/CustomerNotFoundException.java` |
| 11 | `src/main/java/com/northstar/crm/exception/ErrorResponse.java` |
| 12 | `src/main/java/com/northstar/crm/exception/GlobalExceptionHandler.java` |
| 13 | `src/main/java/com/northstar/crm/Main.java` |
| 14 | `src/main/java/com/northstar/crm/repository/CustomerRepository.java` |
| 15 | `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java` |
| 16 | `src/main/java/com/northstar/crm/service/CustomerService.java` |
| 17 | `src/main/java/com/northstar/crm/service/CustomerValidator.java` |
| 18 | `src/main/java/com/northstar/crm/service/DefaultCustomerService.java` |
| 19 | `src/test/java/com/northstar/crm/service/CustomerServiceBddMockTest.java` |
| 20 | `src/test/java/com/northstar/crm/service/CustomerServiceMockitoTest.java` |
| 21 | `src/test/java/com/northstar/crm/service/CustomerServiceTests.java` |
| 22 | `pom.xml` |
| 23 | `docs/isolation-policy.md` |

## Full source

### `src/main/java/com/northstar/crm/api/ApiResult.java`

```java
package com.northstar.crm.api;

import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.exception.ErrorResponse;

public sealed interface ApiResult {
    record Ok(CustomerResponseDTO body) implements ApiResult {}
    record Fail(ErrorResponse error) implements ApiResult {}
}
```

### `src/main/java/com/northstar/crm/api/CustomerApiFacade.java`

```java
package com.northstar.crm.api;

import com.northstar.crm.dto.CustomerMapper;
import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.exception.GlobalExceptionHandler;
import com.northstar.crm.service.CustomerService;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

public class CustomerApiFacade {
    private final CustomerService service;
    private final Validator validator;
    private final GlobalExceptionHandler handler = new GlobalExceptionHandler();

    public CustomerApiFacade(CustomerService service) {
        this.service = service;
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    public ApiResult create(CustomerRequestDTO request, String correlationId) {
        var violations = validator.validate(request);
        if (!violations.isEmpty()) {
            return new ApiResult.Fail(handler.fromValidation(violations, correlationId));
        }
        try {
            var saved = service.addCustomer(CustomerMapper.toEntity(request));
            return new ApiResult.Ok(CustomerMapper.toResponse(saved));
        } catch (BusinessException ex) {
            return new ApiResult.Fail(handler.fromBusiness(ex));
        } catch (Exception ex) {
            return new ApiResult.Fail(handler.fromUnexpected(ex, correlationId));
        }
    }

    public ApiResult getById(String customerId, String correlationId) {
        try {
            return service.findById(customerId)
                    .<ApiResult>map(c -> new ApiResult.Ok(CustomerMapper.toResponse(c)))
                    .orElseThrow(() -> BusinessException.notFound(customerId, correlationId));
        } catch (BusinessException ex) {
            return new ApiResult.Fail(handler.fromBusiness(ex));
        }
    }

    public ApiResult changeStatus(String customerId, CustomerStatus newStatus, String correlationId) {
        try {
            var updated = service.changeStatus(customerId, newStatus, correlationId);
            return new ApiResult.Ok(CustomerMapper.toResponse(updated));
        } catch (BusinessException ex) {
            return new ApiResult.Fail(handler.fromBusiness(ex));
        } catch (Exception ex) {
            return new ApiResult.Fail(handler.fromUnexpected(ex, correlationId));
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

### `src/main/java/com/northstar/crm/exception/BusinessException.java`

```java
package com.northstar.crm.exception;

public class BusinessException extends RuntimeException {
    private final String code;
    private final int statusHint;
    private final String correlationId;

    public BusinessException(String code, String message, int statusHint, String correlationId) {
        super(message);
        this.code = code;
        this.statusHint = statusHint;
        this.correlationId = correlationId;
    }

    public String getCode() { return code; }
    public int getStatusHint() { return statusHint; }
    public String getCorrelationId() { return correlationId; }

    public static BusinessException notFound(String customerId, String correlationId) {
        return new BusinessException(
                "CUSTOMER_NOT_FOUND",
                "Customer not found: " + customerId,
                404,
                correlationId);
    }

    public static BusinessException conflict(String message, String correlationId) {
        return new BusinessException("BUSINESS_CONFLICT", message, 409, correlationId);
    }
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

### `src/main/java/com/northstar/crm/exception/ErrorResponse.java`

```java
package com.northstar.crm.exception;

import java.time.Instant;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ErrorResponse {
    private final Instant timestamp;
    private final int status;
    private final String error;
    private final String message;
    private final String correlationId;
    private final Map<String, String> errors;

    public ErrorResponse(int status, String error, String message, String correlationId,
                         Map<String, String> errors) {
        this.timestamp = Instant.now();
        this.status = status;
        this.error = error;
        this.message = message;
        this.correlationId = correlationId;
        this.errors = errors == null
                ? Map.of()
                : Collections.unmodifiableMap(new LinkedHashMap<>(errors));
    }

    public Instant getTimestamp() { return timestamp; }
    public int getStatus() { return status; }
    public String getError() { return error; }
    public String getMessage() { return message; }
    public String getCorrelationId() { return correlationId; }
    public Map<String, String> getErrors() { return errors; }

    public String toJson() {
        String errFields = errors.entrySet().stream()
                .map(e -> "\"" + e.getKey() + "\":\"" + escape(e.getValue()) + "\"")
                .collect(Collectors.joining(","));
        return "{"
                + "\"timestamp\":\"" + timestamp + "\","
                + "\"status\":" + status + ","
                + "\"error\":\"" + escape(error) + "\","
                + "\"message\":\"" + escape(message) + "\","
                + "\"correlationId\":\"" + escape(correlationId) + "\","
                + "\"errors\":{" + errFields + "}"
                + "}";
    }

    private static String escape(String s) {
        return s == null ? "" : s.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}
```

### `src/main/java/com/northstar/crm/exception/GlobalExceptionHandler.java`

```java
package com.northstar.crm.exception;

import jakarta.validation.ConstraintViolation;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class GlobalExceptionHandler {

    public ErrorResponse fromBusiness(BusinessException ex) {
        return new ErrorResponse(
                ex.getStatusHint(), ex.getCode(), ex.getMessage(),
                ex.getCorrelationId(), Map.of());
    }

    public ErrorResponse fromValidation(
            Set<? extends ConstraintViolation<?>> violations, String correlationId) {
        Map<String, String> fields = new LinkedHashMap<>();
        for (ConstraintViolation<?> v : violations) {
            fields.put(v.getPropertyPath().toString(), v.getMessage());
        }
        return new ErrorResponse(400, "VALIDATION_FAILED", "Validation failed", correlationId, fields);
    }

    public ErrorResponse fromUnexpected(Exception ex, String correlationId) {
        return new ErrorResponse(500, "INTERNAL_ERROR", "Unexpected server error", correlationId, Map.of());
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
        CustomerService service = new DefaultCustomerService(repo, new CustomerValidator(repo));
        service.addCustomer(Customer.amina());
        service.addCustomer(Customer.ravi());
        System.out.println(service.changeStatus("CUS-1002", CustomerStatus.ACTIVE, "lab-request-001"));
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
        if (email == null) return false;
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
import com.northstar.crm.exception.BusinessException;
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
            throw BusinessException.conflict("customerId is required", "lab-request-001");
        }
        if (repository.existsById(customer.getCustomerId())) {
            throw BusinessException.conflict(
                    "duplicate customerId: " + customer.getCustomerId(), "lab-request-001");
        }
        if (customer.getEmail() != null && repository.existsByEmail(customer.getEmail())) {
            throw BusinessException.conflict(
                    "duplicate email: " + customer.getEmail(), "lab-request-001");
        }
    }

    public void validateTransition(CustomerStatus from, CustomerStatus to, String correlationId) {
        Set<CustomerStatus> allowed = ALLOWED.getOrDefault(from, Set.of());
        if (!allowed.contains(to)) {
            throw BusinessException.conflict(
                    "illegal status transition " + from + " -> " + to, correlationId);
        }
    }
}
```

### `src/main/java/com/northstar/crm/service/DefaultCustomerService.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
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
                .orElseThrow(() -> BusinessException.notFound(customerId, correlationId));
        validator.validateTransition(existing.getStatus(), newStatus, correlationId);
        existing.setStatus(newStatus);
        existing.touchUpdatedAt();
        return repository.save(existing);
    }
}
```

### `src/test/java/com/northstar/crm/service/CustomerServiceBddMockTest.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceBddMockTest {

    @Mock
    CustomerRepository repository;

    DefaultCustomerService service;

    @BeforeEach
    void setUp() {
        service = new DefaultCustomerService(repository, new CustomerValidator(repository));
    }

    @Test
    void givenProspectWhenActivateThenSavedActive() {
        Customer ravi = Customer.ravi();
        given(repository.findById("CUS-1002")).willReturn(Optional.of(ravi));
        given(repository.save(any(Customer.class))).willAnswer(inv -> inv.getArgument(0));

        Customer updated = service.changeStatus(
                "CUS-1002", CustomerStatus.ACTIVE, "lab-request-001");

        then(repository).should().findById("CUS-1002");
        then(repository).should().save(any(Customer.class));
        assertEquals(CustomerStatus.ACTIVE, updated.getStatus());
    }
}
```

### `src/test/java/com/northstar/crm/service/CustomerServiceMockitoTest.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceMockitoTest {

    @Mock
    CustomerRepository repository;

    CustomerValidator validator;
    DefaultCustomerService service;

    @BeforeEach
    void setUp() {
        validator = new CustomerValidator(repository);
        service = new DefaultCustomerService(repository, validator);
    }

    @Test
    void activateRaviUsesFindAndSave() {
        Customer ravi = Customer.ravi();
        when(repository.findById("CUS-1002")).thenReturn(Optional.of(ravi));
        when(repository.save(any(Customer.class))).thenAnswer(inv -> inv.getArgument(0));

        Customer result = service.changeStatus(
                "CUS-1002", CustomerStatus.ACTIVE, "lab-request-001");

        assertEquals(CustomerStatus.ACTIVE, result.getStatus());
        verify(repository).findById("CUS-1002");
        verify(repository).save(argThat(c ->
                "CUS-1002".equals(c.getCustomerId()) && c.getStatus() == CustomerStatus.ACTIVE));
    }

    @Test
    void notFoundNeverCallsSave() {
        when(repository.findById("CUS-9999")).thenReturn(Optional.empty());

        assertThrows(BusinessException.class, () ->
                service.changeStatus("CUS-9999", CustomerStatus.ACTIVE, "lab-request-001"));

        verify(repository).findById("CUS-9999");
        verify(repository, never()).save(any());
    }

    @Test
    void addCustomerCapturesSavedEntity() {
        when(repository.existsById("CUS-1001")).thenReturn(false);
        when(repository.existsByEmail("amina.khan@example.com")).thenReturn(false);
        when(repository.save(any(Customer.class))).thenAnswer(inv -> inv.getArgument(0));

        service.addCustomer(Customer.amina());

        ArgumentCaptor<Customer> captor = ArgumentCaptor.forClass(Customer.class);
        verify(repository).save(captor.capture());
        assertEquals("CUS-1001", captor.getValue().getCustomerId());
        assertEquals("Amina Khan", captor.getValue().getFullName());
        assertEquals(CustomerStatus.ACTIVE, captor.getValue().getStatus());
    }
}
```

### `src/test/java/com/northstar/crm/service/CustomerServiceTests.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.repository.InMemoryCustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/** Lab 17 real-repo baseline — keep green alongside Mockito isolation tests. */
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
    }

    @Test
    void illegalTransitionThrowsConflict() {
        service.addCustomer(Customer.amina());
        assertThrows(BusinessException.class,
                () -> service.changeStatus("CUS-1001", CustomerStatus.PROSPECT, "lab-request-001"));
        assertEquals(CustomerStatus.ACTIVE, service.findById("CUS-1001").orElseThrow().getStatus());
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
  <artifactId>lab18-crm</artifactId>
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
    <dependency>
      <groupId>org.mockito</groupId>
      <artifactId>mockito-core</artifactId>
      <version>5.14.2</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.mockito</groupId>
      <artifactId>mockito-junit-jupiter</artifactId>
      <version>5.14.2</version>
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
      <plugin>
        <groupId>org.jacoco</groupId>
        <artifactId>jacoco-maven-plugin</artifactId>
        <version>0.8.12</version>
        <executions>
          <execution>
            <goals><goal>prepare-agent</goal></goals>
          </execution>
          <execution>
            <id>report</id>
            <phase>verify</phase>
            <goals><goal>report</goal></goals>
          </execution>
          <execution>
            <id>jacoco-check</id>
            <phase>verify</phase>
            <goals><goal>check</goal></goals>
            <configuration>
              <!-- Solution: package gate 0.80 on com.northstar.crm.service -->
              <rules>
                <rule>
                  <element>PACKAGE</element>
                  <includes>
                    <include>com.northstar.crm.service</include>
                  </includes>
                  <limits>
                    <limit>
                      <counter>LINE</counter>
                      <value>COVEREDRATIO</value>
                      <minimum>0.80</minimum>
                    </limit>
                  </limits>
                </rule>
              </rules>
            </configuration>
          </execution>
        </executions>
      </plugin>
    </plugins>
  </build>
</project>
```

### `docs/isolation-policy.md`

```markdown
# Lab 18 — Isolation policy (solution)

## What is mocked

- **Mock:** `CustomerRepository` (and optionally notifiers) in Lab 18 unit suites.
- **Real:** `CustomerValidator` + `DefaultCustomerService` (never mock the SUT).

Wire validator and service with the **same** mock repository so `existsById` / `existsByEmail` stubs are hit.

## When to prefer Lab 17 vs Lab 18

| Suite style | Use when |
| --- | --- |
| Lab 17 real in-memory repo | Confidence that transition/uniqueness rules + Map storage integrate |
| Lab 18 Mockito | Prove interaction contracts (`find`/`save`/`never`) without HashMap state |

## Stub vs verify

- **Stub (`when` / `given`)** — supply collaborator return values needed for the path.
- **Verify (`verify` / `then().should`)** — assert the interaction happened (or `never()`).

## Correlation

Exception paths for `changeStatus` carry `lab-request-001` via `BusinessException`.

## AI review (`lab18-001`)

Manual: rejected drafts that `@Mock` the service under test; kept collaborator-only mocks and `never().save` on not-found.
```

## Instructor notes

# Lab 18 solution notes

## What / why

Mockito isolation for `DefaultCustomerService`: mock repository, keep validator real, prove activate Ravi with stub/verify, `never().save` on `CUS-9999`, and `ArgumentCaptor` on add Amina. BDDMockito twin covers given/then/should style.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-18\lab18\solution"
mvn -B clean test
mvn -q test -Dtest=CustomerServiceMockitoTest,CustomerServiceBddMockTest
```

Run twice for determinism. Expect BUILD SUCCESS.

## Pitfalls

- Missing `@ExtendWith(MockitoExtension.class)` → NPE on `@Mock`.
- Mocking the SUT → honor violation.
- Unused stubs → `UnnecessaryStubbingException`.
- Different mock instances for validator vs service → uniqueness stubs miss.


