# Module 46 — Learn → Practice → Review (participant)

**Theme:** Kafka Resilience and Observability  
**CRM:** Bounded retry + DLT · idempotent handlers · lag/metrics · safe replay · release watch

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 178–183 ops problems | [Ex 1](exercises/exercise-01-failure-taxonomy.md) | ~10–12 |
| **B** | 187–194 metrics | [Ex 4](exercises/exercise-04-metrics-todos.md) | ~10–12 |
| **C** | 195–197 DLT/recovery | [Ex 2](exercises/exercise-02-dlt-policy.md) → [3](exercises/exercise-03-idempotency-sketch.md) → [5](exercises/exercise-05-replay-runbook.md) | ~30–36 |
| **D** | 198–200 readiness | [Ex 6](exercises/exercise-06-watch-window.md) | ~8–10 |
| **E** | 201–204 | [Lab 46](lab46/LAB-46-GUIDE.md) timed ~45 min | ~45 |

## Practice order

**1 → 4 → 2 → 3 → 5 → 6** then Lab 46.

## Do / don't

| Do now | Don't yet |
| --- | --- |
| Failure taxonomy; metrics TODOs; DLT policy; idempotency; replay dry-run | Infinite retry as the error strategy |
| Correlation headers; synthetic CUS-1001/1002 only | Dump production Kafka topics / PII in metrics |
| Tie alerts to release watch | Module 47 incident storytelling as this lab |

## Hard gate before Lab 46

- [ ] Ex notes complete (order 1→4→2→3→5→6)
- [ ] Basic produce/consume from Labs 30–31 available
- [ ] No secrets or real customer PII in notes
