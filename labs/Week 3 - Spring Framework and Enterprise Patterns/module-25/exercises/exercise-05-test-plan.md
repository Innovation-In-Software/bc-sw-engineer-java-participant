# Exercise 5 — Service Test Plan

**Module 25** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/service-test-plan.md` — list three service tests Lab 25 should prove.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-25-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-test-plan.md` (this file in the course repo) |
| Your notes file | `notes/service-test-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 25 — Service Test Plan

## Step 1 — Cases

In `notes/service-test-plan.md`: get seeded Amina; duplicate create fails; missing id fails; optional PROSPECT→ACTIVE.

## Step 2 — Fake vs in-memory

State either a fake repo or the in-memory impl is acceptable for unit tests.

## Step 3 — Dual green

Lab expects `mvn test` green twice — note that as a lab habit, not pre-lab work.

## Step 4 — Boundary

Do not write the full JUnit class here.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-25-exercises/`, create `notes/` if needed, then create `notes/service-test-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 25 — Service Test Plan

## Step 1 — Cases

In `notes/service-test-plan.md`: get seeded Amina; duplicate create fails; missing id fails; optional PROSPECT→ACTIVE.

## Step 2 — Fake vs in-memory

State either a fake repo or the in-memory impl is acceptable for unit tests.

## Step 3 — Dual green

Lab expects `mvn test` green twice — note that as a lab habit, not pre-lab work.

## Step 4 — Boundary

Do not write the full JUnit class here.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Test plan lists core service cases without full JUnit in `notes/service-test-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/service-test-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 25 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/service-test-plan.md`
- [ ] At least three cases listed
- [ ] Fake/in-memory option stated
- [ ] Full JUnit deferred

