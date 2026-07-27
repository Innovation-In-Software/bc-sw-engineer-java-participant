# Exercise 4 — Fill SAST Path TODOs

**Module 40** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete a fill-in checklist for one request-to-sink path (pre-lab notes only).

## Steps

### Step 1 — Copy template

In notes, create `sast-path-todo.md` with blanks:
```
Endpoint: _____
Authz check: _____
Sink (SQL/file/log): _____
Customer fixture used: _____
Risk if missing check: _____
```

### Step 2 — Fill for customer read

Fill blanks for `GET /api/customers/{id}` using `CUS-1001`. Authz must mention role/object-level check TODOs.

### Step 3 — Second path

Duplicate the template for a write path (update interaction or status) involving `CUS-1002`.

### Step 4 — Self-check

Ensure no passwords, tokens, or real PII appear. Mark items still `_____` that Lab 40 will prove with code.

## Expected result

Two filled SAST path notes with remaining blanks only where Lab 40 code proof is required.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Template filled for read and write paths | Pass / Fail |
| 2 | Fixtures CUS-1001/CUS-1002 used | Pass / Fail |
| 3 | No secrets in notes | Pass / Fail |
