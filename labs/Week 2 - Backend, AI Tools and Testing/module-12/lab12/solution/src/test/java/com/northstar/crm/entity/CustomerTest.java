package com.northstar.crm.entity;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void equalsIsBasedOnCustomerIdOnly() {
        Customer a = new Customer("CUS-1001", "Amina Khan", "a@example.com", "1",
                CustomerStatus.ACTIVE, LocalDateTime.now());
        Customer b = new Customer("CUS-1001", "Other", "o@example.com", "2",
                CustomerStatus.CLOSED, LocalDateTime.now());
        assertEquals(a, b);
    }

    @Test
    void toStringIncludesCustomerId() {
        Customer c = new Customer("CUS-1002", "Ravi Singh", "r@example.com", "3",
                CustomerStatus.PROSPECT, LocalDateTime.now());
        assertTrue(c.toString().contains("CUS-1002"));
    }
}
