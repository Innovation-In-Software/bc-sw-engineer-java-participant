package com.northstar.crm;

import com.northstar.crm.api.CustomerApiFacade;
import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.dto.CustomerResponseDTO;
import com.northstar.crm.service.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerApiFacade api = new CustomerApiFacade(new CustomerService());
        String correlation = "lab-request-001";

        CustomerRequestDTO amina = new CustomerRequestDTO(
                "CUS-1001", "Amina Khan", "amina.khan@example.com", "ACTIVE");
        CustomerResponseDTO createdAmina = api.create(amina, correlation);
        System.out.println("created: " + createdAmina);

        CustomerRequestDTO ravi = new CustomerRequestDTO(
                "CUS-1002", "Ravi Singh", "ravi.singh@example.com", "PROSPECT");
        CustomerResponseDTO createdRavi = api.create(ravi, correlation);
        System.out.println("created: " + createdRavi);

        System.out.println("get CUS-1001: " + api.get("CUS-1001", correlation));
        System.out.println("get CUS-1002: " + api.get("CUS-1002", correlation));

        try {
            CustomerRequestDTO bad = new CustomerRequestDTO(
                    "CUS-1003", "Bad Email", "not-an-email", "ACTIVE");
            api.create(bad, correlation);
        } catch (IllegalArgumentException ex) {
            System.out.println("invalid email: " + ex.getMessage());
        }

        try {
            api.get("CUS-9999", correlation);
        } catch (IllegalArgumentException ex) {
            System.out.println("unknown id: " + ex.getMessage());
        }
    }
}
