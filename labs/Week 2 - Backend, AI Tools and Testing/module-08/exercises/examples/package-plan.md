
### Package Rules:

| Rule | Good example |
| ---- | ------------ |
| Lowercase package segments | `com.northstar.crm.service` |
| Reverse-domain root | `com.northstar.crm` |
| Class name uses PascalCase | `CustomerService` |
| Folder path matches package declaration | `com/northstar/crm/service` |
| Package describes responsibility | `repository`, not `misc` |

### Complete the map:

| Type | Package                                               | Fully qualified name                                                |
| ---- |-------------------------------------------------------|---------------------------------------------------------------------|
| `CustomerController` | com.northstar.crm.controller.CustomerController       | src/main/java/com/northstar/crm/controller/CustomerController       |
| `CustomerService` | com.northstar.crm.service.CustomerService             | src/main/java/com/northstar/crm/service/CustomerService             |
| `CustomerRepository` | com.northstar.crm.repository.CustomerRepository       | src/main/java/com/northstar/crm/repository/CustomerRepository       |
| `Customer` | com.northstar.crm.entity.Customer                     | src/main/java/com/northstar/crm/entity/Customer                     |
| `CustomerRequest` | com.northstar.crm.dto.CustomerRequest                 | src/main/java/com/northstar/crm/dto/CustomerRequest                 |
| `AppConfig` | com.northstar.crm.config.AppConfig                    | src/main/java/com/northstar/crm/config/AppConfig                    |
| `CustomerNotFoundException` | com.northstar.crm.exception.CustomerNotFoundException | src/main/java/com/northstar/crm/exception/CustomerNotFoundException |


### Translate package to path:
For:
`package com.northstar.crm/service;`
the production source path must be:
`src/main/java/com/northstar/crm/service/`

Write the equivalent path for `CustomerRequest`.
**Expected:** `src/main/java/com/northstar/crm/dto/CustomerRequest.java`

### Correct bad names:

| Bad | Correct |
| --- | ------- |
| `com.Northstar.CRM.Service` | `com.northstar.crm.service` |
| package `utils` for customer business rules | `service` or a focused domain package |
| `customer_service.java` | `CustomerService.java` |
| package declaration does not match folders | Make both paths identical |

## Expected result

All seven types have focused packages, valid fully qualified names, and matching source paths.