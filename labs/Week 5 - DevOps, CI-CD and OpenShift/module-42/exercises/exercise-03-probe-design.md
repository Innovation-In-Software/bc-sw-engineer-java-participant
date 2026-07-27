# Exercise 3 — Design Three Probes

**Module 42** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Differentiate startup, readiness, and liveness for CRM pods.

## Steps

### Step 1 — Definitions

Write one sentence each: startup (slow boot), readiness (take traffic), liveness (restart if wedged).

### Step 2 — Check the reference

Do not point all three at the same shallow endpoint without thinking—readiness should reflect DB dependency where required.

### Step 3 — Paths

Propose Actuator paths/ports for each probe (placeholders OK).

### Step 4 — Failure story

Describe what agents see if readiness fails while liveness stays up.

## Expected result

Probe design notes with agent-visible failure story.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Three probes defined | Pass / Fail |
| 2 | Paths proposed | Pass / Fail |
| 3 | Readiness failure impact stated | Pass / Fail |
