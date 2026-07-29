# Exercise 3 — Health and Resource Checklist

**Module 41** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab41-health-resources.md` — define readiness/health and resource expectations for `crm-api`.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-41-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-health-resources.md` (this file in the course repo) |
| Your notes file | `notes/lab41-health-resources.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 41 — Health and Resource Checklist

## Step 1 — Health

Name the Actuator readiness path you expect (e.g. `/actuator/health/readiness`) and what “ready” means for agents.

## Step 2 — Check the reference

Readiness fails closed if DB is down—agents should not get half-ready CRM.

## Step 3 — Resources

Write placeholder memory/CPU limits for local docker run (numbers can be lab defaults).

## Step 4 — Graceful stop

One sentence on SIGTERM / graceful shutdown expectation for in-flight `lab-request-001` calls.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-41-exercises/`, create `notes/` if needed, then create `notes/lab41-health-resources.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 41 — Health and Resource Checklist

## Step 1 — Health

Name the Actuator readiness path you expect (e.g. `/actuator/health/readiness`) and what “ready” means for agents.

## Step 2 — Check the reference

Readiness fails closed if DB is down—agents should not get half-ready CRM.

## Step 3 — Resources

Write placeholder memory/CPU limits for local docker run (numbers can be lab defaults).

## Step 4 — Graceful stop

One sentence on SIGTERM / graceful shutdown expectation for in-flight `lab-request-001` calls.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Health, resources, and shutdown expectations documented in `notes/lab41-health-resources.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab41-health-resources.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 41 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab41-health-resources.md`
- [ ] Readiness path named
- [ ] DB-down behavior stated
- [ ] Graceful stop noted

