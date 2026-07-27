# Exercise 1 — Define Pipeline Triggers

**Module 43** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Decide what runs on pull_request, main push, and version tags.

## Reference

| Event | Verify | Package JAR+SHA |
| --- | --- | --- |
| pull_request | Yes | No (typical) |
| push main | Yes | Yes |
| tag v* | Yes | Yes |

## Steps

### Step 1 — Matrix

Fill a table: event → jobs (verify always; package on main/tags; deploy later/not yet).

### Step 2 — Check the reference

Leadership: PRs get fast feedback; main/tags get stronger gates; deploy creds never in Git.

### Step 3 — CRM identity

Note synthetic fixtures may appear only in test evidence (`CUS-1001`, `lab-request-001`).

### Step 4 — Save

Write `ci-policy-draft.md`.

## Expected result

Trigger/job policy table documented.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Three events covered | Pass / Fail |
| 2 | Verify vs package split clear | Pass / Fail |
| 3 | No secrets in policy | Pass / Fail |
