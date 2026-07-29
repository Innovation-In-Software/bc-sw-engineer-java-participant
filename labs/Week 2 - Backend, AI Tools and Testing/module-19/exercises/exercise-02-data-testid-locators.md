# Exercise 2 — data-testid Locators

**Module 19** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab19-locators.md` — propose data-testid values for CRM UI elements.

## Deliverable

| Item | Path (under `examples/module-19-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-data-testid-locators.md` (this file in the course repo) |
| Your notes file | `notes/lab19-locators.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-19-exercises/`, create `notes/` if needed, then create `notes/lab19-locators.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 19 — data-testid Locators

## Reference

| Element | data-testid |
| --- | --- |
| Status badge | customer-status |
| Activate button | activate-customer |
| Customer id label | customer-id |

## Step 2 — Brittle alternative

Mark `div.col-md-3 > span:nth-child(2)` as brittle.

## Step 3 — Contract

One sentence: UI and tests share testids as a contract.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

A locator contract preferring data-testid in `notes/lab19-locators.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab19-locators.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 19 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab19-locators.md` | Pass / Fail |
| 2 | Table plus optional correlation id | Pass / Fail |
| 3 | Brittle selector called out | Pass / Fail |
| 4 | Contract sentence present | Pass / Fail |
