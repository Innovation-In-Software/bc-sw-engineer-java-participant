# Exercise 5 — UsernameToken Plan

**Module 24** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/usernametoken-plan.md` — outline UsernameToken evidence without implementing JWT.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-usernametoken-plan.md` (this file in the course repo) |
| Your notes file | `notes/usernametoken-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — UsernameToken Plan

## Step 1 — Happy path

In `notes/usernametoken-plan.md`: secured GetCustomer for `CUS-1001` succeeds.

## Step 2 — Failure path

Missing/invalid token produces a distinct fault from not-found.

## Step 3 — Secret hygiene

Lab secrets stay in local config / `.env.example` placeholders — never real prod passwords.

## Step 4 — Not JWT

Explicitly defer Bearer JWT filter chains to Lab 28.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/usernametoken-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — UsernameToken Plan

## Step 1 — Happy path

In `notes/usernametoken-plan.md`: secured GetCustomer for `CUS-1001` succeeds.

## Step 2 — Failure path

Missing/invalid token produces a distinct fault from not-found.

## Step 3 — Secret hygiene

Lab secrets stay in local config / `.env.example` placeholders — never real prod passwords.

## Step 4 — Not JWT

Explicitly defer Bearer JWT filter chains to Lab 28.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

UsernameToken plan distinguishes security faults from not-found in `notes/usernametoken-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/usernametoken-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 24 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/usernametoken-plan.md`
- [ ] Happy and failure paths listed
- [ ] Secret hygiene stated
- [ ] JWT deferred to Lab 28

