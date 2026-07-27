# Exercise 5 — UsernameToken Plan

**Module 24** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Outline UsernameToken evidence without implementing JWT.

## Steps

### Step 1 — Happy path

In `notes/usernametoken-plan.md`: secured GetCustomer for `CUS-1001` succeeds.

### Step 2 — Failure path

Missing/invalid token produces a distinct fault from not-found.

### Step 3 — Secret hygiene

Lab secrets stay in local config / `.env.example` placeholders — never real prod passwords.

### Step 4 — Not JWT

Explicitly defer Bearer JWT filter chains to Lab 28.

## Expected result

UsernameToken plan distinguishes security faults from not-found.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Happy and failure paths listed | Pass / Fail |
| 2 | Secret hygiene stated | Pass / Fail |
| 3 | JWT deferred to Lab 28 | Pass / Fail |
