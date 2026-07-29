# Exercise 3 — Sketch Findings Triage CSV

**Module 40** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab40-triage-csv-sketch.md` — practice classifying findings before the lab scanner output arrives.

## Deliverable

| Item | Path (under `examples/module-40-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-triage-csv-sketch.md` (this file in the course repo) |
| Your notes file | `notes/lab40-triage-csv-sketch.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-40-exercises/`, create `notes/` if needed, then create `notes/lab40-triage-csv-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 40 — Sketch Findings Triage CSV

## Reference

| Classification | Meaning |
| --- | --- |
| true_positive | Confirm and fix or accept with owner |
| false_positive | Document CPE/path mismatch |
| accepted_risk | Time-bounded, owned |
| fixed | Re-scan evidence required |

## Step 1 — Columns

Define CSV headers: finding_id, cve, cvss, dependency, path, classification, owner, due_date, notes.

## Step 2 — Check the reference

Classifications: `true_positive`, `false_positive`, `accepted_risk`, `fixed`. Accepted risk needs owner + expiry.

## Step 3 — Sample rows

Invent two synthetic rows (not real CVEs from production). One true_positive on a transitive JAR; one false_positive with rationale.

## Step 4 — CRM link

Note how a true_positive on the API layer could affect agents opening `CUS-1001` profiles—without claiming you are remediating today.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A triage CSV sketch with two synthetic rows and clear classifications in `notes/lab40-triage-csv-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab40-triage-csv-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 40 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab40-triage-csv-sketch.md` | Pass / Fail |
| 2 | Headers match the triage model | Pass / Fail |
| 3 | Two sample rows classified | Pass / Fail |
| 4 | Accepted-risk rules stated | Pass / Fail |
