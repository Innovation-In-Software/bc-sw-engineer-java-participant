# Exercise 5 — Outline Rollback Runbook

**Module 44** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Outline `docs/rollback-runbook.md` for digest Y under stress.

## Steps

### Step 1 — Steps

Detect → decide → redeploy known-good digest → verify readiness → CRM smoke → comms update.

### Step 2 — Check the reference

Rollback names digest Y and a verification check—not “redeploy latest”.

### Step 3 — Timebox

Write a target recovery time placeholder (e.g. under N minutes) and who declares SEV.

### Step 4 — Kafka watch

Optional one-liner: watch consumer lag after rollback (detail in Lab 46).

## Expected result

Rollback runbook outline with verification.

## If it fails

| Problem | Fix |
| --- | --- |
| Rolling back to :latest | Pin known-good digest |
| Skipping smoke after undo | Re-check CUS-1001 path |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Steps ordered | Pass / Fail |
| 2 | Digest-based rollback stated | Pass / Fail |
| 3 | Verification included | Pass / Fail |
