# Exercise 2 — Transaction Boundary Placement

**Module 27** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Decide where the transfer transaction boundary belongs.

## Reference

| Location | Verdict |
| --- | --- |
| `TransferService.transfer(...)` | Preferred |
| Controller method | Avoid |
| Repository only | Too narrow for multi-step business |

## Steps

### Step 1 — Choose

In `notes/tx-boundary.md`, pick the boundary for debit+credit+log.

### Step 2 — Check the reference

Service method is preferred.

### Step 3 — Steps inside

Order: load accounts → debit → credit → write TransactionLog.

### Step 4 — Correlation

Happy-path evidence uses `lab-request-001`.

## Expected result

Service-level boundary and step order documented.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Service chosen over controller | Pass / Fail |
| 2 | Four internal steps ordered | Pass / Fail |
| 3 | Correlation noted | Pass / Fail |
