# Exercise 1 — Select Backend Vertical Slice

**Module 49** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Pick one coherent backend slice for capstone build day.

## Steps

### Step 1 — Options

Candidate slices: customer create/read, interaction record, status change + event.

### Step 2 — Check the reference

Slice must include API + persistence + Kafka touch if messaging is in scope.

### Step 3 — Fixtures

Define how `CUS-1001`/`CUS-1002` and `lab-request-001` appear in demos/tests.

### Step 4 — Out of scope

Explicitly list what this slice will not include.

## Expected result

One selected slice with in/out scope and fixtures.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Slice chosen | Pass / Fail |
| 2 | In/out scope listed | Pass / Fail |
| 3 | Fixtures planned | Pass / Fail |
