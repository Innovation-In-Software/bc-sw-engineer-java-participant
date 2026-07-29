# Exercise 5 — Producer Checklist

**Module 30** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab30-producer-checklist.md` — list Lab 30 producer settings you will verify later (acks, idempotence, key).

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-30-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-producer-checklist.md` (this file in the course repo) |
| Your notes file | `notes/lab30-producer-checklist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 30 — Producer Checklist

## Step 1 — Settings list

Write a checklist: `acks=all`, idempotent producer, key = customerId, value = JSON envelope.

## Step 2 — Why acks=all

One sentence: wait for ISR ack before considering the CRM event durable.

## Step 3 — Idempotence

One sentence: broker dedupes producer retries so Amina is not double-created in the log.

## Step 4 — Out of scope today

Mark: *Do not run `kafka-console-producer` in this pre-lab.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-30-exercises/`, create `notes/` if needed, then create `notes/lab30-producer-checklist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 30 — Producer Checklist

## Step 1 — Settings list

Write a checklist: `acks=all`, idempotent producer, key = customerId, value = JSON envelope.

## Step 2 — Why acks=all

One sentence: wait for ISR ack before considering the CRM event durable.

## Step 3 — Idempotence

One sentence: broker dedupes producer retries so Amina is not double-created in the log.

## Step 4 — Out of scope today

Mark: *Do not run `kafka-console-producer` in this pre-lab.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A producer settings checklist ready for the timed lab path in `notes/lab30-producer-checklist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab30-producer-checklist.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 30 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab30-producer-checklist.md`
- [ ] acks + idempotence + key listed
- [ ] Two why-sentences written
- [ ] Explicit no-run note present

