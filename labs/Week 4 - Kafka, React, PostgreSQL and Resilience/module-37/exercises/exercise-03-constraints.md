# Exercise 3 — Constraints Checklist

**Module 37** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab37-constraints.md` — list PK/UK/FK/CHECK constraints before writing DDL.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-37-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-constraints.md` (this file in the course repo) |
| Your notes file | `notes/lab37-constraints.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 37 — Constraints Checklist

## Step 1 — PK/UK

PK on customer_id; UNIQUE on account_number.

## Step 2 — CHECK

status IN ('ACTIVE','SUSPENDED',...).

## Step 3 — NOT NULL

full_name and status NOT NULL.

## Step 4 — SQLSTATE awareness

Note unique violations → SQLSTATE 23505 (for later labs).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-37-exercises/`, create `notes/` if needed, then create `notes/lab37-constraints.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 37 — Constraints Checklist

## Step 1 — PK/UK

PK on customer_id; UNIQUE on account_number.

## Step 2 — CHECK

status IN ('ACTIVE','SUSPENDED',...).

## Step 3 — NOT NULL

full_name and status NOT NULL.

## Step 4 — SQLSTATE awareness

Note unique violations → SQLSTATE 23505 (for later labs).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Constraint checklist including a CHECK for status in `notes/lab37-constraints.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab37-constraints.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 37 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab37-constraints.md`
- [ ] PK/UK listed
- [ ] CHECK drafted
- [ ] 23505 noted

