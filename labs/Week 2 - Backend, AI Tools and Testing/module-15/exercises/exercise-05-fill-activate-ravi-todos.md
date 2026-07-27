# Exercise 5 — Fill Activate Ravi Pseudocode TODOs

**Module 15** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete fill-in blanks for activate(CUS-1002) pseudocode.

## Steps

### Step 1 — Copy pseudocode

Create `notes/lab15-activate-todos.md` and paste:

customer = repo.findById(_____)
if customer is null → throw _____
if status is not _____ → throw _____
set status to _____
repo._____(customer)
log correlation _____

### Step 2 — Fill blanks

Fill with CUS-1002, NotFound, PROSPECT, IllegalState/domain exception, ACTIVE, save/update, lab-request-001.

### Step 3 — Repo boundary note

Write: *Repository saves state; it does not decide PROSPECT→ACTIVE.*

### Step 4 — Self-check

Confirm Ravi starts PROSPECT and ends ACTIVE in the filled sheet.

## Expected result

Filled activate pseudocode with repo boundary called out.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Putting transition ifs in repository | Keep rules in service |
| Activating Amina as the happy path | Use Ravi PROSPECT as the demo path |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | All _____ replaced | Pass / Fail |
| 2 | PROSPECT→ACTIVE correct | Pass / Fail |
| 3 | Repo boundary sentence present | Pass / Fail |
