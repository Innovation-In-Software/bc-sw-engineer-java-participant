# Exercise 5 — Seed and Verify Plan

**Module 37** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Outline seed and verify queries you will run in the real lab.

## Steps

### Step 1 — Seed order

Insert customers before accounts.

### Step 2 — Verify SQL

Write offline: `SELECT customer_id, full_name FROM customer ORDER BY customer_id;`

### Step 3 — Join check

Paper join: accounts for Amina by customer_id.

### Step 4 — No execute

Do not run against a live database in pre-lab.

## Expected result

Ordered seed/verify plan with a SELECT written on paper.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Insert order correct | Pass / Fail |
| 2 | Verify SELECT written | Pass / Fail |
| 3 | No-execute confirmation | Pass / Fail |
