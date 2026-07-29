# Exercise 3 — Sketch Idempotent Handling

**Module 46** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab46-idempotency-sketch.md` — explain how replay must not double-apply CRM side effects.

## Deliverable

| Item | Path (under `examples/module-46-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-idempotency-sketch.md` (this file in the course repo) |
| Your notes file | `notes/lab46-idempotency-sketch.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-46-exercises/`, create `notes/` if needed, then create `notes/lab46-idempotency-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 46 — Sketch Idempotent Handling

## Step 1 — Side effects

List side effects your consumer might own (projection upsert, email, audit row).

## Step 2 — Check the reference

Idempotency keys / upserts / dedupe store—pick a strategy in notes.

## Step 3 — Scenario

Describe duplicate delivery for an event about `CUS-1002` status change.

## Step 4 — Test idea

Name one test: process same event twice → one projection row.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Idempotency strategy and duplicate-delivery scenario documented in `notes/lab46-idempotency-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab46-idempotency-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 46 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab46-idempotency-sketch.md` | Pass / Fail |
| 2 | Side effects listed | Pass / Fail |
| 3 | Strategy chosen | Pass / Fail |
| 4 | Duplicate test idea named | Pass / Fail |
