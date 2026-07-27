# Exercise 1 — Build Shared Fact Base

**Module 47** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Assemble confirmed facts vs assumptions for CRM 1.4 stress.

## Reference

| Audience | Needs |
| --- | --- |
| Responders | Symptoms, impact, next update time |
| Engineers | Change, evidence, rollback |
| Reviewers | PR verify + risk |
| Stakeholders | Business impact, ETA, no jargon pile-up |

## Steps

### Step 1 — Lab scenario

Use: SEV-2, some agents HTTP 503 opening profiles, start time UTC placeholder, suspected `crm-api` 1.4.0, fixtures `CUS-1001`/`CUS-1002`, correlation `lab-request-001`.

### Step 2 — Check the reference

Separate confirmed / assumed / unknown in three lists.

### Step 3 — Mitigation stub

Note rollback toward 1.3.2 digest + watch readiness/Kafka lag (from prior labs).

### Step 4 — Save

Write `communications/fact-base.md` outline (folder may be created in Lab 47).

## Expected result

Fact base with confirmed/assumed/unknown split.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | SEV and symptom stated | Pass / Fail |
| 2 | Three lists present | Pass / Fail |
| 3 | Fixtures consistent | Pass / Fail |
