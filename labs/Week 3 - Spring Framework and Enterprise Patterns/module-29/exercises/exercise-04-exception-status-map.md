# Exercise 2 — Exception to Status Map

**Module 29** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/exception-status-map.md` — document handler mappings for Lab 29 / Lab 16 ideas.

## Deliverable

| Item | Path (under `examples/module-29-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-exception-status-map.md` (this file in the course repo) |
| Your notes file | `notes/exception-status-map.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-29-exercises/`, create `notes/` if needed, then create `notes/exception-status-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 29 — Exception to Status Map

## Reference

| Case | HTTP |
| --- | --- |
| Bean Validation failure | 400 |
| Customer not found | 404 |
| Duplicate create | 409 |
| Illegal status transition | 409 or 422 (pick & justify) |
| Unhandled | 500 safe fallback |

## Step 1 — Fill map

Create `notes/exception-status-map.md` with the five cases.

## Step 2 — Check the reference

Compare statuses; justify illegal-transition choice in one sentence.

## Step 3 — Handler type

Note `@RestControllerAdvice` / `GlobalExceptionHandler`.

## Step 4 — SOAP optional

Optional note: SOAP faults should stay aligned in spirit with REST envelopes.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Exception→status map and handler type documented in `notes/exception-status-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/exception-status-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 29 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/exception-status-map.md` | Pass / Fail |
| 2 | Five cases mapped | Pass / Fail |
| 3 | Global handler named | Pass / Fail |
| 4 | Justification for transition status present | Pass / Fail |
