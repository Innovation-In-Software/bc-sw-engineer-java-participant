# Exercise 3 — Sketch Persistence Changes

**Module 50** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Identify entities and migration needs for the journey.

## Steps

### Step 1 — Entities

Customer, Interaction (adapt to your schema)—key fields only.

### Step 2 — Check the reference

Schema changes go through migrations—not manual prod edits.

### Step 3 — Query needs

List queries: search by name/id, interactions by customer ordered by time.

### Step 4 — Evidence

Plan to prove UI write appears in PostgreSQL for `CUS-1001`.

## Expected result

Persistence sketch with migration and proof idea.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Entities listed | Pass / Fail |
| 2 | Migration discipline stated | Pass / Fail |
| 3 | UI→DB proof planned | Pass / Fail |
