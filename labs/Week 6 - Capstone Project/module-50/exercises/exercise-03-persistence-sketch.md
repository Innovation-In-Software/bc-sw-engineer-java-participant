# Exercise 3 — Sketch Persistence Changes

**Module 50** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab50-persistence-sketch.md` — identify entities and migration needs for the journey.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-50-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-persistence-sketch.md` (this file in the course repo) |
| Your notes file | `notes/lab50-persistence-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 50 — Sketch Persistence Changes

## Step 1 — Entities

Customer, Interaction (adapt to your schema)—key fields only.

## Step 2 — Check the reference

Schema changes go through migrations—not manual prod edits.

## Step 3 — Query needs

List queries: search by name/id, interactions by customer ordered by time.

## Step 4 — Evidence

Plan to prove UI write appears in PostgreSQL for `CUS-1001`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-50-exercises/`, create `notes/` if needed, then create `notes/lab50-persistence-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 50 — Sketch Persistence Changes

## Step 1 — Entities

Customer, Interaction (adapt to your schema)—key fields only.

## Step 2 — Check the reference

Schema changes go through migrations—not manual prod edits.

## Step 3 — Query needs

List queries: search by name/id, interactions by customer ordered by time.

## Step 4 — Evidence

Plan to prove UI write appears in PostgreSQL for `CUS-1001`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Persistence sketch with migration and proof idea in `notes/lab50-persistence-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab50-persistence-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 50 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab50-persistence-sketch.md`
- [ ] Entities listed
- [ ] Migration discipline stated
- [ ] UI→DB proof planned

