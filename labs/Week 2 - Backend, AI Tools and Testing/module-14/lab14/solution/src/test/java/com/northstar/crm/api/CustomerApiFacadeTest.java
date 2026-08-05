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
