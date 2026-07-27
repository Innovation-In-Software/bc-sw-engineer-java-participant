# Exercise 3 — CORS and Headers

**Module 35** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Document local CORS and correlation headers for the CRM SPA.

## Steps

### Step 1 — Origins

Typical: UI `http://localhost:5173`, API `http://localhost:8080` (adjust if your lab differs).

### Step 2 — CORS

One sentence: browser blocks cross-origin XHR unless Spring allows the UI origin.

### Step 3 — Correlation

Plan header e.g. `X-Correlation-Id: lab-request-001` on fetches.

### Step 4 — Secrets

Do not put DB passwords in frontend env — only public API base URL.

## Expected result

CORS/header notes with a safe env boundary.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Origins stated | Pass / Fail |
| 2 | Correlation header planned | Pass / Fail |
| 3 | No-secrets rule written | Pass / Fail |
