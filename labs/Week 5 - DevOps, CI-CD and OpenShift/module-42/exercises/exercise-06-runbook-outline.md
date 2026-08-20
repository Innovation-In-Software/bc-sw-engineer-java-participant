# Exercise 6 — Outline Deployment Runbook

## Activity card

| | |
| --- | --- |
| **Time** | 8–10 minutes |
| **Checkpoint** | **D** (after slides 85–87) |
| **Deliverable** | `notes/lab42-runbook-outline.md` |
| **Fixtures** | CUS-1001 list smoke · Lab 41 image `crm-api:lab41` · no Secret values |

### What you will learn

Outline apply, wait, smoke, rollback commands for peers.

### Enterprise context

Hard gate: peer can deploy from runbook without verbal help.

### Predict

Which namespace and Ingress host go in the runbook?

### Debug

Terraform/Ansible for cluster now — wrong lab?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Vague 'kubectl apply somehow' | Exact listed `-f` files (not `k8s/`), `-n crm-training`, rollout status |
| Secrets in runbook screenshots | Redact tokens/passwords |

**Module 42** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab42-runbook-outline.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — Outline Deployment Runbook

## Step 1 — Headings

Prereqs, apply order, verify probes, smoke CRM, rollback, contacts.

## Step 2 — Apply order

Propose order: ConfigMap → Secret (out-of-band, never apply `secret.example.yaml`) → Deployment → Service → Ingress.

## Step 3 — Safety

Add “stop before destructive actions; instructor approval” note.

## Step 4 — Scope

Mark outline as pre-lab; full apply/smoke is Lab 42.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-runbook-outline.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — Outline Deployment Runbook

## Step 1 — Headings

Prereqs, apply order, verify probes, smoke CRM, rollback, contacts.

## Step 2 — Apply order

Propose order: ConfigMap → Secret (out-of-band, never apply `secret.example.yaml`) → Deployment → Service → Ingress.

## Step 3 — Safety

Add “stop before destructive actions; instructor approval” note.

## Step 4 — Scope

Mark outline as pre-lab; full apply/smoke is Lab 42.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Deployment runbook outline ready for Lab 42 in `notes/lab42-runbook-outline.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-runbook-outline.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 42 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab42-runbook-outline.md`
- [ ] Headings complete
- [ ] Apply order stated
- [ ] Pre-lab scope marked

