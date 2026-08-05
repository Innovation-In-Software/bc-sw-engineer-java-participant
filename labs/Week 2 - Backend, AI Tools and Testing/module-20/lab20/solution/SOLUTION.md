# Lab 20 — Complete reference solution

> **Finished project** — every source file below is the completed answer (not a smoke checklist).
>
> Attempt [`../starter/`](../starter/) first. Guide: [`../LAB-20-GUIDE.md`](../LAB-20-GUIDE.md)

## Goal

**CorrelationFilter MDC + PII-free logging**

## Run the finished project

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab20-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab20-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab20-crm
mvn -B clean test
```

**Expected:** Tests run: 1

## File index (13 files)

| # | Path |
|---|------|
| 1 | `src/main/java/com/northstar/crm/api/CustomerController.java` |
| 2 | `src/main/java/com/northstar/crm/CrmApplication.java` |
| 3 | `src/main/java/com/northstar/crm/logging/CorrelationFilter.java` |
| 4 | `src/main/java/com/northstar/crm/model/Customer.java` |
| 5 | `src/main/java/com/northstar/crm/repository/CustomerRepository.java` |
| 6 | `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java` |
| 7 | `src/main/java/com/northstar/crm/service/CustomerService.java` |
| 8 | `src/main/resources/application.yml` |
| 9 | `src/main/resources/logback-spring.xml` |
| 10 | `src/main/resources/static/customers.html` |
| 11 | `src/test/java/com/northstar/crm/logging/CustomerLoggingIT.java` |
| 12 | `pom.xml` |
| 13 | `docs/logging.md` |

## Full source

### `src/main/java/com/northstar/crm/api/CustomerController.java`

```java
package com.northstar.crm.api;

import com.northstar.crm.model.Customer;
import com.northstar.crm.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customers;

    public CustomerController(CustomerService customers) {
        this.customers = customers;
    }

    @PostMapping
    public ResponseEntity<Customer> create(
            @RequestHeader(value = "X-Correlation-Id", required = false) String correlationId,
            @RequestBody Customer body) {
        String corr = (correlationId == null || correlationId.isBlank()) ? "lab-request-001" : correlationId;
        if (body.getFullName() == null || body.getFullName().isBlank()) {
            return ResponseEntity.badRequest().header("X-Correlation-Id", corr).build();
        }
        Customer created = customers.create(body, corr);
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("X-Correlation-Id", corr)
                .body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> get(
            @PathVariable String id,
            @RequestHeader(value = "X-Correlation-Id", required = false) String correlationId) {
        String corr = (correlationId == null || correlationId.isBlank()) ? "lab-request-001" : correlationId;
        return customers.findById(id)
                .map(c -> ResponseEntity.ok().header("X-Correlation-Id", corr).body(c))
                .orElseGet(() -> ResponseEntity.notFound().header("X-Correlation-Id", corr).build());
    }
}
```

### `src/main/java/com/northstar/crm/CrmApplication.java`

```java
package com.northstar.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrmApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class, args);
    }
}
```

### `src/main/java/com/northstar/crm/logging/CorrelationFilter.java`

```java
package com.northstar.crm.logging;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class CorrelationFilter extends OncePerRequestFilter {
    public static final String HEADER = "X-Correlation-Id";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String cid = request.getHeader(HEADER);
        if (cid == null || cid.isBlank()) {
            cid = "lab-request-001";
        }
        MDC.put("corr", cid);
        response.setHeader(HEADER, cid);
        try {
            filterChain.doFilter(request, response);
        } finally {
            MDC.clear();
        }
    }
}
```

### `src/main/java/com/northstar/crm/model/Customer.java`

```java
package com.northstar.crm.model;

public class Customer {
    private String customerId;
    private String fullName;
    private String email;
    private String status;

    public Customer() {}

