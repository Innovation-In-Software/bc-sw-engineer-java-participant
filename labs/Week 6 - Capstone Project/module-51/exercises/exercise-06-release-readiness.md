# Exercise 6 — Release Readiness Scorecard

**Module 51** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Score readiness categories Pass/Fail as planning targets.

## Steps

### Step 1 — Categories

Authz negatives, pipeline SAST, digest pin, deploy manifests, smoke, rollback, secrets hygiene.

### Step 2 — Honest baseline

Mark current pre-lab status (likely Fail/Pending)—not fake Pass.

### Step 3 — Owners

Assign a teammate owner per Fail/Pending row.

### Step 4 — Save

Save `lab51-readiness-scorecard.md`.

## Expected result

Honest readiness scorecard with owners.

## If it fails

| Problem | Fix |
| --- | --- |
| Shipping on :latest | Pin digest |
| Green build with skipped SAST | Keep the gate |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Categories listed | Pass / Fail |
| 2 | No fake Pass on undone work | Pass / Fail |
| 3 | Owners assigned | Pass / Fail |
