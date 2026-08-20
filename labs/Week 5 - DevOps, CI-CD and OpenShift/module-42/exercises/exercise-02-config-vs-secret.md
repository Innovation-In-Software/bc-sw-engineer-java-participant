# Exercise 2 — ConfigMap vs Secret Split

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 61–73) |
| **Deliverable** | `notes/lab42-config-vs-secret.md` |
| **Fixtures** | CUS-1001 list smoke · Lab 41 image `crm-api:lab41` · no Secret values |

### What you will learn

Split non-secret URLs/flags into ConfigMap; passwords into Secret refs.

### Enterprise context

Never commit kubeconfig, tokens, or Secret data values.

### Predict

`CRM_DB_PASSWORD` — ConfigMap or Secret? `CRM_DB_HOST` — ConfigMap or Secret?

### Debug

`secret.example.yaml` applied (or committed with a real password) — gate fail?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| All env in ConfigMap | Move credentials to Secret |
| Committing kubeconfig | Keep out of Git; redact screenshots |

**Module 42** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab42-config-vs-secret.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — ConfigMap vs Secret Split

## Step 1 — Sort list

Sort: `CRM_DB_HOST`, `CRM_DB_NAME`, `CRM_DB_USER`, `CRM_DB_PASSWORD`, `SPRING_PROFILES_ACTIVE`, log level.

## Step 2 — Check the reference

Secret data is created out-of-band; Git only gets `secret.example.yaml` without values. Never `kubectl apply` the example file.

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

Sort: `CRM_DB_HOST`, `CRM_DB_NAME`, `CRM_DB_USER`, `CRM_DB_PASSWORD`, `SPRING_PROFILES_ACTIVE`, log level.

## Step 2 — Check the reference

Secret data is created out-of-band; Git only gets `secret.example.yaml` without values. Never `kubectl apply` the example file.

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

