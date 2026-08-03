# Module 37 — Acronym Cheatsheet

**Topic:** PostgreSQL Design  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **26** curriculum slide diagram title(s) plus slide text for this module._

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **ACID** | Atomicity, Consistency, Isolation, Durability | Guarantees for reliable database transactions. |
| **DDL** | Data Definition Language | SQL that defines schema (CREATE/ALTER/DROP). |
| **DML** | Data Manipulation Language | SQL that changes data (INSERT/UPDATE/DELETE). |
| **FK** | Foreign Key | Column(s) that reference another table’s primary key. |
| **Index** | — | DB structure that speeds lookups (trade-off: write cost / space). |
| **NOT NULL** | — | Constraint that requires a value to be present. |
| **Oracle** | Oracle Database | Enterprise RDBMS often compared with PostgreSQL in this course. |
| **PK** | Primary Key | Unique identifier for a table row. |
| **PostgreSQL** | — | Popular open-source relational database used in this course. |
| **RDBMS** | Relational Database Management System | Database that stores data in related tables. |
| **SQL** | Structured Query Language | Language to query and change relational data. |
| **UNIQUE** | — | Constraint that prevents duplicate values in a column/set. |

---

## Modeling & Normalization

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **ER** | Entity Relationship | Conceptual modeling approach — entities, attributes, and relationships, designed before any table is created. |
| **ERD** | Entity Relationship Diagram | The diagram used to visualize entities, attributes, and relationships. |
| **DFD** | Data Flow Diagram | Models how data *moves* through a system's processes — not the same as an ER diagram (a knowledge-check distractor in this module). |
| **CRM** | Customer Relationship Management | The customer/account business domain modeled by this module's schema and Lab 37 (CUSTOMER, ACCOUNT, ADDRESS, status history). |
| **1NF** | First Normal Form | Eliminates repeating groups; every column holds a single, atomic (indivisible) value. |
| **2NF** | Second Normal Form | Must already be 1NF, with no partial dependency of a non-key attribute on part of a composite key. |
| **3NF** | Third Normal Form | Must already be 2NF, with no transitive dependency between non-key attributes; the pragmatic target for most business applications. |
| **BCNF** | Boyce-Codd Normal Form | A stricter version of 3NF: every determinant in the table must be a candidate key; used only for complex, overlapping-key cases. |

---

## PostgreSQL Internals

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **MVCC** | Multi-Version Concurrency Control | Lets readers and writers avoid blocking each other by keeping multiple row versions instead of relying only on locks. |
| **WAL** | Write-Ahead Log | Log of changes written before they're applied to data files; used for durability and crash recovery (Oracle's equivalent is the redo log). |
| **JSON** | JavaScript Object Notation | Structured text data format that PostgreSQL can store and query directly in a column. |
| **JSONB** | Binary JSON | PostgreSQL's binary-stored JSON type — one of its advanced, flexible-schema features. |
| **CTE** | Common Table Expression | A named, reusable subquery (`WITH` clause) — one of PostgreSQL's advanced SQL features. |

---

## Oracle Internals

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **SGA** | System Global Area | Oracle's large shared-memory region holding the buffer cache, shared pool, and redo log buffer — Oracle's counterpart to PostgreSQL's shared buffers/WAL buffers. |
| **RAC** | Real Application Clusters | Oracle's clustering technology letting multiple Oracle instances share one database for extreme availability at large scale. |
| **DBWn** | Database Writer | Oracle background process that flushes dirty (modified) buffers from the SGA to disk. |
| **LGWR** | Log Writer | Oracle background process that flushes redo log entries to disk (Oracle's equivalent of writing the WAL). |
| **CKPT** | Checkpoint | Oracle background process that synchronizes data files with the redo log. |
| **SMON** | System Monitor | Oracle background process responsible for instance recovery. |
| **PMON** | Process Monitor | Oracle background process that cleans up after failed sessions. |
| **ARCn** | Archiver | Oracle background process that copies redo logs for recovery/archival. |

---

## Enterprise, Security & Ecosystem

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DBA** | Database Administrator | Full administrative database role; Lab 37's CRM_APP user is deliberately **not** granted DBA privileges (least-privilege principle). |
| **RBAC** | Role-Based Access Control | Security practice of granting database access by role rather than broad/DBA privileges. |
| **SLA** | Service Level Agreement | Contractual performance/uptime guarantee that comes with enterprise vendor support (e.g., Oracle). |
| **DR** | Disaster Recovery | Ability to recover the database after a major failure; both PostgreSQL and Oracle support High Availability & DR via replication. |
| **GDPR** | General Data Protection Regulation | EU data-protection regulation named as an example compliance requirement for sensitive customer data. |
| **PCI-DSS** | Payment Card Industry Data Security Standard | Compliance standard named alongside GDPR for regulated, sensitive data handling. |
| **ORM** | Object-Relational Mapping | Maps Java objects to existing tables; does **not** choose good primary keys, normalize data, or write constraints for you. |
| **JPA** | Java Persistence API | Java's standard ORM API (e.g., via Hibernate); later labs map JPA entities onto this module's frozen PostgreSQL schema. |
| **RDS** | Relational Database Service | Amazon's managed database offering (Amazon RDS/Aurora) — an example of cloud integration both PostgreSQL and Oracle support. |
| **SQLSTATE** | SQL State | Standard error-code returned by the database (e.g., `23505` = unique-constraint violation) — used to verify constraint failures in Lab 37's negative tests. |

---

## One-line memory aid

> Focus first on: **SQL** · **RDBMS** · **PostgreSQL** · **Oracle** · **PK**.

---

**Related:** [Module 37 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
