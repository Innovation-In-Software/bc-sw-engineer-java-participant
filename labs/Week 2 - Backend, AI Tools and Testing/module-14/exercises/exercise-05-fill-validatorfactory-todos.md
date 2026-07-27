# Exercise 5 — Fill ValidatorFactory TODOs

**Module 14** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete fill-in blanks for a ValidatorFactory checklist (no Spring `@Valid`).

## Steps

### Step 1 — Copy TODOs

Create `notes/lab14-validator-todos.md` and paste:

Bootstrap: ValidatorFactory factory = _____;
Validator validator = _____;
Invalid blank name → expect _____ violations
Invalid status TYPO → expect _____
Valid Amina ACTIVE sketch → expect _____ violations
Spring @Valid in this pre-lab? _____

### Step 2 — Fill blanks

Fill with Validation.buildDefaultValidatorFactory(), factory.getValidator(), counts/messages ideas, and `no` for Spring `@Valid`.

### Step 3 — Invalid cases list

Add bullets: blank fullName; unknown status; null customerId on activate.

### Step 4 — Self-check

Confirm Spring `@Valid` blank is no / not in this pre-lab.

## Expected result

Filled ValidatorFactory TODOs plus invalid case bullets.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Assuming @Valid works without Spring MVC | Use ValidatorFactory narrative for prep |
| Putting entities on the wire | Map through DTOs only |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | All _____ replaced | Pass / Fail |
| 2 | Three invalid cases listed | Pass / Fail |
| 3 | No Spring @Valid claimed | Pass / Fail |
