# Exercise 3 — Event Envelope Sketch

**Module 30** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Draft paper JSON for Amina Created and Ravi StatusChanged events.

## Steps

### Step 1 — Headers

List envelope fields you will use: `eventType`, `eventVersion`, `occurredAt`, `correlationId`, `customerId`, `payload`.

### Step 2 — Amina sample

On paper, sketch `CustomerCreated` for `CUS-1001` Amina Khan with `correlationId=lab-request-001`.

### Step 3 — Ravi sample

Sketch `CustomerStatusChanged` for `CUS-1002` Ravi Singh (`ACTIVE` → `SUSPENDED` or similar).

### Step 4 — Compatibility note

Write one rule: consumers must ignore unknown payload fields (forward compatible).

## Expected result

Two sketched envelopes using Northstar fixtures and shared field names.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Both event types sketched | Pass / Fail |
| 2 | customerId and correlationId present | Pass / Fail |
| 3 | Forward-compat rule written | Pass / Fail |
