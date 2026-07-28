# Exercise 3 — Paging and Locking Notes

**Module 39** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Document how CRM list paging and optimistic locks will behave.

## Steps

### Step 1 — Page request

`PageRequest.of(0, 20, Sort.by("customerId"))`.

### Step 2 — Response

Return totalElements + content slice to the UI later.

### Step 3 — Optimistic lock

Second writer on Amina fails if version stale — user retries.

### Step 4 — Correlation

Log `lab-request-001` on lock failures for support.

## Expected result

Paging + optimistic locking behavior notes.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | PageRequest example | Pass / Fail |
| 2 | Stale version behavior | Pass / Fail |
| 3 | Correlation logging note | Pass / Fail |
