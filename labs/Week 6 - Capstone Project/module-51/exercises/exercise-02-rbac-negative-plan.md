# Exercise 2 — Plan RBAC Negative Tests

**Module 51** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Design deny-by-default proofs before coding.

## Reference

| Proof | Evidence idea |
| --- | --- |
| JWT resource server | Security tests + config snippets |
| SAST gate | CI log / scan summary sanitized |
| Image digest | sha256 record in manifest |
| k3s deploy | rollout status + Ingress smoke |
| Rollback | undo + readiness re-check |

## Steps

### Step 1 — Cases

No token → 401; wrong role → 403; cross-customer access denied (as designed).

### Step 2 — Check the reference

Feature-complete is not release-ready without negative authz tests.

### Step 3 — Matrix

Make a small role × endpoint matrix with expected status codes.

### Step 4 — Scope

Plan only—implementation in Lab 51.

## Expected result

RBAC negative-test matrix drafted.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Three negative cases listed | Pass / Fail |
| 2 | Role×endpoint matrix present | Pass / Fail |
| 3 | Pre-lab marked | Pass / Fail |
