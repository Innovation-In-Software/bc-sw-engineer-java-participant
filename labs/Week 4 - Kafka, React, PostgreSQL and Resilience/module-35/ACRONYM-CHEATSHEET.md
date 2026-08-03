# Module 35 — Acronym Cheatsheet

**Topic:** Frontend and API Integration  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **22** curriculum slide diagram title(s) plus slide text for this module._

---

## Frontend

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **React** | — | Library for building UI from components. |
| **SPA** | Single-Page Application | The CRM UI, which never talks to PostgreSQL directly — only Spring's REST endpoints. |
| **UX** | User Experience | How usable and clear the app feels, e.g. loading/error states and confirmation UX. |

---

## REST & HTTP

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HTTP** | Hypertext Transfer Protocol | How clients send web/API requests. |
| **JSON** | JavaScript Object Notation | Lightweight data format common in REST APIs. |
| **REST** | Representational State Transfer | API style usually over HTTP, focused on resources and verbs. |
| **URI** | Uniform Resource Identifier | The general name for identifying a resource, e.g. `/customers/{id}` (encoded with `encodeURIComponent`). |
| **URL** | Uniform Resource Locator | A full web address, e.g. `http://localhost:8080/api/customers`. |

---

## Data formats & legacy APIs

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **SOAP** | Simple Object Access Protocol | Older XML-based API style, contrasted with REST/JSON in this module. |
| **XML** | Extensible Markup Language | Structured text format; what SOAP-bridged endpoints may still use internally. |
| **YAML** | YAML Ain't Markup Language | Human-friendly config/data format (a Knowledge Check distractor for API payload format). |

---

## Security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CSP** | Content Security Policy | Restricts which sources of scripts/styles/images a page may load. |
| **CSRF** | Cross-Site Request Forgery | Tricks a logged-in browser into unwanted requests; explicit-CORS config helps guard against it. |
| **HTTPS** | HTTP Secure | HTTP over TLS encryption. |
| **JWT** | JSON Web Token | Auth token; this module explicitly defers Authorization/bearer-token headers to Lab 36. |
| **PII** | Personally Identifiable Information | Sensitive data (tokens, keys, customer details) that must never leak to the client unnecessarily. |
| **XSS** | Cross-Site Scripting | Attack that injects malicious scripts into pages. |

---

## Browser & networking

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DNS** | Domain Name System | Translates a hostname to an address; a DNS failure is one type of network error to handle. |
| **XHR** | XMLHttpRequest | The browser API Axios wraps under the hood to make HTTP calls. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |

---

## Frontend & browser security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CORS** | Cross-Origin Resource Sharing | Browser rules for calling APIs on another origin. |

---

## APIs & contracts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DTO** | Data Transfer Object | Object that carries data across layers/APIs (no heavy logic). |

---

## Spring

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Spring Boot** | — | Opinionated Spring that auto-configures and runs apps quickly. |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DB** | Database | Generic term for the persistent store behind the API; DB passwords must never live in frontend env vars. |
| **JPA** | Java Persistence API | Maps entities to persistent storage; the Repository layer's data-access technology. |
| **PostgreSQL** | — | Popular open-source relational database used in this course. |
| **UUID** | Universally Unique Identifier | A globally unique id; this lab uses a fixed correlation id instead of a real per-request UUID. |

---

## Business context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | The Northstar Customer Management Platform this lab wires to a real Spring Boot API. |

---

## One-line memory aid

> Focus first on: **React** · **REST** · **JSON** · **HTTP** · **HTTPS**.

---

**Related:** [Module 35 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
