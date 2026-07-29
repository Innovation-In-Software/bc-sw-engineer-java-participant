# Exercise 5 — Fill ValidatorFactory TODOs

**Module 14** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab14-validatorfactory-todos.md` — complete fill-in blanks for a ValidatorFactory checklist (no Spring `@Valid`).

## Deliverable

| Item | Path (under `examples/module-14-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-fill-validatorfactory-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab14-validatorfactory-todos.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-14-exercises/`, create `notes/` if needed, then create `notes/lab14-validatorfactory-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 14 — Fill ValidatorFactory TODOs

## Step 1 — Copy TODOs

Bootstrap: ValidatorFactory factory = _____;
Validator validator = _____;
Invalid blank name → expect _____ violations
Invalid status TYPO → expect _____
Valid Amina ACTIVE sketch → expect _____ violations
Spring @Valid in this pre-lab? _____

## Step 2 — Fill blanks

Fill with Validation.buildDefaultValidatorFactory(), factory.getValidator(), counts/messages ideas, and `no` for Spring `@Valid`.

## Step 3 — Invalid cases list

Add bullets: blank fullName; unknown status; null customerId on activate.

## Step 4 — Self-check

Confirm Spring `@Valid` blank is no / not in this pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled ValidatorFactory TODOs plus invalid case bullets in `notes/lab14-validatorfactory-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab14-validatorfactory-todos.md` |
| Assuming @Valid works without Spring MVC | Use ValidatorFactory narrative for prep |
| Putting entities on the wire | Map through DTOs only |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab14-validatorfactory-todos.md` | Pass / Fail |
| 2 | All _____ replaced | Pass / Fail |
| 3 | Three invalid cases listed | Pass / Fail |
| 4 | No Spring @Valid claimed | Pass / Fail |
