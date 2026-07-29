# Exercise 1 — Capstone Threat Checklist

**Module 51** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab51-threat-checklist.md` — list top threats for the CRM release candidate.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-threat-checklist.md` (this file in the course repo) |
| Your notes file | `notes/lab51-threat-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 51 — Capstone Threat Checklist

## Step 1 — Threats

Broken authz on customer IDs, secret leakage, vulnerable deps, mutable image tags, failed rollback.

## Step 2 — Check the reference

Lab 51 combines JWT/RBAC, pipeline SAST, immutable images, k3s, smoke/rollback.

## Step 3 — Fixtures

Negative tests should use synthetic IDs (`CUS-1001`)—never real customers.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-51-exercises/`, create `notes/` if needed, then create `notes/lab51-threat-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 51 — Capstone Threat Checklist

## Step 1 — Threats

Broken authz on customer IDs, secret leakage, vulnerable deps, mutable image tags, failed rollback.

## Step 2 — Check the reference

Lab 51 combines JWT/RBAC, pipeline SAST, immutable images, k3s, smoke/rollback.

## Step 3 — Fixtures

Negative tests should use synthetic IDs (`CUS-1001`)—never real customers.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Threat checklist aligned to Lab 51 themes in `notes/lab51-threat-checklist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab51-threat-checklist.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 51 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab51-threat-checklist.md`
- [ ] Five threats listed
- [ ] Synthetic fixtures noted
- [ ] Notes saved

