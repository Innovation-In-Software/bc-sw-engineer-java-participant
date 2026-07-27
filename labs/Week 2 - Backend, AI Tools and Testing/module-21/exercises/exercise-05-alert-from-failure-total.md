# Exercise 5 — Alert from create_failure_total

**Module 21** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Write a mini runbook for a create_failure_total alert.

## Steps

### Step 1 — Signal

Alert when create_failure_total rate exceeds threshold for N minutes.

### Step 2 — Triage

Check Actuator/health, then logs filtered by correlation examples.

### Step 3 — CRM check

Reproduce create for a PROSPECT-shaped payload (Ravi-like) in non-prod.

### Step 4 — Capture

Save under `notes/lab21-alert-runbook.md`.

## Expected result

A short alert runbook tied to create_failure_total.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Signal defined | Pass / Fail |
| 2 | Triage steps listed | Pass / Fail |
| 3 | Notes saved | Pass / Fail |
