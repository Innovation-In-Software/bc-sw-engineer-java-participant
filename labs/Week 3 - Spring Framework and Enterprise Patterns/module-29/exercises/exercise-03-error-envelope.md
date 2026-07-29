# Exercise 4 — ErrorResponse Envelope

**Module 29** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/error-envelope.md` — specify `ErrorResponse` fields clients can rely on.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-29-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-error-envelope.md` (this file in the course repo) |
| Your notes file | `notes/error-envelope.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 29 — ErrorResponse Envelope

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

## Step 1 — Sketch JSON

In `notes/error-envelope.md`, sketch a 400 validation example including `correlationId: lab-request-001`.

## Step 2 — Check the reference

Ensure required fields from the table appear.

## Step 3 — 404 example

Sketch envelope for `CUS-9999` not-found.

## Step 4 — Safety

No stack traces or SQL in `message`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-29-exercises/`, create `notes/` if needed, then create `notes/error-envelope.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 29 — ErrorResponse Envelope

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

## Step 1 — Sketch JSON

In `notes/error-envelope.md`, sketch a 400 validation example including `correlationId: lab-request-001`.

## Step 2 — Check the reference

Ensure required fields from the table appear.

## Step 3 — 404 example

Sketch envelope for `CUS-9999` not-found.

## Step 4 — Safety

No stack traces or SQL in `message`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

400 and 404 envelope sketches exist in `notes/error-envelope.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/error-envelope.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 29 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/error-envelope.md`
- [ ] Validation example includes violations/correlation
- [ ] 404 example present
- [ ] No stack traces

