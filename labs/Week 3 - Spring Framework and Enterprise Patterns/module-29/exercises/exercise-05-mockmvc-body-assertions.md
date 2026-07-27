# Exercise 5 — MockMvc Body Assertions Plan

**Module 29** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Plan tests that check JSON fields, not only HTTP status.

## Steps

### Step 1 — Cases

In `notes/mockmvc-body-plan.md`: invalid POST; GET `CUS-9999`; duplicate `CUS-1001`; happy GET Amina.

### Step 2 — Assertions

For failures, assert `status`, `message`/`error`, and `correlationId` exist.

### Step 3 — Security coexistence

If Lab 28 is complete, note tests may need auth headers — do not remove security.

### Step 4 — Boundary

Do not implement full MockMvc classes in pre-lab.

## Expected result

Body-assertion test plan ready.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Four cases listed | Pass / Fail |
| 2 | Envelope field assertions named | Pass / Fail |
| 3 | Security coexistence noted | Pass / Fail |
