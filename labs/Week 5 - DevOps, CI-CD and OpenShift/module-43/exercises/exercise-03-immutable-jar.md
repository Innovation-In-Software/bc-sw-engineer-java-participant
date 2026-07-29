# Exercise 3 — Package-Once Identity

**Module 43** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab43-immutable-jar.md` — explain why the JAR verified in CI must be the one promoted later.

## Deliverable

| Item | Path (under `examples/module-43-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-immutable-jar.md` (this file in the course repo) |
| Your notes file | `notes/lab43-immutable-jar.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-43-exercises/`, create `notes/` if needed, then create `notes/lab43-immutable-jar.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 43 — Package-Once Identity

## Step 1 — Steps

Outline: package once, write `SHA256SUMS`, record `GITHUB_SHA`, upload artifact.

## Step 2 — Check the reference

Lab 44 promotes this identity—rebuilding silently on the deploy agent breaks the chain.

## Step 3 — Example lines

Draft example checksum file lines (fake hashes OK) including commit id.

## Step 4 — Anti-pattern

Name one anti-pattern: packaging differently in deploy than in CI.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Immutable JAR identity plan linked to Lab 44 in `notes/lab43-immutable-jar.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab43-immutable-jar.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 43 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab43-immutable-jar.md` | Pass / Fail |
| 2 | Checksum + commit recorded | Pass / Fail |
| 3 | Promotion link stated | Pass / Fail |
| 4 | Anti-pattern named | Pass / Fail |
