# Exercise 5 — Stereotype Annotation Map

**Module 22** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Map each Northstar CRM type to `@Service`, `@Repository`, `@RestController`, or plain domain.

## Reference

| Type | Stereotype / note |
| --- | --- |
| CustomerService | `@Service` |
| InMemoryCustomerRepository | `@Repository` (implements interface) |
| CustomerController | `@RestController` |
| Customer (model) | Plain Java — no Spring unless required |
| NotificationService | `@Service` |

## Steps

### Step 1 — Fill the blank table

Create `notes/stereotype-map.md` with columns Type | Annotation | Why.
Fill for: `CustomerService`, `CustomerRepository` interface, `InMemoryCustomerRepository`, `CustomerController`, `Customer`, `NotificationService`.

### Step 2 — Check the reference

Compare against the reference table. Domain `Customer` stays free of Spring.

### Step 3 — Singleton caution

Write two sentences: default Spring beans are singletons; mutable instance fields on `CustomerService` are dangerous for concurrent requests.

### Step 4 — Lab prep

Note that Lab 22 requires `docs/dependency-graph.md` naming these beans — you only sketch names here.

## Expected result

Stereotype map matches Spring roles; domain model stays plain.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Service/repository/controller annotations are correct | Pass / Fail |
| 2 | `Customer` is marked as plain domain | Pass / Fail |
| 3 | Singleton caution is written | Pass / Fail |
