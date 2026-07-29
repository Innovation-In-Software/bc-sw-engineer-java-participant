# Exercise 2 — Rewrite Unsafe Logs

**Module 20** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab20-safe-logs.md` — turn unsafe Customer logs into id+status+correlation lines.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-20-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-rewrite-unsafe-logs.md` (this file in the course repo) |
| Your notes file | `notes/lab20-safe-logs.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 20 — Rewrite Unsafe Logs

## Step 1 — Unsafe

Example bad: log full Customer toString including email/phone if present.

## Step 2 — Safe

Rewrite: customerId=CUS-1001 status=ACTIVE correlation=lab-request-001.

## Step 3 — Ravi line

Write a safe activate start line for CUS-1002 PROSPECT.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-20-exercises/`, create `notes/` if needed, then create `notes/lab20-safe-logs.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 20 — Rewrite Unsafe Logs

## Step 1 — Unsafe

Example bad: log full Customer toString including email/phone if present.

## Step 2 — Safe

Rewrite: customerId=CUS-1001 status=ACTIVE correlation=lab-request-001.

## Step 3 — Ravi line

Write a safe activate start line for CUS-1002 PROSPECT.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Before/after log lines using Northstar fixtures safely in `notes/lab20-safe-logs.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab20-safe-logs.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 20 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab20-safe-logs.md`
- [ ] Unsafe example named
- [ ] Safe Amina line written
- [ ] Safe Ravi line written

