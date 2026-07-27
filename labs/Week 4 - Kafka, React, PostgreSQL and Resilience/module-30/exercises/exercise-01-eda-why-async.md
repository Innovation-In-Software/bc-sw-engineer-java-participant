# Exercise 1 — Why Async for CRM

**Module 30** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Explain why Northstar notifications should not block the Customer HTTP API.

## Steps

### Step 1 — List sync pain

Customer service creates `CUS-1001` Amina Khan over HTTP with correlation `lab-request-001`. List **three** problems if it also calls email, audit, and analytics synchronously in the same request thread.

### Step 2 — Event idea

In one sentence, describe publishing a `CustomerCreated` event so other teams consume independently.

### Step 3 — Coupling check

Mark true/false: *The Customer JVM must be up for the Audit consumer to process an already-published event.*

### Step 4 — Capture notes

Save answers under `notes/lab30-prelab-eda.md`.

## Expected result

A short note contrasts sync fan-out with Kafka publish-and-forget for CRM.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Treating Kafka as a request/response RPC bus | Use events for async fan-out; keep HTTP for queries |
| Forgetting correlation IDs | Carry `lab-request-001` (or similar) in the envelope |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Three sync pain points named | Pass / Fail |
| 2 | One clear event-driven sentence | Pass / Fail |
| 3 | True/false answered with a one-line reason | Pass / Fail |
