# Exercise 1 — Threat Sketch

**Module 36** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

List frontend threats relevant to the Northstar CRM SPA.

## Steps

### Step 1 — Assets

What attackers want: session tokens, customer PII for Amina/Ravi, admin actions.

### Step 2 — Threats

Name XSS, token theft, CSRF (if cookie session), open redirects.

### Step 3 — UI vs API

One sentence: hiding a button is not authorization — Spring must enforce.

### Step 4 — Notes

Save `notes/lab36-security.md`.

## Expected result

Threat list with UI-vs-API authorization boundary.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | ≥3 threats named | Pass / Fail |
| 2 | Authorization boundary stated | Pass / Fail |
| 3 | Notes saved | Pass / Fail |
