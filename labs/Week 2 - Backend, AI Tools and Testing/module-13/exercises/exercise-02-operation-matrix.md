# Exercise 2 — Operation Matrix

**Module 13** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab13-operation-matrix.md` — fill an in/out/fault matrix for GetCustomer and ActivateCustomer.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-operation-matrix.md` (this file in the course repo) |
| Your notes file | `notes/lab13-operation-matrix.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 13 — Operation Matrix

## Step 1 — GetCustomer

In: customerId; Out: id, name, status; Fault: not found.

## Step 2 — ActivateCustomer

In: customerId (+ correlation header idea); Out: new status; Fault: invalid transition.

## Step 3 — Happy path

Note Activate on CUS-1002 Ravi PROSPECT → ACTIVE as the design happy path.

## Step 4 — Prep only

Write: *Design only — do not complete full Lab 13 build.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-13-exercises/`, create `notes/` if needed, then create `notes/lab13-operation-matrix.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 13 — Operation Matrix

## Step 1 — GetCustomer

In: customerId; Out: id, name, status; Fault: not found.

## Step 2 — ActivateCustomer

In: customerId (+ correlation header idea); Out: new status; Fault: invalid transition.

## Step 3 — Happy path

Note Activate on CUS-1002 Ravi PROSPECT → ACTIVE as the design happy path.

## Step 4 — Prep only

Write: *Design only — do not complete full Lab 13 build.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A two-operation matrix with Northstar happy path noted in `notes/lab13-operation-matrix.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-operation-matrix.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 13 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab13-operation-matrix.md`
- [ ] Both operations have in/out/fault
- [ ] Ravi activate path noted
- [ ] Design-only boundary present

