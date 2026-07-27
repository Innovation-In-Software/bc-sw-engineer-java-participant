# Exercise 6 — Document End-to-End Data Flow

**Module 50** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Write a short UI→API→JPA→PostgreSQL flow for one action.

## Steps

### Step 1 — Pick action

Add interaction on `CUS-1001` with correlation `lab-request-001`.

### Step 2 — Sequence

Numbered steps across frontend, controller, service, repository, DB row.

### Step 3 — Failure point

Mark where validation or DB failure surfaces in the UI.

### Step 4 — Save

Save `lab50-data-flow.md` as Lab 50 prep.

## Expected result

End-to-end data-flow note with failure surfacing.

## If it fails

| Problem | Fix |
| --- | --- |
| Demo only happy path UI | Plan error/empty states |
| Manual SQL in prod | Use migrations |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Sequence numbered | Pass / Fail |
| 2 | Failure surfacing marked | Pass / Fail |
| 3 | Notes saved | Pass / Fail |
