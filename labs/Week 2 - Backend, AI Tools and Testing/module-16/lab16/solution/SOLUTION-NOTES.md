# Lab 16 solution notes

## What / why

Stable API error document via `BusinessException` factories, `ErrorResponse`, and `GlobalExceptionHandler`, integrated through `CustomerApiFacade` → `ApiResult` Ok/Fail. Lab 15 illegal-transition / not-found paths now throw typed business exceptions carrying `lab-request-001`.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-16\lab16\solution"
mvn -B clean test
mvn -q exec:java -Dexec.mainClass=com.northstar.crm.Main
```

Expect: handler tests green; Main prints 400/404/409 Fail JSON with `lab-request-001`; Amina remains ACTIVE after 409.

## Pitfalls

- Catch `Exception` before `BusinessException` → 409 becomes 500.
- Leaving Lab 15 `IllegalStateException` → facade cannot map stably.
- Putting `ex.getMessage()` into 500 JSON leaks internals.
