# Exercise 5 — Alert from create_failure_total

**Module 21** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab21-alert-runbook.md` — write a mini runbook for a create_failure_total alert.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-21-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-alert-from-failure-total.md` (this file in the course repo) |
| Your notes file | `notes/lab21-alert-runbook.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 21 — Alert from create_failure_total

## Step 1 — Signal

Alert when create_failure_total rate exceeds threshold for N minutes.

## Step 2 — Triage

Check Actuator/health, then logs filtered by correlation examples.

## Step 3 — CRM check

Reproduce create for a PROSPECT-shaped payload (Ravi-like) in non-prod.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-21-exercises/`, create `notes/` if needed, then create `notes/lab21-alert-runbook.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 21 — Alert from create_failure_total

## Step 1 — Signal

Alert when create_failure_total rate exceeds threshold for N minutes.

## Step 2 — Triage

Check Actuator/health, then logs filtered by correlation examples.

## Step 3 — CRM check

Reproduce create for a PROSPECT-shaped payload (Ravi-like) in non-prod.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A short alert runbook tied to create_failure_total in `notes/lab21-alert-runbook.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab21-alert-runbook.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 21 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab21-alert-runbook.md`
- [ ] Signal defined
- [ ] Triage steps listed
- [ ] Notes saved

