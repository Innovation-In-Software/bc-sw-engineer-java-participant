# Exercise 2 — Listener Sketch

**Module 31** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Sketch two listeners (notifications vs audit) without compiling code.

## Steps

### Step 1 — Method outline

On paper: `@KafkaListener(topics="crm.customer-events.v1", groupId="crm-notifications")` void onCustomerEvent(...).

### Step 2 — Second group

Sketch the audit listener with groupId `crm-audit` on the same topic.

### Step 3 — Payload type

Decide: start with `String`/`JsonNode` or a typed `CustomerEvent` DTO — pick one and justify in one line.

### Step 4 — Correlation

Note where you will log `correlationId` / `lab-request-001` for support.

## Expected result

Two sketched listeners with group IDs and a payload typing choice.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Both groupIds present | Pass / Fail |
| 2 | Same topic for both | Pass / Fail |
| 3 | Typing + correlation notes written | Pass / Fail |
