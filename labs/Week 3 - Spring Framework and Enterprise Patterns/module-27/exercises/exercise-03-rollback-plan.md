# Exercise 3 — Rollback Evidence Plan

**Module 27** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/rollback-plan.md` — document what must remain unchanged after forced failure.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-27-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-rollback-plan.md` (this file in the course repo) |
| Your notes file | `notes/rollback-plan.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 27 — Rollback Evidence Plan

## Step 1 — Happy path

In `notes/rollback-plan.md`: MAIN→LOYALTY updates both balances and writes a log.

## Step 2 — Force fail

Transfer to `ACC-FORCE-FAIL`: MAIN balance unchanged; no success log row.

## Step 3 — Test idea

Automated test asserts balances after failure — plan only.

## Step 4 — AI caution

Reject AI drafts that catch Exception and swallow it inside `@Transactional` methods.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-27-exercises/`, create `notes/` if needed, then create `notes/rollback-plan.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 27 — Rollback Evidence Plan

## Step 1 — Happy path

In `notes/rollback-plan.md`: MAIN→LOYALTY updates both balances and writes a log.

## Step 2 — Force fail

Transfer to `ACC-FORCE-FAIL`: MAIN balance unchanged; no success log row.

## Step 3 — Test idea

Automated test asserts balances after failure — plan only.

## Step 4 — AI caution

Reject AI drafts that catch Exception and swallow it inside `@Transactional` methods.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Rollback evidence plan and AI caution recorded in `notes/rollback-plan.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/rollback-plan.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 27 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/rollback-plan.md`
- [ ] Happy and fail paths contrasted
- [ ] No-log-on-fail stated
- [ ] Swallowed-exception reject rule written

