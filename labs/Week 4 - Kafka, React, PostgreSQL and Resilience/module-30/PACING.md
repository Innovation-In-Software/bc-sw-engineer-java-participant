# Module 30 — Learn → Practice → Review (participant)

**Theme:** Event-Driven Architecture with Kafka  
**CRM fixtures:** `CUS-1001` Amina ACTIVE · `CUS-1002` Ravi PROSPECT · keys = customer IDs

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 1–8 EDA vs sync | [Ex 1](exercises/exercise-01-eda-why-async.md) | ~12–15 |
| **B** | 9–14 Kafka core | [Ex 2](exercises/exercise-02-topic-map.md) → [Ex 4](exercises/exercise-04-fill-kafka-basics.md) | ~22–27 |
| **C** | 15–19 messaging | [Ex 3](exercises/exercise-03-envelope-sketch.md) → [Ex 5](exercises/exercise-05-producer-checklist.md) | ~22–27 |
| **D** | 20–22 enterprise | [Ex 6](exercises/exercise-06-lab30-readiness.md) | ~8–10 |
| **E** | 23–26 | [Lab 30](lab30/LAB-30-GUIDE.md) timed ~45 min | ~45 |

## Practice order

**1 → 2 → 4 → 3 → 5 → 6** then Lab 30 (Ex 4 after Ex 2 keeps Kafka vocab next to topic map).

## Do / don't

| Do now | Don't yet |
| --- | --- |
| Topics, keys, envelopes, Compose KRaft plan | Spring `@KafkaListener` (Lab 31) |
| acks=all + idempotence checklist | Resilience4j (Lab 32) |
| Competing vs independent groups on paper | React / PostgreSQL |

## Hard gate before Lab 30

- [ ] Ex 1–6 notes files exist
- [ ] Topic + DLQ names frozen; key = customerId
- [ ] Docker available (or instructor shared bootstrap documented)
