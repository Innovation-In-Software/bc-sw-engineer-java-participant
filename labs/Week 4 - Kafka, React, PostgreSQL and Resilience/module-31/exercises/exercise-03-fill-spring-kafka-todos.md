# Exercise 5 — Fill Spring Kafka TODOs

**Module 31** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Fill TODOs in a tiny Spring Kafka pseudocode snippet.

## Steps

### Step 1 — Paste snippet

Create `notes/lab31-todos.md`:

```java
// application.yml ideas
spring.kafka.bootstrap-servers: _____
spring.kafka.consumer.group-id: _____

@Service
class CustomerEventPublisher {
  private final KafkaTemplate<String, String> template;
  void publishCreated(String customerId, String json) {
    template.send("_____", customerId, json); // topic
  }
}

@KafkaListener(topics = "_____", groupId = "crm-notifications")
void onEvent(String payload) { /* TODO: parse + idempotent handle */ }
```

### Step 2 — Fill blanks

Fill with: `localhost:9092` (or instructor bootstrap), `crm-notifications`, `crm.customer-events.v1` (twice).

### Step 3 — Key reminder

Add a comment: key argument must be `CUS-1001` / `CUS-1002`, not a random UUID.

### Step 4 — DLT blank

Add one line TODO: `// TODO Lab 31: route poison messages to crm.customer-events.v1.dlq`.

## Expected result

Pseudocode with topic/bootstrap/group filled and key/DLT reminders.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Using null key on send | Always pass customerId as the Kafka key |
| Same groupId for notifications and audit | Use distinct groups for independent consumption |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | All _____ replaced | Pass / Fail |
| 2 | Customer ID key comment present | Pass / Fail |
| 3 | DLT TODO line present | Pass / Fail |
