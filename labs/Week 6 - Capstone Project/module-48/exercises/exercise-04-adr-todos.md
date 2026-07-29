# Exercise 4 — Fill ADR Topic TODOs

**Module 48** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab48-adr-todos.md` — complete an ADR shortlist with blanks for status/owners.

## Deliverable

| Item | Path (under `examples/module-48-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-adr-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab48-adr-todos.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-48-exercises/`, create `notes/` if needed, then create `notes/lab48-adr-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 48 — Fill ADR Topic TODOs

## Step 1 — Template

For each topic fill:
```
ADR title: _____
Status: proposed
Decision needed by: _____
Options (A/B): _____
Owner: _____
```
Topics: API style, Kafka event versioning, authn/z approach, DB migration strategy, deploy target (k3s).

## Step 2 — Fill three

Fully fill three ADR stubs; leave two as title-only for Lab 48.

## Step 3 — Consequence reminder

Add a line under each: “Consequences must be written in Lab 48.”

## Step 4 — No code

Do not implement the decisions now.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

ADR shortlist with three filled stubs in `notes/lab48-adr-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab48-adr-todos.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 48 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab48-adr-todos.md` | Pass / Fail |
| 2 | Five topics listed | Pass / Fail |
| 3 | Three stubs filled | Pass / Fail |
| 4 | No implementation attempted | Pass / Fail |
