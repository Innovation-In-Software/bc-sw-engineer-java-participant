# Exercise 3 — Design Three Probes

**Module 42** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab42-probe-design.md` — differentiate startup, readiness, and liveness for CRM pods.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-42-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-probe-design.md` (this file in the course repo) |
| Your notes file | `notes/lab42-probe-design.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 42 — Design Three Probes

## Step 1 — Definitions

Write one sentence each: startup (slow boot), readiness (take traffic), liveness (restart if wedged).

## Step 2 — Check the reference

Do not point all three at the same shallow endpoint without thinking—readiness should reflect DB dependency where required.

## Step 3 — Paths

Propose Actuator paths/ports for each probe (placeholders OK).

## Step 4 — Failure story

Describe what agents see if readiness fails while liveness stays up.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-42-exercises/`, create `notes/` if needed, then create `notes/lab42-probe-design.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 42 — Design Three Probes

## Step 1 — Definitions

Write one sentence each: startup (slow boot), readiness (take traffic), liveness (restart if wedged).

## Step 2 — Check the reference

Do not point all three at the same shallow endpoint without thinking—readiness should reflect DB dependency where required.

## Step 3 — Paths

Propose Actuator paths/ports for each probe (placeholders OK).

## Step 4 — Failure story

Describe what agents see if readiness fails while liveness stays up.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Probe design notes with agent-visible failure story in `notes/lab42-probe-design.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab42-probe-design.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 42 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab42-probe-design.md`
- [ ] Three probes defined
- [ ] Paths proposed
- [ ] Readiness failure impact stated

