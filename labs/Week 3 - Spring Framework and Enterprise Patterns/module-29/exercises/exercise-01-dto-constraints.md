# Exercise 1 — DTO Constraint Plan

**Module 29** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/dto-constraints.md` — plan constraints for `CustomerRequest` / status update fields.

## Deliverable

| Item | Path (under `examples/module-29-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-dto-constraints.md` (this file in the course repo) |
| Your notes file | `notes/dto-constraints.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-29-exercises/`, create `notes/` if needed, then create `notes/dto-constraints.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 29 — DTO Constraint Plan

## Reference

| Field | Constraint idea |
| --- | --- |
| name | `@NotBlank` |
| email | `@Email` + `@NotBlank` |
| customerId | `@NotBlank` / pattern for CUS-#### |
| status | `@NotNull` + allowed values |

## Step 1 — Field list

In `notes/dto-constraints.md`, list constraints for name, email, id, status.

## Step 2 — Check the reference

Align with the reference table; recall Lab 14 concepts.

## Step 3 — Starter dependency

Note Lab 29 adds `spring-boot-starter-validation`.

## Step 4 — Boundary

Do not implement the full DTO class in pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Constraint plan ready for Lab 29 DTOs in `notes/dto-constraints.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/dto-constraints.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 29 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/dto-constraints.md` | Pass / Fail |
| 2 | Four fields constrained | Pass / Fail |
| 3 | Validation starter named | Pass / Fail |
| 4 | Full implementation deferred | Pass / Fail |
