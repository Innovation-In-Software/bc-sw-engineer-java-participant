# Exercise 3 — Event Handler Map

**Module 34** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab34-event-handler-map.md` — document which handler updates which piece of CRM UI state.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-34-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-event-handler-map.md` (this file in the course repo) |
| Your notes file | `notes/lab34-event-handler-map.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 34 — Event Handler Map

## Step 1 — Table

Columns: Event, Handler, State updated.

## Step 2 — Rows

Include name onChange, status onChange, form onSubmit, row onClick → select Amina.

## Step 3 — Derived

Note `isValid` is derived, not stored, if possible.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-34-exercises/`, create `notes/` if needed, then create `notes/lab34-event-handler-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 34 — Event Handler Map

## Step 1 — Table

Columns: Event, Handler, State updated.

## Step 2 — Rows

Include name onChange, status onChange, form onSubmit, row onClick → select Amina.

## Step 3 — Derived

Note `isValid` is derived, not stored, if possible.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Handler map covering list selection and form edits in `notes/lab34-event-handler-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab34-event-handler-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 34 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab34-event-handler-map.md`
- [ ] ≥4 event rows
- [ ] Select-Amina row included
- [ ] Derived state note

