### Exercise-02-try-catch-finally:

Success: try → finally → return
Failure: try throws → catch → finally → return

## Exercise-07-error-strategies:

- Skip & Continue: importing 10,000 CSV rows — one bad row should not stop the other 9,999.
- Fail Fast: a required config value is missing at startup — do not limp along with a null.
- Graceful Degradation: a recommendations service is down — show the page without recommendations instead of a 500 error.
- Circuit Breaker: a downstream payment API is timing out repeatedly — stop hammering it and fail fast for a cooldown period.