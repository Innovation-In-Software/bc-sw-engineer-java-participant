# Exercise 2 — ER Sketch

**Module 37** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab37-er-sketch.md` — draw customer—account cardinality on paper/markdown.

## Deliverable

| Item | Path (under `examples/module-37-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-er-sketch.md` (this file in the course repo) |
| Your notes file | `notes/lab37-er-sketch.md` |

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

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab37-er-sketch.md` | Pass / Fail |
| 2 | 1:N stated | Pass / Fail |
| 3 | Diagram present | Pass / Fail |
| 4 | Delete policy justified | Pass / Fail |
