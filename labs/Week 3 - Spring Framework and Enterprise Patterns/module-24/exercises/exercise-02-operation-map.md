# Exercise 2 — SOAP Operation Map

**Module 24** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/soap-ops.md` — map four customer SOAP operations to shared `CustomerService` methods.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-operation-map.md` (this file in the course repo) |
| Your notes file | `notes/soap-ops.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — SOAP Operation Map

## Reference

| SOAP operation | Service responsibility |
| --- | --- |
| CreateCustomer | create customer |
| GetCustomer | get by id |
| UpdateCustomerStatus | status transition |
| ListCustomers | list / filter |

## Step 1 — Fill map

Create `notes/soap-ops.md` with the four operations and matching service methods.

## Step 2 — Check the reference

Compare to the reference table.

## Step 3 — Shared service rule

Write: REST and SOAP must share `CustomerService` so rules never fork.

## Step 4 — Fixtures

List evidence IDs: `CUS-1001`, `CUS-1002`, `CUS-9999`, correlation `lab24-001`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/soap-ops.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — SOAP Operation Map

## Reference

| SOAP operation | Service responsibility |
| --- | --- |
| CreateCustomer | create customer |
| GetCustomer | get by id |
| UpdateCustomerStatus | status transition |
| ListCustomers | list / filter |

## Step 1 — Fill map

Create `notes/soap-ops.md` with the four operations and matching service methods.

## Step 2 — Check the reference

Compare to the reference table.

## Step 3 — Shared service rule

Write: REST and SOAP must share `CustomerService` so rules never fork.

## Step 4 — Fixtures

List evidence IDs: `CUS-1001`, `CUS-1002`, `CUS-9999`, correlation `lab24-001`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Operation map and shared-service rule are ready in `notes/soap-ops.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/soap-ops.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 24 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/soap-ops.md`
- [ ] Four operations mapped
- [ ] Shared CustomerService stated
- [ ] Fixtures listed

