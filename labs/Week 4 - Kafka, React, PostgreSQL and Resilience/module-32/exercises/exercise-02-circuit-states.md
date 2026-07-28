# Exercise 4 — Circuit States

**Module 32** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Document closed, open, and half-open for the Account Profile breaker.

## Steps

### Step 1 — Closed

Normal calls flow; failures counted.

### Step 2 — Open

Calls fail fast / use fallback; Account Profile is not hammered.

### Step 3 — Half-open

Trial calls probe recovery; success → closed, failure → open.

### Step 4 — Draw

Sketch a tiny state diagram (boxes + arrows) in markdown.

## Expected result

State descriptions plus a simple diagram in notes.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | All three states described | Pass / Fail |
| 2 | Diagram present | Pass / Fail |
| 3 | Fallback mentioned for open | Pass / Fail |
