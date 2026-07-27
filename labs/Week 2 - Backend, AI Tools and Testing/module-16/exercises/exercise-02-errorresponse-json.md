# Exercise 2 — ErrorResponse JSON Draft

**Module 16** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Draft JSON fields for a not-found error including correlation.

## Steps

### Step 1 — Fields

Fields: timestamp, status, error, message, path, correlationId.

### Step 2 — Sample

Sketch JSON for CUS-9999 not found with correlationId lab-request-001.

### Step 3 — Hygiene

Message must not include stack traces or SQL.

### Step 4 — Boundary

Note: paper draft only; advice controller wiring is lab-time.

## Expected result

A sample ErrorResponse JSON using lab-request-001.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Required fields listed | Pass / Fail |
| 2 | CUS-9999 sample sketched | Pass / Fail |
| 3 | No stack-trace in message | Pass / Fail |
