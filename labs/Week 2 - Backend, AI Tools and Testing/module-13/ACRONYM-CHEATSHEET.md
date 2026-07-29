# Module 13 — Acronym Cheatsheet

**Topic:** SOAP API Design with Java  
**Use when:** reviewing slides, pre-lab exercises, or Lab 13 contract design.

Quick meanings in plain language. Full forms match how the Module 13 deck uses each term.

---

## Core SOAP stack

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **SOAP** | Simple Object Access Protocol | Systems exchange structured **XML** messages with clear rules. |
| **WSDL** | Web Services Description Language | The **contract**: what operations exist, what messages look like, and where the endpoint is. |
| **XSD** | XML Schema Definition | Rules for valid XML: fields, types, required/optional, and structure. |
| **XML** | Extensible Markup Language | Text format for structured data; SOAP’s message language. |
| **API** | Application Programming Interface | How one program calls another in a defined way. |
| **URL** | Uniform Resource Locator | The address of an endpoint or resource. |

---

## SOAP vs REST (and friends)

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **REST** | Representational State Transfer | API style usually over HTTP, focused on resources and verbs. |
| **JSON** | JavaScript Object Notation | Lightweight data format common in REST APIs. |
| **YAML** | YAML Ain’t Markup Language | Human-friendly format for config and API docs. |
| **HTTP / HTTPS** | Hypertext Transfer Protocol (Secure) | How clients send requests; HTTPS encrypts the connection. |
| **OpenAPI / Swagger** | — | Describes REST APIs (similar role to WSDL for SOAP). |
| **RAML** | RESTful API Modeling Language | Another way to describe REST APIs. |
| **Protocol Buffers** | — | Compact binary data format, often used with gRPC. |
| **gRPC** | gRPC Remote Procedure Calls | High-performance RPC style often paired with Protocol Buffers. |

---

## Java / Spring tooling

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **JAX-WS** | Jakarta XML Web Services | Java API for building SOAP web services. |
| **JAX-RS** | Jakarta RESTful Web Services | Java API for building REST APIs. |
| **JAXB** | Jakarta XML Binding | Maps Java objects to/from XML. |
| **Spring-WS** | Spring Web Services | Spring support for hosting SOAP endpoints (Lab 24). |
| **wsimport** | — | Tool that generates Java code from a WSDL. |
| **JMS** | Java Message Service | Java API for async messaging (queues/topics). |

---

## WS-* standards (enterprise SOAP extras)

| Term | What the slides emphasize | Simple meaning |
| --- | --- | --- |
| **WS-Security** | Auth & encryption | Login tokens, signatures, and encryption **inside** the SOAP message. |
| **WS-ReliableMessaging** | Guaranteed delivery | Helps ensure messages arrive even when things fail. |
| **WS-AtomicTransaction** | Distributed transactions | Multi-step work across systems is all-or-nothing. |
| **WS-Policy** | Policy assertions | Declares rules the service expects (security, reliability, etc.). |
| **WS-I** | Web Services Interoperability | Guidelines so SOAP services work across vendors/tools. |
| **UsernameToken** | — | Username/password-style credential in WS-Security. |
| **X.509** | — | Digital certificates used to prove identity. |
| **XML Signature** | — | Proves the message was not changed and who signed it. |
| **XML Encryption** | — | Encrypts sensitive parts of the XML message itself. |
| **QoS** | Quality of Service | Delivery guarantees, reliability, and related metadata. |

---

## Security & transport

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **TLS** | Transport Layer Security | Encrypts data in transit (what HTTPS uses). |
| **XXE** | XML External Entity | Attack where XML pulls unsafe external files — disable external entities. |
| **JWT** | JSON Web Token | Compact auth token, common in REST APIs. |
| **OAuth** | Open Authorization | Standard for delegated login / authorization. |
| **ETag** | Entity Tag | HTTP cache tag so clients know if content changed. |
| **UTF-8** | Unicode Transformation Format – 8-bit | Common character encoding so text displays correctly. |

---

## XML namespace shortcuts (seen in envelopes)

| Prefix | Stands for | Simple meaning |
| --- | --- | --- |
| **soap** | SOAP 1.1 envelope | Classic SOAP envelope namespace. |
| **soap12** | SOAP 1.2 envelope | Newer SOAP envelope namespace. |
| **xsi** | XML Schema instance | Schema instance attributes (for example `xsi:nil`). |
| **xsd** | XML Schema | Built-in schema types (for example `xsd:string`). |
| **xmlns** | XML namespace | Declares a namespace to avoid name collisions. |

---

## Business / integration context (Northstar slides)

| Acronym | Full form | Simple meaning |
| --- | --- | --- |
| **CRM** | Customer Relationship Management | System that manages customers (Northstar’s customer service). |
| **ESB** | Enterprise Service Bus | Middleware that connects many systems. |
| **ERP** | Enterprise Resource Planning | Large business systems (finance, inventory, and related). |
| **HIPAA** | Health Insurance Portability and Accountability Act | US health-data privacy rules (partner/compliance example). |
| **UDDI** | Universal Description, Discovery, and Integration | Old directory for finding web services (mostly historical). |
| **SMTP** | Simple Mail Transfer Protocol | Email-sending protocol (possible SOAP transport). |
| **TCP** | Transmission Control Protocol | Low-level reliable network transport. |
| **IDE** | Integrated Development Environment | Your editor/tooling (IntelliJ, VS Code, etc.). |
| **DB** | Database | Persistent data store. |

---

## One-line memory aid

> **XSD** defines the data · **WSDL** defines the service · **SOAP** carries the XML message · **WS-Security / HTTPS** protect it.

---

**Related:** [Module 13 start](README.md) · [Pre-lab exercises](exercises/EXERCISES-INDEX.md) · [Lab 13 guide](lab13/LAB-13-GUIDE.md)
