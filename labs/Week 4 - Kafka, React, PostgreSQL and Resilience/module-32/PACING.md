# Module 32 — Learn → Practice → Review (participant)

**Theme:** Resilience and Fault Tolerance (Resilience4j)  
**CRM fixtures:** `CUS-1001` Amina · outbound Account Profile · instance `accountProfile`

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 51–56 failure design | [Ex 1](exercises/exercise-01-why-resilience.md) | ~10–12 |
| **B** | 57–64 retry + circuit | [Ex 2](exercises/exercise-02-circuit-states.md) | ~12–15 |
| **C** | 65–67 timeout / fallback | [Ex 3](exercises/exercise-03-fallback-contract.md) | ~12–15 |
| **D** | 68–72 Resilience4j | [Ex 4](exercises/exercise-04-pattern-map.md) → [5](exercises/exercise-05-fill-resilience-todos.md) → [6](exercises/exercise-06-lab32-readiness.md) | ~28–34 |
| **E** | 73–76 | [Lab 32](lab32/LAB-32-GUIDE.md) timed ~45 min | ~45 |

## Practice order

**1 → 2 → 3 → 4 → 5 → 6** then Lab 32.

## Do / don't

| Do now | Don't yet |
| --- | --- |
| Retry + CB + TimeLimiter + truthful fallback on **reads** | Aggressive retries on non-idempotent **writes** |
| WireMock 503/slow/OK proofs | React error toasts (Module 33+) |
| Actuator observation | Replacing Kafka with resilience patterns |

## Hard gate before Lab 32

- [ ] Ex 1–6 notes exist
- [ ] Fallback contract = `available=false` (no fake success)
- [ ] Instance name `accountProfile` planned
