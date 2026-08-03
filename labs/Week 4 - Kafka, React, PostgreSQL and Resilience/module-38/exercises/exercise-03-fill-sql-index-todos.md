# Exercise 4 — Fill SQL/Index TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 198–200) |
| **Deliverable** | `notes/lab38-sql-index-todos.md` |
| **Fixtures** | Preserve CUS-1001 / CUS-1002 · Lab 37 schema |

### What you will learn

Draft index DDL TODOs and baseline vs optimized query notes.

### Enterprise context

Scripts 01–05 structure the lab experiment cycle.

### Predict

What goes in report.md for each experiment id?

### Debug

Deep OFFSET for page 5000 — better alternative?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Forgetting keyset paging | Order by stable key + seek predicate |
| Wiping CUS-1001 on load | Preserve/re-seed fixtures after bulk load |

**Module 38** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-38-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab38-sql-index-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 38 — Fill SQL/Index TODOs

## Step 1 — Paste

Create `notes/lab38-todos.sql`:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-38-exercises/`, create `notes/` if needed, then create `notes/lab38-sql-index-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 38 — Fill SQL/Index TODOs

## Step 1 — Paste

Create `notes/lab38-todos.sql`:

```sql
-- baseline (avoid)
SELECT * FROM customer
WHERE _____ (full_name) = 'amina khan';

-- optimized lookup
SELECT customer_id, full_name, status
FROM customer
WHERE customer_id = _____;

-- supporting index ideas
CREATE INDEX _____ ON customer (status);
CREATE INDEX _____ ON account (customer_id);

-- paging sketch
SELECT customer_id, full_name
FROM customer
ORDER BY customer_id
LIMIT _____ OFFSET _____;
```

## Step 2 — Fill

Suggested: `lower`, `'CUS-1001'`, `idx_customer_status`, `idx_account_customer`, `20`, `0`.

## Step 3 — Keyset note

TODO comment: `-- TODO: prefer keyset pagination (WHERE customer_id > :last) for deep pages`.

## Step 4 — No run

Do not execute against Postgres in pre-lab; Lab 38 will measure.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled baseline/optimized SQL and index names on paper in `notes/lab38-sql-index-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab38-sql-index-todos.md` |
| Indexing every column 'just in case' | Index for measured access patterns |
| Using OFFSET for huge pages only | Consider keyset pagination |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab38-sql-index-todos.md`
- [ ] Blanks filled
- [ ] Keyset TODO present
- [ ] No-run confirmation

