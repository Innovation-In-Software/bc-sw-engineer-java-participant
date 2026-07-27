# Exercise 4 — Fill Activate Interaction Sequence TODOs

**Module 18** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete fill-in blanks for the activate interaction sequence.

## Steps

### Step 1 — Copy sequence

Create `notes/lab18-interaction-todos.md` and paste:

1) stub findById(_____) → ravi PROSPECT
2) call service._____(…)
3) verify repo._____(customer)
4) verify notifier._____(…)  // if present
5) assert status _____
6) ArgumentCaptor previews status field _____

### Step 2 — Fill blanks

Fill CUS-1002, activate, save/update, notifyActivated, ACTIVE, ACTIVE.

### Step 3 — Captor preview

One sentence: captors prove the saved Customer carried ACTIVE, not only that save was called.

### Step 4 — Self-check

Confirm step 1 id is CUS-1002 and final status ACTIVE.

## Expected result

Filled interaction TODOs with ArgumentCaptor preview note.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Only verify(save) without state check | Captor or assert on saved status |
| Stubbing unused methods | Stub findById only if activate needs it |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | All _____ replaced | Pass / Fail |
| 2 | Captor benefit sentence present | Pass / Fail |
| 3 | Ravi path correct | Pass / Fail |
