# Exercise 2 — Repository Boundary

**Module 15** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab15-repo-boundary.md` — list what belongs in the repository versus the service.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-15-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-repo-boundary.md` (this file in the course repo) |
| Your notes file | `notes/lab15-repo-boundary.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 15 — Repository Boundary

## Step 1 — Repo owns

CRUD by id, existence checks, persistence mapping.

## Step 2 — Service owns

Transition matrix, notifier calls, domain exceptions.

## Step 3 — Anti-pattern

Anti-pattern: `repo.activateCustomer` hiding business rules.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-15-exercises/`, create `notes/` if needed, then create `notes/lab15-repo-boundary.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 15 — Repository Boundary

## Step 1 — Repo owns

CRUD by id, existence checks, persistence mapping.

## Step 2 — Service owns

Transition matrix, notifier calls, domain exceptions.

## Step 3 — Anti-pattern

Anti-pattern: `repo.activateCustomer` hiding business rules.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A crisp ownership list for repo vs service in `notes/lab15-repo-boundary.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab15-repo-boundary.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 15 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab15-repo-boundary.md`
- [ ] Repo responsibilities listed
- [ ] Service responsibilities listed
- [ ] Anti-pattern named

