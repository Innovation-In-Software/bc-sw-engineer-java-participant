# Exercise 2 — Fetch Flow

**Module 35** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Sketch loading/success/error flow for listing customers.

## Steps

### Step 1 — States

`idle | loading | success | error` for the list view.

### Step 2 — Sequence

Mount → set loading → fetch → set data (Amina/Ravi) or error message.

### Step 3 — Abort

Note AbortController on unmount to avoid setState after navigate away.

### Step 4 — Empty

Draft empty-state copy when API returns [].

## Expected result

State machine notes including abort and empty UI.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Four states named | Pass / Fail |
| 2 | Abort noted | Pass / Fail |
| 3 | Empty copy drafted | Pass / Fail |
