# Exercise 1 — Fill Fault Envelope TODOs

**Module 13** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab13-fault-todos.md` — complete fill-in blanks for a NotFound fault when CUS-9999 is requested.

## Deliverable

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-fill-fault-envelope-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab13-fault-todos.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-13-exercises/`, create `notes/` if needed, then create `notes/lab13-fault-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 13 — Fill Fault Envelope TODOs

## Step 1 — Copy envelope TODOs

Fault code: _____
Fault string: _____
Detail customerId: _____
Correlation id: _____
HTTP/transport note (placeholder): _____
Real hosting lab: _____

## Step 2 — Fill blanks

Use Client/NotFound style code, message for unknown customer, `CUS-9999`, `lab-request-001`, placeholder endpoint honesty, and `Lab 24`.

## Step 3 — Honesty sentence

Write: *Placeholder endpoint only — no Spring-WS hosting in Lab 13 prep.*

## Step 4 — Self-check

Confirm CUS-9999 (not Amina/Ravi) is the not-found example.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled fault TODOs with CUS-9999 and Lab 24 deferral in `notes/lab13-fault-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-fault-todos.md` |
| Using CUS-1001 as not-found | Keep Amina valid; use CUS-9999 for fault demos |
| Claiming live Spring-WS | Design-only until Lab 24 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab13-fault-todos.md` | Pass / Fail |
| 2 | All _____ replaced | Pass / Fail |
| 3 | CUS-9999 and lab-request-001 present | Pass / Fail |
| 4 | Lab 24 named | Pass / Fail |
