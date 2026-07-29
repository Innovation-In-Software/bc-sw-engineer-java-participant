# Exercise 1 — Log Level Quiz

**Module 20** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab20-level-quiz.md` — assign DEBUG/INFO/WARN/ERROR to CRM events.

## Deliverable

| Item | Path (under `examples/module-20-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-level-quiz.md` (this file in the course repo) |
| Your notes file | `notes/lab20-level-quiz.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-20-exercises/`, create `notes/` if needed, then create `notes/lab20-level-quiz.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 20 — Log Level Quiz

## Reference

| Event | Level |
| --- | --- |
| Activate success Ravi | INFO |
| Illegal transition Amina | WARN |
| Unexpected repo failure | ERROR |
| Entering mapper field copy | DEBUG |

## Step 2 — Prod habit

One sentence: DEBUG off by default in prod profiles.

## Step 3 — JDK/Maven

Note logging deps align with Maven BOM/Spring Boot later; prep is level policy.

## Step 4 — Prep only

Write: *Do not complete full Lab 20 retrofit in pre-lab.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A level quiz table with prod DEBUG habit in `notes/lab20-level-quiz.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab20-level-quiz.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 20 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab20-level-quiz.md` | Pass / Fail |
| 2 | Table plus custom event | Pass / Fail |
| 3 | Prod DEBUG habit written | Pass / Fail |
| 4 | Pre-lab boundary present | Pass / Fail |
