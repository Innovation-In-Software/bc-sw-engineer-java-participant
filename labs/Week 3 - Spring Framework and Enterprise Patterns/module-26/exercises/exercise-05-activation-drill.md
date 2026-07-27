# Exercise 5 — Activation Command Drill

**Module 26** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Produce Windows and macOS activation command examples for notes.

## Steps

### Step 1 — -D form

In `notes/activation-commands.md`, write `mvn spring-boot:run -Dspring-boot.run.arguments=--spring.profiles.active=dev` or equivalent `-Dspring.profiles.active=dev` style used in your lab guide.

### Step 2 — Env form

Windows: `$env:SPRING_PROFILES_ACTIVE="test"` · macOS: `export SPRING_PROFILES_ACTIVE=test`.

### Step 3 — Prod caution

Do not run prod profile without required env vars — expect fail-fast.

### Step 4 — Boundary

Do not start the full Lab 26 app in this exercise unless instructor asks.

## Expected result

Activation commands documented for both OS styles.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | `-D` example present | Pass / Fail |
| 2 | Env-var example present | Pass / Fail |
| 3 | Prod fail-fast caution written | Pass / Fail |
