package com.northstar.crm.dto;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRequestDTOValidationTest {
    private Validator validator;

    @BeforeEach
    void setUp() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    void acceptsAminaKhan() {
        CustomerRequestDTO dto = validTemplate();
        dto.setCustomerId("CUS-1001");
        dto.setFullName("Amina Khan");
        dto.setEmail("amina.khan@example.com");
        dto.setStatus("ACTIVE");
        assertTrue(validator.validate(dto).isEmpty());
    }

    @Test
    void rejectsInvalidEmail() {
        CustomerRequestDTO dto = validTemplate();
        dto.setEmail("not-an-email");
        Set<ConstraintViolation<CustomerRequestDTO>> violations = validator.validate(dto);
        assertFalse(violations.isEmpty());
        assertTrue(violations.stream().anyMatch(v -> v.getPropertyPath().toString().equals("email")));
    }

    @Test
    void rejectsBlankFullName() {
        CustomerRequestDTO dto = validTemplate();
        dto.setFullName(" ");
        assertFalse(validator.validate(dto).isEmpty());
    }

    @Test
    void rejectsBlankCustomerId() {
        CustomerRequestDTO dto = validTemplate();
        dto.setCustomerId(" ");
        assertFalse(validator.validate(dto).isEmpty());
    }

    @Test
    void rejectsBlankStatus() {
        CustomerRequestDTO dto = validTemplate();
        dto.setStatus("");
        assertFalse(validator.validate(dto).isEmpty());
    }

    private CustomerRequestDTO validTemplate() {
        CustomerRequestDTO dto = new CustomerRequestDTO();
        dto.setCustomerId("CUS-1002");
        dto.setFullName("Ravi Singh");
        dto.setEmail("ravi.singh@example.com");
        dto.setStatus("PROSPECT");
        return dto;
    }
}
