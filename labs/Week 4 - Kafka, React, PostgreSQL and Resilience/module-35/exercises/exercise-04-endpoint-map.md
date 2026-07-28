# Exercise 5 — Endpoint Map

**Module 35** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Connect dashboard actions to Spring CRM endpoints.

## Reference

| UI action | HTTP |
| --- | --- |
| List customers | GET /api/customers |
| Open Amina | GET /api/customers/CUS-1001 |
| Create customer | POST /api/customers |
| Update status | PATCH /api/customers/{id} |

## Steps

### Step 1 — Copy table

Copy into `notes/lab35-api.md`; adjust paths if your Week 3 API differed — note the difference.

### Step 2 — Ravi row

Add GET for `CUS-1002`.

### Step 3 — Status codes

List expected codes: 200, 201, 400, 404, 500.

### Step 4 — JSON shape

Sketch list item JSON: customerId, name, status.

## Expected result

UI↔HTTP map with status codes and a JSON sketch.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Table + Ravi row | Pass / Fail |
| 2 | Five status codes | Pass / Fail |
| 3 | JSON fields listed | Pass / Fail |
