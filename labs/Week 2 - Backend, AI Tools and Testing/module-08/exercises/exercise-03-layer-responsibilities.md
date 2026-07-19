# Exercise 3 — Assign Layer Responsibilities

**Module 8** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Create `layer-responsibilities.md` and assign each CRM task to the layer that should own it.

## Layer map

| Layer/package | Owns | Does not own |
| ------------- | ---- | ------------ |
| `controller` | Transport boundary, request/response mapping | Business rules, storage |
| `service` | Validation, orchestration, business policy | HTTP details, SQL |
| `repository` | Save/find abstraction | UI formatting, business workflow |
| `entity` | Domain state/identity | HTTP request shape |
| `dto` | Boundary input/output shape | Persistence behavior |
| `config` | Object/application configuration | Customer operations |
| `exception` | Meaningful failure types | Catch-all utility logic |

## Steps

### Step 1 — Assign the tasks

| Task | Layer |
| ---- | ----- |
| Accept future create-customer input | |
| Reject blank customer name | |
| Find customer by ID | |
| Represent customer ID/name/status | |
| Represent create request fields | |
| Define customer-not-found failure | |
| Wire application objects later | |

### Step 2 — Check the reference

```text
accept input → controller
business validation → service
find by ID → repository
domain state → entity
request shape → dto
failure type → exception
wiring/configuration → config
```

### Step 3 — Repair a “god controller”

Bad flow:

```text
Controller validates every business rule
→ edits an in-memory list directly
→ constructs database queries
→ formats errors
```

Rewrite it:

```text
Controller maps request
→ Service validates/orchestrates
→ Repository saves/finds
→ Service returns result
→ Controller maps response
```

### Step 4 — Explain why boundaries help

Write 3–5 sentences covering:

- isolated testing;
- replacing storage without changing controller;
- keeping transport concerns out of business logic;
- making ownership discoverable.

## Expected result

Every responsibility has one primary home, and the repaired flow follows controller → service → repository.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Seven tasks assigned correctly | Pass / Fail |
| 2 | God-controller flow repaired | Pass / Fail |
| 3 | You explain at least two benefits of boundaries | Pass / Fail |
