# Exercise 5 — Propagation Warnings

**Module 27** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/propagation-warnings.md` — flag common AI/propagation mistakes before Lab 27.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-27-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-propagation-warnings.md` (this file in the course repo) |
| Your notes file | `notes/propagation-warnings.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 27 — Propagation Warnings

## Step 1 — List risks

In `notes/propagation-warnings.md`: NOT_SUPPORTED mid-transfer; REQUIRES_NEW for the log only; self-invocation bypassing proxy.

## Step 2 — Preferred default

Default REQUIRED on the outer transfer method is enough for this lab.

## Step 3 — Proxy note

Calling `this.transfer` inside the same class may skip the Spring proxy.

## Step 4 — Boundary

Do not configure custom managers — Boot defaults suffice for Lab 27.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-27-exercises/`, create `notes/` if needed, then create `notes/propagation-warnings.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 27 — Propagation Warnings

## Step 1 — List risks

In `notes/propagation-warnings.md`: NOT_SUPPORTED mid-transfer; REQUIRES_NEW for the log only; self-invocation bypassing proxy.

## Step 2 — Preferred default

Default REQUIRED on the outer transfer method is enough for this lab.

## Step 3 — Proxy note

Calling `this.transfer` inside the same class may skip the Spring proxy.

## Step 4 — Boundary

Do not configure custom managers — Boot defaults suffice for Lab 27.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Propagation risks and defaults documented in `notes/propagation-warnings.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/propagation-warnings.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 27 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/propagation-warnings.md`
- [ ] Three risks listed
- [ ] REQUIRED default stated
- [ ] Self-invocation warning present

