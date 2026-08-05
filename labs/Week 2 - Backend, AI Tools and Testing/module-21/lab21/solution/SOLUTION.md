# Lab 21 — Detailed solution (instructor / shared after class)

> **Audience:** Instructors and participants when the instructor releases `solution/`.  
> **Do not open this during the timed path** unless your instructor says so.  
> Timed starter card: [`../starter/README.md`](../starter/README.md) · Full steps: [`../LAB-21-GUIDE.md`](../LAB-21-GUIDE.md)

## Goal

**Actuator health + metrics**

## What you should end with

| Check | Expected |
| --- | --- |
| Verify command | `mvn -B clean test` |
| Suite / smoke | Tests run: 3 (ActuatorIT) |
| Workspace copy (optional) | `%USERPROFILE%\java-bootcamp\examples\lab21-crm` from this `solution/` |

## Solution tree (key files)

### Java / sources
- `src/main/java/com/northstar/crm/CrmApplication.java`
- `src/main/java/com/northstar/crm/model/Customer.java`
- `src/main/java/com/northstar/crm/repository/CustomerRepository.java`
- `src/main/java/com/northstar/crm/repository/InMemoryCustomerRepository.java`
- `src/main/java/com/northstar/crm/service/CustomerService.java`
- `src/main/java/com/northstar/crm/api/CustomerController.java`
- `src/main/java/com/northstar/crm/logging/CorrelationFilter.java`
- `src/main/java/com/northstar/crm/metrics/CustomerMetrics.java`
- `src/main/java/com/northstar/crm/health/CrmReadinessIndicator.java`
- `src/test/java/com/northstar/crm/actuator/ActuatorIT.java`

### Docs / contracts
- `monitoring-report.md`

## How this maps to the GUIDE

1. Copy `starter/` → `examples/lab21-crm` (timed path) **or** use this `solution/` as the completed reference.
2. Every `// TODO` in the starter has a filled implementation here — compare file-by-file with your work.
3. Run the verify command above from the project root (this folder or your `lab21-crm` copy).
4. Keep `docs/` notes that the GUIDE names (smells, isolation policy, monitoring report, etc.).

## Instructor notes (short)

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


## Step-by-step fill guide (participant walkthrough)

### A. Scaffold
- Open IntelliJ on `%USERPROFILE%\java-bootcamp`.
- Prefer timed path: copy `starter/*` into `examples\lab21-crm`.
- Confirm JDK **21** and Maven **3.9+** (`java -version`, `mvn -version`).

### B. Implement TODOs in GUIDE order
- Follow [`../LAB-21-GUIDE.md`](../LAB-21-GUIDE.md) Steps top-to-bottom.
- When stuck, open the matching file under this `solution/src` (or `contracts/` / `docs/`) and compare **behavior**, not just names.
- Do not paste blindly — check package names (especially Lab 14 `com.northstar.crm.mapper`).

### C. Verify on Windows (this machine baseline)
```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab21-crm
# Or from the repo solution folder:
# cd "...\module-21\lab21\solution"
mvn -B clean test
```

### D. Common pitfalls for Lab 21
- Wrong **Tests run** count usually means a missing test class/method shell or leftover `PlaceholderTest`.
- Package / import drift vs GUIDE samples → fix imports to match solution packages.
- Never commit `target/`.

## Verified on instructor machine

**Date:** Tuesday, August 4, 2026  
**JDK:** Temurin OpenJDK **21.0.11**  
**Maven:** **3.9.9**  
**Result:** Solution suite/smoke **PASS** under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab21-solution`.



## Reference implementation — Actuator readiness group

Path: `src/main/resources/application.yml`

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



## Reference implementation — ActuatorIT

Path: `src/test/java/com/northstar/crm/actuator/ActuatorIT.java`

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

