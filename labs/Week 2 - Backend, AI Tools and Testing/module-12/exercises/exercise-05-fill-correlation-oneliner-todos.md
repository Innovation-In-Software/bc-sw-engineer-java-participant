# Exercise 5 — Fill Correlation One-Liner TODOs

**Module 12** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab12-correlation-todos.md` — complete fill-in blanks for correlation one-liners used during refactor notes.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-12-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-fill-correlation-oneliner-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab12-correlation-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 12 — Fill Correlation One-Liner TODOs

## Step 1 — Copy TODOs

Correlation id value: (your note here)
Log on activate entry: (your note here)
Log on activate success for Ravi: (your note here)
Never log field: (your note here)
Place correlation in: (your note here) (header/MDC — pick one for now)

## Step 2 — Fill blanks

Fill with `lab-request-001`, short log phrases, and a PII field you must not log (e.g. raw email if present later).

## Step 3 — One-liner rule

Write: *Every public service entry logs correlation once.*

## Step 4 — Self-check

Confirm the correlation blank is exactly lab-request-001.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-12-exercises/`, create `notes/` if needed, then create `notes/lab12-correlation-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 12 — Fill Correlation One-Liner TODOs

## Step 1 — Copy TODOs

Correlation id value: _____
Log on activate entry: _____
Log on activate success for Ravi: _____
Never log field: _____
Place correlation in: _____ (header/MDC — pick one for now)

## Step 2 — Fill blanks

Fill with `lab-request-001`, short log phrases, and a PII field you must not log (e.g. raw email if present later).

## Step 3 — One-liner rule

Write: *Every public service entry logs correlation once.*

## Step 4 — Self-check

Confirm the correlation blank is exactly lab-request-001.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled correlation TODOs ready for Lab 12 notes in `notes/lab12-correlation-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab12-correlation-todos.md` |
| Logging full payloads | Log ids + correlation only |
| Inventing a second correlation scheme | Stick to lab-request-001 for prep |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab12-correlation-todos.md`
- [ ] All _____ replaced
- [ ] lab-request-001 present
- [ ] PII exclusion named

