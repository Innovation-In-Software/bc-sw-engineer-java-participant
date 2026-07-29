# Exercise 3 — Ansible Idempotence Notes

**Module 45** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab45-ansible-idempotence.md` — describe idempotent Ansible tasks for a CRM host sketch.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-45-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-ansible-idempotence.md` (this file in the course repo) |
| Your notes file | `notes/lab45-ansible-idempotence.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 45 — Ansible Idempotence Notes

## Step 1 — Modules

Name modules/handlers you expect (package, service, copy/template, handler restart).

## Step 2 — Check the reference

Second run should be no-change when authorized; prove with lint/syntax first.

## Step 3 — Ownership/modes

Note file ownership/modes matter for app config files.

## Step 4 — Inventory

Commit only `inventory.example.yml`—never real host credentials.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-45-exercises/`, create `notes/` if needed, then create `notes/lab45-ansible-idempotence.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 45 — Ansible Idempotence Notes

## Step 1 — Modules

Name modules/handlers you expect (package, service, copy/template, handler restart).

## Step 2 — Check the reference

Second run should be no-change when authorized; prove with lint/syntax first.

## Step 3 — Ownership/modes

Note file ownership/modes matter for app config files.

## Step 4 — Inventory

Commit only `inventory.example.yml`—never real host credentials.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Ansible idempotence and inventory hygiene notes in `notes/lab45-ansible-idempotence.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab45-ansible-idempotence.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 45 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab45-ansible-idempotence.md`
- [ ] Modules named
- [ ] Second-run expectation stated
- [ ] Example inventory only

