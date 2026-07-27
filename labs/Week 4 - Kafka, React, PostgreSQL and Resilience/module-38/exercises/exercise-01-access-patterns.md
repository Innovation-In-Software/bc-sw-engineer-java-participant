# Exercise 1 — Access Patterns

**Module 38** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

List how the CRM will query customers and accounts.

## Steps

### Step 1 — Patterns

By customer_id (`CUS-1001`), by status, by created_at range, accounts by customer_id.

### Step 2 — Hot path

Mark lookup by customer_id as the hottest path.

### Step 3 — Anti-pattern

`SELECT *` without WHERE on huge tables — avoid in app code.

### Step 4 — Notes

Save `notes/lab38-perf.md`.

## Expected result

Access-pattern list with a named hot path.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | ≥3 patterns | Pass / Fail |
| 2 | Hot path identified | Pass / Fail |
| 3 | SELECT * warning | Pass / Fail |
