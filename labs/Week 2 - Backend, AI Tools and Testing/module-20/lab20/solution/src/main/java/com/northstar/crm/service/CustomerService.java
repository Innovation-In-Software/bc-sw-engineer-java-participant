package com.northstar.crm.service;

import com.northstar.crm.model.Customer;
import com.northstar.crm.repository.CustomerRepository;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer create(Customer customer, String correlationId) {
        String customerId = customer.getCustomerId();
        MDC.put("cust", customerId);
        MDC.put("op", "create");
        log.info("create customer id={}", customerId);
        if (customerId == null || customerId.isBlank()) {
            log.warn("reject create reason=missing_customer_id");
            throw new IllegalArgumentException("customerId required [" + correlationId + "]");
        }
        return repository.save(customer);
    }

    public Optional<Customer> findById(String customerId) {
        MDC.put("cust", customerId);
        MDC.put("op", "get");
        log.info("get customer id={}", customerId);
        return repository.findById(customerId);
    }
}
