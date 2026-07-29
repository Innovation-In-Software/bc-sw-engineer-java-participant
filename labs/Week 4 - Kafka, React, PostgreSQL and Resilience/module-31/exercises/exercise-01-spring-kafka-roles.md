# Exercise 1 — Spring Kafka Roles

**Module 31** · Analysis exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab31-spring-kafka.md` — connect KafkaTemplate and @KafkaListener to producer/consumer concepts.

## Deliverable

| Item | Path (under `examples/module-31-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-01-spring-kafka-roles.md` (this file in the course repo) |
| Your notes file | `notes/lab31-spring-kafka.md` |

## Steps

### Step 1 — Create the notes file

From `examples/module-31-exercises/`, create `notes/` if needed, then create `notes/lab31-spring-kafka.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 31 — Spring Kafka Roles

## Reference

| Kafka idea | Spring Boot piece |
| --- | --- |
| Produce record | KafkaTemplate.send(...) |
| Consume record | @KafkaListener |
| Bootstrap servers | spring.kafka.bootstrap-servers |
| Group id | spring.kafka.consumer.group-id |

## Step 1 — Study table

Copy the reference table into `notes/lab31-spring-kafka.md`.

## Step 2 — CRM story

Write: after HTTP creates Amina, service calls `KafkaTemplate` to `crm.customer-events.v1` with key `CUS-1001`.

## Step 3 — Listener story

Write: notifications listener uses group `crm-notifications` and processes the JSON envelope.

## Step 4 — Gap check

List one question you still have about serializers (String/JSON) before lab.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Role mapping notes with a CRM produce/consume story in `notes/lab31-spring-kafka.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab31-spring-kafka.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 31 |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | File exists at `notes/lab31-spring-kafka.md` | Pass / Fail |
| 2 | Table copied | Pass / Fail |
| 3 | Produce + listen stories written | Pass / Fail |
| 4 | One serializer question listed | Pass / Fail |
