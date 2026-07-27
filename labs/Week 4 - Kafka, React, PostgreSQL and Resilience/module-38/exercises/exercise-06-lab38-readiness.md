# Exercise 6 — Lab 38 Readiness

**Module 38** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Confirm performance hypotheses are ready before generating lab data.

## Steps

### Step 1 — Hypothesis

Write: *customer_id equality uses index; LOWER(full_name) may seq scan.*

### Step 2 — Evidence preview

Future: paste EXPLAIN snippets into `database/performance/report.md`.

### Step 3 — Dialect

Primary tools are PostgreSQL EXPLAIN/ANALYZE — not Oracle packs.

### Step 4 — Pass mark

Pass if SQL TODOs filled.

## Expected result

Hypothesis + dialect-correct readiness note.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Hypothesis written | Pass / Fail |
| 2 | PostgreSQL tools named | Pass / Fail |
| 3 | Pass/Fail marked | Pass / Fail |
