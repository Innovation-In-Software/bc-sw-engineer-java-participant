# Exercise 2 — Plan Terraform Checks

**Module 45** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab45-terraform-checks.md` — list fmt/init/validate/plan expectations without applying.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-45-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-terraform-checks.md` (this file in the course repo) |
| Your notes file | `notes/lab45-terraform-checks.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 45 — Plan Terraform Checks

## Step 1 — Command order

`terraform fmt`, `init`, `validate`, `plan` (instructor-safe substitute if needed).

## Step 2 — Check the reference

Read the plan: create/destroy risk before any apply discussion.

## Step 3 — State narrative

Write three bullets on encrypted remote state + locking without committing backend credentials.

## Step 4 — Evidence path

Note sanitized plan snippets go under `notes/screenshots/lab-45/`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-45-exercises/`, create `notes/` if needed, then create `notes/lab45-terraform-checks.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 45 — Plan Terraform Checks

## Step 1 — Command order

`terraform fmt`, `init`, `validate`, `plan` (instructor-safe substitute if needed).

## Step 2 — Check the reference

Read the plan: create/destroy risk before any apply discussion.

## Step 3 — State narrative

Write three bullets on encrypted remote state + locking without committing backend credentials.

## Step 4 — Evidence path

Note sanitized plan snippets go under `notes/screenshots/lab-45/`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Terraform check plan and state narrative written in `notes/lab45-terraform-checks.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab45-terraform-checks.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 45 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab45-terraform-checks.md`
- [ ] Command order listed
- [ ] Plan reading required
- [ ] Remote state bullets present

