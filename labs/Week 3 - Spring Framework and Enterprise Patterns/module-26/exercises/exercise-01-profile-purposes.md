# Exercise 1 — Profile Purposes

**Module 26** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/profiles.md` — describe `dev`, `test`, and `prod` goals for Northstar CRM.

## Deliverable

| Item | Path (under `examples/module-26-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-profile-purposes.md` (this file in the course repo) |
| Your notes file | `notes/profiles.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-26-exercises/`, create `notes/` if needed, then create `notes/profiles.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 26 — Profile Purposes

## Reference

| Profile | Goal |
| --- | --- |
| `dev` | Local H2-friendly / verbose-safe settings |
| `test` | Deterministic automated tests |
| `prod` | Fail-fast; secrets from environment |

## Step 1 — Write goals

In `notes/profiles.md`, one sentence each for `dev`, `test`, `prod`.

## Step 2 — Check the reference

Align with the reference table.

## Step 3 — Incident story

Explain why blank prod passwords in YAML are unacceptable.

## Step 4 — Fixtures

Under `dev`, `CUS-1001` / `CUS-1002` must still be callable.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Profile purposes and secret incident lesson are clear in `notes/profiles.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/profiles.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 26 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/profiles.md` | Pass / Fail |
| 2 | Three profiles described | Pass / Fail |
| 3 | YAML-secret anti-pattern called out | Pass / Fail |
| 4 | Dev fixtures mentioned | Pass / Fail |
