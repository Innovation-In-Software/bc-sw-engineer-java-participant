# Exercise 5 — AAA Service Tests Plan

**Module 17** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab17-aaa-plan.md` — outline three AAA service tests you will write in Lab 17.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-17-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-aaa-service-tests-plan.md` (this file in the course repo) |
| Your notes file | `notes/lab17-aaa-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 17 — AAA Service Tests Plan

## Step 1 — Happy path

AAA for activate Ravi PROSPECT → ACTIVE.

## Step 2 — Not found

AAA for CUS-9999 throws not found.

## Step 3 — Illegal

AAA for illegal transition on Amina ACTIVE.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-17-exercises/`, create `notes/` if needed, then create `notes/lab17-aaa-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 17 — AAA Service Tests Plan

## Step 1 — Happy path

AAA for activate Ravi PROSPECT → ACTIVE.

## Step 2 — Not found

AAA for CUS-9999 throws not found.

## Step 3 — Illegal

AAA for illegal transition on Amina ACTIVE.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Three AAA outlines covering happy/not-found/illegal in `notes/lab17-aaa-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab17-aaa-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 17 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab17-aaa-plan.md`
- [ ] Three AAA outlines
- [ ] Fixtures used
- [ ] Notes saved

