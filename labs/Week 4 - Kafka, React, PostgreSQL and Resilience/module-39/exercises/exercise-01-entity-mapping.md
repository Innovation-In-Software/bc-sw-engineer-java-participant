# Exercise 1 — Entity Mapping

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **A** (after slides 207–216) |
| **Deliverable** | `notes/lab39-jpa.md` |
| **Fixtures** | CUS-1001 / CUS-1002 · Lab 37/38 column names |

### What you will learn

Map CUSTOMER/ACCOUNT columns to JPA fields, types, and relationships.

### Enterprise context

Align with Lab 37/38 DDL — Hibernate validate, not create-drop.

### Predict

Should money be double or BigDecimal?

### Debug

Exposing entities as API responses — risk?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| ddl-auto=create forever | Flyway owns schema; validate in app |
| Skipping @Version | Plan optimistic lock field now |

**Module 39** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab39-jpa.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

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

Then follow **Steps** to create your own file.

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

Self-check before marking Pass:

- [ ] File exists at `notes/lab39-jpa.md`
- [ ] Customer map present
- [ ] Account fields listed
- [ ] Naming strategy chosen

