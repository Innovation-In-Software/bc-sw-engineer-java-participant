# Exercise 3 — CORS and Headers

**Module 35** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab35-cors-and-headers.md` — document local CORS and correlation headers for the CRM SPA.

## Deliverable

| Item | Path (under `examples/module-35-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-cors-and-headers.md` (this file in the course repo) |
| Your notes file | `notes/lab35-cors-and-headers.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-35-exercises/`, create `notes/` if needed, then create `notes/lab35-cors-and-headers.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 35 — CORS and Headers

## Step 1 — Origins

Typical: UI `http://localhost:5173`, API `http://localhost:8080` (adjust if your lab differs).

## Step 2 — CORS

One sentence: browser blocks cross-origin XHR unless Spring allows the UI origin.

## Step 3 — Correlation

Plan header e.g. `X-Correlation-Id: lab-request-001` on fetches.

## Step 4 — Secrets

Do not put DB passwords in frontend env — only public API base URL.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

CORS/header notes with a safe env boundary in `notes/lab35-cors-and-headers.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab35-cors-and-headers.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 35 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab35-cors-and-headers.md` | Pass / Fail |
| 2 | Origins stated | Pass / Fail |
| 3 | Correlation header planned | Pass / Fail |
| 4 | No-secrets rule written | Pass / Fail |
