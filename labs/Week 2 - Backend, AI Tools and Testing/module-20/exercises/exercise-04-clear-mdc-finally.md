# Exercise 4 — Clear MDC Finally Drill

**Module 20** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Document why uncleared MDC corrupts the next CRM request on a thread.

## Steps

### Step 1 — Bug story

Request A sets lab-request-001; without clear, request B logs wrong correlation.

### Step 2 — Fix

Filter/interceptor finally clears MDC.

### Step 3 — Test idea

Later IT: assert MDC empty after request (conceptual).

### Step 4 — Capture

Save under `notes/lab20-mdc-clear.md`.

## Expected result

A clear MDC bug/fix story for thread reuse.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Bug story written | Pass / Fail |
| 2 | Finally fix named | Pass / Fail |
| 3 | Notes saved | Pass / Fail |
