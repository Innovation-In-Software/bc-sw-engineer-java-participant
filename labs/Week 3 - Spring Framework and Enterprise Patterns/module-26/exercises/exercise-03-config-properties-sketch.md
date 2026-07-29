# Exercise 3 — ConfigurationProperties Sketch

**Module 26** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/northstar-props.md` — sketch `NorthstarIntegrationProperties` fields without real secrets.

## Deliverable

| Item | Path (under `examples/module-26-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-03-config-properties-sketch.md` (this file in the course repo) |
| Your notes file | `notes/northstar-props.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-26-exercises/`, create `notes/` if needed, then create `notes/northstar-props.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 26 — ConfigurationProperties Sketch

## Step 1 — Fields

In `notes/northstar-props.md`, list placeholder fields: `apiBaseUrl`, `apiKey` (env-only in prod), `connectTimeoutMs`.

## Step 2 — Prefix

Propose YAML prefix `northstar.integration`.

## Step 3 — Fail-fast

Write: prod must fail startup if `DB_USERNAME` / `DB_PASSWORD` / `NORTHSTAR_API_KEY` missing.

## Step 4 — .env.example

List placeholder keys only — never real values.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Typed config sketch and fail-fast rule documented in `notes/northstar-props.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/northstar-props.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 26 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/northstar-props.md` | Pass / Fail |
| 2 | Three fields listed | Pass / Fail |
| 3 | Fail-fast prod rule written | Pass / Fail |
| 4 | No real secrets | Pass / Fail |
