# Exercise 2 — Plan JDK 21 Verify Job

**Module 43** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab43-java21-verify.md` — specify setup-java and Maven verify without skipping tests.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-43-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-java21-verify.md` (this file in the course repo) |
| Your notes file | `notes/lab43-java21-verify.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 43 — Plan JDK 21 Verify Job

## Step 1 — Setup

List Actions steps: checkout, setup-java Temurin 21 with Maven cache, `./mvnw -B clean verify`.

## Step 2 — Check the reference

Upload Surefire/Failsafe reports even on failure (`if: always()`).

## Step 3 — Failure drill plan

Write how you will intentionally break one test, observe CI red, then restore (plan only).

## Step 4 — Local habit

Note local preflight: `java -version` shows 21; `./mvnw -v` before pushing.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-43-exercises/`, create `notes/` if needed, then create `notes/lab43-java21-verify.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 43 — Plan JDK 21 Verify Job

## Step 1 — Setup

List Actions steps: checkout, setup-java Temurin 21 with Maven cache, `./mvnw -B clean verify`.

## Step 2 — Check the reference

Upload Surefire/Failsafe reports even on failure (`if: always()`).

## Step 3 — Failure drill plan

Write how you will intentionally break one test, observe CI red, then restore (plan only).

## Step 4 — Local habit

Note local preflight: `java -version` shows 21; `./mvnw -v` before pushing.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Verify job plan with report upload and failure drill notes in `notes/lab43-java21-verify.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab43-java21-verify.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 43 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab43-java21-verify.md`
- [ ] JDK 21 + mvnw verify listed
- [ ] Report upload planned
- [ ] Failure drill described

