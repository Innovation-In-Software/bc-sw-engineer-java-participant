# Exercise 3 — Rollback Evidence Plan

**Module 27** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Document what must remain unchanged after forced failure.

## Steps

### Step 1 — Happy path

In `notes/rollback-plan.md`: MAIN→LOYALTY updates both balances and writes a log.

### Step 2 — Force fail

Transfer to `ACC-FORCE-FAIL`: MAIN balance unchanged; no success log row.

### Step 3 — Test idea

Automated test asserts balances after failure — plan only.

### Step 4 — AI caution

Reject AI drafts that catch Exception and swallow it inside `@Transactional` methods.

## Expected result

Rollback evidence plan and AI caution recorded.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Happy and fail paths contrasted | Pass / Fail |
| 2 | No-log-on-fail stated | Pass / Fail |
| 3 | Swallowed-exception reject rule written | Pass / Fail |
