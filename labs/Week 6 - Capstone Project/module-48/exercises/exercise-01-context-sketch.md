# Exercise 1 — Sketch Context Diagram

**Module 48** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Identify users, external systems, and trust boundaries for Northstar CRM.

## Reference

| Artifact | Purpose |
| --- | --- |
| docs/architecture/context.md | Users and external systems |
| docs/architecture/container.md | Deployable units and flows |
| docs/nfrs.md | Measurable quality attributes |
| docs/adrs/ | Decision records |
| docs/backlog.md | Vertical stories |
| docs/risk-register.md | Risks with owners/dates |

## Steps

### Step 1 — Actors

List service agents, admins, and any external IdP/email/Kafka dependencies.

### Step 2 — Check the reference

Week 6 master doc expects `docs/architecture/context.md` and container.md.

### Step 3 — Trust boundaries

Mark where JWT auth, DB, and Kafka cross trust zones.

### Step 4 — Fixtures

Note synthetic customers `CUS-1001`/`CUS-1002` as demo data—not external systems.

## Expected result

Context sketch with actors and trust boundaries.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Actors listed | Pass / Fail |
| 2 | Trust boundaries marked | Pass / Fail |
| 3 | Fixtures distinguished | Pass / Fail |
