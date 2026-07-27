# Exercise 6 — Plan Container Smoke

**Module 41** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Plan a post-start smoke that uses synthetic customers only.

## Steps

### Step 1 — Steps

Order: health ready → create/get `CUS-1001` → correlation header `lab-request-001` → stop container.

### Step 2 — Check the reference

Evidence is screenshots/logs under lab-41 notes—not production dumps.

### Step 3 — Failure case

One planned negative: wrong DB URL should fail readiness.

### Step 4 — Scope line

State this is a plan; full docker build/run is Lab 41.

## Expected result

Smoke plan with happy and negative paths.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Happy path ordered | Pass / Fail |
| 2 | Negative readiness case listed | Pass / Fail |
| 3 | Pre-lab scope stated | Pass / Fail |
