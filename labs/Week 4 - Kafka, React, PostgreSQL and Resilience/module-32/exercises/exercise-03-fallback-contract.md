# Exercise 2 — Fallback Contract

**Module 32** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Specify what minimal Account Profile means for Amina when the dependency fails.

## Steps

### Step 1 — Fields kept

List fields still shown: customerId, displayName maybe, status UNKNOWN.

### Step 2 — Fields dropped

List fields omitted: balance, tier, lastLogin.

### Step 3 — API signal

Decide: HTTP 200 with `degraded=true` vs 503 — pick one and justify.

### Step 4 — User message

Draft one UI string: *Account details temporarily limited.*

## Expected result

A written degraded contract for CRM profile responses.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Kept vs dropped fields | Pass / Fail |
| 2 | Status-code choice justified | Pass / Fail |
| 3 | User-facing string drafted | Pass / Fail |
