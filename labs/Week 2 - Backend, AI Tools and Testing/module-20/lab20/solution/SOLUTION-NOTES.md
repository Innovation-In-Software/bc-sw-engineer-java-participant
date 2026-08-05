# Lab 20 solution notes

## What / why

Structured Logback pattern with MDC keys `corr` / `cust` / `op`, `CorrelationFilter` that defaults and echoes `X-Correlation-Id` and clears MDC in `finally`, plus PII-free service INFO lines. Verified by `CustomerLoggingIT`.

## Verify

```powershell
cd "labs\Week 2 - Backend, AI Tools and Testing\module-20\lab20\solution"
mvn -B -Dtest=CustomerLoggingIT test
```

No Docker required.

## Pitfalls

- Missing `MDC.clear()` leaks corr/cust across Tomcat threads.
- Logging fullName/email fails the IT and the PII checklist.
- Competing `logback.xml` can override `logback-spring.xml`.
