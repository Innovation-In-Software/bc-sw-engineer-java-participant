# Exercise 5 — REST Smoke Plan

**Module 23** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Document the Lab 23 HTTP smoke sequence without executing the full lab.

## Steps

### Step 1 — Sequence

In `notes/rest-smoke-plan.md`, list: start app → POST Amina → GET `CUS-1001` → GET `CUS-1002` or create Ravi → GET missing → check health.

### Step 2 — Correlation

Specify header `X-Correlation-Id: lab-request-001` on create evidence.

### Step 3 — Failure case

Note expected 404 for `CUS-MISSING` (or equivalent missing id).

### Step 4 — Boundary

State SOAP partner calls wait for Lab 24.

## Expected result

Ordered smoke plan with correlation and failure case.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Happy path for CUS-1001 present | Pass / Fail |
| 2 | Correlation header specified | Pass / Fail |
| 3 | Missing-id failure planned | Pass / Fail |
