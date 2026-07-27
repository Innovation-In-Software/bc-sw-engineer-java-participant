# Exercise 6 — Tie Observability to Release Watch

**Module 46** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Connect Lab 44 watch windows to Kafka lag/DLT signals.

## Steps

### Step 1 — Watch list

During a `crm-api` release watch, list signals: readiness, error rate, consumer lag, DLT count.

### Step 2 — Check the reference

Observability evidence supports go/no-go and rollback decisions.

### Step 3 — Scenario

If lag spikes after 1.4.0 while agents fail on `CUS-1001`, what is your first check?

### Step 4 — Save

Write `release-watch-kafka.md`.

## Expected result

Release-watch signal list with first-check answer.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Four signals listed | Pass / Fail |
| 2 | First-check answered | Pass / Fail |
| 3 | Notes saved | Pass / Fail |
