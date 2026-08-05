# Lab 21 — Complete reference solution

> **Finished project** — every source file below is the completed answer (not a smoke checklist).
>
> Attempt [`../starter/`](../starter/) first. Guide: [`../LAB-21-GUIDE.md`](../LAB-21-GUIDE.md)

## Goal

**Actuator readiness + Micrometer metrics**

## Run the finished project

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab21-crm" | Out-Null
Copy-Item -Recurse -Force ".\*" "$env:USERPROFILE\java-bootcamp\examples\lab21-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab21-crm
mvn -B clean test
```

**Expected:** Tests run: 3

## File index (14 files)

| # | Path |
|---|------|
| 1 | `src/main/java/com/northstar/crm/api/CustomerController.java` |
| 2 | `src/main/java/com/northstar/crm/CrmApplication.java` |
| 3 | `src/main/java/com/northstar/crm/health/CrmReadinessIndicator.java` |
| 4 | `src/main/java/com/northstar/crm/logging/CorrelationFilter.java` |
| 5 | `src/main/java/com/northstar/crm/metrics/CustomerMetrics.java` |
| 6 | `src/main/java/com/northstar/crm/model/Customer.java` |
| 7 | `src/main/java/com/northstar/crm/repository/CustomerRepository.java` |
| 8 | `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java` |
| 9 | `src/main/java/com/northstar/crm/service/CustomerService.java` |
| 10 | `src/main/resources/application.yml` |
| 11 | `src/main/resources/logback-spring.xml` |
| 12 | `src/test/java/com/northstar/crm/actuator/ActuatorIT.java` |
| 13 | `pom.xml` |
| 14 | `docs/monitoring-report.md` |

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

### `src/main/java/com/northstar/crm/health/CrmReadinessIndicator.java`

```java
package com.northstar.crm.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Lab-only readiness toggle — NOT for production.
 * When down, readiness should be OUT_OF_SERVICE while liveness stays UP.
 */
@Component
public class CrmReadinessIndicator implements HealthIndicator {
    private volatile boolean ready = true;

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public boolean isReady() {
        return ready;
    }

