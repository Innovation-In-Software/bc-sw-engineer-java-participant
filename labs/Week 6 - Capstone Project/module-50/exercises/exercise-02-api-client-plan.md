# Exercise 2 — Plan Typed API Client

**Module 50** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab50-api-client-plan.md` — list client functions and DTO fields the UI needs.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-50-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-api-client-plan.md` (this file in the course repo) |
| Your notes file | `notes/lab50-api-client-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 50 — Plan Typed API Client

## Reference

| UI state | User sees |
| --- | --- |
| loading | Spinner/skeleton |
| empty | Clear empty guidance |
| error | Actionable message |
| success | Data / confirmation |

## Step 1 — Functions

searchCustomers, getCustomer, listInteractions, createInteraction (names adaptable).

## Step 2 — Check the reference

Typed calls reduce silent UI breakage when APIs evolve.

## Step 3 — Error mapping

Map HTTP 401/403/404/500 to user-visible messages (no stack traces).

## Step 4 — Auth header

Note where JWT will attach later—do not hardcode tokens in source.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-50-exercises/`, create `notes/` if needed, then create `notes/lab50-api-client-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 50 — Plan Typed API Client

## Reference

| UI state | User sees |
| --- | --- |
| loading | Spinner/skeleton |
| empty | Clear empty guidance |
| error | Actionable message |
| success | Data / confirmation |

## Step 1 — Functions

searchCustomers, getCustomer, listInteractions, createInteraction (names adaptable).

## Step 2 — Check the reference

Typed calls reduce silent UI breakage when APIs evolve.

## Step 3 — Error mapping

Map HTTP 401/403/404/500 to user-visible messages (no stack traces).

## Step 4 — Auth header

Note where JWT will attach later—do not hardcode tokens in source.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

API client plan with error mapping in `notes/lab50-api-client-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab50-api-client-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 50 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab50-api-client-plan.md`
- [ ] Functions listed
- [ ] Error mapping present
- [ ] No hardcoded tokens

