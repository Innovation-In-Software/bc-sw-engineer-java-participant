# Exercise 3 — Paging and Locking Notes

**Module 39** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab39-paging-locking.md` — document how CRM list paging and optimistic locks will behave.

## Deliverable

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-paging-locking.md` (this file in the course repo) |
| Your notes file | `notes/lab39-paging-locking.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-39-exercises/`, create `notes/` if needed, then create `notes/lab39-paging-locking.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 39 — Paging and Locking Notes

## Step 1 — Page request

`PageRequest.of(0, 20, Sort.by("customerId"))`.

## Step 2 — Response

Return totalElements + content slice to the UI later.

## Step 3 — Optimistic lock

Second writer on Amina fails if version stale — user retries.

## Step 4 — Correlation

Log `lab-request-001` on lock failures for support.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Paging + optimistic locking behavior notes in `notes/lab39-paging-locking.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab39-paging-locking.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 39 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab39-paging-locking.md` | Pass / Fail |
| 2 | PageRequest example | Pass / Fail |
| 3 | Stale version behavior | Pass / Fail |
| 4 | Correlation logging note | Pass / Fail |
