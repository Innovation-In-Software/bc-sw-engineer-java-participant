# Exercise 2 — Plan JDK 21 Verify Job

**Module 43** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Specify setup-java and Maven verify without skipping tests.

## Steps

### Step 1 — Setup

List Actions steps: checkout, setup-java Temurin 21 with Maven cache, `./mvnw -B clean verify`.

### Step 2 — Check the reference

Upload Surefire/Failsafe reports even on failure (`if: always()`).

### Step 3 — Failure drill plan

Write how you will intentionally break one test, observe CI red, then restore (plan only).

### Step 4 — Local habit

Note local preflight: `java -version` shows 21; `./mvnw -v` before pushing.

## Expected result

Verify job plan with report upload and failure drill notes.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | JDK 21 + mvnw verify listed | Pass / Fail |
| 2 | Report upload planned | Pass / Fail |
| 3 | Failure drill described | Pass / Fail |
