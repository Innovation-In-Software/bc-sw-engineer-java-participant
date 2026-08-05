package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    private CustomerService svc;

    @BeforeEach
    void setUp() {
        svc = new CustomerService();
        svc.setCorrelationId("lab-request-001");
    }

    @Test
    void createAminaKhanThenGetById() {
        Customer created = svc.createCustomer(
                "CUS-1001", "Amina Khan", "amina.khan@example.com", null, CustomerStatus.ACTIVE);
        assertEquals("CUS-1001", created.getCustomerId());
        assertEquals("CUS-1001", svc.getCustomer("CUS-1001").getCustomerId());
        assertEquals("Amina Khan", svc.getCustomer(new String("CUS-1001")).getFullName());
    }

    @Test
    void createRaviProspectThenActivate() {
        svc.createCustomer("CUS-1002", "Ravi Singh", "ravi.singh@example.com", null, CustomerStatus.PROSPECT);
        assertEquals(CustomerStatus.PROSPECT, svc.getCustomer("CUS-1002").getStatus());
        svc.updateStatus("CUS-1002", CustomerStatus.ACTIVE);
        assertEquals(CustomerStatus.ACTIVE, svc.getCustomer("CUS-1002").getStatus());
    }

    @Test
    void unknownIdThrows() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> svc.getCustomer("CUS-9999"));
        assertTrue(ex.getMessage().contains("CUS-9999"));
        assertTrue(ex.getMessage().contains("lab-request-001"));
    }

    @Test
    void duplicateIdThrows() {
        svc.createCustomer("CUS-1001", "Amina Khan", "amina.khan@example.com", null, CustomerStatus.ACTIVE);
        assertThrows(IllegalStateException.class, () ->
                svc.createCustomer("CUS-1001", "Other", "x@example.com", null, CustomerStatus.PROSPECT));
    }

    @Test
    void blankCustomerIdThrows() {
        assertThrows(IllegalArgumentException.class, () ->
                svc.createCustomer(" ", "Name", "n@example.com", null, CustomerStatus.ACTIVE));
    }

    @Test
    void updateUnknownThrowsWithCorrelation() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> svc.updateStatus("CUS-9999", CustomerStatus.ACTIVE));
        assertTrue(ex.getMessage().contains("lab-request-001"));
    }
}
