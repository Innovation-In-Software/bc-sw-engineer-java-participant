# Exercise 1 — Authentication Versus Authorization

**Module 28** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Explain 401 vs 403 with Northstar agent/admin examples.

## Reference

| Status | Meaning | CRM example |
| --- | --- | --- |
| 401 | Not authenticated | No/invalid Bearer token |
| 403 | Authenticated but forbidden | `agent1` hits `/api/admin/**` |
| 200 | Allowed | `agent1` GET `CUS-1001` |

## Steps

### Step 1 — Define

In `notes/authn-authz.md`, define authentication and authorization in one sentence each.

### Step 2 — Check the reference

Fill a 401/403/200 example row matching the table.

### Step 3 — Lab users

Record `agent1` (AGENT) and `admin1` (ADMIN).

### Step 4 — Correlation ≠ auth

`lab-request-001` is operational metadata — never treat it as a credential.

## Expected result

401/403/200 CRM examples and lab users documented.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Authn vs authz defined | Pass / Fail |
| 2 | 401/403 examples correct | Pass / Fail |
| 3 | Correlation-not-auth stated | Pass / Fail |
