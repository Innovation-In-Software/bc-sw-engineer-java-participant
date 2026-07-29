# Exercise 3 — SOAP Fault Versus REST Error

**Module 24** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/fault-vs-rest.md` — document how business exceptions become SOAP faults without leaking stacks.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-24-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-fault-vs-rest.md` (this file in the course repo) |
| Your notes file | `notes/fault-vs-rest.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 24 — SOAP Fault Versus REST Error

## Step 1 — Contrast table

In `notes/fault-vs-rest.md`, columns: Concern | SOAP | REST. Rows: not-found, validation, missing UsernameToken.

## Step 2 — Answer sketch

Not-found → SOAP fault vs HTTP 404 JSON; missing token → security fault vs 401 later on REST.

## Step 3 — No stack traces

Rule: partner-facing faults never include stack traces or secrets.

## Step 4 — Lab 16 link

Note Lab 16 exception ideas feed Lab 24 fault mapping.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-24-exercises/`, create `notes/` if needed, then create `notes/fault-vs-rest.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 24 — SOAP Fault Versus REST Error

## Step 1 — Contrast table

In `notes/fault-vs-rest.md`, columns: Concern | SOAP | REST. Rows: not-found, validation, missing UsernameToken.

## Step 2 — Answer sketch

Not-found → SOAP fault vs HTTP 404 JSON; missing token → security fault vs 401 later on REST.

## Step 3 — No stack traces

Rule: partner-facing faults never include stack traces or secrets.

## Step 4 — Lab 16 link

Note Lab 16 exception ideas feed Lab 24 fault mapping.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Contrast table and safe-fault rule exist in `notes/fault-vs-rest.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/fault-vs-rest.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 24 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/fault-vs-rest.md`
- [ ] Three concern rows filled
- [ ] No-stack-trace rule written
- [ ] Lab 16 connection noted

