# Exercise 1 — Entity vs DTO

**Module 14** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab14-entity-vs-dto.md` — explain why Northstar HTTP/SOAP payloads should not be persistence entities.

## Deliverable

| Item | Path (under `examples/module-14-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-entity-vs-dto.md` (this file in the course repo) |
| Your notes file | `notes/lab14-entity-vs-dto.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-14-exercises/`, create `notes/` if needed, then create `notes/lab14-entity-vs-dto.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 14 — Entity vs DTO

## Step 1 — Definitions

Entity = persistence shape; DTO = API contract shape.

## Step 2 — Leak risks

List two leaks: internal flags, lazy relations, or audit columns in responses.

## Step 3 — Fixture DTO fields

DTO fields for Amina: customerId, fullName, status — no persistence annotations.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Clear entity/DTO split with fixture field list in `notes/lab14-entity-vs-dto.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab14-entity-vs-dto.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 14 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab14-entity-vs-dto.md` | Pass / Fail |
| 2 | Definitions written | Pass / Fail |
| 3 | Two leak risks | Pass / Fail |
| 4 | Amina DTO fields listed | Pass / Fail |
