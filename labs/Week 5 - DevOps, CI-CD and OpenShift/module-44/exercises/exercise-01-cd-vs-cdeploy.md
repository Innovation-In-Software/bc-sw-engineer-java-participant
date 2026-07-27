# Exercise 1 — Delivery vs Deployment

**Module 44** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Explain CD concepts in Northstar CRM language.

## Reference

| Term | Meaning |
| --- | --- |
| Continuous delivery | Main stays releasable; promote with gates |
| Continuous deployment | Every green build may auto-prod |
| Immutable identity | Digest/checksum, not :latest |

## Steps

### Step 1 — Definitions

Write two sentences: continuous delivery (always releasable) vs continuous deployment (auto-prod).

### Step 2 — Check the reference

This cohort emphasizes delivery with gates/approvals—not blind auto-prod.

### Step 3 — CRM example

Describe promoting `crm-api` digest that passed staging smoke for `CUS-1001`.

### Step 4 — Quiz yourself

Answer: if staging said GO on digest X, what must prod receive?

## Expected result

Clear CD definitions with CRM promotion example.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Both terms defined | Pass / Fail |
| 2 | Gated delivery preferred | Pass / Fail |
| 3 | Digest X answer correct | Pass / Fail |
