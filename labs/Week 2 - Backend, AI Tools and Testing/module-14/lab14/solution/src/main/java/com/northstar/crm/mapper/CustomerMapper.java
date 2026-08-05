package com.northstar.crm.mapper;

import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public final class CustomerMapper {
    private CustomerMapper() {}

    public static Customer toEntity(CustomerRequestDTO req) {
        return new Customer(
                req.getCustomerId(),
                req.getFullName(),
                req.getEmail(),
                null,
                CustomerStatus.valueOf(req.getStatus()),
                LocalDateTime.now()
        );
    }

    public static CustomerResponseDTO toResponse(Customer entity) {
        Instant createdAt = entity.getCreatedAt() == null
                ? null
                : entity.getCreatedAt().toInstant(ZoneOffset.UTC);
        return CustomerResponseDTO.of(
                entity.getCustomerId(),
                entity.getFullName(),
                entity.getEmail(),
                entity.getStatus().name(),
                createdAt,
                null
        );
    }
}
