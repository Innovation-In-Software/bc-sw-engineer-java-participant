# Exercise 3 — Sketch Event Contract

**Module 49** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Draft a versioned event payload outline for the slice.

## Steps

### Step 1 — Fields

eventType, eventVersion, customerId, occurredAt, correlationId, payload{}

### Step 2 — Check the reference

Consumers must be idempotent; duplicates are normal.

### Step 3 — Example

Write one example JSON for `CUS-1001` with `lab-request-001` (synthetic).

### Step 4 — Compatibility

One sentence on how you will handle a v2 field addition later.

## Expected result

Versioned event contract sketch with example JSON.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Version field present | Pass / Fail |
| 2 | Example uses fixtures | Pass / Fail |
| 3 | Compatibility note written | Pass / Fail |
