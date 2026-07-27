# Exercise 2 — Sargability

**Module 38** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Classify predicates as sargable or not for PostgreSQL.

## Reference

| Predicate | Sargable? |
| --- | --- |
| customer_id = 'CUS-1001' | Yes |
| status = 'ACTIVE' | Yes (with index) |
| LOWER(full_name) = 'amina khan' | Usually no on plain index |
| created_at >= TIMESTAMP '2026-01-01' | Yes (range) |
| date_trunc('day', created_at) = ... | Often weaker than range |

## Steps

### Step 1 — Study table

Copy the reference table into notes.

### Step 2 — Rewrite

Rewrite a non-sargable name search idea into something index-friendlier (e.g. store lowercased column or use `ILIKE` carefully).

### Step 3 — Half-open range

Prefer `created_at >= d AND created_at < d+1` over wrapping columns in functions.

### Step 4 — Oracle note

If old materials say `TRUNC(created_at)`, map to PostgreSQL range/`date_trunc` contrast.

## Expected result

Predicate classifications plus one rewritten query idea.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Table copied | Pass / Fail |
| 2 | One rewrite written | Pass / Fail |
| 3 | Range preference stated | Pass / Fail |
