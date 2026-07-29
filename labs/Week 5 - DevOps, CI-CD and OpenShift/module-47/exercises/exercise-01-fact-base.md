# Exercise 1 — Build Shared Fact Base

**Module 47** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab47-fact-base.md` — assemble confirmed facts vs assumptions for CRM 1.4 stress.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-47-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-fact-base.md` (this file in the course repo) |
| Your notes file | `notes/lab47-fact-base.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 47 — Build Shared Fact Base

## Reference

| Audience | Needs |
| --- | --- |
| Responders | Symptoms, impact, next update time |
| Engineers | Change, evidence, rollback |
| Reviewers | PR verify + risk |
| Stakeholders | Business impact, ETA, no jargon pile-up |

## Step 1 — Lab scenario

Use: SEV-2, some agents HTTP 503 opening profiles, start time UTC placeholder, suspected `crm-api` 1.4.0, fixtures `CUS-1001`/`CUS-1002`, correlation `lab-request-001`.

## Step 2 — Check the reference

Separate confirmed / assumed / unknown in three lists.

## Step 3 — Mitigation stub

Note rollback toward 1.3.2 digest + watch readiness/Kafka lag (from prior labs).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-47-exercises/`, create `notes/` if needed, then create `notes/lab47-fact-base.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 47 — Build Shared Fact Base

## Reference

| Audience | Needs |
| --- | --- |
| Responders | Symptoms, impact, next update time |
| Engineers | Change, evidence, rollback |
| Reviewers | PR verify + risk |
| Stakeholders | Business impact, ETA, no jargon pile-up |

## Step 1 — Lab scenario

Use: SEV-2, some agents HTTP 503 opening profiles, start time UTC placeholder, suspected `crm-api` 1.4.0, fixtures `CUS-1001`/`CUS-1002`, correlation `lab-request-001`.

## Step 2 — Check the reference

Separate confirmed / assumed / unknown in three lists.

## Step 3 — Mitigation stub

Note rollback toward 1.3.2 digest + watch readiness/Kafka lag (from prior labs).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Fact base with confirmed/assumed/unknown split in `notes/lab47-fact-base.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab47-fact-base.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 47 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab47-fact-base.md`
- [ ] SEV and symptom stated
- [ ] Three lists present
- [ ] Fixtures consistent

