# Exercise 2 — Plan Typed API Client

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 74–76) |
| **Deliverable** | `notes/lab50-api-client-plan.md` |
| **Fixtures** | CUS-1001/CUS-1002 · lab-request-001 · no real PII |

### What you will learn

Plan typed client methods, headers (correlation), and error mapping to UI states.

### Enterprise context

Do not invent parallel payload shapes—type against Lab 49 DTOs.

### Predict

What header carries lab-request-001?

### Debug

UI 200 but wrong TypeScript shape — fix?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| any everywhere | Type request/response DTOs |
| Ignore 401/400 | Map Problem Details to UI |

**Module 50** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-50-exercises/`) |
| ---- | --------------------------------------------- |
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

