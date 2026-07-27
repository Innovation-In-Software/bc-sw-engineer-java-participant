# Exercise 4 — Fill ci.yml TODOs

**Module 43** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete a workflow skeleton with blanks (do not require a passing remote run).

## Steps

### Step 1 — Skeleton

Create notes `ci.yml.skeleton` with blanks for `java-version`, verify command, artifact paths, and package `if:` condition.

### Step 2 — Fill

Fill blanks using Temurin 21 and `./mvnw -B clean verify` / package-once pattern.

### Step 3 — Secrets comment

Add a YAML comment: `# secrets via GitHub Actions secrets — never hardcode`.

### Step 4 — Scope

State that pushing and greening the workflow is Lab 43, not this exercise.

## Expected result

Filled workflow skeleton ready for Lab 43.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Blanks filled for Java/verify/package | Pass / Fail |
| 2 | Secrets comment present | Pass / Fail |
| 3 | Pre-lab scope stated | Pass / Fail |
