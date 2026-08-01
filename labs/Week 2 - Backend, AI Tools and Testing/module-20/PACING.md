# Module 20 — Classroom pacing (Learn → Practice → Review)

**For instructors and participants.** Do **not** finish every Module 20 slide before practicing.

Detailed author notes: `curriculum/Week 2 - Backend, AI Tools and Testing/module-20/INSTRUCTOR-PACING.md`

## Checkpoint map

| Block | After slides | Practice |
| ----- | ------------ | -------- |
| **A** | 237–243 | [Ex 1](exercises/exercise-01-level-quiz.md) |
| **B** | 244 | [Ex 2](exercises/exercise-02-rewrite-unsafe-logs.md) |
| **C** | 245–247 | [Ex 3](exercises/exercise-03-mdc-lifecycle.md) · [Ex 4](exercises/exercise-04-clear-mdc-finally.md) |
| **D** | 248–250 | [Ex 5](exercises/exercise-05-fill-forbidden-pii-todos.md) · [Ex 6](exercises/exercise-06-lab20-prep-checklist.md) |
| **E** | 251–253 | [Lab 20](lab20/LAB-20-GUIDE.md) · Kahoot |

**Classroom practice order:** **1 → 2 → 3 → 4 → 5 → 6**

## Streamline overlapping topics

| Topic | Keep short | Why |
| ----- | ---------- | --- |
| Full ELK/centralized stack setup | Awareness | Lab focuses on app-side structured logs + MDC |
| Actuator / Micrometer metrics | Defer | Lab 21 |
| Logging Customer.toString() / PII | Forbidden | Safe id+status+correlation only |
| Leaving MDC set across requests | Anti-pattern | Always clear in finally |

## Logging reminder

```text
X-Correlation-Id → CorrelationFilter MDC.put(corr/cust/op) → %X{…} in Logback → finally MDC.clear()
INFO create/get with customerId — never fullName / email in logs
```

## Incremental build

Exercises 1–6 notes → Lab 20 `examples/lab20-crm` (Logback pattern + filter + CustomerLoggingIT).

Start here: [`README.md`](README.md) · Exercises: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md)
