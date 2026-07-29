# Exercise 1 — ACID for CRM Transfers

**Module 27** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/acid-crm.md` — tie each ACID letter to a Northstar transfer observation.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-27-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-acid-crm.md` (this file in the course repo) |
| Your notes file | `notes/acid-crm.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 27 — ACID for CRM Transfers

## Reference

| Letter | CRM meaning |
| --- | --- |
| Atomicity | Debit+credit+log all succeed or none |
| Consistency | Balances never violate invariants after commit/rollback |
| Isolation | Concurrent transfers do not see half-updates |
| Durability | Committed transfer log survives restart |

## Step 1 — Fill ACID

In `notes/acid-crm.md`, write one CRM sentence per ACID letter.

## Step 2 — Check the reference

Align with the reference table.

## Step 3 — Accounts

List accounts: `ACC-1001-MAIN`, `ACC-1001-LOYALTY`, `ACC-1002-MAIN`, force id `ACC-FORCE-FAIL`.

## Step 4 — Boundary

Pre-lab explains ACID; Lab 27 proves rollback with code.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-27-exercises/`, create `notes/` if needed, then create `notes/acid-crm.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 27 — ACID for CRM Transfers

## Reference

| Letter | CRM meaning |
| --- | --- |
| Atomicity | Debit+credit+log all succeed or none |
| Consistency | Balances never violate invariants after commit/rollback |
| Isolation | Concurrent transfers do not see half-updates |
| Durability | Committed transfer log survives restart |

## Step 1 — Fill ACID

In `notes/acid-crm.md`, write one CRM sentence per ACID letter.

## Step 2 — Check the reference

Align with the reference table.

## Step 3 — Accounts

List accounts: `ACC-1001-MAIN`, `ACC-1001-LOYALTY`, `ACC-1002-MAIN`, force id `ACC-FORCE-FAIL`.

## Step 4 — Boundary

Pre-lab explains ACID; Lab 27 proves rollback with code.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

ACID mapped to CRM transfer language in `notes/acid-crm.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/acid-crm.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 27 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/acid-crm.md`
- [ ] Four letters explained
- [ ] Force-fail account listed
- [ ] Pre-lab vs lab boundary clear

