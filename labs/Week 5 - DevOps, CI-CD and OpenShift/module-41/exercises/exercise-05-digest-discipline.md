# Exercise 5 — Digest vs Latest

**Module 41** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Explain why `:latest` is insufficient for later k3s deploys.

## Steps

### Step 1 — Define

In two sentences, define image digest vs mutable tag.

### Step 2 — Check the reference

Lab 42/44 promote by digest; `:latest` can drift between staging and prod.

### Step 3 — CRM example

Write an example tag scheme: `crm-api:lab41` plus digest note placeholder `sha256:_____`.

### Step 4 — Runbook heading

Add a `docs/container-runbook.md` heading list: build, inspect user, run, stop, digest capture.

## Expected result

Digest discipline and runbook headings documented.

## If it fails

| Problem | Fix |
| --- | --- |
| Pushing only :latest | Record digest for promotion |
| Embedding .env in image | Inject at run/deploy time |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Digest vs tag explained | Pass / Fail |
| 2 | Example tag scheme written | Pass / Fail |
| 3 | Runbook headings listed | Pass / Fail |
