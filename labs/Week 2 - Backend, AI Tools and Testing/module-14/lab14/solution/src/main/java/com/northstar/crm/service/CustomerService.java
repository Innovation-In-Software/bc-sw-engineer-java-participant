package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/** Lab 12-shaped clean API for Lab 14 DTO boundary. */
public class CustomerService {
    private final Map<String, Customer> customersById = new HashMap<>();

    public Customer createCustomer(String customerId, String fullName, String email,
                                   String phone, CustomerStatus status) {
        if (customerId == null || customerId.isBlank() || fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("customerId and fullName are required");
        }
        if (customersById.containsKey(customerId)) {
            throw new IllegalStateException("Duplicate customerId: " + customerId);
        }
        Customer c = new Customer(customerId, fullName, email, phone,
                status != null ? status : CustomerStatus.PROSPECT, LocalDateTime.now());
        customersById.put(customerId, c);
        return c;
    }

    public Customer getCustomer(String customerId) {
        return findByCustomerId(customerId)
                .orElseThrow(() -> new IllegalArgumentException("Customer not found: " + customerId));
    }

    public Optional<Customer> findByCustomerId(String customerId) {
        return Optional.ofNullable(customersById.get(customerId));
    }
}
