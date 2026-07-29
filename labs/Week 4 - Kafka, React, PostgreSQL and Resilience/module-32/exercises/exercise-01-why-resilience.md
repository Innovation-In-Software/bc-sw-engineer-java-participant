# Exercise 1 — Why Resilience

**Module 32** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab32-resilience.md` — explain how a slow Account Profile dependency hurts the CRM API.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-32-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-why-resilience.md` (this file in the course repo) |
| Your notes file | `notes/lab32-resilience.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 32 — Why Resilience

## Step 1 — Scenario

Customer detail for `CUS-1001` Amina calls Account Profile. The dependency hangs 30s. List three user-visible or thread-pool effects.

## Step 2 — Pattern names

Write the four Resilience4j ideas: retry, circuit breaker, time limiter, fallback.

## Step 3 — Not a substitute

One sentence: resilience wraps calls; it does not fix a permanently wrong URL.

## Step 4 — Notes file



## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-32-exercises/`, create `notes/` if needed, then create `notes/lab32-resilience.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 32 — Why Resilience

## Step 1 — Scenario

Customer detail for `CUS-1001` Amina calls Account Profile. The dependency hangs 30s. List three user-visible or thread-pool effects.

## Step 2 — Pattern names

Write the four Resilience4j ideas: retry, circuit breaker, time limiter, fallback.

## Step 3 — Not a substitute

One sentence: resilience wraps calls; it does not fix a permanently wrong URL.

## Step 4 — Notes file



## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A scenario analysis plus named Resilience4j patterns in `notes/lab32-resilience.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab32-resilience.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 32 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab32-resilience.md`
- [ ] Three hang effects
- [ ] Four patterns named
- [ ] Limitation sentence written

