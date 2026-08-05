package com.northstar.crm.mapper;

import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerMapperTest {

    @Test
    void toEntityMapsStatusEnum() {
        CustomerRequestDTO req = new CustomerRequestDTO(
                "CUS-1001", "Amina Khan", "amina.khan@example.com", "ACTIVE");
        Customer entity = CustomerMapper.toEntity(req);
        assertEquals("CUS-1001", entity.getCustomerId());
        assertEquals(CustomerStatus.ACTIVE, entity.getStatus());
    }

    @Test
    void toResponseNeverExposesEntityType() {
        Customer entity = CustomerMapper.toEntity(new CustomerRequestDTO(
                "CUS-1002", "Ravi Singh", "ravi.singh@example.com", "PROSPECT"));
        CustomerResponseDTO dto = CustomerMapper.toResponse(entity);
        assertEquals("CUS-1002", dto.getCustomerId());
        assertEquals("PROSPECT", dto.getStatus());
        assertNotNull(dto.getCreatedAt());
    }

    @Test
    void invalidStatusThrowsFromValueOf() {
        assertThrows(IllegalArgumentException.class, () ->
                CustomerMapper.toEntity(new CustomerRequestDTO(
                        "CUS-1001", "A", "a@example.com", "NOT_A_STATUS")));
    }
}
