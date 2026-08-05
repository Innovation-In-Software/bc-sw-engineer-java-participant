package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.repository.InMemoryCustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTests {
    DefaultCustomerService service;
    InMemoryCustomerRepository repo;

    @BeforeEach
    void setUp() {
        repo = new InMemoryCustomerRepository();
        service = new DefaultCustomerService(repo, new CustomerValidator(repo));
    }

    @Test
    void addAndActivateRaviHappyPath() {
        service.addCustomer(Customer.amina());
        service.addCustomer(Customer.ravi());
        var activated = service.changeStatus("CUS-1002", CustomerStatus.ACTIVE, "lab-request-001");
        assertEquals(CustomerStatus.ACTIVE, activated.getStatus());
        assertEquals("CUS-1001", service.findById("CUS-1001").orElseThrow().getCustomerId());
        assertEquals(2, service.listAll().size());
    }

    @Test
    void duplicateIdThrowsConflict() {
        service.addCustomer(Customer.amina());
        BusinessException ex = assertThrows(BusinessException.class,
                () -> service.addCustomer(Customer.amina()));
        assertEquals("BUSINESS_CONFLICT", ex.getCode());
    }

    @Test
    void illegalTransitionThrowsConflict() {
        service.addCustomer(Customer.amina());
        BusinessException ex = assertThrows(BusinessException.class,
                () -> service.changeStatus("CUS-1001", CustomerStatus.PROSPECT, "lab-request-001"));
        assertEquals("BUSINESS_CONFLICT", ex.getCode());
        assertEquals(CustomerStatus.ACTIVE, service.findById("CUS-1001").orElseThrow().getStatus());
    }

    @Test
    void missingCustomerThrowsNotFound() {
        BusinessException ex = assertThrows(BusinessException.class,
                () -> service.changeStatus("CUS-9999", CustomerStatus.ACTIVE, "lab-request-001"));
        assertEquals("CUSTOMER_NOT_FOUND", ex.getCode());
        assertEquals("lab-request-001", ex.getCorrelationId());
    }

    @Test
    void duplicateEmailThrowsConflict() {
        service.addCustomer(Customer.amina());
        Customer clone = new Customer(
                "CUS-3001", "Other Name", "amina.khan@example.com", null,
                CustomerStatus.PROSPECT, java.time.LocalDateTime.now());
        assertThrows(BusinessException.class, () -> service.addCustomer(clone));
    }

    @Test
    void closedToActiveRejected() {
        Customer closed = Customer.amina();
        closed.setStatus(CustomerStatus.CLOSED);
        service.addCustomer(closed);
        assertThrows(BusinessException.class,
                () -> service.changeStatus("CUS-1001", CustomerStatus.ACTIVE, "lab-request-001"));
    }
}
