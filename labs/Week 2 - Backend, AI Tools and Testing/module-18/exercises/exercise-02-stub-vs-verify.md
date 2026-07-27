# Exercise 2 — Stub vs Verify

**Module 18** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Explain stubbing return values versus verifying calls for activate.

## Steps

### Step 1 — Stub

`when(repo.findById("CUS-1002")).thenReturn(raviProspect)` — arrange.

### Step 2 — Verify

`verify(repo).save(…)` — assert collaboration happened.

### Step 3 — Both

One sentence: stubs feed inputs; verifies prove side-effect calls.

### Step 4 — Capture

Save under `notes/lab18-stub-verify.md`. Pre-lab only.

## Expected result

Clear stub vs verify examples using CUS-1002.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Stub example written | Pass / Fail |
| 2 | Verify example written | Pass / Fail |
| 3 | Contrast sentence present | Pass / Fail |
