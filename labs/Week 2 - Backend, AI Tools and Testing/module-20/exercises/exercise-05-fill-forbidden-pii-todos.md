# Exercise 5 — Fill Forbidden PII Checklist TODOs

**Module 20** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete fill-in blanks for a forbidden PII logging checklist.

## Steps

### Step 1 — Copy checklist

Create `notes/lab20-pii-todos.md` and paste:

Forbidden: _____
Forbidden: _____
Forbidden: _____
Allowed: customerId _____
Allowed: correlation _____
Clear MDC in finally? _____

### Step 2 — Fill blanks

Fill three forbidden items (email, phone, raw card/national id ideas), CUS-1001/CUS-1002, lab-request-001, and yes for clear MDC.

### Step 3 — Finally note

Write the finally snippet conceptually: try { … } finally { MDC.clear(); }.

### Step 4 — Self-check

Confirm allowed ids are fixtures, not personal emails.

## Expected result

Filled PII TODOs with MDC clear affirmed.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Logging full request bodies | Log ids + outcome + correlation only |
| Forgetting MDC.clear | Always clear in finally |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | All _____ replaced | Pass / Fail |
| 2 | Three forbidden items | Pass / Fail |
| 3 | MDC clear yes | Pass / Fail |
