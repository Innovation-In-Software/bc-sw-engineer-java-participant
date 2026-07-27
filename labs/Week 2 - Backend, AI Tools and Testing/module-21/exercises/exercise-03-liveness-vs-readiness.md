# Exercise 3 — Liveness vs Readiness

**Module 21** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Explain when Kubernetes (or PaaS) should restart vs stop sending traffic.

## Steps

### Step 1 — Liveness

Process stuck → restart. CRM example: deadlocked request threads.

### Step 2 — Readiness

Dependency down (DB) → not ready, keep process, remove from load balancer.

### Step 3 — Wrong mix

One sentence: do not kill the pod on every DB blip if readiness can gate traffic.

### Step 4 — Capture

Save under `notes/lab21-probes.md`. Pre-lab only.

## Expected result

A liveness/readiness contrast with CRM examples.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Both probes defined | Pass / Fail |
| 2 | CRM examples present | Pass / Fail |
| 3 | Wrong-mix warning written | Pass / Fail |
