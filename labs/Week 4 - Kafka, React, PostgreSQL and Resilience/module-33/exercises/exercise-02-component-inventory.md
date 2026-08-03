# Exercise 4 — Component Inventory

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **B** (after slides 83–86) |
| **Deliverable** | `notes/lab33-components.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT |

### What you will learn

Inventory StatusBadge, CustomerCard, CustomerList, form, empty/loading/error.

### Enterprise context

Dashboard must compose small props-driven pieces for Amina/Ravi.

### Predict

Which pieces are presentational vs future stateful parents?

### Debug

One giant App.tsx with all markup — what breaks Lab 34?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Forgot empty/error shells | Plan EmptyState / LoadingState / ErrorState |
| Color-only status | StatusBadge needs text + role, not color alone |

**Module 33** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-33-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab33-components.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 33 — Component Inventory

## Step 1 — Screen

Imagine a Customer list showing Amina and Ravi with status badges.

## Step 2 — Inventory

List ≥5 components: e.g. `App`, `CustomerList`, `CustomerCard`, `StatusBadge`, `PageHeader`.

## Step 3 — One responsibility

For each, write a ≤6-word responsibility.

## Step 4 — Notes


## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-33-exercises/`, create `notes/` if needed, then create `notes/lab33-components.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 33 — Component Inventory

## Step 1 — Screen

Imagine a Customer list showing Amina and Ravi with status badges.

## Step 2 — Inventory

List ≥5 components: e.g. `App`, `CustomerList`, `CustomerCard`, `StatusBadge`, `PageHeader`.

## Step 3 — One responsibility

For each, write a ≤6-word responsibility.

## Step 4 — Notes


## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A component inventory with single-responsibility blurbs in `notes/lab33-components.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab33-components.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 33 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab33-components.md`
- [ ] At least five components
- [ ] Responsibilities written
- [ ] Notes file saved

