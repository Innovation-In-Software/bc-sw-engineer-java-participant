# Exercise 3 — MDC Lifecycle

**Module 20** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Sketch put → use → clear MDC for correlation across a request.

## Steps

### Step 1 — Put

On request entry: MDC.put("correlationId", "lab-request-001").

### Step 2 — Use

Service logs automatically include correlation via pattern.

### Step 3 — Clear

finally { MDC.clear(); } or remove key — prevent leak to next request.

### Step 4 — Boundary

Note metrics/alerts deepen in Lab 21; here focus logs/MDC.

## Expected result

An MDC lifecycle sketch with clear-in-finally.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Put documented | Pass / Fail |
| 2 | Clear in finally documented | Pass / Fail |
| 3 | Lab 21 boundary noted | Pass / Fail |
