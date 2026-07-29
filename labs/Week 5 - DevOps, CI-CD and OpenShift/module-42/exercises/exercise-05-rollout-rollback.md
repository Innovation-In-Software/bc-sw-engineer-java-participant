# Exercise 5 — Rollout and Rollback Checklist

**Module 42** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab42-rollout-rollback.md` — list commands/checks for rollout success and undo rehearsal.

## Deliverable

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-rollout-rollback.md` (this file in the course repo) |
| Your notes file | `notes/lab42-rollout-rollback.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-rollout-rollback.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — Rollout and Rollback Checklist

## Step 1 — Rollout watch

List: `kubectl rollout status`, pod Ready, Ingress HTTP check, CRM get `CUS-1001`.

## Step 2 — Check the reference

Rollback rehearses a bad revision then `rollout undo` to known-good digest.

## Step 3 — Evidence

Name screenshot folders under `notes/screenshots/lab-42/` for before/after.

## Step 4 — Correlation

Include header `lab-request-001` on smoke calls in the checklist.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Rollout/rollback checklist with evidence paths in `notes/lab42-rollout-rollback.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-rollout-rollback.md` |
| Committing kubeconfig | Keep credentials out of Git |
| Skipping rollback rehearsal | Practice undo before claiming done |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab42-rollout-rollback.md` | Pass / Fail |
| 2 | Rollout checks listed | Pass / Fail |
| 3 | Undo rehearsal included | Pass / Fail |
| 4 | Correlation header noted | Pass / Fail |
