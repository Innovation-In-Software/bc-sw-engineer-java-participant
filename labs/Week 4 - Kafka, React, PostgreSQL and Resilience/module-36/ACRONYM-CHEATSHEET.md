# Module 36 — Acronym Cheatsheet

**Topic:** Frontend Security  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **21** curriculum slide diagram title(s) plus slide text for this module._

---

## Security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Authentication** | — | Proving who you are (login / token). |
| **Authorization** | — | What you are allowed to do after authentication. |
| **HS256** | HMAC using SHA-256 | The signing algorithm shown in this module's example JWT header. |
| **HSTS** | HTTP Strict Transport Security | Tells browsers to never attempt an HTTP downgrade for a domain again. |
| **HTTPS** | HTTP Secure | HTTP over TLS encryption. |
| **JWT** | JSON Web Token | Compact signed token used for auth between systems. |
| **MFA** | Multi-Factor Authentication | Requiring more than a password to verify identity. |
| **MITM** | Man-in-the-Middle | Attack that intercepts requests/responses; HTTPS + HSTS defend against it. |
| **OAuth** | Open Authorization | Standard for delegated login / authorization. |
| **RBAC** | Role-Based Access Control | Permissions based on roles (admin, user, …). |
| **SSL** | Secure Sockets Layer | Predecessor to TLS; the deck says "validate SSL" alongside HTTPS/TLS 1.2+. |
| **TLS** | Transport Layer Security | Encrypts data in transit (what HTTPS uses). |

---

## Frontend & browser security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **BFF** | Backend For Frontend | A backend layer that sets HttpOnly session cookies; sketched as a Lab 36 bonus challenge. |
| **CDN** | Content Delivery Network | An external, allowlisted source a strict CSP may still permit scripts from. |
| **CORS** | Cross-Origin Resource Sharing | Browser rules for calling APIs on another origin. |
| **CSP** | Content Security Policy | Header restricting which script/style/image sources the browser will trust. |
| **CSRF** | Cross-Site Request Forgery | Tricks a logged-in browser into unwanted requests. |
| **DOM** | Document Object Model | Browser's tree of HTML elements; DOM-based XSS writes user input into it via `innerHTML`. |
| **XSRF** | Cross-Site Request Forgery | Alternate spelling used in the `X-XSRF-TOKEN` cookie/header convention (same attack as CSRF). |
| **XSS** | Cross-Site Scripting | Attack that injects malicious scripts into pages. |

---

## Frontend

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HTML** | Hypertext Markup Language | Markup that unsafe sinks like `dangerouslySetInnerHTML` render directly (an XSS risk). |
| **JSX** | JavaScript XML | React's HTML-like syntax; it escapes values by default, which is why plain JSX is XSS-safe. |
| **RTL** | React Testing Library | Used for the required XSS proof test against a malicious customer name. |
| **SPA** | Single-Page Application | The CRM app this module hardens — login, token storage, and API calls. |
| **UX** | User Experience | Route guards and hidden buttons are UX conveniences only, never a security boundary. |

---

## Compliance & data protection

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **DB** | Database | Where Stored XSS payloads can persist (e.g. a `fullName` field) if not encoded on output. |
| **GDPR** | General Data Protection Regulation | Data-privacy regulation named as a legal/compliance risk of a data breach. |
| **PCI-DSS** | Payment Card Industry Data Security Standard | Compliance standard named alongside GDPR for handling sensitive data. |
| **PII** | Personally Identifiable Information | Sensitive customer data (names, statuses) rendered in the browser — a high-value attack target. |
| **SSN** | Social Security Number | Example of sensitive data that must never sit in unprotected client-side storage. |

---

## Security testing

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **OWASP** | Open Worldwide Application Security Project | Community standards and top risks for app security. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |

---

## Business context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | The Northstar Customer Management Platform whose SPA this module hardens. |

---

## One-line memory aid

> Focus first on: **JWT** · **CORS** · **XSS** · **CSRF** · **HTTPS**.

---

**Related:** [Module 36 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
