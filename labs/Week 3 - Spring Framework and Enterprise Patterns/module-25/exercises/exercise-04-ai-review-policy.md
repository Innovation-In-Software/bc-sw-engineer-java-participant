# Exercise 3 — AI Review Policy

**Module 25** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Document accept/reject criteria for AI drafts in Lab 25.

## Reference

| Suggestion | Verdict |
| --- | --- |
| Service returns ResponseEntity | Reject |
| Controller calls Map store directly | Reject |
| Service uses repository interface | Accept after review |
| Hard-coded prod password | Reject |

## Steps

### Step 1 — Write policy

Create `notes/ai-review-policy.md` with correlation id `lab25-001` header.

### Step 2 — Accept/reject rows

Copy the reference table and add one row of your own.

### Step 3 — Manual fallback

Note: if Copilot is unavailable, mark N/A and complete layering manually.

### Step 4 — Boundary

Pre-lab does not generate production code via AI — policy only.

## Expected result

AI review policy with lab25-001 is ready.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | lab25-001 present | Pass / Fail |
| 2 | At least four accept/reject rows | Pass / Fail |
| 3 | Manual fallback noted | Pass / Fail |
