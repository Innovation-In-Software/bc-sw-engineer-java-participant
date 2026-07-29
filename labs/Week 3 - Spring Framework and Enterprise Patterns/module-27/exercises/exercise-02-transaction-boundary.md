# Exercise 2 — Transaction Boundary Placement

**Module 27** · Architecture exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/tx-boundary.md` — decide where the transfer transaction boundary belongs.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-27-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-transaction-boundary.md` (this file in the course repo) |
| Your notes file | `notes/tx-boundary.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 27 — Transaction Boundary Placement

## Reference

| Location | Verdict |
| --- | --- |
| `TransferService.transfer(...)` | Preferred |
| Controller method | Avoid |
| Repository only | Too narrow for multi-step business |

## Step 1 — Choose

In `notes/tx-boundary.md`, pick the boundary for debit+credit+log.

## Step 2 — Check the reference

Service method is preferred.

## Step 3 — Steps inside

Order: load accounts → debit → credit → write TransactionLog.

## Step 4 — Correlation

Happy-path evidence uses `lab-request-001`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-27-exercises/`, create `notes/` if needed, then create `notes/tx-boundary.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 27 — Transaction Boundary Placement

## Reference

| Location | Verdict |
| --- | --- |
| `TransferService.transfer(...)` | Preferred |
| Controller method | Avoid |
| Repository only | Too narrow for multi-step business |

## Step 1 — Choose

In `notes/tx-boundary.md`, pick the boundary for debit+credit+log.

## Step 2 — Check the reference

Service method is preferred.

## Step 3 — Steps inside

Order: load accounts → debit → credit → write TransactionLog.

## Step 4 — Correlation

Happy-path evidence uses `lab-request-001`.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Service-level boundary and step order documented in `notes/tx-boundary.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/tx-boundary.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 27 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/tx-boundary.md`
- [ ] Service chosen over controller
- [ ] Four internal steps ordered
- [ ] Correlation noted

