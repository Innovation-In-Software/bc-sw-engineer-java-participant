# Exercise 3 — Liveness vs Readiness

**Module 21** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab21-probes.md` — explain when Kubernetes (or PaaS) should restart vs stop sending traffic.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-21-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-liveness-vs-readiness.md` (this file in the course repo) |
| Your notes file | `notes/lab21-probes.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 21 — Liveness vs Readiness

## Step 1 — Liveness

Process stuck → restart. CRM example: deadlocked request threads.

## Step 2 — Readiness

Dependency down (DB) → not ready, keep process, remove from load balancer.

## Step 3 — Wrong mix

One sentence: do not kill the pod on every DB blip if readiness can gate traffic.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-21-exercises/`, create `notes/` if needed, then create `notes/lab21-probes.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 21 — Liveness vs Readiness

## Step 1 — Liveness

Process stuck → restart. CRM example: deadlocked request threads.

## Step 2 — Readiness

Dependency down (DB) → not ready, keep process, remove from load balancer.

## Step 3 — Wrong mix

One sentence: do not kill the pod on every DB blip if readiness can gate traffic.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A liveness/readiness contrast with CRM examples in `notes/lab21-probes.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab21-probes.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 21 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab21-probes.md`
- [ ] Both probes defined
- [ ] CRM examples present
- [ ] Wrong-mix warning written

