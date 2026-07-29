# Exercise 2 — Mapper No-Leak Rule

**Module 14** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab14-mapper-no-leak.md` — sketch toDto/toEntity rules that keep internals out of API responses.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-14-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-mapper-no-leak.md` (this file in the course repo) |
| Your notes file | `notes/lab14-mapper-no-leak.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 14 — Mapper No-Leak Rule

## Step 1 — toDto

Map only id, fullName, status for CUS-1001 responses.

## Step 2 — Forbidden

List forbidden: password hashes, internal risk scores, raw SQL ids if different.

## Step 3 — Activate DTO

Activate request carries customerId only (+ correlation header outside body).

## Step 4 — Prep boundary

Write: *DTOs before deep service rules — Lab 15 owns transitions.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-14-exercises/`, create `notes/` if needed, then create `notes/lab14-mapper-no-leak.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 14 — Mapper No-Leak Rule

## Step 1 — toDto

Map only id, fullName, status for CUS-1001 responses.

## Step 2 — Forbidden

List forbidden: password hashes, internal risk scores, raw SQL ids if different.

## Step 3 — Activate DTO

Activate request carries customerId only (+ correlation header outside body).

## Step 4 — Prep boundary

Write: *DTOs before deep service rules — Lab 15 owns transitions.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Mapper rules with Lab 15 boundary stated in `notes/lab14-mapper-no-leak.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab14-mapper-no-leak.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 14 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab14-mapper-no-leak.md`
- [ ] toDto fields listed
- [ ] Forbidden fields listed
- [ ] Lab 15 deferral noted

