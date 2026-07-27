# Exercise 5 — Actions Secrets Checklist

**Module 43** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

List what may live in Git vs Actions secrets vs local only.

## Steps

### Step 1 — Sort

Sort: workflow YAML, README, registry password, kubeconfig, `.env`, scan reports.

### Step 2 — Check the reference

Only non-secret config in Git; credentials in Actions secrets/variables as instructed.

### Step 3 — Leak response

Write three steps if a secret is committed: rotate, purge history per policy, notify instructor.

### Step 4 — CRM note

Customer fixtures are not secrets—but real customer dumps are forbidden.

## Expected result

Secrets checklist with leak response.

## If it fails

| Problem | Fix |
| --- | --- |
| Hardcoding tokens in ci.yml | Use Actions secrets |
| Skipping tests to go green | Fix or quarantine with policy |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Items classified | Pass / Fail |
| 2 | Leak response has three steps | Pass / Fail |
| 3 | Fixture vs secret clarified | Pass / Fail |
