# Exercise 1 — Why Resilience

**Module 32** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Explain how a slow Account Profile dependency hurts the CRM API.

## Steps

### Step 1 — Scenario

Customer detail for `CUS-1001` Amina calls Account Profile. The dependency hangs 30s. List three user-visible or thread-pool effects.

### Step 2 — Pattern names

Write the four Resilience4j ideas: retry, circuit breaker, time limiter, fallback.

### Step 3 — Not a substitute

One sentence: resilience wraps calls; it does not fix a permanently wrong URL.

### Step 4 — Notes file

Save under `notes/lab32-resilience.md`.

## Expected result

A scenario analysis plus named Resilience4j patterns.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Three hang effects | Pass / Fail |
| 2 | Four patterns named | Pass / Fail |
| 3 | Limitation sentence written | Pass / Fail |
