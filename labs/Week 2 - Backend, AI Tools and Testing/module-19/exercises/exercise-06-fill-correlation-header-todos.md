# Exercise 6 — Fill Correlation Header TODOs

**Module 19** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete fill-in blanks for correlation headers in integration tests.

## Steps

### Step 1 — Copy TODOs

Create `notes/lab19-correlation-todos.md` and paste:

Header name: _____
Header value for lab: _____
IT call must attach header? _____
UI journey logs correlation? _____
Flake mitigation idea: _____
Actuator in this pre-lab? _____

### Step 2 — Fill blanks

Fill X-Correlation-Id, lab-request-001, yes, yes/optional, explicit waits/testid stability, and no for Actuator.

### Step 3 — CI note

Write: *CI agents need browser driver management; expect flake without waits.*

### Step 4 — Self-check

Confirm Actuator blank is no (Lab 21).

## Expected result

Filled correlation/flake TODOs with Actuator deferred.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Hard sleeps only | Prefer explicit waits + stable testids |
| Skipping correlation on IT | Attach lab-request-001 on API calls |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | All _____ replaced | Pass / Fail |
| 2 | CI flake note present | Pass / Fail |
| 3 | Actuator deferred | Pass / Fail |
