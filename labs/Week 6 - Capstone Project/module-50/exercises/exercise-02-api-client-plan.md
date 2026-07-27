# Exercise 2 — Plan Typed API Client

**Module 50** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

List client functions and DTO fields the UI needs.

## Reference

| UI state | User sees |
| --- | --- |
| loading | Spinner/skeleton |
| empty | Clear empty guidance |
| error | Actionable message |
| success | Data / confirmation |

## Steps

### Step 1 — Functions

searchCustomers, getCustomer, listInteractions, createInteraction (names adaptable).

### Step 2 — Check the reference

Typed calls reduce silent UI breakage when APIs evolve.

### Step 3 — Error mapping

Map HTTP 401/403/404/500 to user-visible messages (no stack traces).

### Step 4 — Auth header

Note where JWT will attach later—do not hardcode tokens in source.

## Expected result

API client plan with error mapping.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Functions listed | Pass / Fail |
| 2 | Error mapping present | Pass / Fail |
| 3 | No hardcoded tokens | Pass / Fail |
