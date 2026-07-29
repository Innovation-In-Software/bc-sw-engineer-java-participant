# Exercise 5 — REST Smoke Plan

**Module 23** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/rest-smoke-plan.md` — document the Lab 23 HTTP smoke sequence without executing the full lab.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-23-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-rest-smoke-plan.md` (this file in the course repo) |
| Your notes file | `notes/rest-smoke-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 23 — REST Smoke Plan

## Step 1 — Sequence

In `notes/rest-smoke-plan.md`, list: start app → POST Amina → GET `CUS-1001` → GET `CUS-1002` or create Ravi → GET missing → check health.

## Step 2 — Correlation

Specify header `X-Correlation-Id: lab-request-001` on create evidence.

## Step 3 — Failure case

Note expected 404 for `CUS-MISSING` (or equivalent missing id).

## Step 4 — Boundary

State SOAP partner calls wait for Lab 24.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-23-exercises/`, create `notes/` if needed, then create `notes/rest-smoke-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 23 — REST Smoke Plan

## Step 1 — Sequence

In `notes/rest-smoke-plan.md`, list: start app → POST Amina → GET `CUS-1001` → GET `CUS-1002` or create Ravi → GET missing → check health.

## Step 2 — Correlation

Specify header `X-Correlation-Id: lab-request-001` on create evidence.

## Step 3 — Failure case

Note expected 404 for `CUS-MISSING` (or equivalent missing id).

## Step 4 — Boundary

State SOAP partner calls wait for Lab 24.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Ordered smoke plan with correlation and failure case in `notes/rest-smoke-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/rest-smoke-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 23 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/rest-smoke-plan.md`
- [ ] Happy path for CUS-1001 present
- [ ] Correlation header specified
- [ ] Missing-id failure planned

