# Exercise 2 — data-testid Locators

**Module 19** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Propose data-testid values for CRM UI elements.

## Reference

| Element | data-testid |
| --- | --- |
| Status badge | customer-status |
| Activate button | activate-customer |
| Customer id label | customer-id |

## Steps

### Step 1 — Copy table

Recreate; add correlation display testid if shown in UI.

### Step 2 — Brittle alternative

Mark `div.col-md-3 > span:nth-child(2)` as brittle.

### Step 3 — Contract

One sentence: UI and tests share testids as a contract.

### Step 4 — Capture

Save under `notes/lab19-locators.md`.

## Expected result

A locator contract preferring data-testid.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Table plus optional correlation id | Pass / Fail |
| 2 | Brittle selector called out | Pass / Fail |
| 3 | Contract sentence present | Pass / Fail |
