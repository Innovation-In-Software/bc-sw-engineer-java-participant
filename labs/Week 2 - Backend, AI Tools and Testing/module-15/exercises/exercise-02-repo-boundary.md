# Exercise 2 — Repository Boundary

**Module 15** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

List what belongs in the repository versus the service.

## Steps

### Step 1 — Repo owns

CRUD by id, existence checks, persistence mapping.

### Step 2 — Service owns

Transition matrix, notifier calls, domain exceptions.

### Step 3 — Anti-pattern

Anti-pattern: `repo.activateCustomer` hiding business rules.

### Step 4 — Capture

Save under `notes/lab15-repo-boundary.md`.

## Expected result

A crisp ownership list for repo vs service.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Repo responsibilities listed | Pass / Fail |
| 2 | Service responsibilities listed | Pass / Fail |
| 3 | Anti-pattern named | Pass / Fail |
