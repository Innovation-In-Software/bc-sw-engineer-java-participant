# Exercise 2 — Exception to Status Map

**Module 29** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Document handler mappings for Lab 29 / Lab 16 ideas.

## Reference

| Case | HTTP |
| --- | --- |
| Bean Validation failure | 400 |
| Customer not found | 404 |
| Duplicate create | 409 |
| Illegal status transition | 409 or 422 (pick & justify) |
| Unhandled | 500 safe fallback |

## Steps

### Step 1 — Fill map

Create `notes/exception-status-map.md` with the five cases.

### Step 2 — Check the reference

Compare statuses; justify illegal-transition choice in one sentence.

### Step 3 — Handler type

Note `@RestControllerAdvice` / `GlobalExceptionHandler`.

### Step 4 — SOAP optional

Optional note: SOAP faults should stay aligned in spirit with REST envelopes.

## Expected result

Exception→status map and handler type documented.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Five cases mapped | Pass / Fail |
| 2 | Global handler named | Pass / Fail |
| 3 | Justification for transition status present | Pass / Fail |
