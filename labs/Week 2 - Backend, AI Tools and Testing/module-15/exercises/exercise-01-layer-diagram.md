# Exercise 1 — Layer Diagram

**Module 15** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab15-layers.md` — sketch API → service → repository for Northstar Customer activate.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-15-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-layer-diagram.md` (this file in the course repo) |
| Your notes file | `notes/lab15-layers.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 15 — Layer Diagram

## Step 1 — Boxes

Draw three boxes: API adapter, CustomerService, CustomerRepository.

## Step 2 — Arrow labels

Label activate(CUS-1002) flowing inward; Customer returned outward.

## Step 3 — Correlation

Note lab-request-001 crosses the API edge into service logging later.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-15-exercises/`, create `notes/` if needed, then create `notes/lab15-layers.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 15 — Layer Diagram

## Step 1 — Boxes

Draw three boxes: API adapter, CustomerService, CustomerRepository.

## Step 2 — Arrow labels

Label activate(CUS-1002) flowing inward; Customer returned outward.

## Step 3 — Correlation

Note lab-request-001 crosses the API edge into service logging later.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A three-layer diagram with activate flow labeled in `notes/lab15-layers.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab15-layers.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 15 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab15-layers.md`
- [ ] Three layers named
- [ ] Activate flow labeled
- [ ] Correlation edge noted

