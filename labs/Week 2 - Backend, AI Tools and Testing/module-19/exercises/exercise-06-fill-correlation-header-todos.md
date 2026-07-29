# Exercise 6 — Fill Correlation Header TODOs

**Module 19** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab19-correlation-header-todos.md` — complete fill-in blanks for correlation headers in integration tests.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-06-fill-correlation-header-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab19-correlation-header-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 19 — Fill Correlation Header TODOs

## Step 1 — Copy TODOs

Header name: (your note here)
Header value for lab: (your note here)
IT call must attach header? (your note here)
UI journey logs correlation? (your note here)
Flake mitigation idea: (your note here)
Actuator in this pre-lab? (your note here)

## Step 2 — Fill blanks

Fill X-Correlation-Id, lab-request-001, yes, yes/optional, explicit waits/testid stability, and no for Actuator.

## Step 3 — CI note

Write: *CI agents need browser driver management; expect flake without waits.*

## Step 4 — Self-check

Confirm Actuator blank is no (Lab 21).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-correlation-header-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — Fill Correlation Header TODOs

## Step 1 — Copy TODOs

Header name: _____
Header value for lab: _____
IT call must attach header? _____
UI journey logs correlation? _____
Flake mitigation idea: _____
Actuator in this pre-lab? _____

## Step 2 — Fill blanks

Fill X-Correlation-Id, lab-request-001, yes, yes/optional, explicit waits/testid stability, and no for Actuator.

## Step 3 — CI note

Write: *CI agents need browser driver management; expect flake without waits.*

## Step 4 — Self-check

Confirm Actuator blank is no (Lab 21).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled correlation/flake TODOs with Actuator deferred in `notes/lab19-correlation-header-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-correlation-header-todos.md` |
| Hard sleeps only | Prefer explicit waits + stable testids |
| Skipping correlation on IT | Attach lab-request-001 on API calls |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab19-correlation-header-todos.md`
- [ ] All _____ replaced
- [ ] CI flake note present
- [ ] Actuator deferred

