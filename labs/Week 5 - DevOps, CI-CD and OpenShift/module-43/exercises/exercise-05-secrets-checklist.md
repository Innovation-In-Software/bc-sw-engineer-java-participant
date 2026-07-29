# Exercise 5 — Actions Secrets Checklist

**Module 43** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab43-secrets-checklist.md` — list what may live in Git vs Actions secrets vs local only.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-43-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-secrets-checklist.md` (this file in the course repo) |
| Your notes file | `notes/lab43-secrets-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 43 — Actions Secrets Checklist

## Step 1 — Sort

Sort: workflow YAML, README, registry password, kubeconfig, `.env`, scan reports.

## Step 2 — Check the reference

Only non-secret config in Git; credentials in Actions secrets/variables as instructed.

## Step 3 — Leak response

Write three steps if a secret is committed: rotate, purge history per policy, notify instructor.

## Step 4 — CRM note

Customer fixtures are not secrets—but real customer dumps are forbidden.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-43-exercises/`, create `notes/` if needed, then create `notes/lab43-secrets-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 43 — Actions Secrets Checklist

## Step 1 — Sort

Sort: workflow YAML, README, registry password, kubeconfig, `.env`, scan reports.

## Step 2 — Check the reference

Only non-secret config in Git; credentials in Actions secrets/variables as instructed.

## Step 3 — Leak response

Write three steps if a secret is committed: rotate, purge history per policy, notify instructor.

## Step 4 — CRM note

Customer fixtures are not secrets—but real customer dumps are forbidden.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Secrets checklist with leak response in `notes/lab43-secrets-checklist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab43-secrets-checklist.md` |
| Hardcoding tokens in ci.yml | Use Actions secrets |
| Skipping tests to go green | Fix or quarantine with policy |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab43-secrets-checklist.md`
- [ ] Items classified
- [ ] Leak response has three steps
- [ ] Fixture vs secret clarified

