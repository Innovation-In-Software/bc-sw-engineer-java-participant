# Exercise 5 — Repository Sketch

**Module 39** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab39-repository-sketch.md` — list repository methods you will implement in Lab 39.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-repository-sketch.md` (this file in the course repo) |
| Your notes file | `notes/lab39-repository-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 39 — Repository Sketch

## Step 1 — CustomerRepository

`findById`, `findByStatus`, `findAll(Pageable)`.

## Step 2 — AccountRepository

`findByCustomerId(String customerId)` for Amina/Ravi.

## Step 3 — Derived vs @Query

Note when a `@Query` might be clearer than a long derived name.

## Step 4 — Service boundary

Controllers talk to services; services use repositories.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-39-exercises/`, create `notes/` if needed, then create `notes/lab39-repository-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 39 — Repository Sketch

## Step 1 — CustomerRepository

`findById`, `findByStatus`, `findAll(Pageable)`.

## Step 2 — AccountRepository

`findByCustomerId(String customerId)` for Amina/Ravi.

## Step 3 — Derived vs @Query

Note when a `@Query` might be clearer than a long derived name.

## Step 4 — Service boundary

Controllers talk to services; services use repositories.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Repository method list with layering reminder in `notes/lab39-repository-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab39-repository-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 39 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab39-repository-sketch.md`
- [ ] ≥3 customer methods
- [ ] Account-by-customer method
- [ ] Layering note

