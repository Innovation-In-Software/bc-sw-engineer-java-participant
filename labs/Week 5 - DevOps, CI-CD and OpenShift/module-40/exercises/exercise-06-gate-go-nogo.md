# Exercise 6 — Draft AppSec Go/No-Go Questions

**Module 40** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab40-gate-go-nogo.md` — write leadership questions that freeze a bad merge before Docker.

## Deliverable

| Item | Path (under `examples/module-40-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-06-gate-go-nogo.md` (this file in the course repo) |
| Your notes file | `notes/lab40-gate-go-nogo.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-40-exercises/`, create `notes/` if needed, then create `notes/lab40-gate-go-nogo.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 40 — Draft AppSec Go/No-Go Questions

## Step 1 — Questions

Draft five go/no-go questions (High CVE owned?, secrets in Git?, authz negative test?, suppression policy?, verify still green?).

## Step 2 — Check the reference

Leadership rule: no ship on raw scanner volume; no silent suppressions; no secrets.

## Step 3 — Tie to CRM

For each question, one line on impact to agents serving Amina/Ravi.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Five go/no-go questions with CRM impact lines in `notes/lab40-gate-go-nogo.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab40-gate-go-nogo.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 40 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab40-gate-go-nogo.md` | Pass / Fail |
| 2 | Five questions drafted | Pass / Fail |
| 3 | Each has CRM impact | Pass / Fail |
| 4 | Secrets/suppression rules reflected | Pass / Fail |
