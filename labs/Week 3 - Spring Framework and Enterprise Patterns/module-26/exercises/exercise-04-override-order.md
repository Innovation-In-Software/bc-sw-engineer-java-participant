# Exercise 2 — Property Override Order

**Module 26** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/override-order.md` — order CLI, env, profile YAML, and base YAML by precedence.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-26-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-override-order.md` (this file in the course repo) |
| Your notes file | `notes/override-order.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 26 — Property Override Order

## Reference

| Rank (highest first) | Source |
| --- | --- |
| 1 | Command-line args / `-D` |
| 2 | Environment variables |
| 3 | Profile-specific YAML |
| 4 | Base `application.yml` |

## Step 1 — Rank

In `notes/override-order.md`, number the four sources highest→lowest.

## Step 2 — Check the reference

Compare to the reference table; correct mistakes.

## Step 3 — Activation pair

Write example activations: `-Dspring.profiles.active=dev` and `SPRING_PROFILES_ACTIVE=prod`.

## Step 4 — Measurement plan

Lab 26 asks for measured override evidence — note you will capture it in lab, not here.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-26-exercises/`, create `notes/` if needed, then create `notes/override-order.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 26 — Property Override Order

## Reference

| Rank (highest first) | Source |
| --- | --- |
| 1 | Command-line args / `-D` |
| 2 | Environment variables |
| 3 | Profile-specific YAML |
| 4 | Base `application.yml` |

## Step 1 — Rank

In `notes/override-order.md`, number the four sources highest→lowest.

## Step 2 — Check the reference

Compare to the reference table; correct mistakes.

## Step 3 — Activation pair

Write example activations: `-Dspring.profiles.active=dev` and `SPRING_PROFILES_ACTIVE=prod`.

## Step 4 — Measurement plan

Lab 26 asks for measured override evidence — note you will capture it in lab, not here.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Correct precedence and activation examples recorded in `notes/override-order.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/override-order.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 26 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/override-order.md`
- [ ] Order matches reference
- [ ] Both activation styles listed
- [ ] Lab measurement deferred explicitly

