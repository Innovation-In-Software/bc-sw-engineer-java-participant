# Exercise 1 — CRM Entities

**Module 37** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab37-design.md` — list core tables for customers and accounts in Northstar.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-37-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-entities.md` (this file in the course repo) |
| Your notes file | `notes/lab37-design.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 37 — CRM Entities

## Step 1 — Entities

Propose `customer` and `account` (add `address` only if needed).

## Step 2 — Attributes

Customer: customer_id, full_name, status, created_at. Account: account_id, customer_id, account_number, type.

## Step 3 — Fixtures

Plan seed: Amina `CUS-1001`, Ravi `CUS-1002`.

## Step 4 — Notes

Save `notes/lab37-design.md`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-37-exercises/`, create `notes/` if needed, then create `notes/lab37-design.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 37 — CRM Entities

## Step 1 — Entities

Propose `customer` and `account` (add `address` only if needed).

## Step 2 — Attributes

Customer: customer_id, full_name, status, created_at. Account: account_id, customer_id, account_number, type.

## Step 3 — Fixtures

Plan seed: Amina `CUS-1001`, Ravi `CUS-1002`.

## Step 4 — Notes

Save `notes/lab37-design.md`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Entity/attribute list with Northstar seed IDs in `notes/lab37-design.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab37-design.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 37 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab37-design.md`
- [ ] Two+ tables named
- [ ] Key attributes listed
- [ ] Fixtures planned

