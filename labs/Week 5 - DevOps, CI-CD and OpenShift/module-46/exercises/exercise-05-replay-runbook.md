# Exercise 5 — Outline DLT Replay Runbook

**Module 46** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Outline `docs/dlt-replay-runbook.md` with dry-run first.

## Steps

### Step 1 — Steps

Inspect DLT → classify → dry-run → limited replay → verify projection → stop criteria.

### Step 2 — Check the reference

Rate-limit replay; never replay blindly into prod topics.

### Step 3 — Evidence

Name what screenshots prove DLT landing and successful limited replay.

### Step 4 — Comms link

Note Lab 47 may communicate this class of incident—keep evidence shareable.

## Expected result

Replay runbook outline with dry-run.

## If it fails

| Problem | Fix |
| --- | --- |
| Infinite retry | Bounded retry + DLT |
| Replaying without idempotency | Prove upsert/dedupe first |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Steps include dry-run | Pass / Fail |
| 2 | Stop criteria present | Pass / Fail |
| 3 | Evidence named | Pass / Fail |
