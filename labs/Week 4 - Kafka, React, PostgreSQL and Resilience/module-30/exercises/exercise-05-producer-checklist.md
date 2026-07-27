# Exercise 5 — Producer Checklist

**Module 30** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

List Lab 30 producer settings you will verify later (acks, idempotence, key).

## Steps

### Step 1 — Settings list

Write a checklist: `acks=all`, idempotent producer, key = customerId, value = JSON envelope.

### Step 2 — Why acks=all

One sentence: wait for ISR ack before considering the CRM event durable.

### Step 3 — Idempotence

One sentence: broker dedupes producer retries so Amina is not double-created in the log.

### Step 4 — Out of scope today

Mark: *Do not run `kafka-console-producer` in this pre-lab.*

## Expected result

A producer settings checklist ready for the timed lab path.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | acks + idempotence + key listed | Pass / Fail |
| 2 | Two why-sentences written | Pass / Fail |
| 3 | Explicit no-run note present | Pass / Fail |
