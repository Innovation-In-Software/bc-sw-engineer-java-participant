# Exercise 1 — AAA Template for Status

**Module 11** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab11-aaa-template.md` with an Arrange–Act–Assert outline Copilot must follow for activating Ravi (`CUS-1002`).

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-11-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-aaa-template.md` (this file in the course repo) |
| Your notes file | `notes/lab11-aaa-template.md` |

## Northstar fixtures (use these exact values)

| ID | Name | Start status | After activate |
| -- | ---- | ------------ | -------------- |
| `CUS-1002` | Ravi Singh | `PROSPECT` | `ACTIVE` |
| Correlation (comments only) | — | — | `lab-request-001` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 11 AAA template — activate Ravi

## Test name (style only)
activate_prospectRavi_setsStatusActive

## AAA

| Phase | What you write |
| ----- | -------------- |
| Arrange | Customer CUS-1002 Ravi Singh status PROSPECT |
| Act | Call updateStatus / activate so Ravi becomes ACTIVE (conceptual — no full suite yet) |
| Assert | Status is ACTIVE; note correlation lab-request-001 for later logging |

## Boundary
Full Mockito isolation waits for Lab 18. This file is structure only.

## Prep note
Prepare for Lab 11; do not complete the full AI-assisted test suite now.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-11-exercises/`, create `notes/` if needed, then create `notes/lab11-aaa-template.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 11 AAA template — activate Ravi

## Test name (style only)
activate_prospectRavi_setsStatusActive

## AAA

| Phase | What you write |
| ----- | -------------- |
| Arrange | Customer CUS-1002 Ravi Singh status PROSPECT |
| Act | Call updateStatus / activate so Ravi becomes ACTIVE (conceptual — no full suite yet) |
| Assert | Status is ACTIVE; note correlation lab-request-001 for later logging |

## Boundary
Full Mockito isolation waits for Lab 18. This file is structure only.

## Prep note
Prepare for Lab 11; do not complete the full AI-assisted test suite now.
```

Fill **Act** in your own words if the starter line feels too short — keep the same customer id and statuses.

### Step 3 — Self-check

Confirm: Ravi = `CUS-1002` / `PROSPECT` → `ACTIVE`. Do **not** swap with Amina (`CUS-1001` / `ACTIVE`).

## Expected result

`notes/lab11-aaa-template.md` exists with AAA table, proposed test name, Lab 18 boundary, and pre-lab-only note.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab11-aaa-template.md` |
| Using Amina for activate | Activate story is **Ravi** `CUS-1002` PROSPECT → ACTIVE |
| Writing full JUnit now | Stop — AAA outline only; Lab 11 writes the suite |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab11-aaa-template.md` | Pass / Fail |
| 2 | AAA table has Arrange / Act / Assert with CUS-1002 | Pass / Fail |
| 3 | Test name + Lab 18 boundary + pre-lab note present | Pass / Fail |
