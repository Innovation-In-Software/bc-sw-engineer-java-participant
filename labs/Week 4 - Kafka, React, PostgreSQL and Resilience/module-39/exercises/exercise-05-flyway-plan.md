# Exercise 4 — Flyway Plan

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 225–230) |
| **Deliverable** | `notes/lab39-flyway-plan.md` |
| **Fixtures** | CUS-1001 / CUS-1002 · Lab 37/38 column names |

### What you will learn

Plan V1__crm_schema.sql aligned to Lab 37/38; no silent checksum hacks.

### Enterprise context

Migrations are the source of truth for CRM tables.

### Predict

Edited applied V1 checksum mismatch — correct fix?

### Debug

Mixing Flyway with ddl-auto=update — why avoid?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Repair as habit | Prefer new V2 migration |
| Oracle-only DDL as primary | PostgreSQL types/syntax for this lab |

**Module 39** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-39-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab39-flyway-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

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

Then follow **Steps** to create your own file.

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

Self-check before marking Pass:

- [ ] File exists at `notes/lab39-flyway-plan.md`
- [ ] V1 filename stated
- [ ] Tables included
- [ ] ddl-auto warning written

