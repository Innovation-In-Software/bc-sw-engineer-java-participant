# Exercise 4 — Circuit States

**Module 32** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab32-circuit-states.md` — document closed, open, and half-open for the Account Profile breaker.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-32-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-circuit-states.md` (this file in the course repo) |
| Your notes file | `notes/lab32-circuit-states.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 32 — Circuit States

## Step 1 — Closed

Normal calls flow; failures counted.

## Step 2 — Open

Calls fail fast / use fallback; Account Profile is not hammered.

## Step 3 — Half-open

Trial calls probe recovery; success → closed, failure → open.

## Step 4 — Draw

Sketch a tiny state diagram (boxes + arrows) in markdown.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-32-exercises/`, create `notes/` if needed, then create `notes/lab32-circuit-states.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 32 — Circuit States

## Step 1 — Closed

Normal calls flow; failures counted.

## Step 2 — Open

Calls fail fast / use fallback; Account Profile is not hammered.

## Step 3 — Half-open

Trial calls probe recovery; success → closed, failure → open.

## Step 4 — Draw

Sketch a tiny state diagram (boxes + arrows) in markdown.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

State descriptions plus a simple diagram in notes in `notes/lab32-circuit-states.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab32-circuit-states.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 32 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab32-circuit-states.md`
- [ ] All three states described
- [ ] Diagram present
- [ ] Fallback mentioned for open

