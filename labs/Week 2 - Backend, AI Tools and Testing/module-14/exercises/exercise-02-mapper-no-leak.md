# Exercise 2 — Mapper No-Leak Rule

**Module 14** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Sketch toDto/toEntity rules that keep internals out of API responses.

## Steps

### Step 1 — toDto

Map only id, fullName, status for CUS-1001 responses.

### Step 2 — Forbidden

List forbidden: password hashes, internal risk scores, raw SQL ids if different.

### Step 3 — Activate DTO

Activate request carries customerId only (+ correlation header outside body).

### Step 4 — Prep boundary

Write: *DTOs before deep service rules — Lab 15 owns transitions.*

## Expected result

Mapper rules with Lab 15 boundary stated.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | toDto fields listed | Pass / Fail |
| 2 | Forbidden fields listed | Pass / Fail |
| 3 | Lab 15 deferral noted | Pass / Fail |
