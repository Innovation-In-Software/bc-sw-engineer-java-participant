# Exercise 5 — Propagation Warnings

**Module 27** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Flag common AI/propagation mistakes before Lab 27.

## Steps

### Step 1 — List risks

In `notes/propagation-warnings.md`: NOT_SUPPORTED mid-transfer; REQUIRES_NEW for the log only; self-invocation bypassing proxy.

### Step 2 — Preferred default

Default REQUIRED on the outer transfer method is enough for this lab.

### Step 3 — Proxy note

Calling `this.transfer` inside the same class may skip the Spring proxy.

### Step 4 — Boundary

Do not configure custom managers — Boot defaults suffice for Lab 27.

## Expected result

Propagation risks and defaults documented.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Three risks listed | Pass / Fail |
| 2 | REQUIRED default stated | Pass / Fail |
| 3 | Self-invocation warning present | Pass / Fail |
