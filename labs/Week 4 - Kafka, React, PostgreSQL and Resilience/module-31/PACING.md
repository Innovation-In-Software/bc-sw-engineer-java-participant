# Module 31 — Learn → Practice → Review (participant)

**Theme:** Kafka Integration with Spring Boot  
**CRM fixtures:** `CUS-1001` Amina · `CUS-1002` Ravi · topic `crm.customer-events.v1`

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 27–32 Spring Kafka components | [Ex 1](exercises/exercise-01-spring-kafka-roles.md) | ~10–12 |
| **B** | 33–36 KafkaTemplate / serialize | [Ex 3](exercises/exercise-03-fill-spring-kafka-todos.md) | ~10–12 |
| **C** | 37–40 @KafkaListener / groups | [Ex 2](exercises/exercise-02-listener-sketch.md) | ~12–15 |
| **D** | 41–46 errors, DLT, reliability | [Ex 4](exercises/exercise-04-error-dlt-notes.md) → [5](exercises/exercise-05-idempotency-plan.md) → [6](exercises/exercise-06-lab31-readiness.md) | ~30–37 |
| **E** | 47–50 | [Lab 31](lab31/LAB-31-GUIDE.md) timed ~45 min | ~45 |

## Practice order

**1 → 3 → 2 → 4 → 5 → 6** then Lab 31 (producer TODOs before listener sketch).

## Do / don't

| Do now | Don't yet |
| --- | --- |
| KafkaTemplate + @KafkaListener + DLT + idempotency | Resilience4j (Lab 32) |
| Key = customerId; validate key↔payload | React UI / JPA schema changes |
| Integration test (EmbeddedKafka / Testcontainers) | Multi-cluster failover design |

## Hard gate before Lab 31

- [ ] Ex 1–6 notes exist
- [ ] Lab 30 topic names frozen (or EmbeddedKafka plan documented)
- [ ] Idempotency + DLT approach written
