# Exercise 1 — When to Keep Real Validator

**Module 18** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab18-keep-real-validator.md` — decide which collaborator stays real for activate tests.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-18-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-keep-real-validator.md` (this file in the course repo) |
| Your notes file | `notes/lab18-keep-real-validator.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 18 — When to Keep Real Validator

## Step 1 — Mock repo

Mock CustomerRepository — I/O boundary.

## Step 2 — Real validator?

Keep a pure StatusValidator real if it is deterministic and fast.

## Step 3 — Mock notifier

Mock notifier to avoid email/IO in unit tests.

## Step 4 — Rule

Write: mock I/O and unstable deps; keep pure domain helpers real when cheap.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-18-exercises/`, create `notes/` if needed, then create `notes/lab18-keep-real-validator.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 18 — When to Keep Real Validator

## Step 1 — Mock repo

Mock CustomerRepository — I/O boundary.

## Step 2 — Real validator?

Keep a pure StatusValidator real if it is deterministic and fast.

## Step 3 — Mock notifier

Mock notifier to avoid email/IO in unit tests.

## Step 4 — Rule

Write: mock I/O and unstable deps; keep pure domain helpers real when cheap.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A mock/real decision table for activate collaborators in `notes/lab18-keep-real-validator.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab18-keep-real-validator.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 18 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab18-keep-real-validator.md`
- [ ] Repo mock justified
- [ ] Validator real justified
- [ ] Notifier mock justified

