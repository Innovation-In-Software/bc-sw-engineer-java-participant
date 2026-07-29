# Exercise 2 — Actuator Allow-List

**Module 21** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab21-actuator-allowlist.md` — draft which Actuator endpoints may be exposed in lab vs locked down.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-21-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-actuator-allowlist.md` (this file in the course repo) |
| Your notes file | `notes/lab21-actuator-allowlist.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

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

Then follow **Steps** to create your own file.

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

Self-check before marking Pass:

- [ ] File exists at `notes/lab21-actuator-allowlist.md`
- [ ] Allow items listed
- [ ] Lockdown items listed
- [ ] Auth/network note present

