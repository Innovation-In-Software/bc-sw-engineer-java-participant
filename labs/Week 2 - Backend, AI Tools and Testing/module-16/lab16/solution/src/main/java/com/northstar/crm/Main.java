package com.northstar.crm;

import com.northstar.crm.api.ApiResult;
import com.northstar.crm.api.CustomerApiFacade;
import com.northstar.crm.dto.CustomerRequestDTO;
import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import com.northstar.crm.repository.CustomerRepository;
import com.northstar.crm.repository.InMemoryCustomerRepository;
import com.northstar.crm.service.CustomerService;
import com.northstar.crm.service.CustomerValidator;
import com.northstar.crm.service.DefaultCustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerRepository repo = new InMemoryCustomerRepository();
        CustomerValidator validator = new CustomerValidator(repo);
        CustomerService service = new DefaultCustomerService(repo, validator);
        CustomerApiFacade api = new CustomerApiFacade(service);

        service.addCustomer(Customer.amina());
        service.addCustomer(Customer.ravi());

        String corr = "lab-request-001";

        ApiResult badEmail = api.create(
                new CustomerRequestDTO("CUS-3001", "Bad Email", "not-an-email", "PROSPECT"), corr);
        printFail("400 validation", badEmail);

        ApiResult missing = api.getById("CUS-9999", corr);
        printFail("404 not found", missing);

        ApiResult conflict = api.changeStatus("CUS-1001", CustomerStatus.PROSPECT, corr);
        printFail("409 conflict", conflict);
        System.out.println("CUS-1001 still: "
                + service.findById("CUS-1001").orElseThrow().getStatus());
    }

    private static void printFail(String label, ApiResult result) {
        if (result instanceof ApiResult.Fail fail) {
            System.out.println(label + ": " + fail.error().toJson());
        } else {
            System.out.println(label + ": unexpected Ok — " + result);
        }
    }
}
