# Exercise 5 — Outline Rollback Runbook

**Module 44** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab44-rollback-runbook.md` — outline `docs/rollback-runbook.md` for digest Y under stress.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-44-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-rollback-runbook.md` (this file in the course repo) |
| Your notes file | `notes/lab44-rollback-runbook.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 44 — Outline Rollback Runbook

## Step 1 — Steps

Detect → decide → redeploy known-good digest → verify readiness → CRM smoke → comms update.

## Step 2 — Check the reference

Rollback names digest Y and a verification check—not “redeploy latest”.

## Step 3 — Timebox

Write a target recovery time placeholder (e.g. under N minutes) and who declares SEV.

## Step 4 — Kafka watch

Optional one-liner: watch consumer lag after rollback (detail in Lab 46).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-44-exercises/`, create `notes/` if needed, then create `notes/lab44-rollback-runbook.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 44 — Outline Rollback Runbook

## Step 1 — Steps

Detect → decide → redeploy known-good digest → verify readiness → CRM smoke → comms update.

## Step 2 — Check the reference

Rollback names digest Y and a verification check—not “redeploy latest”.

## Step 3 — Timebox

Write a target recovery time placeholder (e.g. under N minutes) and who declares SEV.

## Step 4 — Kafka watch

Optional one-liner: watch consumer lag after rollback (detail in Lab 46).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Rollback runbook outline with verification in `notes/lab44-rollback-runbook.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab44-rollback-runbook.md` |
| Rolling back to :latest | Pin known-good digest |
| Skipping smoke after undo | Re-check CUS-1001 path |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab44-rollback-runbook.md`
- [ ] Steps ordered
- [ ] Digest-based rollback stated
- [ ] Verification included

