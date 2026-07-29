# Exercise 2 — Bean Lifecycle Callbacks

**Module 22** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab22-lifecycle-notes.md` — predict when lifecycle callbacks fire for a singleton `CustomerService`.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-22-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-lifecycle-notes.md` (this file in the course repo) |
| Your notes file | `notes/lab22-lifecycle-notes.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 22 — Bean Lifecycle Callbacks

## Reference

| Callback | When |
| --- | --- |
| `@PostConstruct` | After injection, before traffic |
| `@PreDestroy` | During orderly context shutdown |

## Step 1 — Order the phases

Number these: inject dependencies → create bean → `@PostConstruct` → serve requests → `@PreDestroy`.

## Step 2 — Check the reference

Correct order: create → inject → `@PostConstruct` → serve → `@PreDestroy`.

## Step 3 — Evidence plan

Write what log lines you expect once per context start/stop for Lab 22 (no secrets/PII in logs — Lab 20 rules).

## Step 4 — Scope note

State that default scope is singleton unless annotated otherwise.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-22-exercises/`, create `notes/` if needed, then create `notes/lab22-lifecycle-notes.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 22 — Bean Lifecycle Callbacks

## Reference

| Callback | When |
| --- | --- |
| `@PostConstruct` | After injection, before traffic |
| `@PreDestroy` | During orderly context shutdown |

## Step 1 — Order the phases

Number these: inject dependencies → create bean → `@PostConstruct` → serve requests → `@PreDestroy`.

## Step 2 — Check the reference

Correct order: create → inject → `@PostConstruct` → serve → `@PreDestroy`.

## Step 3 — Evidence plan

Write what log lines you expect once per context start/stop for Lab 22 (no secrets/PII in logs — Lab 20 rules).

## Step 4 — Scope note

State that default scope is singleton unless annotated otherwise.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Lifecycle order and PII-safe evidence plan are documented in `notes/lab22-lifecycle-notes.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab22-lifecycle-notes.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 22 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab22-lifecycle-notes.md`
- [ ] Phase order is correct
- [ ] Evidence plan avoids PII
- [ ] Singleton default is mentioned

