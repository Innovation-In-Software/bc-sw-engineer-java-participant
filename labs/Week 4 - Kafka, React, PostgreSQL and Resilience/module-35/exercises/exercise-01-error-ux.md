# Exercise 4 — Error UX Copy

**Module 35** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab35-error-ux.md` — draft user-facing messages for common CRM API failures.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-error-ux.md` (this file in the course repo) |
| Your notes file | `notes/lab35-error-ux.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 35 — Error UX Copy

## Step 1 — 404

Message when `CUS-9999` not found.

## Step 2 — Network

Message when API unreachable.

## Step 3 — 400

Message when name validation fails.

## Step 4 — Logging

Dev console may show correlation id; users see plain language only.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-35-exercises/`, create `notes/` if needed, then create `notes/lab35-error-ux.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 35 — Error UX Copy

## Step 1 — 404

Message when `CUS-9999` not found.

## Step 2 — Network

Message when API unreachable.

## Step 3 — 400

Message when name validation fails.

## Step 4 — Logging

Dev console may show correlation id; users see plain language only.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Three user messages plus logging vs UX boundary in `notes/lab35-error-ux.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab35-error-ux.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 35 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab35-error-ux.md`
- [ ] 404/network/400 messages
- [ ] Correlation stays in logs note
- [ ] No stack traces in UI copy

