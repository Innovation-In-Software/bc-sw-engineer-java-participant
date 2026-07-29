# Exercise 3 — Event Envelope Sketch

**Module 30** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab30-envelope-sketch.md` — draft paper JSON for Amina Created and Ravi StatusChanged events.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-30-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-envelope-sketch.md` (this file in the course repo) |
| Your notes file | `notes/lab30-envelope-sketch.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 30 — Event Envelope Sketch

## Step 1 — Headers

List envelope fields you will use: `eventType`, `eventVersion`, `occurredAt`, `correlationId`, `customerId`, `payload`.

## Step 2 — Amina sample

in this notes file., sketch `CustomerCreated` for `CUS-1001` Amina Khan with `correlationId=lab-request-001`.

## Step 3 — Ravi sample

Sketch `CustomerStatusChanged` for `CUS-1002` Ravi Singh (`ACTIVE` → `SUSPENDED` or similar).

## Step 4 — Compatibility note

Write one rule: consumers must ignore unknown payload fields (forward compatible).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-30-exercises/`, create `notes/` if needed, then create `notes/lab30-envelope-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 30 — Event Envelope Sketch

## Step 1 — Headers

List envelope fields you will use: `eventType`, `eventVersion`, `occurredAt`, `correlationId`, `customerId`, `payload`.

## Step 2 — Amina sample

in this notes file., sketch `CustomerCreated` for `CUS-1001` Amina Khan with `correlationId=lab-request-001`.

## Step 3 — Ravi sample

Sketch `CustomerStatusChanged` for `CUS-1002` Ravi Singh (`ACTIVE` → `SUSPENDED` or similar).

## Step 4 — Compatibility note

Write one rule: consumers must ignore unknown payload fields (forward compatible).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Two sketched envelopes using Northstar fixtures and shared field names in `notes/lab30-envelope-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab30-envelope-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 30 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab30-envelope-sketch.md`
- [ ] Both event types sketched
- [ ] customerId and correlationId present
- [ ] Forward-compat rule written

