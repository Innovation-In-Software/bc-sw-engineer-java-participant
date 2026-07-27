# Exercise 3 — Health and Resource Checklist

**Module 41** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Define readiness/health and resource expectations for `crm-api`.

## Steps

### Step 1 — Health

Name the Actuator readiness path you expect (e.g. `/actuator/health/readiness`) and what “ready” means for agents.

### Step 2 — Check the reference

Readiness fails closed if DB is down—agents should not get half-ready CRM.

### Step 3 — Resources

Write placeholder memory/CPU limits for local docker run (numbers can be lab defaults).

### Step 4 — Graceful stop

One sentence on SIGTERM / graceful shutdown expectation for in-flight `lab-request-001` calls.

## Expected result

Health, resources, and shutdown expectations documented.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Readiness path named | Pass / Fail |
| 2 | DB-down behavior stated | Pass / Fail |
| 3 | Graceful stop noted | Pass / Fail |
