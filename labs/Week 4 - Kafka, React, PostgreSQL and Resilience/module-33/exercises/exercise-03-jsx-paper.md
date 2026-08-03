# Exercise 3 — JSX on Paper

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 87–89) |
| **Deliverable** | `notes/lab33-jsx-paper.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT |

### What you will learn

Sketch JSX for a CustomerCard row with Amina ACTIVE fixture.

### Enterprise context

JSX maps props to accessible UI before coding Vite.

### Predict

What goes in curly braces vs string attributes?

### Debug

Using array index as key in a list sketch — why reject?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| class vs className | JSX uses className |
| Missing key on list | key={customer.customerId} |

**Module 33** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-33-exercises/`) |
| ---- | --------------------------------------------- |
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

