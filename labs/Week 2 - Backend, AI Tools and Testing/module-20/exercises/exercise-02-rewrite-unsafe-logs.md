# Exercise 2 — Rewrite Unsafe Logs

**Module 20** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Turn unsafe Customer logs into id+status+correlation lines.

## Steps

### Step 1 — Unsafe

Example bad: log full Customer toString including email/phone if present.

### Step 2 — Safe

Rewrite: customerId=CUS-1001 status=ACTIVE correlation=lab-request-001.

### Step 3 — Ravi line

Write a safe activate start line for CUS-1002 PROSPECT.

### Step 4 — Capture

Save under `notes/lab20-safe-logs.md`. Pre-lab only.

## Expected result

Before/after log lines using Northstar fixtures safely.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Unsafe example named | Pass / Fail |
| 2 | Safe Amina line written | Pass / Fail |
| 3 | Safe Ravi line written | Pass / Fail |
