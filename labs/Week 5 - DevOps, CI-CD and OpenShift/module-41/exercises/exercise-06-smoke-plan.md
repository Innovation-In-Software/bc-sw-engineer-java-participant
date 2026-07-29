# Exercise 6 — Plan Container Smoke

**Module 41** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab41-smoke-plan.md` — plan a post-start smoke that uses synthetic customers only.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-41-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-06-smoke-plan.md` (this file in the course repo) |
| Your notes file | `notes/lab41-smoke-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 41 — Plan Container Smoke

## Step 1 — Steps

Order: health ready → create/get `CUS-1001` → correlation header `lab-request-001` → stop container.

## Step 2 — Check the reference

Evidence is screenshots/logs under lab-41 notes—not production dumps.

## Step 3 — Failure case

One planned negative: wrong DB URL should fail readiness.

## Step 4 — Scope line

State this is a plan; full docker build/run is Lab 41.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-41-exercises/`, create `notes/` if needed, then create `notes/lab41-smoke-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 41 — Plan Container Smoke

## Step 1 — Steps

Order: health ready → create/get `CUS-1001` → correlation header `lab-request-001` → stop container.

## Step 2 — Check the reference

Evidence is screenshots/logs under lab-41 notes—not production dumps.

## Step 3 — Failure case

One planned negative: wrong DB URL should fail readiness.

## Step 4 — Scope line

State this is a plan; full docker build/run is Lab 41.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Smoke plan with happy and negative paths in `notes/lab41-smoke-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab41-smoke-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 41 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab41-smoke-plan.md`
- [ ] Happy path ordered
- [ ] Negative readiness case listed
- [ ] Pre-lab scope stated

