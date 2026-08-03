# Exercise 4 — Contract-First Mindset

**Module 13** · Checkpoint C · Exercises 1–6 Pass then Lab 13

## Activity card

| | |
| --- | --- |
| **Objective** | Explain contract-first mindset vs code-first for this CRM SOAP API |
| **Skills practiced** | Contract-first design judgment |
| **Expected outcome** | notes/lab13-contract-first.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-13-exercises/` → notes/lab13-contract-first.md |
| **Checkpoint** | C (after slides 124–126) |

## What you will learn

- Contract-first designs XSD/WSDL before hosting code
- Request/response flows must match the contract
- Lab 13 delivers contracts + samples — not a live server

**Enterprise context:** Regulated integrations prefer frozen contracts over ad-hoc Java DTOs.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-13-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab13-contract-first.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

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

Then follow **Steps** to create your own file.

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


## Debug / design challenge

Rewrite a code-first claim ('generate WSDL from classes later') into contract-first steps.

## Predict the Output / Behavior

Should Spring-WS hosting happen before or after the WSDL exists in this course?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab13-contract-first.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 13 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab13-contract-first.md`
- [ ] Contract-first sentence written
- [ ] Two code-first risks
- [ ] Two operations listed

