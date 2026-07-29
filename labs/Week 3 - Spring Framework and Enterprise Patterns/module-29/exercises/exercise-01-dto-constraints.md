# Exercise 1 — DTO Constraint Plan

**Module 29** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/dto-constraints.md` — plan constraints for `CustomerRequest` / status update fields.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-29-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-dto-constraints.md` (this file in the course repo) |
| Your notes file | `notes/dto-constraints.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

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

Then follow **Steps** to create your own file.

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

Self-check before marking Pass:

- [ ] File exists at `notes/dto-constraints.md`
- [ ] Four fields constrained
- [ ] Validation starter named
- [ ] Full implementation deferred

