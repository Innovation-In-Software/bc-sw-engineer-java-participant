# Exercise 1 — Spring Kafka Roles

**Module 31** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Connect KafkaTemplate and @KafkaListener to producer/consumer concepts.

## Reference

| Kafka idea | Spring Boot piece |
| --- | --- |
| Produce record | KafkaTemplate.send(...) |
| Consume record | @KafkaListener |
| Bootstrap servers | spring.kafka.bootstrap-servers |
| Group id | spring.kafka.consumer.group-id |

## Steps

### Step 1 — Study table

Copy the reference table into `notes/lab31-spring-kafka.md`.

### Step 2 — CRM story

Write: after HTTP creates Amina, service calls `KafkaTemplate` to `crm.customer-events.v1` with key `CUS-1001`.

### Step 3 — Listener story

Write: notifications listener uses group `crm-notifications` and processes the JSON envelope.

### Step 4 — Gap check

List one question you still have about serializers (String/JSON) before lab.

## Expected result

Role mapping notes with a CRM produce/consume story.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Table copied | Pass / Fail |
| 2 | Produce + listen stories written | Pass / Fail |
| 3 | One serializer question listed | Pass / Fail |
