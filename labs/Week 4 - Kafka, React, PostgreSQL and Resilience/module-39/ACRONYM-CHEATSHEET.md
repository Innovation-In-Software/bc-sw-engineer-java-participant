# Module 39 — Acronym Cheatsheet

**Topic:** Spring Data JPA and PostgreSQL  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **31** curriculum slide diagram title(s) plus slide text for this module._

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **ACID** | Atomicity, Consistency, Isolation, Durability | The four guarantees a transaction provides — all steps succeed or none do, the DB stays valid, concurrent transactions don't interfere, and committed data survives a crash. |
| **CRUD** | Create, Read, Update, Delete | Four basic data operations. |
| **DAO** | Data Access Object | Hand-written data-access class; Spring Data JPA repositories replace the boilerplate of hand-written JDBC DAOs. |
| **DDL** | Data Definition Language | SQL that defines/changes schema (e.g., CREATE TABLE, CREATE INDEX) — owned by Flyway migrations, never by Hibernate's `ddl-auto` on a shared database. |
| **FK** | Foreign Key | Column referencing another table's primary key; on a `@OneToMany`/`@ManyToOne` pair, the FK lives on the owning ("many") side. |
| **Hibernate** | — | Popular JPA implementation / ORM for Java. |
| **IT** | Integration Test | Maven Failsafe naming convention (e.g., `CustomerRepositoryIT`) for tests run against a real database and verified via `mvn clean verify`. |
| **JDBC** | Java Database Connectivity | Low-level Java API for talking to a database (Connections, PreparedStatements, ResultSets) — what JPA/Hibernate abstracts away. |
| **JPA** | Java Persistence API | Standard API for mapping Java objects to relational tables. |
| **JPQL** | Java Persistence Query Language | Object-oriented query language used with JPA. |
| **N+1** | N+1 query problem | One query plus one per row — often fixed with joins/fetch strategies. |
| **Oracle** | Oracle Database | Enterprise RDBMS often compared with PostgreSQL in this course. |
| **ORM** | Object-Relational Mapping | Maps classes to tables (e.g., Hibernate). |
| **PK** | Primary Key | Unique identifier for a table row. |
| **POJO** | Plain Old Java Object | A plain Java class with no framework logic; a JPA entity is a POJO annotated so Hibernate can map it to a table. |
| **PostgreSQL** | — | Popular open-source relational database used in this course. |
| **SQL** | Structured Query Language | The query language the database actually executes; JPQL and derived queries are translated into SQL by Hibernate. |
| **Transaction** | — | Unit of work that commits or rolls back together. |
| **URL** | Uniform Resource Locator | The database connection address, e.g., `jdbc:postgresql://localhost:5432/crm`, normally pulled from an environment variable. |

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AOP** | Aspect-Oriented Programming | The technique Spring uses to wrap `@Transactional` methods in a proxy that manages the transaction boundary around the method body. |
| **OSIV** | Open Session In View | Spring Boot's default of keeping the Hibernate session open through view rendering; Lab 39 disables it (`open-in-view: false`) so lazy access must happen inside the `@Transactional` service method. |
| **Repository** | — | Layer/interface focused on data access. |
| **Spring Boot** | — | Opinionated Spring that auto-configures and runs apps quickly. |

---

## APIs & contracts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DTO** | Data Transfer Object | Object that carries data across layers/APIs (no heavy logic). |
| **HTTP** | Hypertext Transfer Protocol | Protocol carrying API requests/responses; Lab 39 must return HTTP 409 for duplicate-email and optimistic-lock conflicts without leaking database internals. |
| **JSON** | JavaScript Object Notation | Common response data format; entities with lazy collections can recurse infinitely when serialized to JSON, which is why associations are excluded from equals/toString. |
| **SQLSTATE** | SQL State (error code) | PostgreSQL's internal error code; must never be leaked to API clients — conflicts are translated into a generic `ProblemDetail` 409 instead. |

---

## Business context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | The Northstar CRM Customer Management Platform used as this module's running example (lab39-crm), now backed by real PostgreSQL instead of an in-memory repository. |

---

## One-line memory aid

> Focus first on: **JPA** · **JPQL** · **ORM** · **Hibernate** · **Repository**.

---

**Related:** [Module 39 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
