# Exercise 1 — Validation Messages

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **D** (after slides 114–115) |
| **Deliverable** | `notes/lab34-validation-messages.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · in-memory only |

### What you will learn

Plan field errors for empty name/status; accessible error text.

### Enterprise context

Client UX validation before Lab 35 server errors.

### Predict

Where should errors live in state?

### Debug

Only red borders, no text — RTL/a11y fail?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Validate only on blur forever | Also block invalid submit |
| Clearing errors on cancel | Reset errors with draft discard |

**Module 34** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-34-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab34-validation-messages.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 34 — Validation Messages

## Step 1 — Rules

Name required; status required; name min length 2.

## Step 2 — Messages

Draft three user-facing strings (no jargon).

## Step 3 — Timing

Choose: validate on blur vs on submit — pick one for Lab 34.

## Step 4 — Server later

Note Lab 35 will also show API 400 errors.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-34-exercises/`, create `notes/` if needed, then create `notes/lab34-validation-messages.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 34 — Validation Messages

## Step 1 — Rules

Name required; status required; name min length 2.

## Step 2 — Messages

Draft three user-facing strings (no jargon).

## Step 3 — Timing

Choose: validate on blur vs on submit — pick one for Lab 34.

## Step 4 — Server later

Note Lab 35 will also show API 400 errors.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Three messages plus a validation-timing decision in `notes/lab34-validation-messages.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab34-validation-messages.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 34 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab34-validation-messages.md`
- [ ] Three messages
- [ ] Timing chosen
- [ ] Lab 35 boundary noted

