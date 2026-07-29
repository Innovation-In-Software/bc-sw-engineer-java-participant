# Exercise 3 — Define Promotion Gates

**Module 44** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab44-promotion-gates.md` — write measurable gates for test → staging → prod.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-44-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-promotion-gates.md` (this file in the course repo) |
| Your notes file | `notes/lab44-promotion-gates.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 44 — Define Promotion Gates

## Step 1 — Gate list

Examples: verify green, SAST gate, staging smoke, change approval, residual risk owned.

## Step 2 — Check the reference

Gates need evidence links—not vibes.

## Step 3 — Owner column

Assign role owners: QA/dev lead/security/ops (adapt to team).

## Step 4 — No-go examples

List three automatic no-go conditions (secret leak, digest mismatch, failed readiness).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-44-exercises/`, create `notes/` if needed, then create `notes/lab44-promotion-gates.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 44 — Define Promotion Gates

## Step 1 — Gate list

Examples: verify green, SAST gate, staging smoke, change approval, residual risk owned.

## Step 2 — Check the reference

Gates need evidence links—not vibes.

## Step 3 — Owner column

Assign role owners: QA/dev lead/security/ops (adapt to team).

## Step 4 — No-go examples

List three automatic no-go conditions (secret leak, digest mismatch, failed readiness).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Promotion gate table with owners and no-go conditions in `notes/lab44-promotion-gates.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab44-promotion-gates.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 44 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab44-promotion-gates.md`
- [ ] Gates measurable
- [ ] Owners assigned
- [ ] Three no-gos listed

