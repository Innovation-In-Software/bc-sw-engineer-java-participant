# Exercise 2 — SecurityFilterChain Sketch

**Module 28** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Sketch Lab 28 security components without implementing them.

## Reference

| Component | Role |
| --- | --- |
| SecurityFilterChain | Authorize HTTP requests |
| JwtService | Issue/parse tokens |
| JwtAuthenticationFilter | Read Bearer header |
| CrmUserDetailsService | Load lab users/roles |

## Steps

### Step 1 — Component list

In `notes/filter-chain.md`, list the four components from the reference.

### Step 2 — Session policy

Write: session creation policy STATELESS for JWT APIs.

### Step 3 — Route rules

`/api/auth/login` permitAll; `/api/customers/**` AGENT/ADMIN; `/api/admin/**` ADMIN only.

### Step 4 — CSRF note

For stateless Bearer APIs, CSRF is typically disabled — confirm in lab guide.

## Expected result

Filter-chain sketch and route rules ready.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Four components listed | Pass / Fail |
| 2 | STATELESS noted | Pass / Fail |
| 3 | Route role rules written | Pass / Fail |
