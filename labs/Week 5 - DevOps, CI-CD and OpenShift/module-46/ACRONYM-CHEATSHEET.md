# Module 46 — Acronym Cheatsheet

**Topic:** Kafka Resilience and Observability  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **16** curriculum slide diagram title(s) plus slide text for this module._

---

## Kafka & events

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Broker** | Kafka Broker | A Kafka server that stores and serves topic data. |
| **Capacity Planning** | — | Sizing brokers/partitions/storage for expected load. |
| **Consumer** | Kafka Consumer | Application that reads messages from Kafka topics. |
| **Consumer Lag** | — | How far behind a consumer is from the latest messages. |
| **DLQ** | Dead Letter Queue | Place for messages that keep failing so they don’t block the pipeline. |
| **ISR** | In-Sync Replicas | Replicas that are caught up with the leader. |
| **Kafka** | Apache Kafka | Distributed event streaming platform (topics, brokers, consumers). |
| **Message Backlog** | — | Queue of unprocessed messages waiting for consumers. |
| **Producer** | Kafka Producer | Application that writes messages to Kafka topics. |
| **Replication** | — | Keeping copies of data on multiple brokers for durability/HA. |
| **Topic** | — | Named stream of related events in Kafka. |

---

## Resilience

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Fault Tolerance** | — | System continues correctly when parts fail. |
| **HA** | High Availability | Design so the system stays up despite failures. |

---

## Logging & observability

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Latency** | — | How long one request/message takes end-to-end. |
| **Metrics** | — | Numeric measurements over time (RPS, lag, error rate). |
| **Observability** | — | Ability to understand system health via logs, metrics, and traces. |
| **Throughput** | — | How much work/messages processed per unit time. |

---

## One-line memory aid

> Focus first on: **Kafka** · **Consumer Lag** · **DLQ** · **Replication** · **ISR**.

---

**Related:** [Module 46 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
