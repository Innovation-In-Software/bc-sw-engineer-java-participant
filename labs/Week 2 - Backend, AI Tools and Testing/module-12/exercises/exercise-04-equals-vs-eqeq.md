# Exercise 4 — Equals vs ==

**Module 12** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Document when == is wrong for status strings and customer ids.

## Reference

| Check | Use | Why |
| --- | --- | --- |
| status ACTIVE? | Objects.equals / enum | String identity is unsafe |
| same Customer instance? | == | Reference equality only |
| id CUS-1001? | equals | Value equality |

## Steps

### Step 1 — Copy table

Recreate the reference table; add a row for null-safe status compare.

### Step 2 — Bad snippet

Write a bad line: `if (status == "ACTIVE")` and label it Fail.

### Step 3 — Good snippet

Write a good conceptual check for Amina ACTIVE using equals or enum.

### Step 4 — JDK note

Note: prefer enums on JDK 21 sketches when status set is closed.

## Expected result

A comparison cheat sheet tied to Northstar statuses.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Table plus null-safe row | Pass / Fail |
| 2 | Bad and good snippets present | Pass / Fail |
| 3 | Enum preference noted | Pass / Fail |
