# Exercise 6 — Outline CI Runbook

**Module 43** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab43-ci-runbook-outline.md` — outline `docs/ci-runbook.md` so a peer can re-run a failed verify.

## Deliverable

| Item | Path (under `examples/module-43-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-06-ci-runbook-outline.md` (this file in the course repo) |
| Your notes file | `notes/lab43-ci-runbook-outline.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-43-exercises/`, create `notes/` if needed, then create `notes/lab43-ci-runbook-outline.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 43 — Outline CI Runbook

## Step 1 — Headings

Triggers, jobs, where reports live, how to re-run, what deploy steps exist (none yet).

## Step 2 — Re-run recipe

Bullet the GitHub UI/CLI re-run path and local `./mvnw -B clean verify` equivalent.

## Step 3 — Evidence index

Placeholder links for Surefire zip and JAR SHA artifact names.

## Step 4 — Scope

Mark as pre-lab outline for Lab 43.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

CI runbook outline with re-run recipe in `notes/lab43-ci-runbook-outline.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab43-ci-runbook-outline.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 43 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab43-ci-runbook-outline.md` | Pass / Fail |
| 2 | Headings complete | Pass / Fail |
| 3 | Re-run recipe present | Pass / Fail |
| 4 | Pre-lab marked | Pass / Fail |
