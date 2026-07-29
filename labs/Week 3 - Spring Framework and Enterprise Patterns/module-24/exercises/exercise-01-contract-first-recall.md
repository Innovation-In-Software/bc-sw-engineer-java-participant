# Exercise 1 — Contract-First Recall

**Module 24** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/contract-first.md` — explain why the partner XSD—not Java classes—owns the SOAP contract.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-contract-first-recall.md` (this file in the course repo) |
| Your notes file | `notes/contract-first.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — Contract-First Recall

## Reference

| Artifact | Role |
| --- | --- |
| `customer.xsd` | Source of truth |
| Generated JAXB types | Derived from XSD |
| Dynamic WSDL | Published from XSD + Spring-WS |

## Step 1 — One-paragraph rule

In `notes/contract-first.md`, write why editing Java first would drift the partner contract.

## Step 2 — Check the reference

Align with XSD → JAXB → WSDL order.

## Step 3 — Lab 13 link

Note Lab 24 implements Lab 13’s customer operations over Spring-WS.

## Step 4 — Boundary

State you will not author the full XSD in this pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/contract-first.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — Contract-First Recall

## Reference

| Artifact | Role |
| --- | --- |
| `customer.xsd` | Source of truth |
| Generated JAXB types | Derived from XSD |
| Dynamic WSDL | Published from XSD + Spring-WS |

## Step 1 — One-paragraph rule

In `notes/contract-first.md`, write why editing Java first would drift the partner contract.

## Step 2 — Check the reference

Align with XSD → JAXB → WSDL order.

## Step 3 — Lab 13 link

Note Lab 24 implements Lab 13’s customer operations over Spring-WS.

## Step 4 — Boundary

State you will not author the full XSD in this pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Contract-first rule and Lab 13 link are documented in `notes/contract-first.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/contract-first.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 24 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/contract-first.md`
- [ ] XSD named as source of truth
- [ ] JAXB/WSDL called derived
- [ ] Pre-lab boundary clear

