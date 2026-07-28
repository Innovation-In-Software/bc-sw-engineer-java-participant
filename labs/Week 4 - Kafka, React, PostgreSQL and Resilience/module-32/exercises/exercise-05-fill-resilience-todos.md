# Exercise 3 — Fill Resilience TODOs

**Module 32** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Fill TODOs in Resilience4j pseudocode for the CRM client.

## Steps

### Step 1 — Paste

Create `notes/lab32-todos.md`:

```java
@CircuitBreaker(name = "_____", fallbackMethod = "_____")
@Retry(name = "accountProfile")
@TimeLimiter(name = "accountProfile")
public CompletableFuture<AccountProfile> getProfile(String customerId) {
  return _____.fetch(customerId); // remote client
}

private CompletableFuture<AccountProfile> profileFallback(String customerId, Throwable t) {
  // TODO: return minimal profile for CUS-1001 / CUS-1002
  return CompletableFuture.completedFuture(_____);
}
```

### Step 2 — Fill

Suggested fills: `accountProfile`, `profileFallback`, `accountClient`, `AccountProfile.minimal(customerId)` (or similar).

### Step 3 — Config blanks

Add YAML TODOs: `failureRateThreshold: _____`, `waitDurationInOpenState: _____`, `maxAttempts: _____` with example numbers you choose.

### Step 4 — Correlation

TODO comment: log `lab-request-001` when fallback fires.

## Expected result

Filled pseudocode and numeric config TODOs ready for the starter.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Fallback signature mismatch | Fallback must match return type + extra Throwable arg |
| Retrying non-idempotent POSTs forever | Limit attempts; prefer idempotent GETs for profile |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Annotation blanks filled | Pass / Fail |
| 2 | Three config numbers chosen | Pass / Fail |
| 3 | Correlation log TODO present | Pass / Fail |
