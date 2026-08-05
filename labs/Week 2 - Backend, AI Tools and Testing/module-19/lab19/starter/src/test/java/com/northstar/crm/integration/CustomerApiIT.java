package com.northstar.crm.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerApiIT {

    @LocalServerPort
    int port;

    @Autowired
    TestRestTemplate rest;

    @Test
    void getAminaReturns200() {
        // TODO: GET /api/customers/CUS-1001 → 200; body customerId CUS-1001
        throw new UnsupportedOperationException("TODO: API get happy path");
    }

    @Test
    void createEchoesCorrelationHeader() {
        // TODO: POST customerId CUS-1901 with X-Correlation-Id lab-request-001 → 201 + header echo
        throw new UnsupportedOperationException("TODO: API create + correlation");
    }

    @Test
    void missingCustomerReturns404() {
        // TODO: GET CUS-9999 → 404
        throw new UnsupportedOperationException("TODO: API 404");
    }
}
