# Exercise 2 — ConfigMap vs Secret Split

**Module 42** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Classify CRM settings into ConfigMap vs Secret.

## Steps

### Step 1 — Sort list

Sort: datasource URL host, DB password, Kafka bootstrap, JWT issuer URI, log level, feature flags.

### Step 2 — Check the reference

Secret data is created out-of-band; Git only gets `secret.example.yaml` without values.

### Step 3 — CRM fixtures

Confirm `CUS-1001`/`CUS-1002` are app fixtures, not K8s config keys.

### Step 4 — Write table

Save a two-column table in notes.

## Expected result

Config vs Secret classification table saved.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Every setting classified | Pass / Fail |
| 2 | secret.example pattern stated | Pass / Fail |
| 3 | Fixtures not in ConfigMap | Pass / Fail |
