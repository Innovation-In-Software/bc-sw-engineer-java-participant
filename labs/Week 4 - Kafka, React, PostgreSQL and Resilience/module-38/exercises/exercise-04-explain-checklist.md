# Exercise 3 — EXPLAIN Checklist

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 194–197) |
| **Deliverable** | `notes/lab38-explain-checklist.md` |
| **Fixtures** | Preserve CUS-1001 / CUS-1002 · Lab 37 schema |

### What you will learn

Checklist for reading PostgreSQL EXPLAIN: Seq Scan, Index Scan, buffers, rows.

### Enterprise context

No tune without a plan — record before/after.

### Predict

Seq Scan on email equality with unique index — what to check?

### Debug

Stale statistics — what do you run?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Reading estimated-only forever | Use EXPLAIN (ANALYZE, BUFFERS) in lab |
| Different binds each run | Fix literals/binds in the report |

**Module 38** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-38-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab38-explain-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 38 — EXPLAIN Checklist

## Step 1 — Command

Write the command you will use: `EXPLAIN (ANALYZE, BUFFERS) <sql>;`.

## Step 2 — Look for

Seq Scan vs Index Scan, rows estimates, buffers.

## Step 3 — Success signal

Index Scan on customer_id for Amina lookup is a good sign.

## Step 4 — Analyze

Note `ANALYZE customer;` updates stats (PostgreSQL), not DBMS_STATS.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-38-exercises/`, create `notes/` if needed, then create `notes/lab38-explain-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 38 — EXPLAIN Checklist

## Step 1 — Command

Write the command you will use: `EXPLAIN (ANALYZE, BUFFERS) <sql>;`.

## Step 2 — Look for

Seq Scan vs Index Scan, rows estimates, buffers.

## Step 3 — Success signal

Index Scan on customer_id for Amina lookup is a good sign.

## Step 4 — Analyze

Note `ANALYZE customer;` updates stats (PostgreSQL), not DBMS_STATS.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

EXPLAIN checklist with PostgreSQL-native commands in `notes/lab38-explain-checklist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab38-explain-checklist.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 38 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab38-explain-checklist.md`
- [ ] EXPLAIN command written
- [ ] Scan types named
- [ ] ANALYZE noted

