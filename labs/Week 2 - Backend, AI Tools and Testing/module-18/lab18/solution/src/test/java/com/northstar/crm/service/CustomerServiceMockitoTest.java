package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.exception.BusinessException;
import com.northstar.crm.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceMockitoTest {

    @Mock
    CustomerRepository repository;

    CustomerValidator validator;
    DefaultCustomerService service;

    @BeforeEach
    void setUp() {
        validator = new CustomerValidator(repository);
        service = new DefaultCustomerService(repository, validator);
    }

    @Test
    void activateRaviUsesFindAndSave() {
        Customer ravi = Customer.ravi();
        when(repository.findById("CUS-1002")).thenReturn(Optional.of(ravi));
        when(repository.save(any(Customer.class))).thenAnswer(inv -> inv.getArgument(0));

        Customer result = service.changeStatus(
                "CUS-1002", CustomerStatus.ACTIVE, "lab-request-001");

        assertEquals(CustomerStatus.ACTIVE, result.getStatus());
        verify(repository).findById("CUS-1002");
        verify(repository).save(argThat(c ->
                "CUS-1002".equals(c.getCustomerId()) && c.getStatus() == CustomerStatus.ACTIVE));
    }

    @Test
    void notFoundNeverCallsSave() {
        when(repository.findById("CUS-9999")).thenReturn(Optional.empty());

        assertThrows(BusinessException.class, () ->
                service.changeStatus("CUS-9999", CustomerStatus.ACTIVE, "lab-request-001"));

        verify(repository).findById("CUS-9999");
        verify(repository, never()).save(any());
    }

    @Test
    void addCustomerCapturesSavedEntity() {
        when(repository.existsById("CUS-1001")).thenReturn(false);
        when(repository.existsByEmail("amina.khan@example.com")).thenReturn(false);
        when(repository.save(any(Customer.class))).thenAnswer(inv -> inv.getArgument(0));

        service.addCustomer(Customer.amina());

        ArgumentCaptor<Customer> captor = ArgumentCaptor.forClass(Customer.class);
        verify(repository).save(captor.capture());
        assertEquals("CUS-1001", captor.getValue().getCustomerId());
        assertEquals("Amina Khan", captor.getValue().getFullName());
        assertEquals(CustomerStatus.ACTIVE, captor.getValue().getStatus());
    }
}
