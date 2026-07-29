# Exercise 5 — Rollback and Smoke Mini-Runbook

**Module 51** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab51-rollback-smoke.md` — write a half-page rollback+smoke mini-runbook for the defense packet later.

## Deliverable

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-rollback-smoke.md` (this file in the course repo) |
| Your notes file | `notes/lab51-rollback-smoke.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-51-exercises/`, create `notes/` if needed, then create `notes/lab51-rollback-smoke.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 51 — Rollback and Smoke Mini-Runbook

## Step 1 — Steps

Detect → undo to known-good digest → wait Ready → smoke `CUS-1001` → record evidence.

## Step 2 — Check the reference

Rollback without verification is incomplete.

## Step 3 — Timebox

Add target duration placeholder and who calls the rollback.

## Step 4 — Link forward

Note this becomes part of Lab 52 evidence index.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Mini-runbook with verification and ownership in `notes/lab51-rollback-smoke.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab51-rollback-smoke.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 51 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab51-rollback-smoke.md` | Pass / Fail |
| 2 | Steps include verify | Pass / Fail |
| 3 | Owner/timebox present | Pass / Fail |
| 4 | Lab 52 link noted | Pass / Fail |
