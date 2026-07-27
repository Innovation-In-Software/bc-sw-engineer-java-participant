# Exercise 1 — Catch Order

**Module 16** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Order catch/handlers from specific domain exceptions to generic Exception.

## Steps

### Step 1 — List types

NotFoundException, ConflictException, ValidationException, Exception.

### Step 2 — Order

Write the catch/handler order top-to-bottom specific → general.

### Step 3 — Why

One sentence: broad catch first would shadow domain mapping.

### Step 4 — Prep only

Write: *Do not complete full Lab 16 advice wiring in pre-lab.*

## Expected result

An ordered handler list with rationale.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Four types ordered | Pass / Fail |
| 2 | Rationale sentence present | Pass / Fail |
| 3 | Pre-lab boundary present | Pass / Fail |
