# Exercise 1 — Props Sketch

**Module 33** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Define props for CustomerCard using Northstar fixtures.

## Reference

| Prop | Example |
| --- | --- |
| customerId | CUS-1001 |
| name | Amina Khan |
| status | ACTIVE |
| onSelect | () => void |

## Steps

### Step 1 — Copy props

Copy the table; add a second example row for Ravi (`CUS-1002`).

### Step 2 — Types

Write TypeScript-ish types: `status: 'ACTIVE' | 'SUSPENDED' | ...`.

### Step 3 — Children?

Decide whether `CustomerCard` takes `children` or only props — one sentence.

### Step 4 — Anti-pattern

Note: do not pass the entire global store as one mega-prop.

## Expected result

Props table with Amina/Ravi examples and a status union type.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Both customers exemplified | Pass / Fail |
| 2 | Status union drafted | Pass / Fail |
| 3 | Mega-prop anti-pattern noted | Pass / Fail |
