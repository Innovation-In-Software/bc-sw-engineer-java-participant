# Exercise 5 — Outline DLT Replay Runbook

**Module 46** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab46-replay-runbook.md` — outline `docs/dlt-replay-runbook.md` with dry-run first.

## Deliverable

| Item | Path (under `examples/module-46-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-replay-runbook.md` (this file in the course repo) |
| Your notes file | `notes/lab46-replay-runbook.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-46-exercises/`, create `notes/` if needed, then create `notes/lab46-replay-runbook.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 46 — Outline DLT Replay Runbook

## Step 1 — Steps

Inspect DLT → classify → dry-run → limited replay → verify projection → stop criteria.

## Step 2 — Check the reference

Rate-limit replay; never replay blindly into prod topics.

## Step 3 — Evidence

Name what screenshots prove DLT landing and successful limited replay.

## Step 4 — Comms link

Note Lab 47 may communicate this class of incident—keep evidence shareable.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Replay runbook outline with dry-run in `notes/lab46-replay-runbook.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab46-replay-runbook.md` |
| Infinite retry | Bounded retry + DLT |
| Replaying without idempotency | Prove upsert/dedupe first |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab46-replay-runbook.md` | Pass / Fail |
| 2 | Steps include dry-run | Pass / Fail |
| 3 | Stop criteria present | Pass / Fail |
| 4 | Evidence named | Pass / Fail |
