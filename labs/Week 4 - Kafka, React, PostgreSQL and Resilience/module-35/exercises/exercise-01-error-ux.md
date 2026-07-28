# Exercise 4 — Error UX Copy

**Module 35** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Draft user-facing messages for common CRM API failures.

## Steps

### Step 1 — 404

Message when `CUS-9999` not found.

### Step 2 — Network

Message when API unreachable.

### Step 3 — 400

Message when name validation fails.

### Step 4 — Logging

Dev console may show correlation id; users see plain language only.

## Expected result

Three user messages plus logging vs UX boundary.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | 404/network/400 messages | Pass / Fail |
| 2 | Correlation stays in logs note | Pass / Fail |
| 3 | No stack traces in UI copy | Pass / Fail |
