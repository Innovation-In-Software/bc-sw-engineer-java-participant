# Exercise 4 — Flyway Plan

**Module 39** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab39-flyway-plan.md` — outline Flyway scripts that match the CRM schema.

## Deliverable

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-flyway-plan.md` (this file in the course repo) |
| Your notes file | `notes/lab39-flyway-plan.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-39-exercises/`, create `notes/` if needed, then create `notes/lab39-flyway-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 39 — Flyway Plan

## Step 1 — Version file

Name idea: `V1__crm_schema.sql` under `db/migration`.

## Step 2 — Content

Include customer + account DDL from Lab 37 design.

## Step 3 — Why Flyway

One sentence: schema changes are versioned and repeatable across machines.

## Step 4 — Anti-pattern

Avoid relying on `spring.jpa.hibernate.ddl-auto=create-drop` for shared envs.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Flyway file plan with ddl-auto warning in `notes/lab39-flyway-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab39-flyway-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 39 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab39-flyway-plan.md` | Pass / Fail |
| 2 | V1 filename stated | Pass / Fail |
| 3 | Tables included | Pass / Fail |
| 4 | ddl-auto warning written | Pass / Fail |
