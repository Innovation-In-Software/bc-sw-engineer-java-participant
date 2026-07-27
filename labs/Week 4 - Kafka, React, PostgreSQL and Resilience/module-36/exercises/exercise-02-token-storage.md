# Exercise 2 — Token Storage Options

**Module 36** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Recommend where the CRM SPA keeps access tokens for the lab.

## Reference

| Option | Risk / note |
| --- | --- |
| In-memory variable | Lost on refresh; safer from XSS persistence |
| sessionStorage | Per-tab; XSS can read |
| localStorage | Survives refresh; XSS can read |
| HttpOnly cookie | Not JS-readable; needs CSRF strategy |

## Steps

### Step 1 — Study table

Copy the reference table.

### Step 2 — Lab choice

Pick one approach for Lab 36 and justify in two sentences.

### Step 3 — Never

Never commit tokens; never put DB passwords in Vite env.

### Step 4 — Fixture

Use fake token `lab-token-001` in notes only — not a real secret.

## Expected result

Storage recommendation with explicit never-commit rules.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Choice + justification | Pass / Fail |
| 2 | Never-commit rule | Pass / Fail |
| 3 | Fake token example only | Pass / Fail |
