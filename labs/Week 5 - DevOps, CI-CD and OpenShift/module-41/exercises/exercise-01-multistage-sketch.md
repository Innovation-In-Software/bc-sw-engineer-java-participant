# Exercise 1 — Sketch Multi-Stage Build

**Module 41** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Separate Maven build stage from JRE runtime stage on paper.

## Reference

| Stage | Contains | Must not contain |
| --- | --- | --- |
| build | JDK 21, Maven, sources | runtime secrets |
| runtime | JRE, app JAR, non-root user | Maven, .git, passwords |

## Steps

### Step 1 — Stages

Name two stages: `build` (Maven + JDK 21) and `runtime` (JRE 21). List what copies between them (the JAR only).

### Step 2 — Check the reference

Runtime must not include Maven, source, or `.git`. Prefer Temurin/Eclipse JRE base images as instructed.

### Step 3 — User

Plan non-root UID (example `10001`) and note why root fails the lab.

### Step 4 — CRM note

State that fixtures `CUS-1001`/`CUS-1002` are app data at runtime—not build args.

## Expected result

A two-stage Dockerfile sketch with non-root runtime intent.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Build vs runtime separated | Pass / Fail |
| 2 | JAR-only copy planned | Pass / Fail |
| 3 | Non-root UID noted | Pass / Fail |
