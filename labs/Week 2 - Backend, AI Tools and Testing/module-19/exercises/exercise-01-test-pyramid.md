# Exercise 1 — Test Pyramid for CRM

**Module 19** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab19-pyramid.md` — place activate unit tests, API IT, and Selenium UI on a pyramid.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-test-pyramid.md` (this file in the course repo) |
| Your notes file | `notes/lab19-pyramid.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 19 — Test Pyramid for CRM

## Step 1 — Base

Many fast JUnit/Mockito tests for service rules (Labs 17–18).

## Step 2 — Middle

Fewer API integration tests with real Spring slice or Testcontainers later.

## Step 3 — Top

Few Selenium journeys: view Amina ACTIVE, activate Ravi path in UI if exposed.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-pyramid.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — Test Pyramid for CRM

## Step 1 — Base

Many fast JUnit/Mockito tests for service rules (Labs 17–18).

## Step 2 — Middle

Fewer API integration tests with real Spring slice or Testcontainers later.

## Step 3 — Top

Few Selenium journeys: view Amina ACTIVE, activate Ravi path in UI if exposed.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A pyramid note with Northstar examples at each layer in `notes/lab19-pyramid.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-pyramid.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 19 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab19-pyramid.md`
- [ ] Three layers described
- [ ] Fixtures mentioned at UI layer
- [ ] Actuator deferred

