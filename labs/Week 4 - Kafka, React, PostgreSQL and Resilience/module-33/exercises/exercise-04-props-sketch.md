# Exercise 1 — Props Sketch

**Module 33** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab33-props-sketch.md` — define props for CustomerCard using Northstar fixtures.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-33-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-props-sketch.md` (this file in the course repo) |
| Your notes file | `notes/lab33-props-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 33 — Props Sketch

## Reference

| Prop | Example |
| --- | --- |
| customerId | CUS-1001 |
| name | Amina Khan |
| status | ACTIVE |
| onSelect | () => void |

## Step 2 — Types

Write TypeScript-ish types: `status: 'ACTIVE' | 'SUSPENDED' | ...`.

## Step 3 — Children?

Decide whether `CustomerCard` takes `children` or only props — one sentence.

## Step 4 — Anti-pattern

Note: do not pass the entire global store as one mega-prop.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-33-exercises/`, create `notes/` if needed, then create `notes/lab33-props-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 33 — Props Sketch

## Reference

| Prop | Example |
| --- | --- |
| customerId | CUS-1001 |
| name | Amina Khan |
| status | ACTIVE |
| onSelect | () => void |

## Step 2 — Types

Write TypeScript-ish types: `status: 'ACTIVE' | 'SUSPENDED' | ...`.

## Step 3 — Children?

Decide whether `CustomerCard` takes `children` or only props — one sentence.

## Step 4 — Anti-pattern

Note: do not pass the entire global store as one mega-prop.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Props table with Amina/Ravi examples and a status union type in `notes/lab33-props-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab33-props-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 33 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab33-props-sketch.md`
- [ ] Both customers exemplified
- [ ] Status union drafted
- [ ] Mega-prop anti-pattern noted

