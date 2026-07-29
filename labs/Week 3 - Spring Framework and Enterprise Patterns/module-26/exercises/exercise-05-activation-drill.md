# Exercise 5 — Activation Command Drill

**Module 26** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/activation-commands.md` — produce Windows and macOS activation command examples for notes.

## Deliverable

| Item | Path (under `examples/module-26-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-05-activation-drill.md` (this file in the course repo) |
| Your notes file | `notes/activation-commands.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-26-exercises/`, create `notes/` if needed, then create `notes/activation-commands.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 26 — Activation Command Drill

## Step 1 — -D form

In `notes/activation-commands.md`, write `mvn spring-boot:run -Dspring-boot.run.arguments=--spring.profiles.active=dev` or equivalent `-Dspring.profiles.active=dev` style used in your lab guide.

## Step 2 — Env form

Windows: `$env:SPRING_PROFILES_ACTIVE="test"` · macOS: `export SPRING_PROFILES_ACTIVE=test`.

## Step 3 — Prod caution

Do not run prod profile without required env vars — expect fail-fast.

## Step 4 — Boundary

Do not start the full Lab 26 app in this exercise unless instructor asks.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Activation commands documented for both OS styles in `notes/activation-commands.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/activation-commands.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 26 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/activation-commands.md` | Pass / Fail |
| 2 | `-D` example present | Pass / Fail |
| 3 | Env-var example present | Pass / Fail |
| 4 | Prod fail-fast caution written | Pass / Fail |
