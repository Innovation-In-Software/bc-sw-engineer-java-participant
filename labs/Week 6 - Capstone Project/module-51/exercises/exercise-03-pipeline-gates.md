# Exercise 3 — Outline Delivery Gates

**Module 51** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab51-pipeline-gates.md` — list pipeline stages required for capstone delivery.

## Deliverable

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-pipeline-gates.md` (this file in the course repo) |
| Your notes file | `notes/lab51-pipeline-gates.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-51-exercises/`, create `notes/` if needed, then create `notes/lab51-pipeline-gates.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 51 — Outline Delivery Gates

## Step 1 — Stages

build, test, SAST/Dependency-Check, package image, (deploy as authorized).

## Step 2 — Check the reference

SAST gate must be able to fail the pipeline.

## Step 3 — Secrets

Checklist: no credentials in YAML; use Actions secrets.

## Step 4 — Artifact identity

Require digest/checksum recorded for promotion.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Delivery gate outline with failing SAST and digest identity in `notes/lab51-pipeline-gates.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab51-pipeline-gates.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 51 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab51-pipeline-gates.md` | Pass / Fail |
| 2 | Stages listed | Pass / Fail |
| 3 | Failing SAST required | Pass / Fail |
| 4 | Digest identity required | Pass / Fail |
