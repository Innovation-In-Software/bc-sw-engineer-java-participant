# Exercise 5 — Fill Activate Ravi Pseudocode TODOs

**Module 15** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab15-activate-ravi-todos.md` — complete fill-in blanks for activate(CUS-1002) pseudocode.

## Deliverable

| Item | Path (under `examples/module-15-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-fill-activate-ravi-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab15-activate-ravi-todos.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-15-exercises/`, create `notes/` if needed, then create `notes/lab15-activate-ravi-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 15 — Fill Activate Ravi Pseudocode TODOs

## Step 1 — Copy pseudocode

customer = repo.findById(_____)
if customer is null → throw _____
if status is not _____ → throw _____
set status to _____
repo._____(customer)
log correlation _____

## Step 2 — Fill blanks

Fill with CUS-1002, NotFound, PROSPECT, IllegalState/domain exception, ACTIVE, save/update, lab-request-001.

## Step 3 — Repo boundary note

Write: *Repository saves state; it does not decide PROSPECT→ACTIVE.*

## Step 4 — Self-check

Confirm Ravi starts PROSPECT and ends ACTIVE in the filled sheet.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled activate pseudocode with repo boundary called out in `notes/lab15-activate-ravi-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab15-activate-ravi-todos.md` |
| Putting transition ifs in repository | Keep rules in service |
| Activating Amina as the happy path | Use Ravi PROSPECT as the demo path |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab15-activate-ravi-todos.md` | Pass / Fail |
| 2 | All _____ replaced | Pass / Fail |
| 3 | PROSPECT→ACTIVE correct | Pass / Fail |
| 4 | Repo boundary sentence present | Pass / Fail |
