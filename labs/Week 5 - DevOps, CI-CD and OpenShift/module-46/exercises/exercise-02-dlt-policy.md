# Exercise 2 — Draft DLT Policy

**Module 46** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Define retry bounds and dead-letter topic naming.

## Steps

### Step 1 — Names

Primary topic example `crm.customer.events`; DLT `crm.customer.events.DLT`; group `crm-customer-projection-v1`.

### Step 2 — Check the reference

Use `DefaultErrorHandler` + `DeadLetterPublishingRecoverer` pattern (Spring Kafka).

### Step 3 — Headers

List headers to preserve: original topic, exception message class, correlation `lab-request-001`.

### Step 4 — PII rule

Prefer customer IDs in logs/metrics—not emails/names.

## Expected result

DLT policy with headers and PII rule.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Topic/DLT named | Pass / Fail |
| 2 | Retry+DLT approach stated | Pass / Fail |
| 3 | Correlation header included | Pass / Fail |
