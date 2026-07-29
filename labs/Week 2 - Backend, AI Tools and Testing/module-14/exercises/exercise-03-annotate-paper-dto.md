# Exercise 3 — Annotate Paper DTO

**Module 14** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab14-annotate-dto.md` — mark required/optional constraints on a paper CreateCustomerRequest.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-14-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-annotate-paper-dto.md` (this file in the course repo) |
| Your notes file | `notes/lab14-annotate-dto.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 14 — Annotate Paper DTO

## Reference

| Field | Constraint idea |
| --- | --- |
| fullName | required, non-blank |
| status | optional on create; default PROSPECT |
| customerId | server-assigned or pattern CUS-#### |

## Step 2 — Paper annotations

Write pseudo `@NotBlank` / `@Pattern` names — documentation only.

## Step 3 — No Spring yet

Explicit: do not wire `@Valid` on a controller in this pre-lab.

## Step 4 — Correlation

Note correlation `lab-request-001` stays in headers/logs, not as a DTO business field.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-14-exercises/`, create `notes/` if needed, then create `notes/lab14-annotate-dto.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 14 — Annotate Paper DTO

## Reference

| Field | Constraint idea |
| --- | --- |
| fullName | required, non-blank |
| status | optional on create; default PROSPECT |
| customerId | server-assigned or pattern CUS-#### |

## Step 2 — Paper annotations

Write pseudo `@NotBlank` / `@Pattern` names — documentation only.

## Step 3 — No Spring yet

Explicit: do not wire `@Valid` on a controller in this pre-lab.

## Step 4 — Correlation

Note correlation `lab-request-001` stays in headers/logs, not as a DTO business field.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Paper DTO constraints without live Spring validation in `notes/lab14-annotate-dto.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab14-annotate-dto.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 14 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab14-annotate-dto.md`
- [ ] Constraint table filled
- [ ] No `@Valid` wiring claimed
- [ ] Correlation placement noted

