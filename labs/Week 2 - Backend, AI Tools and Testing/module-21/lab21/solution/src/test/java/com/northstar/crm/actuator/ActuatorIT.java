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
