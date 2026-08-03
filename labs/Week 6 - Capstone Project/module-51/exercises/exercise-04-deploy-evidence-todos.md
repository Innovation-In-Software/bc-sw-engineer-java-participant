# Exercise 4 — Fill Deploy Evidence TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 108–111) |
| **Deliverable** | `notes/lab51-deploy-evidence-todos.md` |
| **Fixtures** | CUS-1001 smoke · 401/403 negatives · no secrets in Git |

### What you will learn

List digests, manifests, probes, and dry-run/apply evidence for k3s.

### Enterprise context

OpenShift Routes are comparison; cohort deploys on k3s/Ingress.

### Predict

What proves the running Pod matches the pipeline image?

### Debug

ImagePullBackOff — checklist?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No digest recorded | Capture sha256 from build |
| Terraform as graded path | Awareness only; execute GHA+k3s |

**Module 51** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-51-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab51-deploy-evidence-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 51 — Fill Deploy Evidence TODOs

## Step 1 — Template

Fill:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-51-exercises/`, create `notes/` if needed, then create `notes/lab51-deploy-evidence-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 51 — Fill Deploy Evidence TODOs

## Step 1 — Template

Fill:
```
Image digest: _____
Namespace: _____
Rollout status: _____
Smoke CUS-1001: _____
Correlation lab-request-001: _____
Rollback digest: _____
Residual risk owner: _____
```

## Step 2 — Paths

Map each blank to `notes/screenshots/lab-51/` filename ideas.

## Step 3 — Forbidden

Strike any plan to screenshot kubeconfig contents.

## Step 4 — Scope

Evidence plan only—execution is Lab 51.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Deploy evidence TODO sheet with safe screenshot plan in `notes/lab51-deploy-evidence-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab51-deploy-evidence-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 51 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab51-deploy-evidence-todos.md`
- [ ] Blanks filled or path-mapped
- [ ] No kubeconfig screenshots
- [ ] Pre-lab marked

