package com.northstar.crm;

import com.northstar.crm.dto.CustomerRequest;
import com.northstar.crm.dto.CustomerResponse;
import com.northstar.crm.entity.Customer;

public class StructureDemo {
    public static void main(String[] args) {
        CustomerRequest request =
                new CustomerRequest(
                        "Amina Khan", "amina@example.test");

        Customer entity =
                new Customer(
                        "CUS-1001",
                        request.getName(),
                        "ACTIVE");

        CustomerResponse response =
                new CustomerResponse(
                        entity.getId(),
                        entity.getName(),
                        entity.getStatus());

        System.out.println(response.summary());
    }
}
