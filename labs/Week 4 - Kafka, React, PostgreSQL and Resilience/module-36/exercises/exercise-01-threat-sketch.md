# Exercise 1 — Threat Sketch

**Module 36** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab36-security.md` — list frontend threats relevant to the Northstar CRM SPA.

## Deliverable

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-threat-sketch.md` (this file in the course repo) |
| Your notes file | `notes/lab36-security.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-security.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 — Threat Sketch

## Step 1 — Assets

What attackers want: session tokens, customer PII for Amina/Ravi, admin actions.

## Step 2 — Threats

Name XSS, token theft, CSRF (if cookie session), open redirects.

## Step 3 — UI vs API

One sentence: hiding a button is not authorization — Spring must enforce.

## Step 4 — Notes

Save `notes/lab36-security.md`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Threat list with UI-vs-API authorization boundary in `notes/lab36-security.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab36-security.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 36 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab36-security.md` | Pass / Fail |
| 2 | ≥3 threats named | Pass / Fail |
| 3 | Authorization boundary stated | Pass / Fail |
| 4 | Notes saved | Pass / Fail |
