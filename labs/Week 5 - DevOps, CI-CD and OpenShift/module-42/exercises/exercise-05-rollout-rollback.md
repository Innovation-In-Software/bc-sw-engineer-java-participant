# Exercise 5 — Rollout and Rollback Checklist

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 74–77) |
| **Deliverable** | `notes/lab42-rollout-rollback.md` |
| **Fixtures** | CUS-1001 list smoke · Lab 41 image `crm-api:lab41` · no Secret values |

### What you will learn

List rollout status checks and rollout undo rehearsal steps.

### Enterprise context

Verified rollback is part of the definition of done.

### Predict

Undo with only one revision — what happens?

### Debug

Starting Lab 43 deploy workflows early — park?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No second revision | Change image/annotation before undo demo |
| Skipping smoke after rollback | Re-check readiness + CUS-1001 |

**Module 42** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab42-rollout-rollback.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — Rollout and Rollback Checklist

## Step 1 — Rollout watch

List: `kubectl rollout status`, pod Ready, Host-header Ingress check on `:8088`, `GET /api/customers`.

## Step 2 — Check the reference

Rollback rehearses a bad image tag then `rollout undo` to `crm-api:lab41`.

## Step 3 — Evidence

Name screenshot folders under `notes/screenshots/lab-42/` for before/after.

## Step 4 — Correlation

Include header `lab-request-001` on smoke calls in the checklist.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-rollout-rollback.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — Rollout and Rollback Checklist

## Step 1 — Rollout watch

List: `kubectl rollout status`, pod Ready, Host-header Ingress check on `:8088`, `GET /api/customers`.

## Step 2 — Check the reference

Rollback rehearses a bad image tag then `rollout undo` to `crm-api:lab41`.

## Step 3 — Evidence

Name screenshot folders under `notes/screenshots/lab-42/` for before/after.

## Step 4 — Correlation

Include header `lab-request-001` on smoke calls in the checklist.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Rollout/rollback checklist with evidence paths in `notes/lab42-rollout-rollback.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-rollout-rollback.md` |
| Committing kubeconfig | Keep credentials out of Git |
| Skipping rollback rehearsal | Practice undo before claiming done |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab42-rollout-rollback.md`
- [ ] Rollout checks listed
- [ ] Undo rehearsal included
- [ ] Correlation header noted

