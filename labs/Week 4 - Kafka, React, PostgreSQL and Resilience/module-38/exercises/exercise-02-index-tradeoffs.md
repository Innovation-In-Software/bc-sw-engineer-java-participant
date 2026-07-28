# Exercise 5 — Index Tradeoffs

**Module 38** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Document costs of extra indexes on CRM write paths.

## Steps

### Step 1 — Benefit

Faster status filters and account-by-customer joins.

### Step 2 — Cost

Slower INSERT/UPDATE for Amina/Ravi seeds at scale; more disk.

### Step 3 — Cleanup

Lab may include dropping experimental indexes — plan to document before/after.

### Step 4 — Rule

Add index only when EXPLAIN shows need.

## Expected result

Tradeoff paragraph tied to CRM workloads.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Benefit stated | Pass / Fail |
| 2 | Write-cost stated | Pass / Fail |
| 3 | Measure-first rule | Pass / Fail |
