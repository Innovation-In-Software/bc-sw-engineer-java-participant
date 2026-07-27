# Exercise 3 — ConfigurationProperties Sketch

**Module 26** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Sketch `NorthstarIntegrationProperties` fields without real secrets.

## Steps

### Step 1 — Fields

In `notes/northstar-props.md`, list placeholder fields: `apiBaseUrl`, `apiKey` (env-only in prod), `connectTimeoutMs`.

### Step 2 — Prefix

Propose YAML prefix `northstar.integration`.

### Step 3 — Fail-fast

Write: prod must fail startup if `DB_USERNAME` / `DB_PASSWORD` / `NORTHSTAR_API_KEY` missing.

### Step 4 — .env.example

List placeholder keys only — never real values.

## Expected result

Typed config sketch and fail-fast rule documented.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Three fields listed | Pass / Fail |
| 2 | Fail-fast prod rule written | Pass / Fail |
| 3 | No real secrets | Pass / Fail |
