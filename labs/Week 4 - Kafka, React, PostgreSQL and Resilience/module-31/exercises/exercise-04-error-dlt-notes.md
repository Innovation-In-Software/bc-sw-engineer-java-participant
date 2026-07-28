# Exercise 3 — Error and DLT Notes

**Module 31** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Describe when a listener should retry vs send to DLT.

## Steps

### Step 1 — Retryable

Example: transient network blip calling email API — retry.

### Step 2 — Non-retryable

Example: JSON missing `customerId` — DLT after limited attempts.

### Step 3 — Ops note

Write: support replays DLT after fixing the consumer, using correlation `lab-request-001`.

### Step 4 — No runtime

Confirm you will not publish to DLT from CLI in this pre-lab.

## Expected result

Clear retry vs DLT decision notes for Lab 31.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Retryable example | Pass / Fail |
| 2 | Non-retryable example | Pass / Fail |
| 3 | Replay/ops sentence | Pass / Fail |
