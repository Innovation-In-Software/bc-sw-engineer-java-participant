# Exercise 4 — Fill Metric Sketch TODOs

**Module 21** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete fill-in blanks for metrics and an alert on create_failure_total.

## Steps

### Step 1 — Copy TODOs

Create `notes/lab21-metric-todos.md` and paste:

Success counter: _____
Failure counter: _____
Forbidden label: _____
Alert name: _____
Alert when create_failure_total rises above: _____
First responder action: _____

### Step 2 — Fill blanks

Fill create_success_total, create_failure_total, customerId (forbidden), CrmCreateFailuresHigh, a numeric threshold you choose, and check logs for lab-request-001.

### Step 3 — Alert narrative

Write: page on sustained create_failure_total; correlate with recent CUS-1001/CUS-1002 traffic via logs, not metric labels.

### Step 4 — Self-check

Confirm failure counter blank is create_failure_total.

## Expected result

Filled metric/alert TODOs anchored on create_failure_total.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Alerting on customerId label cardinality | Alert on aggregated failure_total |
| No runbook action | Always name first log/query step |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | All _____ replaced | Pass / Fail |
| 2 | create_failure_total used | Pass / Fail |
| 3 | Responder action named | Pass / Fail |
