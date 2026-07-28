# Exercise 2 — Bean Lifecycle Callbacks

**Module 22** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Predict when lifecycle callbacks fire for a singleton `CustomerService`.

## Reference

| Callback | When |
| --- | --- |
| `@PostConstruct` | After injection, before traffic |
| `@PreDestroy` | During orderly context shutdown |

## Steps

### Step 1 — Order the phases

Number these: inject dependencies → create bean → `@PostConstruct` → serve requests → `@PreDestroy`.

### Step 2 — Check the reference

Correct order: create → inject → `@PostConstruct` → serve → `@PreDestroy`.

### Step 3 — Evidence plan

Write what log lines you expect once per context start/stop for Lab 22 (no secrets/PII in logs — Lab 20 rules).

### Step 4 — Scope note

State that default scope is singleton unless annotated otherwise.

## Expected result

Lifecycle order and PII-safe evidence plan are documented.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Phase order is correct | Pass / Fail |
| 2 | Evidence plan avoids PII | Pass / Fail |
| 3 | Singleton default is mentioned | Pass / Fail |
