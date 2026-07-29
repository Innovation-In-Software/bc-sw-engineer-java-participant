# Exercise 5 — Pattern Map

**Module 32** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab32-pattern-map.md` — assign each pattern to a concrete Northstar outbound behavior.

## Deliverable

| Item | Path (under `examples/module-32-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-pattern-map.md` (this file in the course repo) |
| Your notes file | `notes/lab32-pattern-map.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-32-exercises/`, create `notes/` if needed, then create `notes/lab32-pattern-map.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 32 — Pattern Map

## Reference

| Pattern | CRM use |
| --- | --- |
| Retry | Transient 503 from Account Profile |
| TimeLimiter | Fail fast if call exceeds N ms |
| CircuitBreaker | Stop calling when failure rate high |
| Fallback | Return cached/minimal profile for Amina |

## Step 2 — Add Ravi row

Add one example sentence for `CUS-1002` Ravi when circuit is open.

## Step 3 — Order idea

Propose decorator order in one line (e.g. TimeLimiter → CircuitBreaker → Retry → call).

## Step 4 — Boundary

Mark: do not apply circuit breaker to local in-memory map lookups.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Pattern→CRM map with decorator order and a Ravi open-circuit example in `notes/lab32-pattern-map.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab32-pattern-map.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 32 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab32-pattern-map.md` | Pass / Fail |
| 2 | Table present | Pass / Fail |
| 3 | Ravi example | Pass / Fail |
| 4 | Decorator order proposed | Pass / Fail |
