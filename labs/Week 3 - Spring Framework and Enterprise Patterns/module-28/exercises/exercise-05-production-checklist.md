# Exercise 5 — Production IdP Checklist

**Module 28** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Draft `docs/security-notes.md` outline items for IdP and key rotation.

## Steps

### Step 1 — Outline

In `notes/security-notes-outline.md`: replace lab users with IdP; rotate signing keys; short token TTL; HTTPS only.

### Step 2 — Lab vs prod

In-memory `agent1`/`admin1` are lab-only.

### Step 3 — Transfers

Note Lab 27 money routes must stay behind auth in production narratives.

### Step 4 — Boundary

Do not implement OAuth2 Authorization Server here.

## Expected result

Production checklist outline exists.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Four checklist items present | Pass / Fail |
| 2 | Lab users marked non-prod | Pass / Fail |
| 3 | OAuth server deferred | Pass / Fail |
