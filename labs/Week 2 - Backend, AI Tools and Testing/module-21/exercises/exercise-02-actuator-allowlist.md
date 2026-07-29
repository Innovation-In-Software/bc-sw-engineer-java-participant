# Exercise 2 — Actuator Allow-List

**Module 21** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab21-actuator-allowlist.md` — draft which Actuator endpoints may be exposed in lab vs locked down.

## Deliverable

| Item | Path (under `examples/module-21-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-actuator-allowlist.md` (this file in the course repo) |
| Your notes file | `notes/lab21-actuator-allowlist.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-21-exercises/`, create `notes/` if needed, then create `notes/lab21-actuator-allowlist.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 21 — Actuator Allow-List

## Step 1 — Candidates

health, info, metrics, prometheus — list in this notes file.

## Step 2 — Allow-list

Lab allow: health (and maybe info); lock env/beans/configprops.

## Step 3 — Auth note

One sentence: production metrics scrapes need network policy/auth.

## Step 4 — Prep only

Write: *Prepare for Lab 21; do not open all Actuator endpoints in prep.*

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

An Actuator allow-list with lockdown items in `notes/lab21-actuator-allowlist.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab21-actuator-allowlist.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 21 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab21-actuator-allowlist.md` | Pass / Fail |
| 2 | Allow items listed | Pass / Fail |
| 3 | Lockdown items listed | Pass / Fail |
| 4 | Auth/network note present | Pass / Fail |
