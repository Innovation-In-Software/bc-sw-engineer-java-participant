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
