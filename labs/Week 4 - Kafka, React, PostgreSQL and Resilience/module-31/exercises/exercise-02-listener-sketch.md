# Exercise 2 — Listener Sketch

**Module 31** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab31-listener-sketch.md` — sketch two listeners (notifications vs audit) without compiling code.

## Deliverable

| Item | Path (under `examples/module-31-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-listener-sketch.md` (this file in the course repo) |
| Your notes file | `notes/lab31-listener-sketch.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-31-exercises/`, create `notes/` if needed, then create `notes/lab31-listener-sketch.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 31 — Listener Sketch

## Step 1 — Method outline

in this notes file.: `@KafkaListener(topics="crm.customer-events.v1", groupId="crm-notifications")` void onCustomerEvent(...).

## Step 2 — Second group

Sketch the audit listener with groupId `crm-audit` on the same topic.

## Step 3 — Payload type

Decide: start with `String`/`JsonNode` or a typed `CustomerEvent` DTO — pick one and justify in one line.

## Step 4 — Correlation

Note where you will log `correlationId` / `lab-request-001` for support.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Two sketched listeners with group IDs and a payload typing choice in `notes/lab31-listener-sketch.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab31-listener-sketch.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 31 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab31-listener-sketch.md` | Pass / Fail |
| 2 | Both groupIds present | Pass / Fail |
| 3 | Same topic for both | Pass / Fail |
| 4 | Typing + correlation notes written | Pass / Fail |
