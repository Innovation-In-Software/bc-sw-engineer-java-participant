# Exercise 5 — Pattern Map

**Module 32** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Assign each pattern to a concrete Northstar outbound behavior.

## Reference

| Pattern | CRM use |
| --- | --- |
| Retry | Transient 503 from Account Profile |
| TimeLimiter | Fail fast if call exceeds N ms |
| CircuitBreaker | Stop calling when failure rate high |
| Fallback | Return cached/minimal profile for Amina |

## Steps

### Step 1 — Copy table

Copy the reference table into notes.

### Step 2 — Add Ravi row

Add one example sentence for `CUS-1002` Ravi when circuit is open.

### Step 3 — Order idea

Propose decorator order in one line (e.g. TimeLimiter → CircuitBreaker → Retry → call).

### Step 4 — Boundary

Mark: do not apply circuit breaker to local in-memory map lookups.

## Expected result

Pattern→CRM map with decorator order and a Ravi open-circuit example.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Table present | Pass / Fail |
| 2 | Ravi example | Pass / Fail |
| 3 | Decorator order proposed | Pass / Fail |
