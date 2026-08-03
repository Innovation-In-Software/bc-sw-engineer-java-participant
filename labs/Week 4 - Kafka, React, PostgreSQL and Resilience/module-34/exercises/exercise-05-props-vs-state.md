# Exercise 2 — Props vs State

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **C** (after slides 111–113) |
| **Deliverable** | `notes/lab34-state.md` |
| **Fixtures** | CUS-1001 Amina · CUS-1002 Ravi · in-memory only |

### What you will learn

Decide what stays props (Lab 33) vs what App owns as state.

### Enterprise context

StatusBadge stays props; customers list is lifted state.

### Predict

Can a child mutate a prop object in place safely?

### Debug

Duplicating customers in Card local state — sync bugs?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Props downward only | Callbacks upward for child→parent |
| Edit mutates prop | Clone via immutable update in App |

**Module 34** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-34-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab34-state.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 34 — Props vs State

## Step 1 — Scenario

Editing Amina (`CUS-1001`): name field, status dropdown, Save button.

## Step 2 — Classify

Mark each as prop or state: initialCustomer, draftName, draftStatus, isSaving, onSaved callback.

## Step 3 — Rule

Write: *state = data that changes over time because of user interaction in this component.*

## Step 4 — Notes

Save `notes/lab34-state.md`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-34-exercises/`, create `notes/` if needed, then create `notes/lab34-state.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 34 — Props vs State

## Step 1 — Scenario

Editing Amina (`CUS-1001`): name field, status dropdown, Save button.

## Step 2 — Classify

Mark each as prop or state: initialCustomer, draftName, draftStatus, isSaving, onSaved callback.

## Step 3 — Rule

Write: *state = data that changes over time because of user interaction in this component.*

## Step 4 — Notes

Save `notes/lab34-state.md`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Classification table for form fields with a clear rule sentence in `notes/lab34-state.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab34-state.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 34 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab34-state.md`
- [ ] Five items classified
- [ ] Rule sentence present
- [ ] Notes saved

