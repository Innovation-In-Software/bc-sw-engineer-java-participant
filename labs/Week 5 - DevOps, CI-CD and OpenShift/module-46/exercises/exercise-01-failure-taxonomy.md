# Exercise 1 — Classify Consumer Failures

**Module 46** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Categorize why CRM consumer processing fails.

## Reference

| Failure | Typical action |
| --- | --- |
| Validation | DLT + fix publisher |
| Deserialization | DLT + schema/version check |
| Transient DB | Bounded retry then DLT |
| Poison forever-retry | Forbidden pattern |

## Steps

### Step 1 — Categories

List: validation, deserialization, timeout, DB, authz—with one CRM example each.

### Step 2 — Check the reference

Poison messages must not block the partition forever while lag grows unnoticed.

### Step 3 — User impact

Map one failure to stale profile data for `CUS-1001` or stuck status for `CUS-1002`.

### Step 4 — Save

Write `kafka-failure-taxonomy.md`.

## Expected result

Failure taxonomy with CRM user impact.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Five categories listed | Pass / Fail |
| 2 | User impact mapped | Pass / Fail |
| 3 | Notes saved | Pass / Fail |
