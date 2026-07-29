# Exercise 3 — XSS and CSP Notes

**Module 36** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab36-xss-csp.md` — document XSS-safe rendering rules for customer names/notes.

## Deliverable

| Item | Path (under `examples/module-36-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-xss-csp.md` (this file in the course repo) |
| Your notes file | `notes/lab36-xss-csp.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-36-exercises/`, create `notes/` if needed, then create `notes/lab36-xss-csp.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 36 — XSS and CSP Notes

## Step 1 — Danger

If a malicious name contains `<script>...` and you use `dangerouslySetInnerHTML`, XSS can steal tokens.

## Step 2 — Rule

Prefer text children / React escaping; avoid HTML injection APIs.

## Step 3 — CSP

One sentence: CSP can reduce inline script risk (lab may only document).

## Step 4 — Test idea

Paper test string: `Amina <b>Khan</b>` should show angle brackets as text.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

XSS rules and a paper test string for safe rendering in `notes/lab36-xss-csp.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab36-xss-csp.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 36 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab36-xss-csp.md` | Pass / Fail |
| 2 | dangerouslySetInnerHTML warning | Pass / Fail |
| 3 | Prefer-escaping rule | Pass / Fail |
| 4 | Test string recorded | Pass / Fail |
