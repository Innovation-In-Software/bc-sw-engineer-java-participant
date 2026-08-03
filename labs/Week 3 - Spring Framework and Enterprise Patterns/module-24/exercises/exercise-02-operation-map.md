# Exercise 2 — SOAP Operation Map

**Module 24** · Checkpoint B · Exercises 1–6 Pass then Lab 24

## Activity card

| | |
| --- | --- |
| **Objective** | Map four SOAP operations to CustomerService methods |
| **Skills practiced** | Operation-to-service mapping |
| **Expected outcome** | notes/soap-ops.md |
| **Estimated time** | 10–12 minutes |
| **File to create** | `examples/module-24-exercises/` → notes/soap-ops.md |
| **Checkpoint** | B (after slides 75–78) |

## What you will learn

- get/create/update/delete (or lab’s four ops) → service methods
- Endpoint stays thin
- Same service as REST

**Enterprise context:** Dual protocols with forked services create split-brain CRM data for Amina/Ravi.

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/soap-ops.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — SOAP Operation Map

| SOAP operation | CustomerService method |
| --- | --- |
| GetCustomer | getById / find |
| CreateCustomer | create |
| UpdateCustomer | update |
| DeleteCustomer | delete |

Shared store: one CustomerService bean for REST + SOAP.

## Scope
Pre-lab only.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/soap-ops.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — SOAP Operation Map

| SOAP operation | CustomerService method |
| --- | --- |
| GetCustomer | _____ |
| CreateCustomer | _____ |
| UpdateCustomer | _____ |
| DeleteCustomer | _____ |

## Shared service?
_____

## Scope
Pre-lab only.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab24-001` (or `lab-request-001` on REST). Replace every `_____` before Pass.

## Expected result

Operation map in `notes/soap-ops.md`.

## Debug / design challenge

What goes wrong if SOAP uses a second InMemoryCustomerRepository?

## Predict the Output / Behavior

Should GetCustomer re-validate business rules already in the service?

## Troubleshooting

### If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/soap-ops.md` |
| Mapping ops to controller only | Map to CustomerService |
| Two services | One shared service |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/soap-ops.md`
- [ ] Four ops mapped
- [ ] Shared service noted
