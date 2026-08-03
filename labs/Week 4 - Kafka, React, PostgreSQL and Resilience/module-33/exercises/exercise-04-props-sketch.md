# Exercise 1 — Props Sketch

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 90–94) |
| **Deliverable** | `notes/lab33-props-sketch.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT |

### What you will learn

Define prop types for CustomerCard / StatusBadge / CustomerList.

### Enterprise context

Stable props shapes let Lab 34 lift state without rewrite.

### Predict

Should CustomerCard fetch its own data?

### Debug

Passing entire CRM store into every badge — coupling risk?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| any everywhere | Use Customer / CustomerStatus types |
| Children vs props unclear | Document when children are used |

**Module 33** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-33-exercises/`) |
| ---- | --------------------------------------------- |
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

