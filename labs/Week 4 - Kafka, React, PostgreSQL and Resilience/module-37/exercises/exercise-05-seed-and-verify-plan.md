# Exercise 5 — Seed and Verify Plan

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 176–178) |
| **Deliverable** | `notes/lab37-seed-and-verify-plan.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT |

### What you will learn

Plan seeds for Amina/Ravi and negative verify cases.

### Enterprise context

History may record correlation lab-request-001.

### Predict

Which negative tests prove constraints work?

### Debug

Seed order: account before customer — fails how?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Same email twice | Expect UNIQUE violation |
| Orphan account FK | Insert account without customer — must fail |

**Module 37** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-37-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab37-seed-and-verify-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 37 — Seed and Verify Plan

## Step 1 — Seed order

Insert customers before accounts.

## Step 2 — Verify SQL

Write offline: `SELECT customer_id, full_name FROM customer ORDER BY customer_id;`

## Step 3 — Join check

Paper join: accounts for Amina by customer_id.

## Step 4 — No execute

Do not run against a live database in pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-37-exercises/`, create `notes/` if needed, then create `notes/lab37-seed-and-verify-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 37 — Seed and Verify Plan

## Step 1 — Seed order

Insert customers before accounts.

## Step 2 — Verify SQL

Write offline: `SELECT customer_id, full_name FROM customer ORDER BY customer_id;`

## Step 3 — Join check

Paper join: accounts for Amina by customer_id.

## Step 4 — No execute

Do not run against a live database in pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Ordered seed/verify plan with a SELECT written on paper in `notes/lab37-seed-and-verify-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab37-seed-and-verify-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 37 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab37-seed-and-verify-plan.md`
- [ ] Insert order correct
- [ ] Verify SELECT written
- [ ] No-execute confirmation

