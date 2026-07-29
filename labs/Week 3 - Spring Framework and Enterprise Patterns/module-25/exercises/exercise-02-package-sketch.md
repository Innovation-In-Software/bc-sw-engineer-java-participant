# Exercise 2 — Package Sketch

**Module 25** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/package-tree.md` — sketch `api`/`controller`, `service`, `repository`, `model` packages.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-25-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-package-sketch.md` (this file in the course repo) |
| Your notes file | `notes/package-tree.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 25 — Package Sketch

## Step 1 — Tree

In `notes/package-tree.md`, draw `com.northstar.crm` with controller, service, repository, model (and optional dto).

## Step 2 — Types

Place `CustomerController`, `CustomerService`, `CustomerRepository`, `InMemoryCustomerRepository`, `Customer`.

## Step 3 — SOAP note

If SOAP exists from Lab 24, endpoints stay adapters; still call the same service.

## Step 4 — JPA readiness

One sentence: later JPA repo should keep the same service method signatures.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-25-exercises/`, create `notes/` if needed, then create `notes/package-tree.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 25 — Package Sketch

## Step 1 — Tree

In `notes/package-tree.md`, draw `com.northstar.crm` with controller, service, repository, model (and optional dto).

## Step 2 — Types

Place `CustomerController`, `CustomerService`, `CustomerRepository`, `InMemoryCustomerRepository`, `Customer`.

## Step 3 — SOAP note

If SOAP exists from Lab 24, endpoints stay adapters; still call the same service.

## Step 4 — JPA readiness

One sentence: later JPA repo should keep the same service method signatures.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Package tree supports layered Boot CRM in `notes/package-tree.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/package-tree.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 25 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/package-tree.md`
- [ ] Four packages present
- [ ] Five types placed
- [ ] JPA readiness sentence written

