# Exercise 1 — Catch Order

**Module 16** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab16-catch-order.md` — order catch/handlers from specific domain exceptions to generic Exception.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-16-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-catch-order.md` (this file in the course repo) |
| Your notes file | `notes/lab16-catch-order.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 16 — Catch Order

## Step 1 — List types

NotFoundException, ConflictException, ValidationException, Exception.

## Step 2 — Order

Write the catch/handler order top-to-bottom specific → general.

## Step 3 — Why

One sentence: broad catch first would shadow domain mapping.

## Step 4 — Prep only

Write: *Do not complete full Lab 16 advice wiring in pre-lab.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-16-exercises/`, create `notes/` if needed, then create `notes/lab16-catch-order.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 16 — Catch Order

## Step 1 — List types

NotFoundException, ConflictException, ValidationException, Exception.

## Step 2 — Order

Write the catch/handler order top-to-bottom specific → general.

## Step 3 — Why

One sentence: broad catch first would shadow domain mapping.

## Step 4 — Prep only

Write: *Do not complete full Lab 16 advice wiring in pre-lab.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

An ordered handler list with rationale in `notes/lab16-catch-order.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab16-catch-order.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 16 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab16-catch-order.md`
- [ ] Four types ordered
- [ ] Rationale sentence present
- [ ] Pre-lab boundary present