    @Override
    public Health health() {
        return ready
                ? Health.up().build()
                : Health.outOfService().withDetail("reason", "lab-toggle").build();
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
        String corr = request.getHeader(HEADER);
        if (corr == null || corr.isBlank()) {
            corr = "lab-request-001";
        }
        MDC.put("corr", corr);
        response.setHeader(HEADER, corr);
        try {
            filterChain.doFilter(request, response);
        } finally {
            MDC.clear();
        }
    }
}
```

### `src/main/java/com/northstar/crm/metrics/CustomerMetrics.java`

```java
package com.northstar.crm.metrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class CustomerMetrics {
    private final MeterRegistry registry;

    public CustomerMetrics(MeterRegistry registry) {
        this.registry = registry;
    }

    public void recordCreate(String result) {
        Counter.builder("crm.customer.create")
                .tag("result", result)
                .register(registry)
                .increment();
    }

    public void recordGet(String result) {
        Counter.builder("crm.customer.get")
                .tag("result", result)
                .register(registry)
                .increment();
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

import com.northstar.crm.metrics.CustomerMetrics;
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
    private final CustomerMetrics metrics;

    public CustomerService(CustomerRepository repository, CustomerMetrics metrics) {
        this.repository = repository;
        this.metrics = metrics;
    }

    public Customer create(Customer customer, String correlationId) {
        MDC.put("cust", customer.getCustomerId());
        MDC.put("op", "create");
        log.info("create customer");
        try {
            Customer saved = repository.save(customer);
            metrics.recordCreate("success");
            return saved;
        } catch (RuntimeException ex) {
            metrics.recordCreate("failure");
            throw ex;
        }
    }

    public Optional<Customer> findById(String customerId) {
        MDC.put("cust", customerId);
        MDC.put("op", "get");
        log.info("get customer");
        Optional<Customer> found = repository.findById(customerId);
        metrics.recordGet(found.isPresent() ? "success" : "not_found");
        return found;
    }
}
```

### `src/main/resources/application.yml`

```yaml
server.port: 8080
spring.application.name: lab21-crm
management:
  endpoints:
    web:
      exposure:
        # LAB-ONLY — production must authenticate / firewall / allow-list Actuator
        include: health,metrics,info
  endpoint:
    health:
      probes:
        enabled: true
      show-details: always
      group:
        readiness:
          include: readinessState,crmReadinessIndicator
  metrics:
    tags:
      application: northstar-crm
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
  <root level="INFO">
    <appender-ref ref="CONSOLE"/>
  </root>
</configuration>
```

### `src/test/java/com/northstar/crm/actuator/ActuatorIT.java`

```java
package com.northstar.crm.actuator;

import com.northstar.crm.health.CrmReadinessIndicator;
import com.northstar.crm.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ActuatorIT {

    @LocalServerPort
    int port;

    @Autowired
    TestRestTemplate rest;

    @Autowired
    CrmReadinessIndicator readiness;

    private String url(String path) {
        return "http://localhost:" + port + path;
    }

    @Test
    void healthAndProbesAreUp() {
        ResponseEntity<Map> health = rest.getForEntity(url("/actuator/health"), Map.class);
        assertTrue(health.getStatusCode().is2xxSuccessful());
        assertEquals("UP", health.getBody().get("status"));

        ResponseEntity<Map> live = rest.getForEntity(url("/actuator/health/liveness"), Map.class);
        assertTrue(live.getStatusCode().is2xxSuccessful());
        assertEquals("UP", live.getBody().get("status"));

        ResponseEntity<Map> ready = rest.getForEntity(url("/actuator/health/readiness"), Map.class);
        assertTrue(ready.getStatusCode().is2xxSuccessful());
        assertEquals("UP", ready.getBody().get("status"));
    }

    @Test
    void readinessCanGoDownWhileLivenessStaysUp() {
        try {
            readiness.setReady(false);
            ResponseEntity<Map> ready = rest.getForEntity(url("/actuator/health/readiness"), Map.class);
            assertFalse(ready.getStatusCode().is2xxSuccessful()
                    && "UP".equals(ready.getBody() != null ? ready.getBody().get("status") : null));

            ResponseEntity<Map> live = rest.getForEntity(url("/actuator/health/liveness"), Map.class);
            assertTrue(live.getStatusCode().is2xxSuccessful());
            assertEquals("UP", live.getBody().get("status"));
        } finally {
            readiness.setReady(true);
        }
    }

    @Test
    void createMetricAppearsAfterTraffic() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Correlation-Id", "lab-request-001");
        headers.setContentType(MediaType.APPLICATION_JSON);
        Customer body = new Customer("CUS-2101", "Metric User", "metric@example.com", "PROSPECT");
        ResponseEntity<Customer> created = rest.exchange(
                url("/api/customers"),
                HttpMethod.POST,
                new HttpEntity<>(body, headers),
                Customer.class);
        assertEquals(HttpStatus.CREATED, created.getStatusCode());

        rest.getForEntity(url("/api/customers/CUS-1001"), Customer.class);

        ResponseEntity<String> metric = rest.getForEntity(
                url("/actuator/metrics/crm.customer.create"), String.class);
        assertTrue(metric.getStatusCode().is2xxSuccessful(), () -> "metric status=" + metric.getStatusCode());
        assertNotNull(metric.getBody());
        assertTrue(metric.getBody().contains("crm.customer.create")
                        || metric.getBody().contains("\"name\":\"crm.customer.create\""),
                () -> "unexpected metric body: " + metric.getBody());
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
  <artifactId>lab21-crm</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <name>lab21-crm</name>
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
      <artifactId>spring-boot-starter-actuator</artifactId>
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

### `docs/monitoring-report.md`

```markdown
# Lab 21 — Monitoring report (solution)

## Probes

| Endpoint | Meaning |
| --- | --- |
| `/actuator/health/liveness` | Process alive — do not fail for dependency warmup |
| `/actuator/health/readiness` | Safe for traffic — includes `crmReadiness` lab toggle |

`CrmReadinessIndicator` is **lab-only** (contributor id `crmReadinessIndicator` in the readiness group). When `setReady(false)`, readiness leaves UP while liveness stays UP.

## Metrics (low cardinality)

| Name | Tags |
| --- | --- |
| `crm.customer.create` | `result=success\|failure` |
| `crm.customer.get` | `result=success\|not_found` |

Never tag `customerId` or correlation IDs (cardinality explosion).

## Production hardening

Local lab exposes `health,metrics,info`. Production must authenticate Actuator, firewall the management port, and allow-list endpoints. Do **not** expose `/actuator/env` or unrestricted `show-details`.

## Evidence checklist

- Health + liveness + readiness UP at start
- Readiness toggled down independently of liveness
- After POST `CUS-2101` / GET `CUS-1001`, `/actuator/metrics/crm.customer.create` present
```

## Instructor notes

# Lab 21 solution notes

## What / why

Actuator health with distinct liveness vs readiness (`CrmReadinessIndicator` in readiness group), Micrometer counters `crm.customer.create` / `crm.customer.get` with low-cardinality `result` tags, verified by `ActuatorIT`.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-21\lab21\solution"
mvn -B -Dtest=ActuatorIT test
```

No Docker required. Delete any `target/` under solution/starter before commit.

## Pitfalls

- Custom readiness indicator must be in the readiness group or the probe ignores it.
- Tagging customerId/correlation → cardinality anti-pattern.
- Lab exposure of Actuator is not a production config.


