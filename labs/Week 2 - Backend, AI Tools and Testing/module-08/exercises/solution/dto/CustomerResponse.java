package com.northstar.crm.dto;

public class CustomerResponse {
    private final String id;
    private final String name;
    private final String status;

    public CustomerResponse(
            String id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public String summary() {
        return id + " | " + name + " | " + status;
    }
}
