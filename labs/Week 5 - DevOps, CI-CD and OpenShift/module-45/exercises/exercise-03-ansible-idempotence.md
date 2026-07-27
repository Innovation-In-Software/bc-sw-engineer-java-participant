# Exercise 3 — Ansible Idempotence Notes

**Module 45** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Describe idempotent Ansible tasks for a CRM host sketch.

## Steps

### Step 1 — Modules

Name modules/handlers you expect (package, service, copy/template, handler restart).

### Step 2 — Check the reference

Second run should be no-change when authorized; prove with lint/syntax first.

### Step 3 — Ownership/modes

Note file ownership/modes matter for app config files.

### Step 4 — Inventory

Commit only `inventory.example.yml`—never real host credentials.

## Expected result

Ansible idempotence and inventory hygiene notes.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Modules named | Pass / Fail |
| 2 | Second-run expectation stated | Pass / Fail |
| 3 | Example inventory only | Pass / Fail |
