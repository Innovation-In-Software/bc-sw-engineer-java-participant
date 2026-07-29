# Exercise 3 — Error and DLT Notes

**Module 31** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab31-error-dlt-notes.md` — describe when a listener should retry vs send to DLT.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-31-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-error-dlt-notes.md` (this file in the course repo) |
| Your notes file | `notes/lab31-error-dlt-notes.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 31 — Error and DLT Notes

## Step 1 — Retryable

Example: transient network blip calling email API — retry.

## Step 2 — Non-retryable

Example: JSON missing `customerId` — DLT after limited attempts.

## Step 3 — Ops note

Write: support replays DLT after fixing the consumer, using correlation `lab-request-001`.

## Step 4 — No runtime

Confirm you will not publish to DLT from CLI in this pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-31-exercises/`, create `notes/` if needed, then create `notes/lab31-error-dlt-notes.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 31 — Error and DLT Notes

## Step 1 — Retryable

Example: transient network blip calling email API — retry.

## Step 2 — Non-retryable

Example: JSON missing `customerId` — DLT after limited attempts.

## Step 3 — Ops note

Write: support replays DLT after fixing the consumer, using correlation `lab-request-001`.

## Step 4 — No runtime

Confirm you will not publish to DLT from CLI in this pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Clear retry vs DLT decision notes for Lab 31 in `notes/lab31-error-dlt-notes.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab31-error-dlt-notes.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 31 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab31-error-dlt-notes.md`
- [ ] Retryable example
- [ ] Non-retryable example
- [ ] Replay/ops sentence

