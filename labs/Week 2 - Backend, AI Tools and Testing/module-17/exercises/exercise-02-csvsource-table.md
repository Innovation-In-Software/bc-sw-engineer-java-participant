# Exercise 2 — CsvSource Table Design

**Module 17** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Design a CsvSource table for status validation inputs.

## Reference

| inputStatus | valid? |
| --- | --- |
| ACTIVE | true |
| PROSPECT | true |
| ACTVE | false |
|  | false |

## Steps

### Step 1 — Copy table

Recreate as a future `@CsvSource` row list in notes.

### Step 2 — Extra row

Add one more invalid status of your choice.

### Step 3 — JDK/Maven

Note tests will run with JDK 21 via Maven Surefire in the timed lab.

### Step 4 — Boundary

Mark: stubbing collaborators waits for Lab 18.

## Expected result

A CsvSource-ready table with an extra invalid row.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Base rows present | Pass / Fail |
| 2 | Extra invalid added | Pass / Fail |
| 3 | Lab 18 boundary noted | Pass / Fail |
