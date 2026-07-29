# Exercise 4 — Fill AI Prompt TODOs

**Module 45** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab45-ai-prompt-todos.md` — complete a bounded prompt template for scaffolding IaC.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-45-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-ai-prompt-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab45-ai-prompt-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 45 — Fill AI Prompt TODOs

## Step 1 — Template

Fill blanks:
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-45-exercises/`, create `notes/` if needed, then create `notes/lab45-ai-prompt-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 45 — Fill AI Prompt TODOs

## Step 1 — Template

Fill blanks:
```
Goal: _____
Environment: _____
Must include: _____
Must forbid: secrets, public DB, _____
Assumptions: _____
Output files: infra/terraform/*.tf, ansible/site.yml
```

## Step 2 — Harden

Add explicit “do not invent credentials” and “mark TODOs for human review”.

## Step 3 — Rejection plan

Write one AI suggestion you would reject (e.g. 0.0.0.0/0 on DB) and why.

## Step 4 — Scope

Prompt only—full generate/validate is Lab 45.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Constrained AI prompt with a planned rejection in `notes/lab45-ai-prompt-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab45-ai-prompt-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 45 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab45-ai-prompt-todos.md`
- [ ] Template filled
- [ ] Forbid list includes secrets/public DB
- [ ] Rejection example written

