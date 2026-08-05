# Lab 17 — JUnit runbook (solution)

## Commands

```bash
mvn -q test
mvn -q clean verify   # includes JaCoCo check on com.northstar.crm.service ≥ 0.80
mvn -q test -Dtest=CustomerServiceTests
mvn -q test -Dtest=CustomerValidatorParameterizedTest
```

## Suites

| Class | Scope |
| --- | --- |
| `CustomerServiceTests` | Real in-memory repo: create/find/activate, duplicates, illegal transition, not-found |
| `CustomerValidatorParameterizedTest` | Legal/illegal transition matrix via `@CsvSource` |
| `GlobalExceptionHandlerTest` | Lab 16 handler mapping |

## Coverage gate

JaCoCo PACKAGE rule: `com.northstar.crm.service` LINE ≥ **0.80**. Always use `mvn clean verify` so the agent applies.

Deliberate fail: temporarily set `minimum` to `0.99`, observe rule violation, restore `0.80`.

## AI review

Manual equivalent (`lab17-001`): rejected trivial `assertNotNull(service)`-only drafts; kept asserts on IDs, status, and `BusinessException` codes.
