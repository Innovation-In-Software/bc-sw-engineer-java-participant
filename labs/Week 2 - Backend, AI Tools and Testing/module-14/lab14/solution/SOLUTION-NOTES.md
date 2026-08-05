# Lab 14 — Instructor solution notes

## What was implemented

- `CustomerRequestDTO` / `CustomerResponseDTO` with Jakarta constraints.
- `CustomerMapper` in package `com.northstar.crm.mapper` (GUIDE naming).
- `CustomerApiFacade` validate → create/get → DTO only.
- Tests: validation (5) + facade (5) + mapper (3) = **13**.
- Renamed/aligned `CustomerRequestDTOValidationTest` with GUIDE.

## How to verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-14\lab14\solution"
mvn -B clean test
```

Expected: Tests run: 13, Failures: 0.

## Pitfalls

- Use `jakarta.validation` (not javax).
- Mapper package is `mapper`, not `dto`.
- Service API is Lab 12 `createCustomer`/`getCustomer` — adapt GUIDE's `addCustomer` examples.
- Running Main needs validation jars on classpath (`dependency:build-classpath` or IntelliJ).
