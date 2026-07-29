# Exercise 3 — MockMvc Evidence Matrix

**Module 28** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/mockmvc-matrix.md` — draft the status matrix Lab 28 tests must cover.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-28-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-mockmvc-matrix.md` (this file in the course repo) |
| Your notes file | `notes/mockmvc-matrix.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 28 — MockMvc Evidence Matrix

## Step 1 — Matrix

In `notes/mockmvc-matrix.md`, rows: anonymous GET customers; bad token; agent GET customer; agent GET admin; admin GET admin.

## Step 2 — Expected statuses

Fill expected 401/403/200 for each row.

## Step 3 — Fixture

Successful customer read uses `CUS-1001` Amina.

## Step 4 — Boundary

Do not write full MockMvc tests in pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-28-exercises/`, create `notes/` if needed, then create `notes/mockmvc-matrix.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 28 — MockMvc Evidence Matrix

## Step 1 — Matrix

In `notes/mockmvc-matrix.md`, rows: anonymous GET customers; bad token; agent GET customer; agent GET admin; admin GET admin.

## Step 2 — Expected statuses

Fill expected 401/403/200 for each row.

## Step 3 — Fixture

Successful customer read uses `CUS-1001` Amina.

## Step 4 — Boundary

Do not write full MockMvc tests in pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Status matrix prepared for Lab 28 automation in `notes/mockmvc-matrix.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/mockmvc-matrix.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 28 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/mockmvc-matrix.md`
- [ ] Five scenarios listed
- [ ] Statuses assigned
- [ ] CUS-1001 mentioned

