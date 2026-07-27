# Exercise 3 — Define Promotion Gates

**Module 44** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Write measurable gates for test → staging → prod.

## Steps

### Step 1 — Gate list

Examples: verify green, SAST gate, staging smoke, change approval, residual risk owned.

### Step 2 — Check the reference

Gates need evidence links—not vibes.

### Step 3 — Owner column

Assign role owners: QA/dev lead/security/ops (adapt to team).

### Step 4 — No-go examples

List three automatic no-go conditions (secret leak, digest mismatch, failed readiness).

## Expected result

Promotion gate table with owners and no-go conditions.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Gates measurable | Pass / Fail |
| 2 | Owners assigned | Pass / Fail |
| 3 | Three no-gos listed | Pass / Fail |
