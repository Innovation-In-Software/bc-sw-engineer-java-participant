# Exercise 3 — Transition Matrix

**Module 15** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Tabulate allowed and forbidden customer status transitions.

## Reference

| From | To | Allowed? |
| --- | --- | --- |
| PROSPECT | ACTIVE | yes (Ravi activate) |
| ACTIVE | ACTIVE | no-op or reject — decide |
| ACTIVE | PROSPECT | no |

## Steps

### Step 1 — Copy matrix

Recreate table; decide ACTIVE→ACTIVE policy in one word.

### Step 2 — Amina

Note CUS-1001 already ACTIVE — activate should be rejected or no-op per your policy.

### Step 3 — Illegal list

List two illegal transitions you will throw on later.

### Step 4 — Boundary

Mark: exception HTTP mapping waits for Lab 16.

## Expected result

A transition matrix with Amina/Ravi implications.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Matrix filled | Pass / Fail |
| 2 | Amina case noted | Pass / Fail |
| 3 | Lab 16 mapping deferred | Pass / Fail |
