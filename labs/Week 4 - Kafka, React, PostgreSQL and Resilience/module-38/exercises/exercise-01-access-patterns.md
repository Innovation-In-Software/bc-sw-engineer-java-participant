# Exercise 1 — Access Patterns

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 183–193) |
| **Deliverable** | `notes/lab38-perf.md` |
| **Fixtures** | Preserve CUS-1001 / CUS-1002 · Lab 37 schema |

### What you will learn

List CRM lookups: by email, status, created date, customer→account join.

### Enterprise context

Lab 39 APIs will hit these patterns — tune what you will actually query.

### Predict

Which pattern is hottest for login/email lookup?

### Debug

Indexing every column — write cost risk?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Skipping Lab 37 schema | Need CUSTOMER/ACCOUNT columns from Lab 37 |
| Only thinking SELECT * | Name concrete filters and join keys |

**Module 38** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-38-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab38-perf.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 38 — Access Patterns

## Step 1 — Patterns

By customer_id (`CUS-1001`), by status, by created_at range, accounts by customer_id.

## Step 2 — Hot path

Mark lookup by customer_id as the hottest path.

## Step 3 — Anti-pattern

`SELECT *` without WHERE on huge tables — avoid in app code.

## Step 4 — Notes

Save `notes/lab38-perf.md`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-38-exercises/`, create `notes/` if needed, then create `notes/lab38-perf.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 38 — Access Patterns

## Step 1 — Patterns

By customer_id (`CUS-1001`), by status, by created_at range, accounts by customer_id.

## Step 2 — Hot path

Mark lookup by customer_id as the hottest path.

## Step 3 — Anti-pattern

`SELECT *` without WHERE on huge tables — avoid in app code.

## Step 4 — Notes

Save `notes/lab38-perf.md`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Access-pattern list with a named hot path in `notes/lab38-perf.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab38-perf.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 38 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab38-perf.md`
- [ ] ≥3 patterns
- [ ] Hot path identified
- [ ] SELECT * warning

