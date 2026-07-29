# Exercise 5 — MockMvc Body Assertions Plan

**Module 29** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/mockmvc-body-plan.md` — plan tests that check JSON fields, not only HTTP status.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-29-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-06-mockmvc-body-assertions.md` (this file in the course repo) |
| Your notes file | `notes/mockmvc-body-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 29 — MockMvc Body Assertions Plan

## Step 1 — Cases

In `notes/mockmvc-body-plan.md`: invalid POST; GET `CUS-9999`; duplicate `CUS-1001`; happy GET Amina.

## Step 2 — Assertions

For failures, assert `status`, `message`/`error`, and `correlationId` exist.

## Step 3 — Security coexistence

If Lab 28 is complete, note tests may need auth headers — do not remove security.

## Step 4 — Boundary

Do not implement full MockMvc classes in pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-29-exercises/`, create `notes/` if needed, then create `notes/mockmvc-body-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 29 — MockMvc Body Assertions Plan

## Step 1 — Cases

In `notes/mockmvc-body-plan.md`: invalid POST; GET `CUS-9999`; duplicate `CUS-1001`; happy GET Amina.

## Step 2 — Assertions

For failures, assert `status`, `message`/`error`, and `correlationId` exist.

## Step 3 — Security coexistence

If Lab 28 is complete, note tests may need auth headers — do not remove security.

## Step 4 — Boundary

Do not implement full MockMvc classes in pre-lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Body-assertion test plan ready in `notes/mockmvc-body-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/mockmvc-body-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 29 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/mockmvc-body-plan.md`
- [ ] Four cases listed
- [ ] Envelope field assertions named
- [ ] Security coexistence noted

