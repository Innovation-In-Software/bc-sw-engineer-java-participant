# Exercise 1 — Capstone Threat Checklist

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 89–96) |
| **Deliverable** | `notes/lab51-threat-checklist.md` |
| **Fixtures** | CUS-1001 smoke · 401/403 negatives · no secrets in Git |

### What you will learn

Threat-model CRM endpoints: authn/authz, secrets, actuators, CORS, logging.

### Enterprise context

Feature-complete is not release-complete without a threat checklist.

### Predict

Should actuators be public by default?

### Debug

Disabling security tests for green CI — gate fail?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Empty threat list | Cover API, UI, Kafka, secrets, admin |
| Committing .env | Never; use Actions secrets |

**Module 51** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
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

