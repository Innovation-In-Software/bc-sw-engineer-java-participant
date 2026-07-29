# Exercise 4 — Fill Activate Interaction Sequence TODOs

**Module 18** · Hands-on exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab18-activate-interaction-todos.md` — complete fill-in blanks for the activate interaction sequence.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-18-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-fill-activate-interaction-todos.md` (this file in the course repo) |
| Your notes file | `notes/lab18-activate-interaction-todos.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 18 — Fill Activate Interaction Sequence TODOs

## Step 1 — Copy sequence

1) stub findById((your note here)) → ravi PROSPECT
2) call service.(your note here)(…)
3) verify repo.(your note here)(customer)
4) verify notifier.(your note here)(…)  // if present
5) assert status (your note here)
6) ArgumentCaptor previews status field (your note here)

## Step 2 — Fill blanks

Fill CUS-1002, activate, save/update, notifyActivated, ACTIVE, ACTIVE.

## Step 3 — Captor preview

One sentence: captors prove the saved Customer carried ACTIVE, not only that save was called.

## Step 4 — Self-check

Confirm step 1 id is CUS-1002 and final status ACTIVE.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-18-exercises/`, create `notes/` if needed, then create `notes/lab18-activate-interaction-todos.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 18 — Fill Activate Interaction Sequence TODOs

## Step 1 — Copy sequence

1) stub findById(_____) → ravi PROSPECT
2) call service._____(…)
3) verify repo._____(customer)
4) verify notifier._____(…)  // if present
5) assert status _____
6) ArgumentCaptor previews status field _____

## Step 2 — Fill blanks

Fill CUS-1002, activate, save/update, notifyActivated, ACTIVE, ACTIVE.

## Step 3 — Captor preview

One sentence: captors prove the saved Customer carried ACTIVE, not only that save was called.

## Step 4 — Self-check

Confirm step 1 id is CUS-1002 and final status ACTIVE.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Filled interaction TODOs with ArgumentCaptor preview note in `notes/lab18-activate-interaction-todos.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab18-activate-interaction-todos.md` |
| Only verify(save) without state check | Captor or assert on saved status |
| Stubbing unused methods | Stub findById only if activate needs it |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab18-activate-interaction-todos.md`
- [ ] All _____ replaced
- [ ] Captor benefit sentence present
- [ ] Ravi path correct

