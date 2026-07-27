# Exercise 3 — Package-Once Identity

**Module 43** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Explain why the JAR verified in CI must be the one promoted later.

## Steps

### Step 1 — Steps

Outline: package once, write `SHA256SUMS`, record `GITHUB_SHA`, upload artifact.

### Step 2 — Check the reference

Lab 44 promotes this identity—rebuilding silently on the deploy agent breaks the chain.

### Step 3 — Example lines

Draft example checksum file lines (fake hashes OK) including commit id.

### Step 4 — Anti-pattern

Name one anti-pattern: packaging differently in deploy than in CI.

## Expected result

Immutable JAR identity plan linked to Lab 44.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Checksum + commit recorded | Pass / Fail |
| 2 | Promotion link stated | Pass / Fail |
| 3 | Anti-pattern named | Pass / Fail |
