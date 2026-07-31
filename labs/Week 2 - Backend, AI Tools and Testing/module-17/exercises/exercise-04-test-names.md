# Exercise 1 — Expressive Test Names

**Module 17** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab17-test-names.md` — propose three method names that encode fixture and outcome.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-17-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-test-names.md` (this file in the course repo) |
| Your notes file | `notes/lab17-test-names.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 17 — Expressive Test Names

## Step 1 — Pattern

Use methodName_state_expectedOutcome style.

## Step 2 — Examples

Write names for Amina already ACTIVE reject, Ravi PROSPECT activate success, CUS-9999 not found.

## Step 3 — Anti-name

Reject names like `test1` / `testActivate`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-17-exercises/`, create `notes/` if needed, then create `notes/lab17-test-names.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 17 — Expressive Test Names

## Step 1 — Pattern

Use methodName_state_expectedOutcome style.

## Step 2 — Examples

Write names for Amina already ACTIVE reject, Ravi PROSPECT activate success, CUS-9999 not found.

## Step 3 — Anti-name

Reject names like `test1` / `testActivate`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Three expressive names plus an anti-pattern note in `notes/lab17-test-names.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab17-test-names.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 17 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab17-test-names.md`
- [ ] Three good names
- [ ] Fixtures reflected
- [ ] Anti-name rejected

