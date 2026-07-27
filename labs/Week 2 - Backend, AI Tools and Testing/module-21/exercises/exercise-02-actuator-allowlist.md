# Exercise 2 — Actuator Allow-List

**Module 21** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

Draft which Actuator endpoints may be exposed in lab vs locked down.

## Steps

### Step 1 — Candidates

health, info, metrics, prometheus — list on paper.

### Step 2 — Allow-list

Lab allow: health (and maybe info); lock env/beans/configprops.

### Step 3 — Auth note

One sentence: production metrics scrapes need network policy/auth.

### Step 4 — Prep only

Write: *Prepare for Lab 21; do not open all Actuator endpoints in prep.*

## Expected result

An Actuator allow-list with lockdown items.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Allow items listed | Pass / Fail |
| 2 | Lockdown items listed | Pass / Fail |
| 3 | Auth/network note present | Pass / Fail |
