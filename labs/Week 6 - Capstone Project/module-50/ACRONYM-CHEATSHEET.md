# Module 50 — Acronym Cheatsheet

**Topic:** Capstone Frontend and Persistence  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Capstone / text module: terms taken from slide text and the module topic (few or no slide diagram PNGs)._

---

## Frontend

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **ARIA** | Accessible Rich Internet Applications | Attributes (e.g., `aria-describedby`, ARIA roles) that expose UI meaning to assistive technology. |
| **CSS** | Cascading Style Sheets | Styling; the module warns against coupling tests to brittle CSS selectors. |
| **E2E** | End-to-End | The one required critical-path browser test (search, save, verify the timeline), as opposed to isolated component tests. |
| **JSX** | JavaScript XML (JavaScript syntax extension) | The markup-in-JavaScript syntax React components are written in. |
| **React** | — | Library for building UI from components. |
| **SPA** | Single-Page Application | Web app that updates in the browser without full page reloads. |
| **UI** | User Interface | The React search/profile/timeline/form journey this module builds and proves. |
| **UX** | User Experience | Client-side checks are framed as UX help, not the security boundary — the API still validates. |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DB** | Database | Generic term used alongside "API proof" and "DB row" as required evidence of persistence. |
| **FK** | Foreign Key | The column an `Interaction` entity holds to reference its owning `Customer`. |
| **JDBC** | Java Database Connectivity | Low-level database API; Spring Data JPA sits on top of it so the service layer avoids hand-written JDBC. |
| **JPA** | Java Persistence API | Standard API for mapping Java objects to relational tables. |
| **ORM** | Object-Relational Mapping | Maps classes to tables (e.g., Hibernate). |
| **PostgreSQL** | — | Popular open-source relational database used in this course. |
| **SQL** | Structured Query Language | The query language behind every persistence proof — a row that survives an API restart is the module's hardest evidence bar. |
| **UUID** | Universally Unique Identifier | Native PostgreSQL identifier type for `interaction_id` and `customer_id` (contrasted with Oracle's `RAW(16)`). |

---

## REST & HTTP

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | Module 49's backend contract; the typed React client calls it exclusively, never a raw `fetch`. |
| **HTTP** | Hypertext Transfer Protocol | The protocol behind every typed-client call, status code, and header (e.g., `X-Correlation-ID`). |
| **JSON** | JavaScript Object Notation | Format for Problem Details error bodies and DTO payloads the typed client parses. |
| **REST** | Representational State Transfer | API style usually over HTTP, focused on resources and verbs. |
| **URL** | Uniform Resource Locator | The typed client centralizes one base URL so no component hardcodes a host. |

---

## Security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **ADR** | Architecture Decision Record | Written record of an architecture choice (e.g., relationship ownership) from Module 48 that this module's JPA mappings must match. |
| **JWT** | JSON Web Token | Compact signed token used for auth between systems; this module plans where it attaches, Module 51 wires enforcement. |
| **PII** | Personally Identifiable Information | Real customer data; fixtures like CUS-1001/Amina are synthetic and never real PII. |

---

## APIs & contracts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRUD** | Create, Read, Update, Delete | Repository methods are named by business intent, not generic CRUD guessing. |
| **DTO** | Data Transfer Object | Object that carries data across layers/APIs (no heavy logic). |

---

## DevOps & delivery

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CI/CD** | Continuous Integration and Continuous Delivery | Automated build, test, and release pipeline. |
| **CRM** | Customer Relationship Management | The Northstar CRM platform this journey (search, profile, timeline, form) is part of. |

---

## Process

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Capstone** | — | Final multi-module project integrating the full stack. |

---

## One-line memory aid

> Focus first on: **React** · **JPA** · **PostgreSQL** · **REST** · **JWT** · **SQL proof** · **ARIA/a11y**.

---

**Related:** [Module 50 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
