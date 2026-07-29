# Exercise 4 — Clear MDC Finally Drill

**Module 20** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab20-mdc-clear.md` — document why uncleared MDC corrupts the next CRM request on a thread.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-20-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-clear-mdc-finally.md` (this file in the course repo) |
| Your notes file | `notes/lab20-mdc-clear.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 20 — Clear MDC Finally Drill

## Step 1 — Bug story

Request A sets lab-request-001; without clear, request B logs wrong correlation.

## Step 2 — Fix

Filter/interceptor finally clears MDC.

## Step 3 — Test idea

Later IT: assert MDC empty after request (conceptual).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-20-exercises/`, create `notes/` if needed, then create `notes/lab20-mdc-clear.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 20 — Clear MDC Finally Drill

## Step 1 — Bug story

Request A sets lab-request-001; without clear, request B logs wrong correlation.

## Step 2 — Fix

Filter/interceptor finally clears MDC.

## Step 3 — Test idea

Later IT: assert MDC empty after request (conceptual).

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A clear MDC bug/fix story for thread reuse in `notes/lab20-mdc-clear.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab20-mdc-clear.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 20 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab20-mdc-clear.md`
- [ ] Bug story written
- [ ] Finally fix named
- [ ] Notes saved

