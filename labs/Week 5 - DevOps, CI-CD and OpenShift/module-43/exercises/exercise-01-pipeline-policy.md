# Exercise 1 — Define Pipeline Triggers

**Module 43** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab43-pipeline-policy.md` — decide what runs on pull_request, main push, and version tags.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-43-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-pipeline-policy.md` (this file in the course repo) |
| Your notes file | `notes/lab43-pipeline-policy.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 43 — Define Pipeline Triggers

## Reference

| Event | Verify | Package JAR+SHA |
| --- | --- | --- |
| pull_request | Yes | No (typical) |
| push main | Yes | Yes |
| tag v* | Yes | Yes |

## Step 1 — Matrix

Fill a table: event → jobs (verify always; package on main/tags; deploy later/not yet).

## Step 2 — Check the reference

Leadership: PRs get fast feedback; main/tags get stronger gates; deploy creds never in Git.

## Step 3 — CRM identity

Note synthetic fixtures may appear only in test evidence (`CUS-1001`, `lab-request-001`).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-43-exercises/`, create `notes/` if needed, then create `notes/lab43-pipeline-policy.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 43 — Define Pipeline Triggers

## Reference

| Event | Verify | Package JAR+SHA |
| --- | --- | --- |
| pull_request | Yes | No (typical) |
| push main | Yes | Yes |
| tag v* | Yes | Yes |

## Step 1 — Matrix

Fill a table: event → jobs (verify always; package on main/tags; deploy later/not yet).

## Step 2 — Check the reference

Leadership: PRs get fast feedback; main/tags get stronger gates; deploy creds never in Git.

## Step 3 — CRM identity

Note synthetic fixtures may appear only in test evidence (`CUS-1001`, `lab-request-001`).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Trigger/job policy table documented in `notes/lab43-pipeline-policy.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab43-pipeline-policy.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 43 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab43-pipeline-policy.md`
- [ ] Three events covered
- [ ] Verify vs package split clear
- [ ] No secrets in policy

