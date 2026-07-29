# Exercise 4 — Fill Metric Sketch TODOs

**Module 21** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab21-metric-sketch-todos.md` — complete fill-in blanks for metrics and an alert on create_failure_total.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-21-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-fill-metric-sketch-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab21-metric-sketch-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 21 — Fill Metric Sketch TODOs

## Step 1 — Copy TODOs

Success counter: (your note here)
Failure counter: (your note here)
Forbidden label: (your note here)
Alert name: (your note here)
Alert when create_failure_total rises above: (your note here)
First responder action: (your note here)

## Step 2 — Fill blanks

Fill create_success_total, create_failure_total, customerId (forbidden), CrmCreateFailuresHigh, a numeric threshold you choose, and check logs for lab-request-001.

## Step 3 — Alert narrative

Write: page on sustained create_failure_total; correlate with recent CUS-1001/CUS-1002 traffic via logs, not metric labels.

## Step 4 — Self-check

Confirm failure counter blank is create_failure_total.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-21-exercises/`, create `notes/` if needed, then create `notes/lab21-metric-sketch-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 21 — Fill Metric Sketch TODOs

## Step 1 — Copy TODOs

Success counter: _____
Failure counter: _____
Forbidden label: _____
Alert name: _____
Alert when create_failure_total rises above: _____
First responder action: _____

## Step 2 — Fill blanks

Fill create_success_total, create_failure_total, customerId (forbidden), CrmCreateFailuresHigh, a numeric threshold you choose, and check logs for lab-request-001.

## Step 3 — Alert narrative

Write: page on sustained create_failure_total; correlate with recent CUS-1001/CUS-1002 traffic via logs, not metric labels.

## Step 4 — Self-check

Confirm failure counter blank is create_failure_total.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled metric/alert TODOs anchored on create_failure_total in `notes/lab21-metric-sketch-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab21-metric-sketch-todos.md` |
| Alerting on customerId label cardinality | Alert on aggregated failure_total |
| No runbook action | Always name first log/query step |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab21-metric-sketch-todos.md`
- [ ] All _____ replaced
- [ ] create_failure_total used
- [ ] Responder action named

