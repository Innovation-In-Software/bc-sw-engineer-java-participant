# Exercise 4 — Contract-First Mindset

**Module 13** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab13-contract-first.md` — explain why Northstar SOAP should start from contract, not Java classes.

## Deliverable

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-contract-first.md` (this file in the course repo) |
| Your notes file | `notes/lab13-contract-first.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-13-exercises/`, create `notes/` if needed, then create `notes/lab13-contract-first.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 13 — Contract-First Mindset

## Step 1 — Definition

One sentence: define types and operations in XSD/WSDL before generating Java.

## Step 2 — Risk of code-first

Name two risks: accidental breaking changes and framework leakage into the contract.

## Step 3 — CRM ops

List candidate ops: GetCustomer, ActivateCustomer (paper names only).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A contract-first rationale with two CRM operations named in `notes/lab13-contract-first.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-contract-first.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 13 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab13-contract-first.md` | Pass / Fail |
| 2 | Contract-first sentence written | Pass / Fail |
| 3 | Two code-first risks | Pass / Fail |
| 4 | Two operations listed | Pass / Fail |
