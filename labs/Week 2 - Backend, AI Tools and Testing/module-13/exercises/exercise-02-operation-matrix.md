# Exercise 2 — Operation Matrix

**Module 13** · Checkpoint B · Exercises 1–6 Pass then Lab 13

## Activity card

| | |
| --- | --- |
| **Objective** | Build an operation matrix (in/out/fault) for create/get/update |
| **Skills practiced** | WSDL operation design |
| **Expected outcome** | notes/lab13-operation-matrix.md |
| **Estimated time** | 12–15 minutes |
| **File to create** | `examples/module-13-exercises/` → notes/lab13-operation-matrix.md |
| **Checkpoint** | B (after slides 121–123) |

## What you will learn

- Each operation needs request, response, and fault stories
- WSDL documents the operations consumers can call
- Matrix prevents inventing ops mid-lab

**Enterprise context:** Partner teams integrate from the operation matrix before Java exists.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
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


## Debug / design challenge

Add getCustomer → CustomerNotFound fault to the matrix if missing.

## Predict the Output / Behavior

How many primary Customer ops does Lab 13 expect (create/get/update)?

## Troubleshooting

### If it fails

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

