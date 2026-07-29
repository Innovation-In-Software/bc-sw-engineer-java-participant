# Exercise 3 — AI Review Policy

**Module 25** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/ai-review-policy.md` — document accept/reject criteria for AI drafts in Lab 25.

## Deliverable

| Item | Path (under `examples/module-25-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-04-ai-review-policy.md` (this file in the course repo) |
| Your notes file | `notes/ai-review-policy.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-25-exercises/`, create `notes/` if needed, then create `notes/ai-review-policy.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 25 — AI Review Policy

## Reference

| Suggestion | Verdict |
| --- | --- |
| Service returns ResponseEntity | Reject |
| Controller calls Map store directly | Reject |
| Service uses repository interface | Accept after review |
| Hard-coded prod password | Reject |

## Step 1 — Write policy

Create `notes/ai-review-policy.md` with correlation id `lab25-001` header.

## Step 2 — Accept/reject rows

Copy the reference table and add one row of your own.

## Step 3 — Manual fallback

Note: if Copilot is unavailable, mark N/A and complete layering manually.

## Step 4 — Boundary

Pre-lab does not generate production code via AI — policy only.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

AI review policy with lab25-001 is ready in `notes/ai-review-policy.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/ai-review-policy.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 25 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/ai-review-policy.md` | Pass / Fail |
| 2 | lab25-001 present | Pass / Fail |
| 3 | At least four accept/reject rows | Pass / Fail |
| 4 | Manual fallback noted | Pass / Fail |
