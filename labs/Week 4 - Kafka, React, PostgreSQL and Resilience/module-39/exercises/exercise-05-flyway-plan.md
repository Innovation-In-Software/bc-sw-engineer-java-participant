# Exercise 4 — Flyway Plan

**Module 39** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Outline Flyway scripts that match the CRM schema.

## Steps

### Step 1 — Version file

Name idea: `V1__crm_schema.sql` under `db/migration`.

### Step 2 — Content

Include customer + account DDL from Lab 37 design.

### Step 3 — Why Flyway

One sentence: schema changes are versioned and repeatable across machines.

### Step 4 — Anti-pattern

Avoid relying on `spring.jpa.hibernate.ddl-auto=create-drop` for shared envs.

## Expected result

Flyway file plan with ddl-auto warning.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | V1 filename stated | Pass / Fail |
| 2 | Tables included | Pass / Fail |
| 3 | ddl-auto warning written | Pass / Fail |
