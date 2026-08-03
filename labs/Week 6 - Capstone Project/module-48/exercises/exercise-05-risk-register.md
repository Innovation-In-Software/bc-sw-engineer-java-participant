# Exercise 5 — Outline Risk Register

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 21–30) |
| **Deliverable** | `notes/lab48-risk-register.md` |
| **Fixtures** | CUS-1001/CUS-1002 · lab-request-001 · no secrets in ADRs |

### What you will learn

Outline scored risks with triggers, mitigations, and contingencies.

### Enterprise context

Undocumented risks become defense failures—score likelihood×impact.

### Predict

What columns belong in a useful risk register?

### Debug

Risks listed with no mitigation — incomplete?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| No scores | Add L×I or High/Med/Low + rationale |
| Only technical risks | Include delivery risks too |

**Module 48** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-48-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab48-risk-register.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 48 — Outline Risk Register

## Step 1 — Columns

id, risk, likelihood, impact, mitigation, owner, due date, status.

## Step 2 — Starter risks

Examples: secret leak, Kafka lag during demo, incomplete JWT negative tests.

## Step 3 — Check the reference

Every risk needs owner + date—unowned risks fail professionalism.

## Step 4 — Scope

Outline for Lab 48 completion.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-48-exercises/`, create `notes/` if needed, then create `notes/lab48-risk-register.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 48 — Outline Risk Register

## Step 1 — Columns

id, risk, likelihood, impact, mitigation, owner, due date, status.

## Step 2 — Starter risks

Examples: secret leak, Kafka lag during demo, incomplete JWT negative tests.

## Step 3 — Check the reference

Every risk needs owner + date—unowned risks fail professionalism.

## Step 4 — Scope

Outline for Lab 48 completion.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Risk register outline with three starter risks in `notes/lab48-risk-register.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab48-risk-register.md` |
| NFRs like “secure” with no metric | Add measurable targets |
| Horizontal tasks as stories | Slice vertical user outcomes |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab48-risk-register.md`
- [ ] Columns defined
- [ ] Three risks with owners/dates
- [ ] Pre-lab marked

