# Exercise 3 — Outline Delivery Gates

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 97–104) |
| **Deliverable** | `notes/lab51-pipeline-gates.md` |
| **Fixtures** | CUS-1001 smoke · 401/403 negatives · no secrets in Git |

### What you will learn

Outline GitHub Actions gates: verify, SAST/deps, image build/scan, deploy.

### Enterprise context

Promote only through evidenced gates—not :latest folklore.

### Predict

Which job should fail the pipeline on critical CVEs?

### Debug

Pipeline green with skipped tests — acceptable?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Skip security job | Keep gate; triage exceptions |
| :latest only identity | Pin digest |

**Module 51** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab51-pipeline-gates.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

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

Then follow **Steps** to create your own file.

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

Self-check before marking Pass:

- [ ] File exists at `notes/lab51-pipeline-gates.md`
- [ ] Stages listed
- [ ] Failing SAST required
- [ ] Digest identity required

