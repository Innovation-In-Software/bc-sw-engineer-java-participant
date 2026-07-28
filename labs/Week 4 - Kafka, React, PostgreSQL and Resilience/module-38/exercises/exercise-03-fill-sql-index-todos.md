# Exercise 4 — Fill SQL/Index TODOs

**Module 38** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Fill TODOs in baseline vs optimized SQL and index DDL (on paper).

## Steps

### Step 1 — Paste

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

### Step 2 — Fill

Suggested: `lower`, `'CUS-1001'`, `idx_customer_status`, `idx_account_customer`, `20`, `0`.

### Step 3 — Keyset note

TODO comment: `-- TODO: prefer keyset pagination (WHERE customer_id > :last) for deep pages`.

### Step 4 — No run

Do not execute against Postgres in pre-lab; Lab 38 will measure.

## Expected result

Filled baseline/optimized SQL and index names on paper.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Indexing every column 'just in case' | Index for measured access patterns |
| Using OFFSET for huge pages only | Consider keyset pagination |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Blanks filled | Pass / Fail |
| 2 | Keyset TODO present | Pass / Fail |
| 3 | No-run confirmation | Pass / Fail |
