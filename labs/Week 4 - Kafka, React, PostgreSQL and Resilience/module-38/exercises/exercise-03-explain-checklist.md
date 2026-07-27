# Exercise 3 — EXPLAIN Checklist

**Module 38** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Build a checklist for reading `EXPLAIN (ANALYZE, BUFFERS)` later in lab.

## Steps

### Step 1 — Command

Write the command you will use: `EXPLAIN (ANALYZE, BUFFERS) <sql>;`.

### Step 2 — Look for

Seq Scan vs Index Scan, rows estimates, buffers.

### Step 3 — Success signal

Index Scan on customer_id for Amina lookup is a good sign.

### Step 4 — Analyze

Note `ANALYZE customer;` updates stats (PostgreSQL), not DBMS_STATS.

## Expected result

EXPLAIN checklist with PostgreSQL-native commands.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | EXPLAIN command written | Pass / Fail |
| 2 | Scan types named | Pass / Fail |
| 3 | ANALYZE noted | Pass / Fail |
