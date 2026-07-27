# Exercise 2 — Property Override Order

**Module 26** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Order CLI, env, profile YAML, and base YAML by precedence.

## Reference

| Rank (highest first) | Source |
| --- | --- |
| 1 | Command-line args / `-D` |
| 2 | Environment variables |
| 3 | Profile-specific YAML |
| 4 | Base `application.yml` |

## Steps

### Step 1 — Rank

In `notes/override-order.md`, number the four sources highest→lowest.

### Step 2 — Check the reference

Compare to the reference table; correct mistakes.

### Step 3 — Activation pair

Write example activations: `-Dspring.profiles.active=dev` and `SPRING_PROFILES_ACTIVE=prod`.

### Step 4 — Measurement plan

Lab 26 asks for measured override evidence — note you will capture it in lab, not here.

## Expected result

Correct precedence and activation examples recorded.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Order matches reference | Pass / Fail |
| 2 | Both activation styles listed | Pass / Fail |
| 3 | Lab measurement deferred explicitly | Pass / Fail |
