# Module 24 — Acronym Cheatsheet

**Topic:** SOAP Web Services with Spring WS  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **25** curriculum slide diagram title(s) plus slide text for this module._

---

## SOAP & XML

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JAXB** | Jakarta XML Binding | Maps Java objects to/from XML. |
| **SOAP** | Simple Object Access Protocol | Systems exchange structured XML messages with clear rules. |
| **Spring-WS** | Spring Web Services | Spring support for hosting SOAP endpoints. |
| **WS-Security** | Web Services Security | Auth, signatures, and encryption inside SOAP messages. |
| **WSDL** | Web Services Description Language | The contract: operations, messages, and endpoint address. |
| **XML** | Extensible Markup Language | Text format for structured data; SOAP’s message language. |
| **XSD** | XML Schema Definition | Rules for valid XML structure and types. |
| **WSS4J** | Web Services Security for Java | Apache library that implements WS-Security (validates UsernameToken headers). |
| **XJC** | XML to Java Compiler | JAXB tool that generates Java classes from an XSD. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **POJO** | Plain Old Java Object | The simple Java class an @Endpoint is annotated on top of. |
| **DTO** | Data Transfer Object | JAXB-generated request/response objects passed between layers. |
| **REST** | Representational State Transfer | The API style Lab 23 already built; SOAP and REST both call the same CustomerService. |
| **JSON** | JavaScript Object Notation | REST's error-response format, contrasted with SOAP's XML fault format. |

---

## Web & transport protocols

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HTTP** | Hypertext Transfer Protocol | Most common transport SOAP messages travel over. |
| **HTTPS** | Hypertext Transfer Protocol Secure | Encrypted transport recommended alongside WS-Security for every SOAP call. |
| **SMTP** | Simple Mail Transfer Protocol | Alternate SOAP transport mentioned alongside HTTP and JMS. |
| **JMS** | Java Message Service | Alternate SOAP transport (queues/topics) besides HTTP. |
| **URI** | Uniform Resource Identifier | Identifies the namespace used to match @PayloadRoot to a request. |
| **URL** | Uniform Resource Locator | The endpoint address published in the WSDL's service/port. |
| **TLS** | Transport Layer Security | Encrypts the transport; used with WS-Security, not instead of it. |
| **SSL** | Secure Sockets Layer | Older transport-encryption protocol, mentioned alongside TLS for "Enforce HTTPS". |

---

## Security & identity standards

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **SAML** | Security Assertion Markup Language | Token type carrying identity/role assertions, an alternative to UsernameToken. |
| **SSO** | Single Sign-On | Enterprise login capability SAML tokens support. |
| **OASIS** | Organization for the Advancement of Structured Information Standards | Standards body that publishes the WS-Security specification. |
| **W3C** | World Wide Web Consortium | Standards body behind SOAP/XML as an interoperable standard. |
| **JWT** | JSON Web Token | Modern bearer-token auth, explicitly deferred to a later lab (not used for SOAP here). |

---

## Java tooling & alternatives

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JAX-WS** | Jakarta XML Web Services | Code-first alternative to Spring-WS's contract-first approach. |
| **IDE** | Integrated Development Environment | Tooling that can also generate JAXB classes from an XSD (alongside XJC). |
| **DAO** | Data Access Object | Repository-layer pattern shown alongside JPA in the Spring WS architecture diagram. |

---

## Business context

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | Northstar CRM, the running example whose SOAP endpoint this module builds. |
| **B2B** | Business-to-Business | Partner-integration use case SOAP/WS-Security commonly serves. |

---

## One-line memory aid

> Focus first on: **SOAP** · **WSDL** · **XSD** · **XML** · **Spring-WS**.

---

**Related:** [Module 24 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
