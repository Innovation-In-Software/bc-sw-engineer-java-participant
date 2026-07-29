# Exercise 3 — Page Object Sketch

**Module 19** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab19-page-object.md` — sketch a CustomerStatusPage object with actions and queries.

## Deliverable

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-page-object.md` (this file in the course repo) |
| Your notes file | `notes/lab19-page-object.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-page-object.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — Page Object Sketch

## Step 1 — Class

Paper class `CustomerStatusPage` with driver field.

## Step 2 — Actions

Methods: open(customerId), readStatus(), clickActivate().

## Step 3 — No asserts in page?

Prefer assertions in tests; page returns data (status text).

## Step 4 — Prep boundary

Write: *Prepare for Lab 19; do not complete full Selenium suite now.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A Page Object sketch with clear responsibilities in `notes/lab19-page-object.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-page-object.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 19 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab19-page-object.md` | Pass / Fail |
| 2 | Class and methods sketched | Pass / Fail |
| 3 | Assert placement noted | Pass / Fail |
| 4 | Pre-lab boundary present | Pass / Fail |
