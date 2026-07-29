# Exercise 6 — Document End-to-End Data Flow

**Module 50** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab50-data-flow-note.md` — write a short UI→API→JPA→PostgreSQL flow for one action.

## Deliverable

| Item | Path (under `examples/module-50-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-06-data-flow-note.md` (this file in the course repo) |
| Your notes file | `notes/lab50-data-flow-note.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-50-exercises/`, create `notes/` if needed, then create `notes/lab50-data-flow-note.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 50 — Document End-to-End Data Flow

## Step 1 — Pick action

Add interaction on `CUS-1001` with correlation `lab-request-001`.

## Step 2 — Sequence

Numbered steps across frontend, controller, service, repository, DB row.

## Step 3 — Failure point

Mark where validation or DB failure surfaces in the UI.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

End-to-end data-flow note with failure surfacing in `notes/lab50-data-flow-note.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab50-data-flow-note.md` |
| Demo only happy path UI | Plan error/empty states |
| Manual SQL in prod | Use migrations |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab50-data-flow-note.md` | Pass / Fail |
| 2 | Sequence numbered | Pass / Fail |
| 3 | Failure surfacing marked | Pass / Fail |
| 4 | Notes saved | Pass / Fail |
