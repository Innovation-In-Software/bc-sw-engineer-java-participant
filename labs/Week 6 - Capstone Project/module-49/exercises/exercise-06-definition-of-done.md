# Exercise 6 — Backend Slice DoD

**Module 49** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab49-definition-of-done.md` — write a Definition of Done checklist for Lab 49.

## Deliverable

| Item | Path (under `examples/module-49-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-06-definition-of-done.md` (this file in the course repo) |
| Your notes file | `notes/lab49-definition-of-done.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-49-exercises/`, create `notes/` if needed, then create `notes/lab49-definition-of-done.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 49 — Backend Slice DoD

## Step 1 — Items

API works, migration present, event versioned, tests green, demo notes, no secrets.

## Step 2 — Check the reference

Green demo alone is not enough—peer must reproduce from docs.

## Step 3 — Negative proof

Require one failing-path proof in the DoD.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

DoD checklist emphasizing reproducibility and negative proof in `notes/lab49-definition-of-done.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab49-definition-of-done.md` |
| UI work during backend day | Stay on Lab 49 slice |
| Unversioned events | Add eventVersion now |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab49-definition-of-done.md` | Pass / Fail |
| 2 | DoD items listed | Pass / Fail |
| 3 | Negative proof required | Pass / Fail |
| 4 | Notes saved | Pass / Fail |
