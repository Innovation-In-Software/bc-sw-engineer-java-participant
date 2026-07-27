# Exercise 4 — Fill Message Hygiene TODOs

**Module 16** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete fill-in blanks for safe vs unsafe error messages.

## Steps

### Step 1 — Copy TODOs

Create `notes/lab16-hygiene-todos.md` and paste:

Safe not-found message: _____
Unsafe message anti-pattern: _____
Correlation always field: _____
Log stack trace? _____ (server logs yes/no)
Return stack trace to client? _____
@ControllerAdvice live in this pre-lab? _____

### Step 2 — Fill blanks

Fill safe message for unknown customer, unsafe SQL/PII example, `correlationId`, yes for server logs, no for client, no for live advice.

### Step 3 — Correlation always

Write: *Every error sketch includes lab-request-001 (or request header value).*

### Step 4 — Self-check

Confirm client stack-trace blank is no.

## Expected result

Filled hygiene TODOs with correlation-always rule.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Returning e.getMessage() blindly | Map to stable client messages |
| Omitting correlation on 500s | Always include correlationId |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | All _____ replaced | Pass / Fail |
| 2 | Correlation rule written | Pass / Fail |
| 3 | No live @ControllerAdvice claimed | Pass / Fail |
