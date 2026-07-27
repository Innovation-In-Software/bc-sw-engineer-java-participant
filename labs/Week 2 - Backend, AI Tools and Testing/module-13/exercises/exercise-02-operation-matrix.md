# Exercise 2 — Operation Matrix

**Module 13** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Fill an in/out/fault matrix for GetCustomer and ActivateCustomer.

## Steps

### Step 1 — GetCustomer

In: customerId; Out: id, name, status; Fault: not found.

### Step 2 — ActivateCustomer

In: customerId (+ correlation header idea); Out: new status; Fault: invalid transition.

### Step 3 — Happy path

Note Activate on CUS-1002 Ravi PROSPECT → ACTIVE as the design happy path.

### Step 4 — Prep only

Write: *Design only — do not complete full Lab 13 build.*

## Expected result

A two-operation matrix with Northstar happy path noted.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Both operations have in/out/fault | Pass / Fail |
| 2 | Ravi activate path noted | Pass / Fail |
| 3 | Design-only boundary present | Pass / Fail |
