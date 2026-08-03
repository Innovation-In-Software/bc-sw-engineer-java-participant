# Exercise 3 — Event Handler Map

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **B** (after slides 108–110) |
| **Deliverable** | `notes/lab34-event-handler-map.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · in-memory only |

### What you will learn

Map onChange / onSubmit / onEdit / onCancel to state updates.

### Enterprise context

Create vs edit modes must be mutually exclusive for CRM forms.

### Predict

What happens to draft on Cancel?

### Debug

Create and edit both true — what UI bug?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Mutating array with push | Use immutable [...prev, row] / map |
| Missing preventDefault | onSubmit must prevent full page reload |

**Module 34** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-34-exercises/`) |
| ---- | --------------------------------------------- |
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

