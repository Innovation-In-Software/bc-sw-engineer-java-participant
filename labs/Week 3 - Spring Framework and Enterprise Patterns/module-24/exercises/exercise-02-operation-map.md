# Exercise 2 — SOAP Operation Map

**Module 24** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Map four customer SOAP operations to shared `CustomerService` methods.

## Reference

| SOAP operation | Service responsibility |
| --- | --- |
| CreateCustomer | create customer |
| GetCustomer | get by id |
| UpdateCustomerStatus | status transition |
| ListCustomers | list / filter |

## Steps

### Step 1 — Fill map

Create `notes/soap-ops.md` with the four operations and matching service methods.

### Step 2 — Check the reference

Compare to the reference table.

### Step 3 — Shared service rule

Write: REST and SOAP must share `CustomerService` so rules never fork.

### Step 4 — Fixtures

List evidence IDs: `CUS-1001`, `CUS-1002`, `CUS-9999`, correlation `lab24-001`.

## Expected result

Operation map and shared-service rule are ready.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Four operations mapped | Pass / Fail |
| 2 | Shared CustomerService stated | Pass / Fail |
| 3 | Fixtures listed | Pass / Fail |
