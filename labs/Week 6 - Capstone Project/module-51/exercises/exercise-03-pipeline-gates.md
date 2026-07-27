# Exercise 3 — Outline Delivery Gates

**Module 51** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

List pipeline stages required for capstone delivery.

## Steps

### Step 1 — Stages

build, test, SAST/Dependency-Check, package image, (deploy as authorized).

### Step 2 — Check the reference

SAST gate must be able to fail the pipeline.

### Step 3 — Secrets

Checklist: no credentials in YAML; use Actions secrets.

### Step 4 — Artifact identity

Require digest/checksum recorded for promotion.

## Expected result

Delivery gate outline with failing SAST and digest identity.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Stages listed | Pass / Fail |
| 2 | Failing SAST required | Pass / Fail |
| 3 | Digest identity required | Pass / Fail |
