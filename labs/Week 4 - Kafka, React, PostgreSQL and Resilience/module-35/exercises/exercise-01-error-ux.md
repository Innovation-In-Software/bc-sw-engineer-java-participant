# Exercise 4 — Error UX Copy

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 131–133) |
| **Deliverable** | `notes/lab35-error-ux.md` |
| **Fixtures** | CUS-1001 / CUS-1002 · `X-Correlation-Id: lab-request-001` |

### What you will learn

Write user-facing copy for network, 400, 500, and abort cases.

### Enterprise context

CRM must not show raw stack traces; map ApiError to honest UX.

### Predict

Should AbortError show a red toast?

### Debug

Treating all failures as 'try again' — what about 400 field errors?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Abort as failure | Ignore AbortError in UI toasts |
| Leaking server internals | Show safe message + correlation id optionally |

**Module 35** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab35-error-ux.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 35 — Error UX Copy

## Step 1 — 404

Message when `CUS-9999` not found.

## Step 2 — Network

Message when API unreachable.

## Step 3 — 400

Message when name validation fails.

## Step 4 — Logging

Dev console may show correlation id; users see plain language only.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-35-exercises/`, create `notes/` if needed, then create `notes/lab35-error-ux.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 35 — Error UX Copy

## Step 1 — 404

Message when `CUS-9999` not found.

## Step 2 — Network

Message when API unreachable.

## Step 3 — 400

Message when name validation fails.

## Step 4 — Logging

Dev console may show correlation id; users see plain language only.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Three user messages plus logging vs UX boundary in `notes/lab35-error-ux.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab35-error-ux.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 35 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab35-error-ux.md`
- [ ] 404/network/400 messages
- [ ] Correlation stays in logs note
- [ ] No stack traces in UI copy

