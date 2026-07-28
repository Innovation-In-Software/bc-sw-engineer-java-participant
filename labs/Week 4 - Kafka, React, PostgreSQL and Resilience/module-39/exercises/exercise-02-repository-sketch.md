# Exercise 5 — Repository Sketch

**Module 39** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

List repository methods you will implement in Lab 39.

## Steps

### Step 1 — CustomerRepository

`findById`, `findByStatus`, `findAll(Pageable)`.

### Step 2 — AccountRepository

`findByCustomerId(String customerId)` for Amina/Ravi.

### Step 3 — Derived vs @Query

Note when a `@Query` might be clearer than a long derived name.

### Step 4 — Service boundary

Controllers talk to services; services use repositories.

## Expected result

Repository method list with layering reminder.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | ≥3 customer methods | Pass / Fail |
| 2 | Account-by-customer method | Pass / Fail |
| 3 | Layering note | Pass / Fail |
