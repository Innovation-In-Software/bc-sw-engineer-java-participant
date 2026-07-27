# Exercise 3 — Walk the Maven Lifecycle

**Module 9** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Create `lifecycle-notes.md` mapping each major phase to what it proves for Northstar CRM.

## Lifecycle (default)

```text
validate → compile → test → package → verify → install → deploy
```

| Phase | What it proves |
| ----- | -------------- |
| `validate` | POM/model is structurally OK |
| `compile` | Production sources compile to `target/classes` |
| `test` | Unit tests under Surefire pass |
| `package` | Artifact exists under `target/` (e.g. JAR) |
| `verify` | Extra checks/integrations tied to the package succeed |
| `install` | Artifact copied into the local `~/.m2` repository |
| `deploy` | Artifact published to a remote repository (CI/release, not casual laptop) |

## Steps

### Step 1 — Match command to intent

| Intent | Command |
| ------ | ------- |
| Confirm POM parses before coding further | |
| Compile production Java only (stops before tests if you use the phase carefully) | |
| Run unit tests | |
| Produce `target/customer-service.jar` | |
| Run package plus verification checks CI cares about | |
| Put the JAR into your local Maven cache | |

### Step 2 — Check the reference

| Intent | Command |
| ------ | ------- |
| Confirm POM | `mvn validate` |
| Compile | `mvn compile` |
| Unit tests | `mvn test` |
| Produce JAR | `mvn package` |
| CI-style checks | `mvn verify` (often `mvn -B verify`) |
| Local `.m2` | `mvn install` |

### Step 3 — Order the walk

Number these 1–6 for a first-time Lab 9 walk (do **not** include `deploy`):

- `package`
- `validate`
- `install`
- `compile`
- `verify`
- `test`

**Expected order:** `validate` → `compile` → `test` → `package` → `verify` → `install`

### Step 4 — Explain why CI prefers `verify`

Write:

> Continuous Integration usually runs `mvn -B verify` so the build is batch/non-interactive and stops after verification without casually installing or deploying from every laptop.

Also note: `deploy` belongs to release/CI credentialed publishing, not Module 9 classroom machines.

## Expected result

You can name each phase, pick the right command, and explain why classroom/CI stops at `verify` unless install is intentional.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Six intent → command rows match | Pass / Fail |
| 2 | Lifecycle order is correct without `deploy` | Pass / Fail |
| 3 | You state why CI uses `mvn -B verify` | Pass / Fail |
