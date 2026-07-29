# Exercise 2 — Stub vs Verify

**Module 18** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab18-stub-verify.md` — explain stubbing return values versus verifying calls for activate.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-18-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-stub-vs-verify.md` (this file in the course repo) |
| Your notes file | `notes/lab18-stub-verify.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 18 — Stub vs Verify

## Step 1 — Stub

`when(repo.findById("CUS-1002")).thenReturn(raviProspect)` — arrange.

## Step 2 — Verify

`verify(repo).save(…)` — assert collaboration happened.

## Step 3 — Both

One sentence: stubs feed inputs; verifies prove side-effect calls.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-18-exercises/`, create `notes/` if needed, then create `notes/lab18-stub-verify.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 18 — Stub vs Verify

## Step 1 — Stub

`when(repo.findById("CUS-1002")).thenReturn(raviProspect)` — arrange.

## Step 2 — Verify

`verify(repo).save(…)` — assert collaboration happened.

## Step 3 — Both

One sentence: stubs feed inputs; verifies prove side-effect calls.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Clear stub vs verify examples using CUS-1002 in `notes/lab18-stub-verify.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab18-stub-verify.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 18 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab18-stub-verify.md`
- [ ] Stub example written
- [ ] Verify example written
- [ ] Contrast sentence present

