# Exercise 4 — Separate Entity and DTO

**Module 8** · Small compile exercise · [setup](EXERCISES-INDEX.md)

## Goal

Create a tiny plain-Java package tree proving that a domain entity and boundary DTOs can have different fields and responsibilities.

> No Spring, JPA, Lombok, or validation annotations yet.

## Files

```text
mini-src/com/northstar/crm/
├── StructureDemo.java
├── entity/Customer.java
└── dto/
    ├── CustomerRequest.java
    └── CustomerResponse.java
```

### `entity/Customer.java`

```java
package com.northstar.crm.entity;

public class Customer {
    private final String id;
    private final String name;
    private final String status;

    public Customer(String id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getStatus() { return status; }
}
```

### `dto/CustomerRequest.java`

```java
package com.northstar.crm.dto;

public class CustomerRequest {
    private final String name;
    private final String email;

    public CustomerRequest(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
}
```

### `dto/CustomerResponse.java`

```java
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
```

### `StructureDemo.java`

```java
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
```

## Steps

### Step 1 — Create directories/files

Use IntelliJ **New → Directory** and **New → File**, following the tree exactly.

### Step 2 — Compile

From `module-08-exercises`:

```text
javac -d mini-out mini-src/com/northstar/crm/entity/Customer.java mini-src/com/northstar/crm/dto/CustomerRequest.java mini-src/com/northstar/crm/dto/CustomerResponse.java mini-src/com/northstar/crm/StructureDemo.java
```

### Step 3 — Run

**Windows:**

```powershell
java -cp mini-out com.northstar.crm.StructureDemo
```

**macOS:**

```bash
java -cp mini-out com.northstar.crm.StructureDemo
```

**Expected:**

```text
CUS-1001 | Amina Khan | ACTIVE
```

## Why three types?

| Type | Purpose |
| ---- | ------- |
| Request DTO | Fields accepted at boundary; no generated ID/status |
| Entity | Internal customer identity/state |
| Response DTO | Safe outward representation |

The demo manually maps objects only to illustrate boundaries. Real behavior arrives in later labs.

## Failure experiment

Change `Customer.java` package to `com.northstar.crm.dto` without moving the file/imports. Compilation should fail. Restore it.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Package tree matches declarations | Pass / Fail |
| 2 | Compile and run output matches expected | Pass / Fail |
| 3 | You explain entity vs request/response DTO | Pass / Fail |
