# Exercise 4 — ErrorResponse Envelope

**Module 29** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Specify `ErrorResponse` fields clients can rely on.

## Reference

| Field | Purpose |
| --- | --- |
| timestamp | ISO-8601 UTC |
| status | HTTP status code |
| error | Short reason phrase |
| message | Safe human message |
| path | Request path |
| correlationId | e.g. lab-request-001 |
| violations | Optional field errors |

## Steps

### Step 1 — Sketch JSON

In `notes/error-envelope.md`, sketch a 400 validation example including `correlationId: lab-request-001`.

### Step 2 — Check the reference

Ensure required fields from the table appear.

### Step 3 — 404 example

Sketch envelope for `CUS-9999` not-found.

### Step 4 — Safety

No stack traces or SQL in `message`.

## Expected result

400 and 404 envelope sketches exist.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Validation example includes violations/correlation | Pass / Fail |
| 2 | 404 example present | Pass / Fail |
| 3 | No stack traces | Pass / Fail |
