# Exercise 1 — ACID for CRM Transfers

**Module 27** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Tie each ACID letter to a Northstar transfer observation.

## Reference

| Letter | CRM meaning |
| --- | --- |
| Atomicity | Debit+credit+log all succeed or none |
| Consistency | Balances never violate invariants after commit/rollback |
| Isolation | Concurrent transfers do not see half-updates |
| Durability | Committed transfer log survives restart |

## Steps

### Step 1 — Fill ACID

In `notes/acid-crm.md`, write one CRM sentence per ACID letter.

### Step 2 — Check the reference

Align with the reference table.

### Step 3 — Accounts

List accounts: `ACC-1001-MAIN`, `ACC-1001-LOYALTY`, `ACC-1002-MAIN`, force id `ACC-FORCE-FAIL`.

### Step 4 — Boundary

Pre-lab explains ACID; Lab 27 proves rollback with code.

## Expected result

ACID mapped to CRM transfer language.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Four letters explained | Pass / Fail |
| 2 | Force-fail account listed | Pass / Fail |
| 3 | Pre-lab vs lab boundary clear | Pass / Fail |
