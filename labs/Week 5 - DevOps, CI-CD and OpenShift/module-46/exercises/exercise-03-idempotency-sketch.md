# Exercise 3 — Sketch Idempotent Handling

**Module 46** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Explain how replay must not double-apply CRM side effects.

## Steps

### Step 1 — Side effects

List side effects your consumer might own (projection upsert, email, audit row).

### Step 2 — Check the reference

Idempotency keys / upserts / dedupe store—pick a strategy in notes.

### Step 3 — Scenario

Describe duplicate delivery for an event about `CUS-1002` status change.

### Step 4 — Test idea

Name one test: process same event twice → one projection row.

## Expected result

Idempotency strategy and duplicate-delivery scenario documented.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Side effects listed | Pass / Fail |
| 2 | Strategy chosen | Pass / Fail |
| 3 | Duplicate test idea named | Pass / Fail |
