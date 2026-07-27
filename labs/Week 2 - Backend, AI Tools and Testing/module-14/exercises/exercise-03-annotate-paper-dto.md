# Exercise 3 — Annotate Paper DTO

**Module 14** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Mark required/optional constraints on a paper CreateCustomerRequest.

## Reference

| Field | Constraint idea |
| --- | --- |
| fullName | required, non-blank |
| status | optional on create; default PROSPECT |
| customerId | server-assigned or pattern CUS-#### |

## Steps

### Step 1 — Copy table

Recreate constraints; note Ravi starts PROSPECT when created in labs.

### Step 2 — Paper annotations

Write pseudo `@NotBlank` / `@Pattern` names — documentation only.

### Step 3 — No Spring yet

Explicit: do not wire `@Valid` on a controller in this pre-lab.

### Step 4 — Correlation

Note correlation `lab-request-001` stays in headers/logs, not as a DTO business field.

## Expected result

Paper DTO constraints without live Spring validation.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Constraint table filled | Pass / Fail |
| 2 | No `@Valid` wiring claimed | Pass / Fail |
| 3 | Correlation placement noted | Pass / Fail |
