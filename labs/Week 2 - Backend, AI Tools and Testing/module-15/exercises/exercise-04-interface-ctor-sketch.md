# Exercise 4 — Interface and Constructor Sketch

**Module 15** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab15-interface-ctor-sketch.md` — sketch CustomerService methods and constructor dependencies on paper.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-15-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-interface-ctor-sketch.md` (this file in the course repo) |
| Your notes file | `notes/lab15-interface-ctor-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 15 — Interface and Constructor Sketch

## Step 1 — Interface

Methods: findById, activate(customerId).

## Step 2 — Constructor

Deps: CustomerRepository, optional CustomerNotifier — JDK-style ctor injection sketch.

## Step 3 — No framework magic

Note: prefer explicit ctor over field injection in standards.

## Step 4 — Prep boundary

Write: *Prepare for Lab 15; do not complete full service implementation now.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-15-exercises/`, create `notes/` if needed, then create `notes/lab15-interface-ctor-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 15 — Interface and Constructor Sketch

## Step 1 — Interface

Methods: findById, activate(customerId).

## Step 2 — Constructor

Deps: CustomerRepository, optional CustomerNotifier — JDK-style ctor injection sketch.

## Step 3 — No framework magic

Note: prefer explicit ctor over field injection in standards.

## Step 4 — Prep boundary

Write: *Prepare for Lab 15; do not complete full service implementation now.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Interface + ctor sketch ready for the timed lab in `notes/lab15-interface-ctor-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab15-interface-ctor-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 15 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab15-interface-ctor-sketch.md`
- [ ] Methods listed
- [ ] Deps listed
- [ ] Pre-lab boundary present

