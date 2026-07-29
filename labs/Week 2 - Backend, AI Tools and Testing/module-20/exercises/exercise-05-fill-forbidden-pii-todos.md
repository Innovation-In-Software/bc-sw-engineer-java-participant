# Exercise 5 — Fill Forbidden PII Checklist TODOs

**Module 20** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab20-forbidden-pii-todos.md` — complete fill-in blanks for a forbidden PII logging checklist.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-20-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-fill-forbidden-pii-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab20-forbidden-pii-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 20 — Fill Forbidden PII Checklist TODOs

## Step 1 — Copy checklist

Forbidden: (your note here)
Forbidden: (your note here)
Forbidden: (your note here)
Allowed: customerId (your note here)
Allowed: correlation (your note here)
Clear MDC in finally? (your note here)

## Step 2 — Fill blanks

Fill three forbidden items (email, phone, raw card/national id ideas), CUS-1001/CUS-1002, lab-request-001, and yes for clear MDC.

## Step 3 — Finally note

Write the finally snippet conceptually: try { … } finally { MDC.clear(); }.

## Step 4 — Self-check

Confirm allowed ids are fixtures, not personal emails.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-20-exercises/`, create `notes/` if needed, then create `notes/lab20-forbidden-pii-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 20 — Fill Forbidden PII Checklist TODOs

## Step 1 — Copy checklist

Forbidden: _____
Forbidden: _____
Forbidden: _____
Allowed: customerId _____
Allowed: correlation _____
Clear MDC in finally? _____

## Step 2 — Fill blanks

Fill three forbidden items (email, phone, raw card/national id ideas), CUS-1001/CUS-1002, lab-request-001, and yes for clear MDC.

## Step 3 — Finally note

Write the finally snippet conceptually: try { … } finally { MDC.clear(); }.

## Step 4 — Self-check

Confirm allowed ids are fixtures, not personal emails.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled PII TODOs with MDC clear affirmed in `notes/lab20-forbidden-pii-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab20-forbidden-pii-todos.md` |
| Logging full request bodies | Log ids + outcome + correlation only |
| Forgetting MDC.clear | Always clear in finally |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab20-forbidden-pii-todos.md`
- [ ] All _____ replaced
- [ ] Three forbidden items
- [ ] MDC clear yes

