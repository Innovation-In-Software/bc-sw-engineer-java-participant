# Exercise 1 — Cardinality Anti-Patterns

**Module 21** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Reject labels that explode time-series for Northstar traffic.

## Reference

| Label | OK? |
| --- | --- |
| outcome=success|failure | yes |
| status=ACTIVE|PROSPECT | careful / limited |
| customerId=CUS-1001 | no — high cardinality |
| correlationId=lab-request-001 | no — use logs/traces |

## Steps

### Step 1 — Copy table

Recreate; add path template vs raw URL with ids as another anti-pattern.

### Step 2 — Where ids go

customerId and correlation belong in logs/traces, not metric labels.

### Step 3 — Good metric

Name idea: `customer_create_failure_total` with reason=validation|conflict.

### Step 4 — Boundary

Prep sketch only — do not complete full Lab 21 dashboards now.

## Expected result

A cardinality do/don't table tied to CRM ids.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Table plus URL anti-pattern | Pass / Fail |
| 2 | Ids routed to logs/traces | Pass / Fail |
| 3 | Good metric named | Pass / Fail |
