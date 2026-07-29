# Exercise 1 — Entity Mapping

**Module 39** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab39-jpa.md` — connect Lab 37 columns to JPA entity fields for Customer.

## Deliverable

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-entity-mapping.md` (this file in the course repo) |
| Your notes file | `notes/lab39-jpa.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-39-exercises/`, create `notes/` if needed, then create `notes/lab39-jpa.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 39 — Entity Mapping

## Reference

| Column | Java field / annotation idea |
| --- | --- |
| customer_id | @Id String customerId |
| full_name | String fullName + @Column |
| status | String or enum status |
| created_at | Instant createdAt |

## Step 2 — Account

Add account mapping: Long id, String customerId, @ManyToOne optional note.

## Step 3 — Naming

Decide snake_case columns vs camelCase fields strategy.

## Step 4 — Fixture

Entity instance mental model: customerId=`CUS-1001`, fullName=`Amina Khan`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Customer/account mapping notes with Amina fixture in `notes/lab39-jpa.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab39-jpa.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 39 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab39-jpa.md` | Pass / Fail |
| 2 | Customer map present | Pass / Fail |
| 3 | Account fields listed | Pass / Fail |
| 4 | Naming strategy chosen | Pass / Fail |
