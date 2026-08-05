package com.northstar.crm;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.service.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerService svc = new CustomerService();
        svc.setCorrelationId("lab-request-001");

        Customer amina = svc.createCustomer(
                "CUS-1001", "Amina Khan", "amina.khan@example.com", "555-0101", CustomerStatus.ACTIVE);
        System.out.println("created " + amina);

        svc.createCustomer("CUS-1002", "Ravi Singh", "ravi.singh@example.com", "555-0102", CustomerStatus.PROSPECT);
        System.out.println("get CUS-1001 -> " + svc.getCustomer("CUS-1001"));
        System.out.println("update CUS-1002 -> " + svc.updateStatus("CUS-1002", CustomerStatus.ACTIVE));

        try {
            svc.createCustomer("CUS-1001", "Other", "x@example.com", null, CustomerStatus.PROSPECT);
        } catch (IllegalStateException ex) {
            System.out.println("duplicate: " + ex.getMessage());
        }
        try {
            svc.getCustomer("CUS-9999");
        } catch (IllegalArgumentException ex) {
            System.out.println("unknown: " + ex.getMessage());
        }
    }
}
