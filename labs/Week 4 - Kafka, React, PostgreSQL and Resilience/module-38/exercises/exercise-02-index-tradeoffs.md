# Exercise 5 — Index Tradeoffs

**Module 38** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab38-index-tradeoffs.md` — document costs of extra indexes on CRM write paths.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-38-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-index-tradeoffs.md` (this file in the course repo) |
| Your notes file | `notes/lab38-index-tradeoffs.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 38 — Index Tradeoffs

## Step 1 — Benefit

Faster status filters and account-by-customer joins.

## Step 2 — Cost

Slower INSERT/UPDATE for Amina/Ravi seeds at scale; more disk.

## Step 3 — Cleanup

Lab may include dropping experimental indexes — plan to document before/after.

## Step 4 — Rule

Add index only when EXPLAIN shows need.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-38-exercises/`, create `notes/` if needed, then create `notes/lab38-index-tradeoffs.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 38 — Index Tradeoffs

## Step 1 — Benefit

Faster status filters and account-by-customer joins.

## Step 2 — Cost

Slower INSERT/UPDATE for Amina/Ravi seeds at scale; more disk.

## Step 3 — Cleanup

Lab may include dropping experimental indexes — plan to document before/after.

## Step 4 — Rule

Add index only when EXPLAIN shows need.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Tradeoff paragraph tied to CRM workloads in `notes/lab38-index-tradeoffs.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab38-index-tradeoffs.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 38 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab38-index-tradeoffs.md`
- [ ] Benefit stated
- [ ] Write-cost stated
- [ ] Measure-first rule

