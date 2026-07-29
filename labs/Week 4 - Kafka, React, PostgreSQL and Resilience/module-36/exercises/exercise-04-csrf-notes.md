# Exercise 5 — CSRF Notes

**Module 36** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab36-csrf-notes.md` — explain when CSRF matters for the CRM SPA session model.

## Deliverable

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-csrf-notes.md` (this file in the course repo) |
| Your notes file | `notes/lab36-csrf-notes.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-csrf-notes.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 — CSRF Notes

## Step 1 — Cookie sessions

If auth cookie is sent automatically, CSRF is in scope.

## Step 2 — Bearer header

If token only in Authorization header from JS, classic CSRF is reduced.

## Step 3 — Lab stance

Write which model your Lab 36 starter follows (from README skim or instructor).

## Step 4 — Checklist

Add item: SameSite cookie attributes if cookies used.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

CSRF applicability note matched to token model in `notes/lab36-csrf-notes.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab36-csrf-notes.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 36 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab36-csrf-notes.md` | Pass / Fail |
| 2 | Cookie vs bearer contrast | Pass / Fail |
| 3 | Lab stance stated | Pass / Fail |
| 4 | SameSite checklist item | Pass / Fail |
