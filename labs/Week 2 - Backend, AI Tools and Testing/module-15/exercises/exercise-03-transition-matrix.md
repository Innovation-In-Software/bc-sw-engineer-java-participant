# Exercise 3 — Transition Matrix

**Module 15** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab15-transition-matrix.md` — tabulate allowed and forbidden customer status transitions.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-15-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-transition-matrix.md` (this file in the course repo) |
| Your notes file | `notes/lab15-transition-matrix.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 15 — Transition Matrix

## Reference

| From | To | Allowed? |
| --- | --- | --- |
| PROSPECT | ACTIVE | yes (Ravi activate) |
| ACTIVE | ACTIVE | no-op or reject — decide |
| ACTIVE | PROSPECT | no |

## Step 2 — Amina

Note CUS-1001 already ACTIVE — activate should be rejected or no-op per your policy.

## Step 3 — Illegal list

List two illegal transitions you will throw on later.

## Step 4 — Boundary

Mark: exception HTTP mapping waits for Lab 16.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-15-exercises/`, create `notes/` if needed, then create `notes/lab15-transition-matrix.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 15 — Transition Matrix

## Reference

| From | To | Allowed? |
| --- | --- | --- |
| PROSPECT | ACTIVE | yes (Ravi activate) |
| ACTIVE | ACTIVE | no-op or reject — decide |
| ACTIVE | PROSPECT | no |

## Step 2 — Amina

Note CUS-1001 already ACTIVE — activate should be rejected or no-op per your policy.

## Step 3 — Illegal list

List two illegal transitions you will throw on later.

## Step 4 — Boundary

Mark: exception HTTP mapping waits for Lab 16.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A transition matrix with Amina/Ravi implications in `notes/lab15-transition-matrix.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab15-transition-matrix.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 15 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab15-transition-matrix.md`
- [ ] Matrix filled
- [ ] Amina case noted
- [ ] Lab 16 mapping deferred

