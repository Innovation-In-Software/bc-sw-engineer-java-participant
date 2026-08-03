# Module 19 — Acronym Cheatsheet

**Topic:** Integration Testing and UI Test Automation  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **19** curriculum slide diagram title(s) plus slide text for this module._

---

## Testing

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **E2E** | End-to-End | Test that exercises the full user/system path. |
| **JUnit** | — | Standard unit-testing framework for Java. |
| **Selenium** | — | Browser automation for UI tests. |
| **UI** | User Interface | What users see and click. |
| **WebDriver** | — | API Selenium uses to control browsers. |
| **SUT** | System Under Test | The app/component layers being validated by an integration or E2E test. |
| **AUT** | Application Under Test | The running web application a Selenium test drives (labeled in the WebDriver architecture diagram). |
| **UAT** | User Acceptance Testing | One of the "when to use" cases for E2E tests — production-readiness sign-off. |
| **RC** | Remote Control | Selenium RC — the historical, now-obsolete predecessor to Selenium WebDriver. |

---

## Spring Test & data access

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JPA** | Jakarta Persistence API | The repository/ORM layer `@DataJpaTest` targets. |
| **JDBC** | Java Database Connectivity | The Java API used to connect to a database; `@DynamicPropertySource` wires a Testcontainers JDBC URL into Spring. |
| **H2** | — | In-memory database useful for fast tests, but it can accept SQL that a real engine (PostgreSQL) would reject. |
| **DB** | Database | Persistent data store; integration tests use a real or Testcontainers-backed DB for the tested boundary. |
| **SQL** | Structured Query Language | The query language whose engine-specific behavior Testcontainers verifies against a real database. |
| **MVC** | Model-View-Controller | The web layer `@WebMvcTest`/Spring MVC slices test in isolation. |

---

## Web & browser protocols

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HTTP** | Hypertext Transfer Protocol | How clients send web/API requests; `TestRestTemplate` makes real HTTP calls. |
| **REST** | Representational State Transfer | Style of the partner/internal APIs the CRM exposes and Selenium/HTTP tests exercise. |
| **JSON** | JavaScript Object Notation | Format asserted in MockMvc response bodies (`jsonPath`). |
| **CSS** | Cascading Style Sheets | Source of `By.cssSelector` locators — a flexible, widely preferred locator strategy. |
| **HTML** | Hypertext Markup Language | Markup of the CRM's static customer form page Selenium automates. |
| **URL** | Uniform Resource Locator | Web address; tests normalize routes (e.g. `/customers/{id}`) instead of logging the raw URL. |
| **DOM** | Document Object Model | The in-browser element tree WebDriver locator strategies search. |
| **W3C** | World Wide Web Consortium | Standards body behind the WebDriver protocol Selenium uses to talk to browser drivers. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |

---

## DevOps & delivery

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CI** | Continuous Integration | Automatically build/test on every change. |
| **CI/CD** | Continuous Integration / Continuous Delivery | Pipeline cadence table: unit tests every commit, smoke UI every PR, full browser matrix on release. |
| **PR** | Pull Request | Trigger point in the execution-cadence table for component/API and smoke UI tests. |

---

## Domain context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | The Northstar CRM app this module's integration and Selenium tests regression-test end to end. |

---

## AI-assisted development

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **AI** | Artificial Intelligence | Tools that assist coding/testing (e.g., Copilot). |

---

## One-line memory aid

> Focus first on: **E2E** · **UI** · **Selenium** · **WebDriver** · **API**.

---

**Related:** [Module 19 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
