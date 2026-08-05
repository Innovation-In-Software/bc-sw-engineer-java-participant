# Lab 15 — Service layer notes (solution)

## Bean Validation vs CustomerValidator

| Layer | Responsibility |
| --- | --- |
| Lab 14 Bean Validation (DTO) | Shape: non-blank id/name, email format |
| Lab 15 `CustomerValidator` | Meaning: uniqueness + allowed status transitions |

## Allowed transitions

```text
PROSPECT  -> ACTIVE, CLOSED
ACTIVE    -> SUSPENDED, CLOSED
SUSPENDED -> ACTIVE, CLOSED
CLOSED    -> (none)
```

Same-status `changeStatus` is **rejected** (destination must appear in ALLOWED).

## Wiring (shared repository)

```java
CustomerRepository repo = new InMemoryCustomerRepository();
CustomerValidator validator = new CustomerValidator(repo);
CustomerService service = new DefaultCustomerService(repo, validator);
```

Two different repo instances break uniqueness checks.

## Anti-leak

`Map` stays private inside `InMemoryCustomerRepository`. `listAll()` returns `List.copyOf(...)`.
No `HashMap` / JDBC / `EntityManager` in the `service` package.
