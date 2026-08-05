# Lab 17 solution notes

## What / why

Formal JUnit 5 suite for Labs 15–16 behavior with AAA isolation (`@BeforeEach` fresh repo), parameterized transition matrix, and JaCoCo ≥80% on `com.northstar.crm.service`.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-17\lab17\solution"
mvn -B clean verify
```

Expect: BUILD SUCCESS; JaCoCo gate passes. Do not commit `target/site/jacoco`.

## Pitfalls

- `mvn test` without `clean` may skip agent application for verify.
- Prefer `assertThrows(BusinessException.class)` over bare `Exception`.
- Shared static service → flaky tests.
