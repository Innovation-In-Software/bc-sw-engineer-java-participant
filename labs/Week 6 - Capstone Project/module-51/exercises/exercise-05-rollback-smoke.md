# Exercise 5 — Rollback and Smoke Mini-Runbook

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 112–115) |
| **Deliverable** | `notes/lab51-rollback-smoke.md` |
| **Fixtures** | CUS-1001 smoke · 401/403 negatives · no secrets in Git |

### What you will learn

Outline smoke (auth + CUS-1001) and previous-digest rollback steps.

### Enterprise context

Release without rollback rehearsal is incomplete.

### Predict

What do you roll back to if only one revision exists?

### Debug

Rollback breaks DB — note?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No prior digest | Record known-good before promote |
| Smoke without 401/403 | Add negatives |

**Module 51** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab51-rollback-smoke.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 51 — Rollback and Smoke Mini-Runbook

## Step 1 — Steps

Detect → undo to known-good digest → wait Ready → smoke `CUS-1001` → record evidence.

## Step 2 — Check the reference

Rollback without verification is incomplete.

## Step 3 — Timebox

Add target duration placeholder and who calls the rollback.

## Step 4 — Link forward

Note this becomes part of Lab 52 evidence index.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-51-exercises/`, create `notes/` if needed, then create `notes/lab51-rollback-smoke.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 51 — Rollback and Smoke Mini-Runbook

## Step 1 — Steps

Detect → undo to known-good digest → wait Ready → smoke `CUS-1001` → record evidence.

## Step 2 — Check the reference

Rollback without verification is incomplete.

## Step 3 — Timebox

Add target duration placeholder and who calls the rollback.

## Step 4 — Link forward

Note this becomes part of Lab 52 evidence index.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Mini-runbook with verification and ownership in `notes/lab51-rollback-smoke.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab51-rollback-smoke.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 51 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab51-rollback-smoke.md`
- [ ] Steps include verify
- [ ] Owner/timebox present
- [ ] Lab 52 link noted

