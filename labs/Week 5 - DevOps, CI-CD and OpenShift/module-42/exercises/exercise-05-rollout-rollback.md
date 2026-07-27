# Exercise 5 — Rollout and Rollback Checklist

**Module 42** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

List commands/checks for rollout success and undo rehearsal.

## Steps

### Step 1 — Rollout watch

List: `kubectl rollout status`, pod Ready, Ingress HTTP check, CRM get `CUS-1001`.

### Step 2 — Check the reference

Rollback rehearses a bad revision then `rollout undo` to known-good digest.

### Step 3 — Evidence

Name screenshot folders under `notes/screenshots/lab-42/` for before/after.

### Step 4 — Correlation

Include header `lab-request-001` on smoke calls in the checklist.

## Expected result

Rollout/rollback checklist with evidence paths.

## If it fails

| Problem | Fix |
| --- | --- |
| Committing kubeconfig | Keep credentials out of Git |
| Skipping rollback rehearsal | Practice undo before claiming done |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Rollout checks listed | Pass / Fail |
| 2 | Undo rehearsal included | Pass / Fail |
| 3 | Correlation header noted | Pass / Fail |
