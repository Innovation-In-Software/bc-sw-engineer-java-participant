# Exercise 1 — When to Keep Real Validator

**Module 18** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Decide which collaborator stays real for activate tests.

## Steps

### Step 1 — Mock repo

Mock CustomerRepository — I/O boundary.

### Step 2 — Real validator?

Keep a pure StatusValidator real if it is deterministic and fast.

### Step 3 — Mock notifier

Mock notifier to avoid email/IO in unit tests.

### Step 4 — Rule

Write: mock I/O and unstable deps; keep pure domain helpers real when cheap.

## Expected result

A mock/real decision table for activate collaborators.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Repo mock justified | Pass / Fail |
| 2 | Validator real justified | Pass / Fail |
| 3 | Notifier mock justified | Pass / Fail |
