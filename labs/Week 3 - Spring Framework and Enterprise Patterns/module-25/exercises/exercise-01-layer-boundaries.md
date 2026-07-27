# Exercise 1 — Layer Boundary Quiz

**Module 25** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Classify CRM tasks into the correct layer.

## Reference

| Task | Layer |
| --- | --- |
| Parse JSON / return ResponseEntity | Controller |
| PROSPECT → ACTIVE rule | Service |
| Map/store lookup by id | Repository |
| Duplicate id rejection | Service |

## Steps

### Step 1 — Classify

In `notes/layers.md`, classify: HTTP mapping, uniqueness check, in-memory save, status transition, JSON serialization.

### Step 2 — Check the reference

Compare to the reference table; fix any controller-owns-rules mistakes.

### Step 3 — Import rule

Write: controllers must not import repository types.

### Step 4 — Fixtures

Seed plan: `CUS-1001` ACTIVE, `CUS-1002` PROSPECT.

## Expected result

Layer classifications and import rule are correct.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Five tasks classified correctly | Pass / Fail |
| 2 | No-controller-repo-import rule written | Pass / Fail |
| 3 | Fixtures named | Pass / Fail |
