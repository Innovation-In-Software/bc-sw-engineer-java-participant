# Exercise 2 — Package Sketch

**Module 25** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Sketch `api`/`controller`, `service`, `repository`, `model` packages.

## Steps

### Step 1 — Tree

In `notes/package-tree.md`, draw `com.northstar.crm` with controller, service, repository, model (and optional dto).

### Step 2 — Types

Place `CustomerController`, `CustomerService`, `CustomerRepository`, `InMemoryCustomerRepository`, `Customer`.

### Step 3 — SOAP note

If SOAP exists from Lab 24, endpoints stay adapters; still call the same service.

### Step 4 — JPA readiness

One sentence: later JPA repo should keep the same service method signatures.

## Expected result

Package tree supports layered Boot CRM.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Four packages present | Pass / Fail |
| 2 | Five types placed | Pass / Fail |
| 3 | JPA readiness sentence written | Pass / Fail |
