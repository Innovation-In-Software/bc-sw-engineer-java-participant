# Exercise 2 — Plan Dependency-Check Gate

**Module 40** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab40-dependency-check-plan.md` — draft how Dependency-Check will run under JDK 21 / Maven without claiming a finished lab.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-40-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-dependency-check-plan.md` (this file in the course repo) |
| Your notes file | `notes/lab40-dependency-check-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 40 — Plan Dependency-Check Gate

## Step 1 — Profile sketch

Write a bullet plan for a Maven profile `-Psecurity-scan`: plugin goal, HTML+JSON reports, and a CVSS fail threshold placeholder.

## Step 2 — Check the reference

Confirm JDK 21 + Maven Wrapper habits: `./mvnw -B -Psecurity-scan dependency-check:check` from the CRM module root.

## Step 3 — Suppression policy draft

Write three required fields for any suppression: CVE id, owner, expiry date. State that silent suppressions fail the gate.

## Step 4 — Folder prep

Create note paths for sanitized HTML/JSON under `notes/screenshots/lab-40/` (do not run the full scan yet unless instructor says smoke only).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-40-exercises/`, create `notes/` if needed, then create `notes/lab40-dependency-check-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 40 — Plan Dependency-Check Gate

## Step 1 — Profile sketch

Write a bullet plan for a Maven profile `-Psecurity-scan`: plugin goal, HTML+JSON reports, and a CVSS fail threshold placeholder.

## Step 2 — Check the reference

Confirm JDK 21 + Maven Wrapper habits: `./mvnw -B -Psecurity-scan dependency-check:check` from the CRM module root.

## Step 3 — Suppression policy draft

Write three required fields for any suppression: CVE id, owner, expiry date. State that silent suppressions fail the gate.

## Step 4 — Folder prep

Create note paths for sanitized HTML/JSON under `notes/screenshots/lab-40/` (do not run the full scan yet unless instructor says smoke only).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A written scan-gate plan and suppression policy exist for Lab 40 in `notes/lab40-dependency-check-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab40-dependency-check-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 40 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab40-dependency-check-plan.md`
- [ ] Profile goal and report formats named
- [ ] CVSS threshold placeholder present
- [ ] Suppression fields include owner + expiry

