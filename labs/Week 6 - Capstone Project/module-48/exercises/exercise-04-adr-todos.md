# Exercise 4 — Fill ADR Topic TODOs

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 15–20) |
| **Deliverable** | `notes/lab48-adr-todos.md` |
| **Fixtures** | CUS-1001/CUS-1002 · lab-request-001 · no secrets in ADRs |

### What you will learn

List ADR topics: DB, messaging, consistency, auth, deploy—with status placeholders.

### Enterprise context

Conflicting silent tech choices fail review—accept one ADR and supersede others.

### Predict

Which five ADR themes does Lab 48 expect at minimum?

### Debug

Two accepted ADRs that contradict — fix?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No ADR status | Proposed/Accepted/Superseded |
| Secrets in ADR body | Never paste tokens/passwords |

**Module 48** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-48-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab48-adr-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 48 — Fill ADR Topic TODOs

## Step 1 — Template

For each topic fill:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-48-exercises/`, create `notes/` if needed, then create `notes/lab48-adr-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 48 — Fill ADR Topic TODOs

## Step 1 — Template

For each topic fill:
```
ADR title: _____
Status: proposed
Decision needed by: _____
Options (A/B): _____
Owner: _____
```
Topics: API style, Kafka event versioning, authn/z approach, DB migration strategy, deploy target (k3s).

## Step 2 — Fill three

Fully fill three ADR stubs; leave two as title-only for Lab 48.

## Step 3 — Consequence reminder

Add a line under each: “Consequences must be written in Lab 48.”

## Step 4 — No code

Do not implement the decisions now.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

ADR shortlist with three filled stubs in `notes/lab48-adr-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab48-adr-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 48 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab48-adr-todos.md`
- [ ] Five topics listed
- [ ] Three stubs filled
- [ ] No implementation attempted

