# Exercise 1 — Profile Purposes

**Module 26** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Describe `dev`, `test`, and `prod` goals for Northstar CRM.

## Reference

| Profile | Goal |
| --- | --- |
| `dev` | Local H2-friendly / verbose-safe settings |
| `test` | Deterministic automated tests |
| `prod` | Fail-fast; secrets from environment |

## Steps

### Step 1 — Write goals

In `notes/profiles.md`, one sentence each for `dev`, `test`, `prod`.

### Step 2 — Check the reference

Align with the reference table.

### Step 3 — Incident story

Explain why blank prod passwords in YAML are unacceptable.

### Step 4 — Fixtures

Under `dev`, `CUS-1001` / `CUS-1002` must still be callable.

## Expected result

Profile purposes and secret incident lesson are clear.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Three profiles described | Pass / Fail |
| 2 | YAML-secret anti-pattern called out | Pass / Fail |
| 3 | Dev fixtures mentioned | Pass / Fail |