    public Customer(String customerId, String fullName, String email, String status) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.email = email;
        this.status = status;
    }

    public static Customer amina() {
        return new Customer("CUS-1001", "Amina Khan", "amina.khan@example.com", "ACTIVE");
    }

    public static Customer ravi() {
        return new Customer("CUS-1002", "Ravi Singh", "ravi.singh@example.com", "PROSPECT");
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

### `src/main/java/com/northstar/crm/repository/CustomerRepository.java`

```java
package com.northstar.crm.repository;

import com.northstar.crm.model.Customer;
import java.util.Optional;

public interface CustomerRepository {
    Customer save(Customer customer);
    Optional<Customer> findById(String customerId);
}
```

### `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java`

```java
package com.northstar.crm.repository;

import com.northstar.crm.model.Customer;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
    private final Map<String, Customer> store = new ConcurrentHashMap<>();

    public InMemoryCustomerRepository() {
        store.put("CUS-1001", Customer.amina());
        store.put("CUS-1002", Customer.ravi());
    }

    @Override
    public Customer save(Customer customer) {
        store.put(customer.getCustomerId(), customer);
        return customer;
    }

    @Override
    public Optional<Customer> findById(String customerId) {
        return Optional.ofNullable(store.get(customerId));
    }
}
```

### `src/main/java/com/northstar/crm/service/CustomerService.java`

```java
package com.northstar.crm.service;

import com.northstar.crm.model.Customer;
import com.northstar.crm.repository.CustomerRepository;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer create(Customer customer, String correlationId) {
        String customerId = customer.getCustomerId();
        MDC.put("cust", customerId);
        MDC.put("op", "create");
        log.info("create customer id={}", customerId);
        if (customerId == null || customerId.isBlank()) {
            log.warn("reject create reason=missing_customer_id");
            throw new IllegalArgumentException("customerId required [" + correlationId + "]");
        }
        return repository.save(customer);
    }

    public Optional<Customer> findById(String customerId) {
        MDC.put("cust", customerId);
        MDC.put("op", "get");
        log.info("get customer id={}", customerId);
        return repository.findById(customerId);
    }
}
```

### `src/main/resources/application.yml`

```yaml
server.port: 8080
spring.application.name: lab20-crm
logging:
  level:
    root: INFO
    com.northstar.crm: INFO
```

### `src/main/resources/logback-spring.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <include resource="org/springframework/boot/logging/logback/defaults.xml"/>
  <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
    <encoder>
      <pattern>%d{ISO8601} %-5level [%thread] %logger{36} corr=%X{corr} cust=%X{cust} op=%X{op} - %msg%n</pattern>
    </encoder>
  </appender>
  <logger name="com.northstar.crm" level="INFO"/>
  <root level="INFO">
    <appender-ref ref="CONSOLE"/>
  </root>
</configuration>
```

### `src/main/resources/static/customers.html`

```html
<!DOCTYPE html>
<html lang="en">
<head><meta charset="UTF-8"/><title>Northstar CRM</title></head>
<body>
  <h1>Create customer</h1>
  <form id="customer-form">
    <input data-testid="customer-id" name="customerId" placeholder="id"/>
    <input data-testid="full-name" name="fullName" placeholder="name"/>
    <input data-testid="email" name="email" placeholder="email"/>
    <input data-testid="status" name="status" value="PROSPECT"/>
    <button type="submit" data-testid="submit-customer">Create</button>
  </form>
  <pre data-testid="create-result" id="result"></pre>
  <script>
    document.getElementById('customer-form').addEventListener('submit', async (e) => {
      e.preventDefault();
      const body = {
        customerId: document.querySelector('[data-testid="customer-id"]').value,
        fullName: document.querySelector('[data-testid="full-name"]').value,
        email: document.querySelector('[data-testid="email"]').value,
        status: document.querySelector('[data-testid="status"]').value
      };
      const res = await fetch('/api/customers', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
          'X-Correlation-Id': 'lab-request-001'
        },
        body: JSON.stringify(body)
      });
      document.getElementById('result').textContent = await res.text();
    });
  </script>
</body>
</html>
```

### `src/test/java/com/northstar/crm/logging/CustomerLoggingIT.java`

```java
package com.northstar.crm.logging;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(OutputCaptureExtension.class)
class CustomerLoggingIT {

    @LocalServerPort
    int port;

    @Autowired
    TestRestTemplate rest;

    @Test
    void getAminaLogsCorrelationWithoutPii(CapturedOutput output) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Correlation-Id", "lab-request-001");
        ResponseEntity<String> res = rest.exchange(
                "http://localhost:" + port + "/api/customers/CUS-1001",
                HttpMethod.GET,
                new HttpEntity<>(headers),
                String.class);
        assertEquals(HttpStatus.OK, res.getStatusCode());

        String logs = output.getOut() + output.getErr();
        assertTrue(logs.contains("lab-request-001"), () -> "missing corr in: " + logs);
        assertTrue(logs.contains("CUS-1001"), () -> "missing cust in: " + logs);
        assertFalse(logs.contains("Amina"), () -> "PII fullName leaked: " + logs);
        assertFalse(logs.toLowerCase().contains("amina.khan@example.com"),
                () -> "PII email leaked: " + logs);
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
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.3.5</version>
    <relativePath/>
  </parent>
  <groupId>com.northstar</groupId>
  <artifactId>lab20-crm</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <name>lab20-crm</name>
  <properties>
    <java.version>21</java.version>
  </properties>
  <dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
    </dependency>
  </dependencies>
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <configuration>
          <!-- Spring Boot parent excludes *IT by default; this lab's IT is the timed suite -->
          <includes>
            <include>**/*Test.java</include>
            <include>**/*Tests.java</include>
            <include>**/*IT.java</include>
          </includes>
        </configuration>
      </plugin>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
      </plugin>
    </plugins>
  </build>
</project>
```

### `docs/logging.md`

```markdown
# Lab 20 — logging contract

## MDC keys

| Key | Meaning |
| --- | ------- |
| corr | X-Correlation-Id (filter-owned) |
| cust | customerId (service-owned for the op) |
| op | create / get |

## Rules

- Never log fullName or email
- Filter always `MDC.clear()` in `finally`
- Pattern: `corr=%X{corr} cust=%X{cust} op=%X{op}`

## Sample INFO lines (after smoke)

```text
... CustomerService corr=lab-request-001 cust=CUS-1001 op=get - get customer id=CUS-1001
... CustomerService corr=lab-request-001 cust=CUS-1002 op=create - create customer id=CUS-1002
```
```

## Instructor notes

# Lab 20 solution notes

## What / why

Structured Logback pattern with MDC keys `corr` / `cust` / `op`, `CorrelationFilter` that defaults and echoes `X-Correlation-Id` and clears MDC in `finally`, plus PII-free service INFO lines. Verified by `CustomerLoggingIT`.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-20\lab20\solution"
mvn -B -Dtest=CustomerLoggingIT test
```

No Docker required.

## Pitfalls

- Missing `MDC.clear()` leaks corr/cust across Tomcat threads.
- Logging fullName/email fails the IT and the PII checklist.
- Competing `logback.xml` can override `logback-spring.xml`.


