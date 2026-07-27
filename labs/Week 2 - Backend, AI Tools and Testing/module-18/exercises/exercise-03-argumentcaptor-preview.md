# Exercise 3 — ArgumentCaptor Preview

**Module 18** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Sketch ArgumentCaptor steps for saved Customer without running tests yet.

## Steps

### Step 1 — Declare

Paper: `ArgumentCaptor<Customer> captor = ArgumentCaptor.forClass(Customer.class);`

### Step 2 — Verify

`verify(repo).save(captor.capture());`

### Step 3 — Assert

Assert captor.getValue().getStatus() is ACTIVE for Ravi.

### Step 4 — Prep only

Write: *Prepare for Lab 18; do not complete full Mockito lab now.*

## Expected result

A three-step captors sketch with pre-lab boundary.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Declare/verify/assert sketched | Pass / Fail |
| 2 | ACTIVE asserted | Pass / Fail |
| 3 | Pre-lab boundary present | Pass / Fail |
