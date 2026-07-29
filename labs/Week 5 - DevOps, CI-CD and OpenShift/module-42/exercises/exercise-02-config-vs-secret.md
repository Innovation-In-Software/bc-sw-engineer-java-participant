# Exercise 2 — ConfigMap vs Secret Split

**Module 42** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab42-config-vs-secret.md` — classify CRM settings into ConfigMap vs Secret.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-config-vs-secret.md` (this file in the course repo) |
| Your notes file | `notes/lab42-config-vs-secret.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — ConfigMap vs Secret Split

## Step 1 — Sort list

Sort: datasource URL host, DB password, Kafka bootstrap, JWT issuer URI, log level, feature flags.

## Step 2 — Check the reference

Secret data is created out-of-band; Git only gets `secret.example.yaml` without values.

## Step 3 — CRM fixtures

Confirm `CUS-1001`/`CUS-1002` are app fixtures, not K8s config keys.

## Step 4 — Write table

Save a two-column table in notes.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-config-vs-secret.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — ConfigMap vs Secret Split

## Step 1 — Sort list

Sort: datasource URL host, DB password, Kafka bootstrap, JWT issuer URI, log level, feature flags.

## Step 2 — Check the reference

Secret data is created out-of-band; Git only gets `secret.example.yaml` without values.

## Step 3 — CRM fixtures

Confirm `CUS-1001`/`CUS-1002` are app fixtures, not K8s config keys.

## Step 4 — Write table

Save a two-column table in notes.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Config vs Secret classification table saved in `notes/lab42-config-vs-secret.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-config-vs-secret.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 42 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab42-config-vs-secret.md`
- [ ] Every setting classified
- [ ] secret.example pattern stated
- [ ] Fixtures not in ConfigMap

