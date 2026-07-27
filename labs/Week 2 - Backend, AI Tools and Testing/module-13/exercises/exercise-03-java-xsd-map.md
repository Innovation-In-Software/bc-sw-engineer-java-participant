# Exercise 3 — Java to XSD Map

**Module 13** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Map Customer fields to XSD-friendly types for fixtures.

## Reference

| Java idea | XSD idea | Example |
| --- | --- | --- |
| String customerId | xsd:string | CUS-1001 |
| String fullName | xsd:string | Amina Khan |
| enum/status | xsd:string or enum | ACTIVE / PROSPECT |

## Steps

### Step 1 — Copy map

Recreate the table; add Ravi Singh PROSPECT as a second example row set.

### Step 2 — Id pattern

Propose a documentation pattern `CUS-####` (not enforced in code yet).

### Step 3 — Honesty

Note: mapping on paper ≠ generated JAXB yet.

### Step 4 — Boundary

Mark: hosting/codegen with Spring-WS is Lab 24, not this prep.

## Expected result

A Java→XSD map using Amina and Ravi examples.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Table includes both customers | Pass / Fail |
| 2 | Id pattern proposed | Pass / Fail |
| 3 | Lab 24 hosting deferred | Pass / Fail |
