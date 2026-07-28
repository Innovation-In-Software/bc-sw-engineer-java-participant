# Exercise 4 — Idempotency Plan

**Module 31** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Define how a consumer ignores a second delivery of Amina's Created event.

## Steps

### Step 1 — Why duplicates

List two causes: producer retry, consumer rebalance/reprocess.

### Step 2 — Business key

Propose an idempotency key, e.g. `eventId` or `customerId+eventType+occurredAt` for `CUS-1001`.

### Step 3 — Store idea

One sentence: check a processed-events table/set before side effects (email).

### Step 4 — Out of scope

Do not implement the table yet — paper design only.

## Expected result

A short idempotency plan tied to Northstar customer events.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Two duplicate causes | Pass / Fail |
| 2 | Concrete key proposal | Pass / Fail |
| 3 | Processed-store idea stated | Pass / Fail |
