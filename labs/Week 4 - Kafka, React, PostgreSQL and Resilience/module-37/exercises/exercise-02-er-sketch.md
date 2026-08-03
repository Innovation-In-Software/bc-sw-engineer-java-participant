# Exercise 2 — ER Sketch

## Activity card

| | |
| --- | --- |
| **Time** | 12–15 minutes |
| **Checkpoint** | **B** (after slides 168–171) |
| **Deliverable** | `notes/lab37-er-sketch.md` |
| **Fixtures** | CUS-1001 Amina ACTIVE · CUS-1002 Ravi PROSPECT |

### What you will learn

Sketch cardinalities: customer–account, customer–address, history.

### Enterprise context

Ravi PROSPECT may have no account; Amina ACTIVE has one.

### Predict

Can an ACCOUNT exist without a CUSTOMER?

### Debug

Using email as primary key — what breaks if email changes?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Missing cardinalities | Mark 1:N / 1:0..1 explicitly |
| Mutable business id as PK | Prefer surrogate PK + unique customer_code |

**Module 37** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-37-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab37-er-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 37 — ER Sketch

## Reference

| Relationship | Cardinality |
| --- | --- |
| customer → account | 1:N |
| account.customer_id | FK → customer.customer_id |
| customer.customer_id | PK / unique business key |

## Step 2 — Diagram

Mermaid or ASCII: Customer ||--o{ Account.

## Step 3 — Cascade policy

Decide ON DELETE behavior (RESTRICT vs CASCADE) and justify.

## Step 4 — Boundary

Do not create Kafka outbox tables in this module unless guide requires.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-37-exercises/`, create `notes/` if needed, then create `notes/lab37-er-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 37 — ER Sketch

## Reference

| Relationship | Cardinality |
| --- | --- |
| customer → account | 1:N |
| account.customer_id | FK → customer.customer_id |
| customer.customer_id | PK / unique business key |

## Step 2 — Diagram

Mermaid or ASCII: Customer ||--o{ Account.

## Step 3 — Cascade policy

Decide ON DELETE behavior (RESTRICT vs CASCADE) and justify.

## Step 4 — Boundary

Do not create Kafka outbox tables in this module unless guide requires.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

ER sketch with FK and delete policy decision in `notes/lab37-er-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab37-er-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 37 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab37-er-sketch.md`
- [ ] 1:N stated
- [ ] Diagram present
- [ ] Delete policy justified

