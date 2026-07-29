# Exercise 2 — Sargability

**Module 38** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab38-sargability.md` — classify predicates as sargable or not for PostgreSQL.

## Deliverable

| Item | Path (under `examples/module-38-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-sargability.md` (this file in the course repo) |
| Your notes file | `notes/lab38-sargability.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-38-exercises/`, create `notes/` if needed, then create `notes/lab38-sargability.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 38 — Sargability

## Reference

| Predicate | Sargable? |
| --- | --- |
| customer_id = 'CUS-1001' | Yes |
| status = 'ACTIVE' | Yes (with index) |
| LOWER(full_name) = 'amina khan' | Usually no on plain index |
| created_at >= TIMESTAMP '2026-01-01' | Yes (range) |
| date_trunc('day', created_at) = ... | Often weaker than range |

## Step 1 — Study table

Copy the reference table into notes.

## Step 2 — Rewrite

Rewrite a non-sargable name search idea into something index-friendlier (e.g. store lowercased column or use `ILIKE` carefully).

## Step 3 — Half-open range

Prefer `created_at >= d AND created_at < d+1` over wrapping columns in functions.

## Step 4 — Oracle note

If old materials say `TRUNC(created_at)`, map to PostgreSQL range/`date_trunc` contrast.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Predicate classifications plus one rewritten query idea in `notes/lab38-sargability.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab38-sargability.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 38 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab38-sargability.md` | Pass / Fail |
| 2 | Table copied | Pass / Fail |
| 3 | One rewrite written | Pass / Fail |
| 4 | Range preference stated | Pass / Fail |
