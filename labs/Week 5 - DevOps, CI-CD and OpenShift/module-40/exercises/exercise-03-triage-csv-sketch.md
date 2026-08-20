# Exercise 3 — Sketch Findings Triage CSV

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 19–22) |
| **Deliverable** | `notes/lab40-triage-csv-sketch.md` |
| **Fixtures** | Synthetic CUS-1001 / CUS-1002 only · no real PII |

### What you will learn

Sketch CSV columns used in Lab 40: finding_id, source, package_or_location, cve_or_rule, cvss, classification, owner, due_date, notes.

### Enterprise context

Every suppression needs policy justification + expiry.

### Predict

False positive CPE — what evidence do you keep?

### Debug

Accept forever with no owner — gate fail?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Empty classification column | Use `confirmed` / `false_positive` / `mitigated` / `accepted` / `needs_review` |
| Real customer PII in CSV | Synthetic fixtures only |

**Module 40** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-40-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab40-triage-csv-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 40 — Sketch Findings Triage CSV

## Reference

| Classification | Meaning |
| --- | --- |
| confirmed | Reachable/true issue — fix or accept with owner |
| false_positive | Document CPE/path mismatch |
| mitigated | Control in place; still record evidence |
| accepted | Time-bounded, owned, expiry required |
| needs_review | Not classified yet |

## Step 1 — Columns

Use these headers (same as Lab 40 GUIDE): `finding_id,source,package_or_location,cve_or_rule,cvss,classification,owner,due_date,notes`.

## Step 2 — Check the reference

Classifications: `confirmed`, `false_positive`, `mitigated`, `accepted`, `needs_review`. `accepted` needs owner + expiry.

## Step 3 — Sample rows

Invent two synthetic rows (not real production CVEs). One `confirmed` on a transitive JAR; one `false_positive` with rationale.

## Step 4 — CRM link

Note how a `confirmed` finding on the API layer could affect agents opening `CUS-1001` profiles—without claiming you are remediating today.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-40-exercises/`, create `notes/` if needed, then create `notes/lab40-triage-csv-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 40 — Sketch Findings Triage CSV

## Reference

| Classification | Meaning |
| --- | --- |
| confirmed | Reachable/true issue — fix or accept with owner |
| false_positive | Document CPE/path mismatch |
| mitigated | Control in place; still record evidence |
| accepted | Time-bounded, owned, expiry required |
| needs_review | Not classified yet |

## Step 1 — Columns

Use these headers (same as Lab 40 GUIDE): `finding_id,source,package_or_location,cve_or_rule,cvss,classification,owner,due_date,notes`.

## Step 2 — Check the reference

Classifications: `confirmed`, `false_positive`, `mitigated`, `accepted`, `needs_review`. `accepted` needs owner + expiry.

## Step 3 — Sample rows

Invent two synthetic rows (not real production CVEs). One `confirmed` on a transitive JAR; one `false_positive` with rationale.

## Step 4 — CRM link

Note how a `confirmed` finding on the API layer could affect agents opening `CUS-1001` profiles—without claiming you are remediating today.

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

Self-check before marking Pass:

- [ ] File exists at `notes/lab40-triage-csv-sketch.md`
- [ ] Headers match the Lab 40 GUIDE columns
- [ ] Two sample rows classified
- [ ] `accepted` rules (owner + expiry) stated

