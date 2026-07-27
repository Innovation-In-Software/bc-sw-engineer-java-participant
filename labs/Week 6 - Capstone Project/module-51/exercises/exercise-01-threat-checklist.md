# Exercise 1 — Capstone Threat Checklist

**Module 51** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

List top threats for the CRM release candidate.

## Steps

### Step 1 — Threats

Broken authz on customer IDs, secret leakage, vulnerable deps, mutable image tags, failed rollback.

### Step 2 — Check the reference

Lab 51 combines JWT/RBAC, pipeline SAST, immutable images, k3s, smoke/rollback.

### Step 3 — Fixtures

Negative tests should use synthetic IDs (`CUS-1001`)—never real customers.

### Step 4 — Save

Write `lab51-threat-checklist.md`.

## Expected result

Threat checklist aligned to Lab 51 themes.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Five threats listed | Pass / Fail |
| 2 | Synthetic fixtures noted | Pass / Fail |
| 3 | Notes saved | Pass / Fail |
