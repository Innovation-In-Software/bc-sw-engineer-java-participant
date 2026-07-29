# Exercise 4 — Fill Metrics/Alert TODOs

**Module 46** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab46-metrics-todos.md` — complete blanks for metrics and dashboard panels.

## Deliverable

| Item | Path (under `examples/module-46-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-metrics-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab46-metrics-todos.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-46-exercises/`, create `notes/` if needed, then create `notes/lab46-metrics-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 46 — Fill Metrics/Alert TODOs

## Step 1 — Template

Fill:
```
Processed count: _____
Failed count: _____
Retry count: _____
DLT count: _____
Lag signal: _____
Alert if lag > _____ for _____
```

## Step 2 — Panels

List three dashboard panels tied to agent impact (lag, DLT growth, error rate).

## Step 3 — Cardinality

Strike any plan that tags metrics with raw email addresses.

## Step 4 — Scope

Checklist only—wiring Micrometer is Lab 46.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Metrics/alert TODO sheet filled without high-cardinality PII tags in `notes/lab46-metrics-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab46-metrics-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 46 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab46-metrics-todos.md` | Pass / Fail |
| 2 | Metric blanks filled | Pass / Fail |
| 3 | Three panels listed | Pass / Fail |
| 4 | No email tags | Pass / Fail |
