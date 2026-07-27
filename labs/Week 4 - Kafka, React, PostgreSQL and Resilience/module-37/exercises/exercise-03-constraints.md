# Exercise 3 — Constraints Checklist

**Module 37** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

List PK/UK/FK/CHECK constraints before writing DDL.

## Steps

### Step 1 — PK/UK

PK on customer_id; UNIQUE on account_number.

### Step 2 — CHECK

status IN ('ACTIVE','SUSPENDED',...).

### Step 3 — NOT NULL

full_name and status NOT NULL.

### Step 4 — SQLSTATE awareness

Note unique violations → SQLSTATE 23505 (for later labs).

## Expected result

Constraint checklist including a CHECK for status.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | PK/UK listed | Pass / Fail |
| 2 | CHECK drafted | Pass / Fail |
| 3 | 23505 noted | Pass / Fail |
