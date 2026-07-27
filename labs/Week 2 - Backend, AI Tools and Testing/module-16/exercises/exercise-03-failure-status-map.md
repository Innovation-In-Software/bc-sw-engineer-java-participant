# Exercise 3 — Failure to Status Map

**Module 16** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Map Northstar failures to client-facing status classes.

## Reference

| Failure | Status idea |
| --- | --- |
| CUS-9999 not found | 404 / SOAP Client fault |
| Activate Amina illegal transition | 409 or 422 |
| Validation blank name | 400 |
| Unexpected bug | 500 (generic message) |

## Steps

### Step 1 — Copy map

Recreate the table in notes; add one row for timeout/unavailable if you wish.

### Step 2 — Choose conflict

Pick 409 vs 422 for illegal activate and write one reason.

### Step 3 — Never

Write: never return 200 with an error payload for these failures.

### Step 4 — Capture

Save under `notes/lab16-status-map.md`. Pre-lab only — no live `@ControllerAdvice`.

## Expected result

A failure→status map with an explicit never-200 rule.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Table copied | Pass / Fail |
| 2 | 409/422 decision reasoned | Pass / Fail |
| 3 | Never-200 rule written | Pass / Fail |
