# Exercise 3 — JSX on Paper

**Module 33** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab33-jsx-paper.md` — hand-write JSX structure for a two-row customer list.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-33-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-jsx-paper.md` (this file in the course repo) |
| Your notes file | `notes/lab33-jsx-paper.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 33 — JSX on Paper

## Step 1 — Tree

Sketch `<CustomerList>` containing two `<CustomerCard>` nodes.

## Step 2 — Keys

Write why `key={customerId}` should be `CUS-1001`, not array index.

## Step 3 — Badge

Nest `<StatusBadge status="ACTIVE" />` inside Amina's card.

## Step 4 — No runtime

Do not create a Vite app in this exercise.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-33-exercises/`, create `notes/` if needed, then create `notes/lab33-jsx-paper.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 33 — JSX on Paper

## Step 1 — Tree

Sketch `<CustomerList>` containing two `<CustomerCard>` nodes.

## Step 2 — Keys

Write why `key={customerId}` should be `CUS-1001`, not array index.

## Step 3 — Badge

Nest `<StatusBadge status="ACTIVE" />` inside Amina's card.

## Step 4 — No runtime

Do not create a Vite app in this exercise.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Paper JSX tree with correct keys and nested badge in `notes/lab33-jsx-paper.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab33-jsx-paper.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 33 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab33-jsx-paper.md`
- [ ] Two cards sketched
- [ ] Key rationale written
- [ ] StatusBadge nested

