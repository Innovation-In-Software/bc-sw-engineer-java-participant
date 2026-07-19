# Exercise 2 — Plan Package Organization

**Module 8** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Create `package-plan.md` mapping CRM types to packages and fully qualified class names.

## Package rules

| Rule | Good example |
| ---- | ------------ |
| Lowercase package segments | `com.northstar.crm.service` |
| Reverse-domain root | `com.northstar.crm` |
| Class name uses PascalCase | `CustomerService` |
| Folder path matches package declaration | `com/northstar/crm/service` |
| Package describes responsibility | `repository`, not `misc` |

## Steps

### Step 1 — Complete the map

| Type | Package | Fully qualified name |
| ---- | ------- | -------------------- |
| `CustomerController` | | |
| `CustomerService` | | |
| `CustomerRepository` | | |
| `Customer` | | |
| `CustomerRequest` | | |
| `AppConfig` | | |
| `CustomerNotFoundException` | | |

### Step 2 — Check the reference

```text
com.northstar.crm.controller.CustomerController
com.northstar.crm.service.CustomerService
com.northstar.crm.repository.CustomerRepository
com.northstar.crm.entity.Customer
com.northstar.crm.dto.CustomerRequest
com.northstar.crm.config.AppConfig
com.northstar.crm.exception.CustomerNotFoundException
```

### Step 3 — Translate package to path

For:

```java
package com.northstar.crm.service;
```

the production source path must be:

```text
src/main/java/com/northstar/crm/service/
```

Write the equivalent path for `CustomerRequest`.

**Expected:** `src/main/java/com/northstar/crm/dto/CustomerRequest.java`

### Step 4 — Correct bad names

| Bad | Correct |
| --- | ------- |
| `com.Northstar.CRM.Service` | `com.northstar.crm.service` |
| package `utils` for customer business rules | `service` or a focused domain package |
| `customer_service.java` | `CustomerService.java` |
| package declaration does not match folders | Make both paths identical |

## Expected result

All seven types have focused packages, valid fully qualified names, and matching source paths.

## If it fails

| Problem | Fix |
| ------- | --- |
| IDE reports wrong package | Compare declaration with path under `src/main/java` |
| Everything lands in root package | Create responsibility-specific subpackages |
| Generic `util` becomes a dumping ground | Name packages for a stable concern |

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Seven FQCNs are correct | Pass / Fail |
| 2 | DTO path matches its declaration | Pass / Fail |
| 3 | Package segments are lowercase and meaningful | Pass / Fail |
