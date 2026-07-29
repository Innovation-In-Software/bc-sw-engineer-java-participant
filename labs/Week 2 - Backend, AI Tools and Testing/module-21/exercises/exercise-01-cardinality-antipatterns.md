# Exercise 1 — Cardinality Anti-Patterns

**Module 21** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab21-cardinality-antipatterns.md` — reject labels that explode time-series for Northstar traffic.

## Deliverable

| Item | Path (under `examples/module-21-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-cardinality-antipatterns.md` (this file in the course repo) |
| Your notes file | `notes/lab21-cardinality-antipatterns.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-21-exercises/`, create `notes/` if needed, then create `notes/lab21-cardinality-antipatterns.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 21 — Cardinality Anti-Patterns

## Reference

| Label | OK? |
| --- | --- |
| outcome=success|failure | yes |
| status=ACTIVE|PROSPECT | careful / limited |
| customerId=CUS-1001 | no — high cardinality |
| correlationId=lab-request-001 | no — use logs/traces |

## Step 2 — Where ids go

customerId and correlation belong in logs/traces, not metric labels.

## Step 3 — Good metric

Name idea: `customer_create_failure_total` with reason=validation|conflict.

## Step 4 — Boundary

Prep sketch only — do not complete full Lab 21 dashboards now.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A cardinality do/don't table tied to CRM ids in `notes/lab21-cardinality-antipatterns.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab21-cardinality-antipatterns.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 21 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab21-cardinality-antipatterns.md` | Pass / Fail |
| 2 | Table plus URL anti-pattern | Pass / Fail |
| 3 | Ids routed to logs/traces | Pass / Fail |
| 4 | Good metric named | Pass / Fail |
