# Exercise 1 — Classify Consumer Failures

**Module 46** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab46-failure-taxonomy.md` — categorize why CRM consumer processing fails.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-46-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-failure-taxonomy.md` (this file in the course repo) |
| Your notes file | `notes/lab46-failure-taxonomy.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 46 — Classify Consumer Failures

## Reference

| Failure | Typical action |
| --- | --- |
| Validation | DLT + fix publisher |
| Deserialization | DLT + schema/version check |
| Transient DB | Bounded retry then DLT |
| Poison forever-retry | Forbidden pattern |

## Step 1 — Categories

List: validation, deserialization, timeout, DB, authz—with one CRM example each.

## Step 2 — Check the reference

Poison messages must not block the partition forever while lag grows unnoticed.

## Step 3 — User impact

Map one failure to stale profile data for `CUS-1001` or stuck status for `CUS-1002`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-46-exercises/`, create `notes/` if needed, then create `notes/lab46-failure-taxonomy.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 46 — Classify Consumer Failures

## Reference

| Failure | Typical action |
| --- | --- |
| Validation | DLT + fix publisher |
| Deserialization | DLT + schema/version check |
| Transient DB | Bounded retry then DLT |
| Poison forever-retry | Forbidden pattern |

## Step 1 — Categories

List: validation, deserialization, timeout, DB, authz—with one CRM example each.

## Step 2 — Check the reference

Poison messages must not block the partition forever while lag grows unnoticed.

## Step 3 — User impact

Map one failure to stale profile data for `CUS-1001` or stuck status for `CUS-1002`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Failure taxonomy with CRM user impact in `notes/lab46-failure-taxonomy.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab46-failure-taxonomy.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 46 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab46-failure-taxonomy.md`
- [ ] Five categories listed
- [ ] User impact mapped
- [ ] Notes saved

