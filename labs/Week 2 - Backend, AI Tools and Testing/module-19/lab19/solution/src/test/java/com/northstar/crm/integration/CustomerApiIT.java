package com.northstar.crm.integration;

import com.northstar.crm.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerApiIT {

    @LocalServerPort
    int port;

    @Autowired
    TestRestTemplate rest;

    private String url(String path) {
        return "http://localhost:" + port + path;
    }

    @Test
    void getAminaReturns200() {
        ResponseEntity<Customer> res = rest.getForEntity(url("/api/customers/CUS-1001"), Customer.class);
        assertEquals(HttpStatus.OK, res.getStatusCode());
        assertNotNull(res.getBody());
        assertEquals("CUS-1001", res.getBody().getCustomerId());
    }

    @Test
    void createEchoesCorrelationHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Correlation-Id", "lab-request-001");
        headers.setContentType(MediaType.APPLICATION_JSON);
        Customer body = new Customer("CUS-1901", "Lab Nineteen", "lab19@example.com", "PROSPECT");
        ResponseEntity<Customer> created = rest.exchange(
                url("/api/customers"),
                HttpMethod.POST,
                new HttpEntity<>(body, headers),
                Customer.class);
        assertEquals(HttpStatus.CREATED, created.getStatusCode());
        assertEquals("lab-request-001", created.getHeaders().getFirst("X-Correlation-Id"));
        assertNotNull(created.getBody());
        assertEquals("CUS-1901", created.getBody().getCustomerId());
    }

    @Test
    void missingCustomerReturns404() {
        ResponseEntity<Customer> res = rest.getForEntity(url("/api/customers/CUS-9999"), Customer.class);
        assertEquals(HttpStatus.NOT_FOUND, res.getStatusCode());
    }
}
