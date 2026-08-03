# Exercise 2 — Sargability

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **C** (after slides 198–200) |
| **Deliverable** | `notes/lab38-sargability.md` |
| **Fixtures** | Preserve CUS-1001 / CUS-1002 · Lab 37 schema |

### What you will learn

Contrast wrapping columns (TRUNC/UPPER) vs sargable range/equality predicates.

### Enterprise context

Non-sargable predicates disable index use and force scans.

### Predict

WHERE TRUNC(created_at) = CURRENT_DATE — rewrite how?

### Debug

WHERE LOWER(email) = ... without functional index — plan?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Function on column left side | Rewrite to range or store normalized column |
| Leading wildcard LIKE '%x' | Often not index-friendly |

**Module 38** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-38-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab38-sargability.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 38 — Sargability

## Reference

| Predicate | Sargable? |
| --- | --- |
| customer_id = 'CUS-1001' | Yes |
| status = 'ACTIVE' | Yes (with index) |
| LOWER(full_name) = 'amina khan' | Usually no on plain index |
| created_at >= TIMESTAMP '2026-01-01' | Yes (range) |
| date_trunc('day', created_at) = ... | Often weaker than range |

## Step 1 — Study table

Copy the reference table into notes.

## Step 2 — Rewrite

Rewrite a non-sargable name search idea into something index-friendlier (e.g. store lowercased column or use `ILIKE` carefully).

## Step 3 — Half-open range

Prefer `created_at >= d AND created_at < d+1` over wrapping columns in functions.

## Step 4 — Oracle note

If old materials say `TRUNC(created_at)`, map to PostgreSQL range/`date_trunc` contrast.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-38-exercises/`, create `notes/` if needed, then create `notes/lab38-sargability.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 38 — Sargability

## Reference

| Predicate | Sargable? |
| --- | --- |
| customer_id = 'CUS-1001' | Yes |
| status = 'ACTIVE' | Yes (with index) |
| LOWER(full_name) = 'amina khan' | Usually no on plain index |
| created_at >= TIMESTAMP '2026-01-01' | Yes (range) |
| date_trunc('day', created_at) = ... | Often weaker than range |

## Step 1 — Study table

Copy the reference table into notes.

## Step 2 — Rewrite

Rewrite a non-sargable name search idea into something index-friendlier (e.g. store lowercased column or use `ILIKE` carefully).

## Step 3 — Half-open range

Prefer `created_at >= d AND created_at < d+1` over wrapping columns in functions.

## Step 4 — Oracle note

If old materials say `TRUNC(created_at)`, map to PostgreSQL range/`date_trunc` contrast.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Predicate classifications plus one rewritten query idea in `notes/lab38-sargability.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab38-sargability.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 38 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab38-sargability.md`
- [ ] Table copied
- [ ] One rewrite written
- [ ] Range preference stated

