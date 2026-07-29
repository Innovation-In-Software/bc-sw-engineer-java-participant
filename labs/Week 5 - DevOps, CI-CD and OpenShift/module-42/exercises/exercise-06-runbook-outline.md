# Exercise 6 — Outline Deployment Runbook

**Module 42** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab42-runbook-outline.md` — outline `docs/deployment-runbook.md` for a peer on shared k3s.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-06-runbook-outline.md` (this file in the course repo) |
| Your notes file | `notes/lab42-runbook-outline.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — Outline Deployment Runbook

## Step 1 — Headings

Prereqs, apply order, verify probes, smoke CRM, rollback, contacts.

## Step 2 — Apply order

Propose order: ConfigMap → Secret (out-of-band) → Deployment → Service → Ingress.

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

Propose order: ConfigMap → Secret (out-of-band) → Deployment → Service → Ingress.

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

