# Exercise 1 — Entity vs DTO

**Module 14** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Explain why Northstar HTTP/SOAP payloads should not be persistence entities.

## Steps

### Step 1 — Definitions

Entity = persistence shape; DTO = API contract shape.

### Step 2 — Leak risks

List two leaks: internal flags, lazy relations, or audit columns in responses.

### Step 3 — Fixture DTO fields

DTO fields for Amina: customerId, fullName, status — no persistence annotations.

### Step 4 — Capture

Save under `notes/lab14-entity-vs-dto.md`. Pre-lab only — no Spring `@Valid`.

## Expected result

Clear entity/DTO split with fixture field list.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Definitions written | Pass / Fail |
| 2 | Two leak risks | Pass / Fail |
| 3 | Amina DTO fields listed | Pass / Fail |
