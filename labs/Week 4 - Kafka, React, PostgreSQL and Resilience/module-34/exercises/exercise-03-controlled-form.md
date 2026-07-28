# Exercise 4 — Controlled Form Sketch

**Module 34** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Sketch a controlled form flow for creating a customer (paper).

## Reference

| UI piece | State field |
| --- | --- |
| Name input | name |
| Status select | status |
| Error text | error |
| Submit disabled | isValid derived |

## Steps

### Step 1 — Copy table

Copy reference table into notes.

### Step 2 — Flow

Number steps: render → onChange updates state → validate → onSubmit.

### Step 3 — Fixture

Example draft: name `Ravi Singh`, status `ACTIVE` before submit assigns `CUS-1002` (server later).

### Step 4 — Uncontrolled note

One line: uncontrolled refs are out of scope for this lab path.

## Expected result

Controlled-form flow diagram/list tied to Ravi example.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Table present | Pass / Fail |
| 2 | Four flow steps | Pass / Fail |
| 3 | Fixture example included | Pass / Fail |
