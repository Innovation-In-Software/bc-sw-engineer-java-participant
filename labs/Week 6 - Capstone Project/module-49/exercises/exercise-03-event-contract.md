# Exercise 3 — Sketch Event Contract

**Module 49** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab49-event-contract.md` — draft a versioned event payload outline for the slice.

## Deliverable

| Item | Path (under `examples/module-49-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-event-contract.md` (this file in the course repo) |
| Your notes file | `notes/lab49-event-contract.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-49-exercises/`, create `notes/` if needed, then create `notes/lab49-event-contract.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 49 — Sketch Event Contract

## Step 1 — Fields

eventType, eventVersion, customerId, occurredAt, correlationId, payload{}

## Step 2 — Check the reference

Consumers must be idempotent; duplicates are normal.

## Step 3 — Example

Write one example JSON for `CUS-1001` with `lab-request-001` (synthetic).

## Step 4 — Compatibility

One sentence on how you will handle a v2 field addition later.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Versioned event contract sketch with example JSON in `notes/lab49-event-contract.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab49-event-contract.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 49 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab49-event-contract.md` | Pass / Fail |
| 2 | Version field present | Pass / Fail |
| 3 | Example uses fixtures | Pass / Fail |
| 4 | Compatibility note written | Pass / Fail |
