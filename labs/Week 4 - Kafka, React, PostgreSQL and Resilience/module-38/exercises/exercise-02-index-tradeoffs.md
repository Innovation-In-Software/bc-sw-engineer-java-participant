# Exercise 5 — Index Tradeoffs

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 194–197) |
| **Deliverable** | `notes/lab38-index-tradeoffs.md` |
| **Fixtures** | Preserve CUS-1001 / CUS-1002 · Lab 37 schema |

### What you will learn

Weigh read speed vs write/storage cost for email and status indexes.

### Enterprise context

Earn every retained index with before/after evidence in the lab.

### Predict

Does a unique email index help inserts?

### Debug

Low-selectivity status index alone — when useless?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Index without measuring | Plan baseline EXPLAIN first |
| Oracle-only plan tools as primary | Use PostgreSQL EXPLAIN (ANALYZE, BUFFERS) |

**Module 38** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-38-exercises/`) |
| ---- | --------------------------------------------- |
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

