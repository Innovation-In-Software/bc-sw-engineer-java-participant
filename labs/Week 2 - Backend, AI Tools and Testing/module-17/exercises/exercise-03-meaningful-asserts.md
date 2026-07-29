# Exercise 3 — Meaningful Asserts

**Module 17** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab17-meaningful-asserts.md` — rewrite weak asserts into status/id assertions for fixtures.

## Deliverable

| Item | Path (under `examples/module-17-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-meaningful-asserts.md` (this file in the course repo) |
| Your notes file | `notes/lab17-meaningful-asserts.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-17-exercises/`, create `notes/` if needed, then create `notes/lab17-meaningful-asserts.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 17 — Meaningful Asserts

## Step 1 — Weak

`assertNotNull(result)` after activate — label weak.

## Step 2 — Strong

Assert Ravi id CUS-1002 and status ACTIVE after activate.

## Step 3 — Exception assert

Plan `assertThrows` for activating Amina under your illegal policy.

## Step 4 — Prep only

Write: *Prepare for Lab 17; do not complete full suite now.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Strong assert examples including assertThrows plan in `notes/lab17-meaningful-asserts.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab17-meaningful-asserts.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 17 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab17-meaningful-asserts.md` | Pass / Fail |
| 2 | Weak vs strong shown | Pass / Fail |
| 3 | assertThrows planned | Pass / Fail |
| 4 | Pre-lab boundary present | Pass / Fail |
