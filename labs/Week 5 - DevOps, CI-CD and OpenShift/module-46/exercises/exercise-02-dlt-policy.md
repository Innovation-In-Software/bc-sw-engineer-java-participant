# Exercise 2 — Draft DLT Policy

**Module 46** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab46-dlt-policy.md` — define retry bounds and dead-letter topic naming.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-46-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-dlt-policy.md` (this file in the course repo) |
| Your notes file | `notes/lab46-dlt-policy.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 46 — Draft DLT Policy

## Step 1 — Names

Primary topic example `crm.customer.events`; DLT `crm.customer.events.DLT`; group `crm-customer-projection-v1`.

## Step 2 — Check the reference

Use `DefaultErrorHandler` + `DeadLetterPublishingRecoverer` pattern (Spring Kafka).

## Step 3 — Headers

List headers to preserve: original topic, exception message class, correlation `lab-request-001`.

## Step 4 — PII rule

Prefer customer IDs in logs/metrics—not emails/names.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-46-exercises/`, create `notes/` if needed, then create `notes/lab46-dlt-policy.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 46 — Draft DLT Policy

## Step 1 — Names

Primary topic example `crm.customer.events`; DLT `crm.customer.events.DLT`; group `crm-customer-projection-v1`.

## Step 2 — Check the reference

Use `DefaultErrorHandler` + `DeadLetterPublishingRecoverer` pattern (Spring Kafka).

## Step 3 — Headers

List headers to preserve: original topic, exception message class, correlation `lab-request-001`.

## Step 4 — PII rule

Prefer customer IDs in logs/metrics—not emails/names.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

DLT policy with headers and PII rule in `notes/lab46-dlt-policy.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab46-dlt-policy.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 46 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab46-dlt-policy.md`
- [ ] Topic/DLT named
- [ ] Retry+DLT approach stated
- [ ] Correlation header included

