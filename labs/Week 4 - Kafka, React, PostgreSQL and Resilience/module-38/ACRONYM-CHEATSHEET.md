# Module 38 — Acronym Cheatsheet

**Topic:** SQL and Query Performance  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **24** curriculum slide diagram title(s) plus slide text for this module._

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DDL** | Data Definition Language | SQL that defines/changes structures (CREATE, ALTER, DROP, TRUNCATE). |
| **DML** | Data Manipulation Language | SQL that changes data (INSERT/UPDATE/DELETE). |
| **DQL** | Data Query Language | SQL that reads data (SELECT). |
| **DCL** | Data Control Language | SQL that manages permissions (GRANT, REVOKE). |
| **TCL** | Transaction Control Language | SQL that manages transactions (COMMIT, ROLLBACK, SAVEPOINT). |
| **Index** | — | DB structure that speeds lookups (trade-off: write cost / space). |
| **B-Tree** | Balanced Tree | Default PostgreSQL index type; handles both equality and range queries (`>`, `<`, `BETWEEN`, `ORDER BY`). |
| **MVCC** | Multi-Version Concurrency Control | PostgreSQL's concurrency model; long-running transactions under it can block cleanup and bloat tables. |
| **VACUUM / autovacuum** | — | PostgreSQL maintenance that reclaims dead space; autovacuum also triggers automatic `ANALYZE` so planner statistics stay fresh. |
| **PostgreSQL** | — | Popular open-source relational database used in this course. |
| **SQL** | Structured Query Language | Language to query and change relational data. |

---

## Query execution & tuning

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **EXPLAIN / EXPLAIN ANALYZE** | — | PostgreSQL commands that show a query's plan; `EXPLAIN` estimates only, `EXPLAIN ANALYZE` actually runs the query and reports real timing. Plain `ANALYZE` refreshes planner statistics. |
| **Seq Scan** | Sequential Scan | Execution-plan operator that reads every row in a table row by row — the main thing this module teaches you to avoid on large tables. |
| **Sargable** | Search ARGument-ABLE | A `WHERE` condition written so the optimizer can match it directly to an index, instead of evaluating a function per row. |
| **DBMS_XPLAN / DBMS_STATS** | — | Oracle's plan-display and statistics packages, referenced in the lab's title and older material; this module's real PostgreSQL tools are `EXPLAIN ANALYZE` and `ANALYZE`. |

---

## Business & lab context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | The customer/account schema and API used as Lab 38's running scenario. |
| **API** | Application Programming Interface | What Lab 39's Spring Data JPA layer will expose over this module's tuned schema. |
| **JPA** | Jakarta (Java) Persistence API | The Spring Data JPA layer that will sit on top of this module's schema and indexes in Lab 39. |

---

## Logging & observability

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Latency** | — | How long one request/message takes end-to-end. |
| **Throughput** | — | How much work/messages processed per unit time. |
| **CPU** | Central Processing Unit | Processing capacity a query consumes; inefficient queries burn more of it and need more hardware. |
| **I/O** | Input/Output | Disk reads/writes caused by a query; fewer I/O hits from a good index usually means a faster query. |
| **SLA** | Service Level Agreement | A response-time/availability commitment; slow queries are what cause SLAs to be missed. |
| **ms** | milliseconds | Unit used for latency thresholds, e.g. alert if `mean_time > 1000 ms`. |
| **p95 / p99** | 95th / 99th percentile | Latency percentiles tracked instead of a plain average, since they surface the slow-tail requests an average can hide. |
| **CSV** | Comma-Separated Values | One of the structured log formats PostgreSQL can write slow-query logs in. |
| **JSON** | JavaScript Object Notation | The other structured, machine-parseable log format PostgreSQL can write. |
| **APM** | Application Performance Monitoring | Third-party monitoring tools (alongside pgAdmin/DataGrip/DBeaver) used to catch slow queries. |
| **pg_stat_statements** | — | PostgreSQL extension that tracks every query's call count, total time, and mean time — the tool for finding the worst offenders (`ORDER BY total_time DESC`). |

---

## One-line memory aid

> Focus first on: **SQL** · **Index** · **EXPLAIN ANALYZE** · **Seq Scan** · **Sargable** · **Throughput** · **Latency** · **PostgreSQL**.

---

**Related:** [Module 38 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
