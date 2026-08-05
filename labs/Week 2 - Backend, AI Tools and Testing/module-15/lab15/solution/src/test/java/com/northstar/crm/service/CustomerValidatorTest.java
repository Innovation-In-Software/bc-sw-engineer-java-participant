package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.repository.InMemoryCustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerValidatorTest {
    CustomerValidator validator;
    InMemoryCustomerRepository repo;

    @BeforeEach
    void setUp() {
        repo = new InMemoryCustomerRepository();
        validator = new CustomerValidator(repo);
    }

    @Test
    void prospectToActiveAllowed() {
        assertDoesNotThrow(() ->
                validator.validateTransition(
                        CustomerStatus.PROSPECT, CustomerStatus.ACTIVE, "lab-request-001"));
    }

    @Test
    void activeToProspectRejected() {
        IllegalStateException ex = assertThrows(IllegalStateException.class, () ->
                validator.validateTransition(
                        CustomerStatus.ACTIVE, CustomerStatus.PROSPECT, "lab-request-001"));
        assertTrue(ex.getMessage().contains("lab-request-001"));
        assertTrue(ex.getMessage().contains("ACTIVE"));
        assertTrue(ex.getMessage().contains("PROSPECT"));
    }

    @Test
    void duplicateIdRejected() {
        repo.save(Customer.amina());
        assertThrows(IllegalStateException.class, () -> validator.validateNew(Customer.amina()));
    }
}
