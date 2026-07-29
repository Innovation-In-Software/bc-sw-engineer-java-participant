# Exercise 3 — MDC Lifecycle

**Module 20** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab20-mdc-lifecycle.md` — sketch put → use → clear MDC for correlation across a request.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-20-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-mdc-lifecycle.md` (this file in the course repo) |
| Your notes file | `notes/lab20-mdc-lifecycle.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 20 — MDC Lifecycle

## Step 1 — Put

On request entry: MDC.put("correlationId", "lab-request-001").

## Step 2 — Use

Service logs automatically include correlation via pattern.

## Step 3 — Clear

finally { MDC.clear(); } or remove key — prevent leak to next request.

## Step 4 — Boundary

Note metrics/alerts deepen in Lab 21; here focus logs/MDC.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-20-exercises/`, create `notes/` if needed, then create `notes/lab20-mdc-lifecycle.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 20 — MDC Lifecycle

## Step 1 — Put

On request entry: MDC.put("correlationId", "lab-request-001").

## Step 2 — Use

Service logs automatically include correlation via pattern.

## Step 3 — Clear

finally { MDC.clear(); } or remove key — prevent leak to next request.

## Step 4 — Boundary

Note metrics/alerts deepen in Lab 21; here focus logs/MDC.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

An MDC lifecycle sketch with clear-in-finally in `notes/lab20-mdc-lifecycle.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab20-mdc-lifecycle.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 20 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab20-mdc-lifecycle.md`
- [ ] Put documented
- [ ] Clear in finally documented
- [ ] Lab 21 boundary noted

