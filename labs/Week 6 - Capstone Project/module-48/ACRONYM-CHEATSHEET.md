# Module 48 — Acronym Cheatsheet

**Topic:** Capstone Planning and Architecture  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Capstone / text module: terms taken from slide text and the module topic (few or no slide diagram PNGs)._

---

## Process

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Capstone** | — | Final multi-module project integrating the full stack. |

---

## Business context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | System that manages customers (Northstar platform theme). |
| **Northstar** | — | Course CRM case-study platform you build toward. |
| **PII** | Personally Identifiable Information | Real customer data that must never be imported — only synthetic fixtures (CUS-1001/CUS-1002) are used. |

---

## Professional skills

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **ADR** | Architecture Decision Record | Short note explaining an architecture choice, alternatives, and consequences. |
| **AC** | Acceptance Criteria | Numbered, testable conditions every backlog story (e.g. CAP-12's AC1/AC2/AC4) must have. |
| **QA** | Quality Assurance | Team the Development Team coordinates with when delivering vertical slices. |
| **Q&A** | Questions and Answers | Part of the Lab 52 defense, alongside the live demo and retrospective. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **C4** | C4 Model (Context, Containers, Components, Code) | Four-level architecture diagramming approach; Lab 48 requires only the Context and Container levels. |
| **NFR** | Non-Functional Requirement | A quality requirement (latency, availability, security...) that needs a threshold, method, and environment — never a bare adjective. |

---

## Security & identity

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JWT** | JSON Web Token | Token format securing the Spring Boot API as a resource server. |
| **OIDC** | OpenID Connect | Identity protocol the Identity Provider uses to issue and validate tokens. |
| **RBAC** | Role-Based Access Control | AGENT/MANAGER roles enforced instead of per-person special cases. |
| **IdP** | Identity Provider | Container that issues/validates OIDC/JWT tokens; must appear in the C4 container diagram. |

---

## REST & HTTP

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **REST** | Representational State Transfer | API style usually over HTTP, focused on resources and verbs. |
| **HTTP** | Hypertext Transfer Protocol | Protocol carrying versioned request/event contracts and status codes (401/403) between UI and API. |

---

## Kafka & events

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Kafka** | Apache Kafka | Distributed event streaming platform (topics, brokers, consumers). |
| **DLT** | Dead Letter Topic | Where poison Kafka messages land after bounded retries, per the Kafka-lag risk mitigation. |

---

## Frontend

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **React** | — | Library for building UI from components. |
| **UI** | User Interface | The React CRM UI container — the agent-facing search/profile/timeline/interaction journey. |
| **a11y** | Accessibility | One of the five required NFR categories (latency, availability, security, a11y, retention). |

---

## DevOps & delivery

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Bitbucket Pipelines** | — | CI/CD on Bitbucket (compared in the course). |
| **CI/CD** | Continuous Integration and Continuous Delivery | Automated build, test, and release pipeline. |
| **GitHub Actions** | — | CI/CD workflows that run on GitHub events. |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **PostgreSQL** | — | Popular open-source relational database used in this course. |
| **JPA** | Java Persistence API | Spring Data JPA is how the API reaches PostgreSQL — never raw JDBC or "Hibernate will figure it out." |
| **JDBC** | Java Database Connectivity | Low-level database access layer underneath JPA, named in the container sync-flow labels. |
| **DB** | Database | Shorthand used when testing a migration against a throwaway DB before touching the shared schema. |
| **H2** | — | In-memory Java database compared against real PostgreSQL for the CI test profile. |
| **DTO** | Data Transfer Object | Request/response shape (with Bean Validation) for the interaction API. |

---

## One-line memory aid

> Focus first on: **Capstone** · **CRM** · **Northstar** · **C4** · **ADR** · **NFR**.

---

**Related:** [Module 48 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
