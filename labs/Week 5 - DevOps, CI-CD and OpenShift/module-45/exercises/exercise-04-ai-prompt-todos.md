# Exercise 4 — Fill AI Prompt TODOs

**Module 45** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete a bounded prompt template for scaffolding IaC.

## Steps

### Step 1 — Template

Fill blanks:
```
Goal: _____
Environment: _____
Must include: _____
Must forbid: secrets, public DB, _____
Assumptions: _____
Output files: infra/terraform/*.tf, ansible/site.yml
```

### Step 2 — Harden

Add explicit “do not invent credentials” and “mark TODOs for human review”.

### Step 3 — Rejection plan

Write one AI suggestion you would reject (e.g. 0.0.0.0/0 on DB) and why.

### Step 4 — Scope

Prompt only—full generate/validate is Lab 45.

## Expected result

Constrained AI prompt with a planned rejection.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Template filled | Pass / Fail |
| 2 | Forbid list includes secrets/public DB | Pass / Fail |
| 3 | Rejection example written | Pass / Fail |
