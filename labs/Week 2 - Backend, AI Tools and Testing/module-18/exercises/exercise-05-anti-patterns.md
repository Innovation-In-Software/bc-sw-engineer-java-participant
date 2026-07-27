# Exercise 5 — Mockito Anti-Patterns

**Module 18** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

List anti-patterns Copilot might suggest for CRM tests.

## Reference

| Anti-pattern | Better |
| --- | --- |
| Mock the SUT | Mock collaborators only |
| Unnecessary stubbing | Stub what is used |
| verifyNoMoreInteractions always | Use when interaction surface is critical |

## Steps

### Step 1 — Copy table

Recreate and add: mocking String/enum status — mark as silly.

### Step 2 — AI reject rule

Reject suggestions that mock CustomerService while testing CustomerService.

### Step 3 — Fixture

Prefer real Customer state objects for Amina/Ravi over mocking getters needlessly.

### Step 4 — Boundary

Note ArgumentCaptor deep practice continues in timed lab; preview next.

## Expected result

An anti-pattern sheet tuned for AI-assisted Mockito.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Table plus silly mock row | Pass / Fail |
| 2 | SUT-mock reject rule | Pass / Fail |
| 3 | Real fixture preference noted | Pass / Fail |
