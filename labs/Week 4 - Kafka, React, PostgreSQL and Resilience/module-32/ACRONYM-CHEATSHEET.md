# Module 32 — Acronym Cheatsheet

**Topic:** Resilience and Fault Tolerance  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **26** curriculum slide diagram title(s) plus slide text for this module._

---

## Resilience

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Backoff** | — | Wait longer between retries to reduce load. |
| **Bulkhead** | — | Isolate failures so one area doesn’t sink the whole system. |
| **Circuit Breaker** | — | Stops calling a failing dependency temporarily to recover. |
| **Fault Tolerance** | — | System continues correctly when parts fail. |
| **HA** | High Availability | Design so the system stays up despite failures. |
| **Idempotent** | Idempotency | Doing the same operation twice has the same effect as once. |
| **Resilience4j** | — | Java library for circuit breaker, retry, rate limiter, and more. |
| **Retry** | — | Try again after a failure (often with backoff). |
| **Timeout** | — | Give up after a time limit instead of waiting forever. |

---

## Kafka & events

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DLQ** | Dead Letter Queue | Place for messages that keep failing so they don’t block the pipeline. |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **PostgreSQL** | — | Popular open-source relational database used in this course. |

---

## One-line memory aid

> Focus first on: **Circuit Breaker** · **Retry** · **Backoff** · **Bulkhead** · **Timeout**.

---

**Related:** [Module 32 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
