# Exercise 1 — Layer Boundary Quiz

**Module 25** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/layers.md` — classify CRM tasks into the correct layer.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-25-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-layer-boundaries.md` (this file in the course repo) |
| Your notes file | `notes/layers.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 25 — Layer Boundary Quiz

## Reference

| Task | Layer |
| --- | --- |
| Parse JSON / return ResponseEntity | Controller |
| PROSPECT → ACTIVE rule | Service |
| Map/store lookup by id | Repository |
| Duplicate id rejection | Service |

## Step 1 — Classify

In `notes/layers.md`, classify: HTTP mapping, uniqueness check, in-memory save, status transition, JSON serialization.

## Step 2 — Check the reference

Compare to the reference table; fix any controller-owns-rules mistakes.

## Step 3 — Import rule

Write: controllers must not import repository types.

## Step 4 — Fixtures

Seed plan: `CUS-1001` ACTIVE, `CUS-1002` PROSPECT.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-25-exercises/`, create `notes/` if needed, then create `notes/layers.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 25 — Layer Boundary Quiz

## Reference

| Task | Layer |
| --- | --- |
| Parse JSON / return ResponseEntity | Controller |
| PROSPECT → ACTIVE rule | Service |
| Map/store lookup by id | Repository |
| Duplicate id rejection | Service |

## Step 1 — Classify

In `notes/layers.md`, classify: HTTP mapping, uniqueness check, in-memory save, status transition, JSON serialization.

## Step 2 — Check the reference

Compare to the reference table; fix any controller-owns-rules mistakes.

## Step 3 — Import rule

Write: controllers must not import repository types.

## Step 4 — Fixtures

Seed plan: `CUS-1001` ACTIVE, `CUS-1002` PROSPECT.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Layer classifications and import rule are correct in `notes/layers.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/layers.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 25 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/layers.md`
- [ ] Five tasks classified correctly
- [ ] No-controller-repo-import rule written
- [ ] Fixtures named

