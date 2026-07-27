# Exercise 1 — DTO Constraint Plan

**Module 29** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Plan constraints for `CustomerRequest` / status update fields.

## Reference

| Field | Constraint idea |
| --- | --- |
| name | `@NotBlank` |
| email | `@Email` + `@NotBlank` |
| customerId | `@NotBlank` / pattern for CUS-#### |
| status | `@NotNull` + allowed values |

## Steps

### Step 1 — Field list

In `notes/dto-constraints.md`, list constraints for name, email, id, status.

### Step 2 — Check the reference

Align with the reference table; recall Lab 14 concepts.

### Step 3 — Starter dependency

Note Lab 29 adds `spring-boot-starter-validation`.

### Step 4 — Boundary

Do not implement the full DTO class in pre-lab.

## Expected result

Constraint plan ready for Lab 29 DTOs.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Four fields constrained | Pass / Fail |
| 2 | Validation starter named | Pass / Fail |
| 3 | Full implementation deferred | Pass / Fail |
