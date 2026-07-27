# Exercise 3 — SOAP Fault Versus REST Error

**Module 24** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Document how business exceptions become SOAP faults without leaking stacks.

## Steps

### Step 1 — Contrast table

In `notes/fault-vs-rest.md`, columns: Concern | SOAP | REST. Rows: not-found, validation, missing UsernameToken.

### Step 2 — Answer sketch

Not-found → SOAP fault vs HTTP 404 JSON; missing token → security fault vs 401 later on REST.

### Step 3 — No stack traces

Rule: partner-facing faults never include stack traces or secrets.

### Step 4 — Lab 16 link

Note Lab 16 exception ideas feed Lab 24 fault mapping.

## Expected result

Contrast table and safe-fault rule exist.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Three concern rows filled | Pass / Fail |
| 2 | No-stack-trace rule written | Pass / Fail |
| 3 | Lab 16 connection noted | Pass / Fail |
