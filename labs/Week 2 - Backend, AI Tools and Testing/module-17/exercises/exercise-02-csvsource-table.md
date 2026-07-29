# Exercise 2 — CsvSource Table Design

**Module 17** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab17-csvsource-table.md` — design a CsvSource table for status validation inputs.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-17-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-csvsource-table.md` (this file in the course repo) |
| Your notes file | `notes/lab17-csvsource-table.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 17 — CsvSource Table Design

## Reference

| inputStatus | valid? |
| --- | --- |
| ACTIVE | true |
| PROSPECT | true |
| ACTVE | false |
|  | false |

## Step 2 — Extra row

Add one more invalid status of your choice.

## Step 3 — JDK/Maven

Note tests will run with JDK 21 via Maven Surefire in the timed lab.

## Step 4 — Boundary

Mark: stubbing collaborators waits for Lab 18.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-17-exercises/`, create `notes/` if needed, then create `notes/lab17-csvsource-table.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 17 — CsvSource Table Design

## Reference

| inputStatus | valid? |
| --- | --- |
| ACTIVE | true |
| PROSPECT | true |
| ACTVE | false |
|  | false |

## Step 2 — Extra row

Add one more invalid status of your choice.

## Step 3 — JDK/Maven

Note tests will run with JDK 21 via Maven Surefire in the timed lab.

## Step 4 — Boundary

Mark: stubbing collaborators waits for Lab 18.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A CsvSource-ready table with an extra invalid row in `notes/lab17-csvsource-table.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab17-csvsource-table.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 17 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab17-csvsource-table.md`
- [ ] Base rows present
- [ ] Extra invalid added
- [ ] Lab 18 boundary noted

