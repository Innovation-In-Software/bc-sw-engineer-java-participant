# Exercise 5 — Digest vs Latest

**Module 41** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab41-digest-discipline.md` — explain why `:latest` is insufficient for later k3s deploys.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-41-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-digest-discipline.md` (this file in the course repo) |
| Your notes file | `notes/lab41-digest-discipline.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 41 — Digest vs Latest

## Step 1 — Define

In two sentences, define image digest vs mutable tag.

## Step 2 — Check the reference

Lab 42/44 promote by digest; `:latest` can drift between staging and prod.

## Step 3 — CRM example

Write an example tag scheme: `crm-api:lab41` plus digest note placeholder `sha256:(your note here)`.

## Step 4 — Runbook heading

Add a `docs/container-runbook.md` heading list: build, inspect user, run, stop, digest capture.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-41-exercises/`, create `notes/` if needed, then create `notes/lab41-digest-discipline.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 41 — Digest vs Latest

## Step 1 — Define

In two sentences, define image digest vs mutable tag.

## Step 2 — Check the reference

Lab 42/44 promote by digest; `:latest` can drift between staging and prod.

## Step 3 — CRM example

Write an example tag scheme: `crm-api:lab41` plus digest note placeholder `sha256:_____`.

## Step 4 — Runbook heading

Add a `docs/container-runbook.md` heading list: build, inspect user, run, stop, digest capture.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Digest discipline and runbook headings documented in `notes/lab41-digest-discipline.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab41-digest-discipline.md` |
| Pushing only :latest | Record digest for promotion |
| Embedding .env in image | Inject at run/deploy time |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab41-digest-discipline.md`
- [ ] Digest vs tag explained
- [ ] Example tag scheme written
- [ ] Runbook headings listed

