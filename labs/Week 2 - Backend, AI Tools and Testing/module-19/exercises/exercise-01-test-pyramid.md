# Exercise 1 — Test Pyramid for CRM

**Module 19** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Place activate unit tests, API IT, and Selenium UI on a pyramid.

## Steps

### Step 1 — Base

Many fast JUnit/Mockito tests for service rules (Labs 17–18).

### Step 2 — Middle

Fewer API integration tests with real Spring slice or Testcontainers later.

### Step 3 — Top

Few Selenium journeys: view Amina ACTIVE, activate Ravi path in UI if exposed.

### Step 4 — Capture

Save under `notes/lab19-pyramid.md`. Pre-lab only — no Actuator.

## Expected result

A pyramid note with Northstar examples at each layer.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Three layers described | Pass / Fail |
| 2 | Fixtures mentioned at UI layer | Pass / Fail |
| 3 | Actuator deferred | Pass / Fail |
