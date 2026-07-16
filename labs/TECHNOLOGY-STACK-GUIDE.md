# Technology Stack Guide

A reference for every major technology in the Java Software Engineer Bootcamp — what it is, why you learn it, how it is used in the course, and where it appears in industry.

**Back to:** [Lab Index](LABS-INDEX.md) · **Setup / install:** [Labs Setup Instructions](SETUP-INSTRUCTIONS.md)

---

## Contents

1. [Learning path overview](#learning-path-overview)
2. [Acronyms and full forms](#acronyms-and-full-forms)
3. [Quick reference](#quick-reference)
4. [Week 1 — Java and JVM Foundations](#week-1--java-and-jvm-foundations)
5. [Week 2 — Backend, AI Tools and Testing](#week-2--backend-ai-tools-and-testing)
6. [Week 3 — Spring Framework and Enterprise Patterns](#week-3--spring-framework-and-enterprise-patterns)
7. [Week 4 — Kafka, React, PostgreSQL and Resilience](#week-4--kafka-react-postgresql-and-resilience)
8. [Week 5 — DevOps, CI/CD and k3s](#week-5--devops-cicd-and-kubernetes-k3s)
9. [Week 6 — Enterprise Capstone](#week-6--enterprise-capstone)

---

## Learning path overview

Students progress through six weeks, each adding a layer to the **Customer Management Platform**:

```text
Week 1   Java + JVM             Write and understand core code
Week 2   Maven + APIs + Tests   Structure, integrate, verify
Week 3   Spring Boot            Enterprise backend framework
Week 4   Kafka + React + PostgreSQL Full-stack, event-driven, persistent
Week 5   DevOps + CI/CD         Secure, containerise, deploy
Week 6   Capstone               Deliver a production-style CRM platform
```

By Lab 52, students have used the full enterprise Java stack — from bytecode to **k3s** deployment (GHCR + kubectl).

---

## Acronyms and full forms

Quick lookup for abbreviations used across the bootcamp. See [week sections](#week-1--java-and-jvm-foundations) below for context and usage.

### Java, JVM, and core programming

| Acronym | Full form | Used in |
| ------- | --------- | ------- |
| JDK | Java Development Kit | Labs 1–7 |
| JVM | Java Virtual Machine | Labs 1, 4 |
| JRE | Java Runtime Environment | Lab 1 |
| GC | Garbage Collection | Labs 1, 4 |
| G1 GC | Garbage-First Garbage Collector | Lab 4 |
| ZGC | Z Garbage Collector | Lab 4 |
| OOP | Object-Oriented Programming | Labs 3, 22+ |
| SOLID | Single responsibility, Open-closed, Liskov substitution, Interface segregation, Dependency inversion | Lab 3 |
| API | Application Programming Interface | Labs 13+ |
| REST | Representational State Transfer | Labs 35+ |

### Build, structure, and AI

| Acronym | Full form | Used in |
| ------- | --------- | ------- |
| AI | Artificial Intelligence | Labs 10–12, 25, 27, 45 |
| IDE | Integrated Development Environment | Labs 10+ (IntelliJ IDEA) |

### Enterprise APIs and contracts

| Acronym | Full form | Used in |
| ------- | --------- | ------- |
| SOAP | Simple Object Access Protocol | Labs 13–14, 24, 35 |
| XML | eXtensible Markup Language | Labs 13–14, 24 |
| WSDL | Web Services Description Language | Labs 13, 24 |
| XSD | XML Schema Definition | Labs 13–14, 24 |
| DTO | Data Transfer Object | Labs 14–16 |

### Testing and quality

| Acronym | Full form | Used in |
| ------- | --------- | ------- |
| UI | User Interface | Labs 19, 33–36, 50 |
| E2E | End-to-End (testing) | Labs 19, 50 |

### Logging, observability, and operations

| Acronym | Full form | Used in |
| ------- | --------- | ------- |
| SLF4J | Simple Logging Facade for Java | Lab 20 |
| SRE | Site Reliability Engineering | Labs 21, 46 |
| SDLC | Software Development Life Cycle | Lab 40 |

### Spring and enterprise backend

| Acronym | Full form | Used in |
| ------- | --------- | ------- |
| IoC | Inversion of Control | Lab 22 |
| DI | Dependency Injection | Labs 15, 22, 25 |
| WS | Web Services | Labs 24, 28 |
| JPA | Java Persistence API | Labs 39, 50 |
| JPQL | Java Persistence Query Language | Lab 39 |
| ORM | Object-Relational Mapping | Lab 39 (Hibernate) |
| ACID | Atomicity, Consistency, Isolation, Durability | Lab 27 |
| JWT | JSON Web Token | Labs 28, 36, 51 |
| RBAC | Role-Based Access Control | Lab 28 |

### Event-driven architecture and resilience

| Acronym | Full form | Used in |
| ------- | --------- | ------- |
| DLQ | Dead Letter Queue | Labs 31, 46 |
| EDA | Event-Driven Architecture | Labs 30–32 |

### Frontend and browser security

| Acronym | Full form | Used in |
| ------- | --------- | ------- |
| JSX | JavaScript XML | Labs 33–36 |
| CORS | Cross-Origin Resource Sharing | Lab 36 |
| XSS | Cross-Site Scripting | Lab 36 |

### Database and persistence

| Acronym | Full form | Used in |
| ------- | --------- | ------- |
| SQL | Structured Query Language | Labs 37–39 |
| RDBMS | Relational Database Management System | Labs 37–39 |

### DevOps, security, and delivery

| Acronym | Full form | Used in |
| ------- | --------- | ------- |
| SAST | Static Application Security Testing | Labs 40, 51 |
| DAST | Dynamic Application Security Testing | Lab 51 |
| CI | Continuous Integration | Labs 43–44, 51 |
| CD | Continuous Delivery / Continuous Deployment | Labs 44–45, 51 |
| CI/CD | Continuous Integration and Continuous Delivery | Labs 43–51 |
| IaC | Infrastructure as Code | Lab 45 |
| YAML | YAML Ain't Markup Language | Labs 26, 42–43 |
| OIDC | OpenID Connect | Lab 43 (GitHub Actions) |
| K8s | Kubernetes (common abbreviation) | Labs 42, 51 |

### Business, architecture, and capstone

| Acronym | Full form | Used in |
| ------- | --------- | ------- |
| CRM | Customer Relationship Management | Capstone (Labs 48–52) |
| ERP | Enterprise Resource Planning | Lab 13 (integration context) |
| UML | Unified Modeling Language | Lab 48 |
| HL7 | Health Level Seven (healthcare data standards) | Lab 13 (industry context) |
| FHIR | Fast Healthcare Interoperability Resources | Lab 13 (industry context) |

---

## Quick reference

| Technology area | Week | Labs | Primary tools |
| --------------- | ---- | ---- | ------------- |
| JVM and core Java | 1 | 1–7 | JDK, javac, javap, VisualVM, G1/ZGC |
| Build and project structure | 2 | 8–9 | Maven, layered packages |
| AI-assisted development | 2, 3, 5 | 10–12, 25, 27, 45 | GitHub Copilot, IntelliJ |
| Enterprise APIs | 2–3 | 13–16, 24 | SOAP, XML, WSDL, DTOs, Bean Validation |
| Testing and quality | 2 | 17–19 | JUnit 5, Mockito, Selenium |
| Logging and observability | 2, 5 | 20–21, 46 | SLF4J, Logback, Spring Actuator |
| Spring ecosystem | 3 | 22–29 | IoC, Boot, WS, Security, JPA |
| Event-driven architecture | 4, 5 | 30–32, 46 | Apache Kafka, Spring Kafka, Resilience4j |
| Frontend | 4 | 33–36, 50 | React, JSX, Hooks, Axios |
| Data persistence | 4 | 37–39, 50 | PostgreSQL, SQL, Spring Data JPA |
| DevOps and delivery | 5 | 40–45, 51 | Docker, **k3s** / kubectl, GitHub Actions, GHCR, Terraform, Ansible |
| Capstone delivery | 6 | 48–52 | Full-stack integration |

---

## Week 1 — Java and JVM Foundations

**Labs 1–7** · Modules 1–7

---

### JDK, javac, javap, and the JVM

| | |
| --- | --- |
| **What it is** | The JDK provides the compiler (`javac`), runtime (`java`), and inspection tools (`javap`). The JVM executes compiled bytecode on any supported platform. |
| **Why learn it** | Production outages — memory leaks, slow GC, class-loading failures — require JVM knowledge to diagnose. |
| **In this bootcamp** | [Lab 1](Week%201%20-%20Java%20and%20JVM%20Foundations/module-01/lab1/LAB-1-GUIDE.md) compiles and runs programs, inspects bytecode, and observes heap/stack behaviour. Labs 4–5 apply memory concepts to collections. |
| **Industry use** | Every Java backend — banking, telecom, healthcare. |

---

### Java language fundamentals

Covers syntax, OOP, collections, streams, and exceptions.

| | |
| --- | --- |
| **What it is** | Core Java: variables, loops, methods; OOP (classes, inheritance, SOLID); `ArrayList`/`HashMap`; Streams API with lambdas; `try-catch-finally` and custom exceptions. |
| **Why learn it** | Spring Boot, Kafka, and JPA are all Java. Weak fundamentals produce unmaintainable enterprise code. |
| **In this bootcamp** | [Labs 2–7](README.md#lab-index) scaffold the platform in plain Java — registration console, OOP models, collections, stream reporting, error handling. |
| **Industry use** | Required for every Java full-stack and backend role. |

---

### VisualVM, G1 GC, and ZGC

| | |
| --- | --- |
| **What it is** | VisualVM profiles JVM memory and threads. G1 and ZGC are modern garbage collectors with different latency/throughput trade-offs. |
| **Why learn it** | Applications crash from memory exhaustion. Developers must read GC logs and tune heap settings. |
| **In this bootcamp** | [Lab 4](Week%201%20-%20Java%20and%20JVM%20Foundations/module-04/lab4/LAB-4-GUIDE.md) triggers allocation, observes GC, and introduces performance analysis for capstone-scale data. |
| **Industry use** | Performance engineering and SRE in high-traffic systems. |

---

## Week 2 — Backend, AI Tools and Testing

**Labs 8–21** · Modules 8–21

---

### Maven and layered project structure

| | |
| --- | --- |
| **What it is** | Maven automates builds and dependencies via `pom.xml`. Standard layout (`src/main/java`, `src/test/java`) and packages (`controller`, `service`, `repository`) organise large codebases. |
| **Why learn it** | Enterprise projects have hundreds of dependencies. Manual JAR management does not scale. |
| **In this bootcamp** | [Lab 8](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-08/lab8/LAB-8-GUIDE.md) structures the project; [Lab 9](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-09/lab9/LAB-9-GUIDE.md) adds Maven for Spring, Kafka, and PostgreSQL drivers later. |
| **Industry use** | De facto Java build standard worldwide. |

---

### GitHub Copilot and AI-assisted development

| | |
| --- | --- |
| **What it is** | Copilot generates code, tests, and refactors from prompts in IntelliJ IDEA. Prompt engineering shapes output quality. |
| **Why learn it** | AI pair-programming is part of enterprise workflows. Developers must know when to trust, verify, and refine output. |
| **In this bootcamp** | [Labs 10–11](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-10/lab10/LAB-10-GUIDE.md) scaffold code and tests. Labs 12, 25, 27, 45 use Copilot for refactoring, repositories, transactions, and IaC — always with human review. |
| **Industry use** | Banking, insurance, and product teams accelerating delivery. |

---

### SOAP, XML, WSDL, and XSD

| | |
| --- | --- |
| **What it is** | SOAP is a contract-first XML protocol. WSDL describes the interface; XSD defines data schemas. |
| **Why learn it** | Banks, government systems, and ERP platforms still expose SOAP. Java developers must publish and consume it. |
| **In this bootcamp** | [Labs 13–14](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-13/lab13/LAB-13-GUIDE.md) design contracts and DTOs. [Lab 24](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-24/lab24/LAB-24-GUIDE.md) implements Spring WS endpoints. [Lab 35](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-35/lab35/LAB-35-GUIDE.md) connects React to SOAP. |
| **Industry use** | Financial services, healthcare integrations, enterprise ERP. |

---

### DTOs, Bean Validation, and service layer

| | |
| --- | --- |
| **What it is** | DTOs decouple API contracts from entities. Bean Validation (`@NotNull`, `@Size`) enforces input rules. The service layer holds business logic away from controllers and persistence. |
| **Why learn it** | Clean boundaries prevent leaking database models and centralise rules for testability. |
| **In this bootcamp** | [Labs 14–16](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-14/lab14/LAB-14-GUIDE.md) build validated models, services, and global exception handling. |
| **Industry use** | Standard in every enterprise API — REST, SOAP, or event-driven. |

---

### JUnit 5, Mockito, and Selenium

| | |
| --- | --- |
| **What it is** | JUnit 5 — unit testing. Mockito — mocks and stubs for isolation. Selenium — browser automation via WebDriver. |
| **Why learn it** | Enterprise teams block merges without automated tests. |
| **In this bootcamp** | [Labs 17–19](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-17/lab17/LAB-17-GUIDE.md) add unit, mocked, and UI tests. Capstone Labs 49–50 require test evidence. |
| **Industry use** | CI pipelines gate every production deployment. |

---

### SLF4J, Logback, and observability

| | |
| --- | --- |
| **What it is** | SLF4J/Logback for structured logging with correlation IDs. Spring Actuator exposes `/health`, metrics, and diagnostics. |
| **Why learn it** | When production fails at 2 AM, logs and health endpoints are the first diagnostic tools. |
| **In this bootcamp** | [Lab 20](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-20/lab20/LAB-20-GUIDE.md) adds logging. [Lab 21](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-21/lab21/LAB-21-GUIDE.md) wires Actuator — preparation for [Lab 46](Week%205%20-%20DevOps,%20CI-CD%20and%20k3s/lab46/LAB-46-GUIDE.md) and capstone ops. |
| **Industry use** | SRE, DevOps, and on-call engineering. |

---

## Week 3 — Spring Framework and Enterprise Patterns

**Labs 22–29** · Modules 22–29

---

### Spring Framework, IoC, and dependency injection

| | |
| --- | --- |
| **What it is** | Spring's IoC container manages object lifecycles. Dependency injection wires components without `new`. |
| **Why learn it** | Spring Boot powers most enterprise Java backends. IoC/DI underpins every Spring annotation. |
| **In this bootcamp** | [Lab 22](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-22/lab22/LAB-22-GUIDE.md) replaces manual wiring. Labs 23–29, 31, 39, 49 all depend on the container. |
| **Industry use** | Banking, telecom, insurance — virtually every large Java organisation. |

---

### Spring Boot, starters, and auto-configuration

| | |
| --- | --- |
| **What it is** | Boot removes boilerplate. Starters bundle dependencies. Auto-configuration sets up Tomcat, Jackson, and datasources from the classpath. |
| **Why learn it** | Modern services are created and deployed in minutes, not days of XML config. |
| **In this bootcamp** | [Lab 23](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-23/lab23/LAB-23-GUIDE.md) bootstraps the platform. [Lab 26](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-26/lab26/LAB-26-GUIDE.md) adds `dev`/`staging`/`prod` profiles. |
| **Industry use** | Default choice for new microservices and APIs. |

---

### Spring WS, transactions, security, and validation

| | |
| --- | --- |
| **What it is** | Spring WS for SOAP endpoints. `@Transactional` for ACID operations. Spring Security for JWT and RBAC. `@ControllerAdvice` for unified errors. |
| **Why learn it** | Production apps must be secure, consistent, and data-safe — non-negotiable requirements. |
| **In this bootcamp** | [Labs 24–29](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-24/lab24/LAB-24-GUIDE.md) harden the platform — endpoints, repositories, config, transactions, JWT, validation. |
| **Industry use** | Required for Spring Boot roles in regulated industries. |

---

## Week 4 — Kafka, React, PostgreSQL and Resilience

**Labs 30–39** · Modules 30–39

---

### Apache Kafka and Spring Kafka

| | |
| --- | --- |
| **What it is** | Kafka streams events across topics and partitions. Spring Kafka provides `KafkaTemplate` and `@KafkaListener`. |
| **Why learn it** | Modern systems use events for orders, notifications, audit trails, and service decoupling. |
| **In this bootcamp** | [Lab 30](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-30/lab30/LAB-30-GUIDE.md) designs flows. [Lab 31](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-31/lab31/LAB-31-GUIDE.md) integrates with Boot. [Lab 46](Week%205%20-%20DevOps,%20CI-CD%20and%20k3s/lab46/LAB-46-GUIDE.md) adds monitoring and DLQs. |
| **Industry use** | Banks, telcos, Netflix-scale data pipelines. |

---

### Resilience4j

| | |
| --- | --- |
| **What it is** | Circuit breakers, retries, and timeouts prevent cascading failures in distributed calls. |
| **Why learn it** | Distributed systems fail. Resilient services degrade gracefully. |
| **In this bootcamp** | [Lab 32](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-32/lab32/LAB-32-GUIDE.md) wraps SOAP and Kafka calls — essential for capstone integration. |
| **Industry use** | Cloud-native microservices architectures. |

---

### React, JSX, hooks, and Axios

| | |
| --- | --- |
| **What it is** | React builds UIs with components and JSX. Hooks (`useState`, `useEffect`) manage state. Axios calls backend APIs. |
| **Why learn it** | Full-stack Java roles require frontend skills. The CRM capstone has a React UI. |
| **In this bootcamp** | [Labs 33–36](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-33/lab33/LAB-33-GUIDE.md) build screens, state, API integration, and security. [Lab 50](Week%206%20-%20Capstone%20Project/module-50/lab50/LAB-50-GUIDE.md) delivers the capstone frontend. |
| **Industry use** | Standard frontend paired with Java backends. |

---

### PostgreSQL, SQL, and Spring Data JPA

| | |
| --- | --- |
| **What it is** | PostgreSQL stores relational data. SQL queries and indexes tune performance. JPA/Hibernate maps objects to tables via repositories. |
| **Why learn it** | Enterprise data lives in RDBMS systems. Developers must design schemas and write efficient queries. |
| **In this bootcamp** | [Labs 37–38](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-37/lab37/LAB-37-GUIDE.md) design and tune the schema. [Lab 39](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-39/lab39/LAB-39-GUIDE.md) connects JPA. [Lab 50](Week%206%20-%20Capstone%20Project/module-50/lab50/LAB-50-GUIDE.md) persists capstone data. |
| **Industry use** | Banking, government, large corporate IT. |

---

## Week 5 — DevOps, CI/CD and Kubernetes (k3s)

> Folder name still says “k3s” for historical path stability. **This cohort deploys to k3s** — see [FINAL-SETUP-README.md](FINAL-SETUP-README.md).

**Labs 40–47** · Modules 40–47

---

### SAST and application security testing

| | |
| --- | --- |
| **What it is** | Static scans find vulnerabilities — SQL injection, secrets, insecure dependencies — before deployment. |
| **Why learn it** | Finding flaws in CI is cheaper than remediating breaches. |
| **In this bootcamp** | [Lab 40](Week%205%20-%20DevOps,%20CI-CD%20and%20k3s/lab40/LAB-40-GUIDE.md) integrates scanning. [Lab 51](Week%206%20-%20Capstone%20Project/module-51/lab51/LAB-51-GUIDE.md) runs SAST/DAST in capstone delivery. |
| **Industry use** | Regulated industries and secure-SDLC programmes. |

---

### Docker and container images

| | |
| --- | --- |
| **What it is** | Docker packages apps into portable images via `Dockerfile`. Images run identically anywhere. |
| **Why learn it** | Every cloud deployment starts with a container image. |
| **In this bootcamp** | [Lab 41](Week%205%20-%20DevOps,%20CI-CD%20and%20k3s/lab41/LAB-41-GUIDE.md) containerises backend and frontend. [Lab 51](Week%206%20-%20Capstone%20Project/module-51/lab51/LAB-51-GUIDE.md) ships capstone containers. |
| **Industry use** | Universal format for Kubernetes deployments. |

---

### Kubernetes (k3s) — this cohort

| | |
| --- | --- |
| **What it is** | Kubernetes orchestrates containers — scaling, health checks, rolling updates. **This cohort** uses **k3s** with **Traefik** Ingress (not k3s). |
| **Why learn it** | Enterprise Java runs on clusters, not individual servers. |
| **In this bootcamp** | [Lab 42](Week%205%20-%20DevOps,%20CI-CD%20and%20k3s/lab42/LAB-42-GUIDE.md) deploys with **`kubectl`** into your namespace. [Lab 51](Week%206%20-%20Capstone%20Project/module-51/lab51/LAB-51-GUIDE.md) is the production-style target. Prefer Ingress over “k3s Route” wording. See [FINAL-SETUP-README.md](FINAL-SETUP-README.md). |
| **Industry use** | Finance, telecom, government cloud-native platforms. |

---

### GitHub Actions, CD, Terraform, and Ansible

| | |
| --- | --- |
| **What it is** | GitHub Actions automates build-test-deploy. CD promotes artefacts across environments. Terraform provisions infrastructure; Ansible configures and deploys. |
| **Why learn it** | Modern teams ship through pipelines. IaC makes infrastructure repeatable and auditable. |
| **In this bootcamp** | [Labs 43–44](Week%205%20-%20DevOps,%20CI-CD%20and%20k3s/lab43/LAB-43-GUIDE.md) build the pipeline. [Lab 45](Week%205%20-%20DevOps,%20CI-CD%20and%20k3s/lab45/LAB-45-GUIDE.md) provisions infra. [Lab 51](Week%206%20-%20Capstone%20Project/module-51/lab51/LAB-51-GUIDE.md) wires full delivery. |
| **Industry use** | Atlassian, AWS, Azure, and hybrid-cloud DevOps. |

---

### Kafka monitoring and professional communication

| | |
| --- | --- |
| **What it is** | Consumer-lag alerts, dead-letter queues, and schema evolution keep Kafka healthy. Agile ceremonies and clear communication align teams. |
| **Why learn it** | Production Kafka needs observability. Soft skills get architecture approved and code merged. |
| **In this bootcamp** | [Lab 46](Week%205%20-%20DevOps,%20CI-CD%20and%20k3s/lab46/LAB-46-GUIDE.md) monitors Kafka. [Lab 47](Week%205%20-%20DevOps,%20CI-CD%20and%20k3s/lab47/LAB-47-GUIDE.md) prepares for stand-ups, reviews, and [Lab 52](Week%206%20-%20Capstone%20Project/module-52/lab52/LAB-52-GUIDE.md) defense. |
| **Industry use** | Platform engineering and every professional dev role. |

---

## Week 6 — Enterprise Capstone

**Labs 48–52** · Modules 48–52

The capstone combines every technology from Weeks 1–5 into a production-style **Customer Relationship Management (CRM) Platform**.

| Lab | Focus | Key technologies |
| --- | ----- | ---------------- |
| [48](Week%206%20-%20Capstone%20Project/module-48/lab48/LAB-48-GUIDE.md) | Architecture, planning, documentation | UML, Agile backlog, risk assessment |
| [49](Week%206%20-%20Capstone%20Project/module-49/lab49/LAB-49-GUIDE.md) | Backend and messaging | Spring Boot, Kafka, Spring Security, JUnit |
| [50](Week%206%20-%20Capstone%20Project/module-50/lab50/LAB-50-GUIDE.md) | Frontend and persistence | React, Spring Data JPA, PostgreSQL, Selenium |
| [51](Week%206%20-%20Capstone%20Project/module-51/lab51/LAB-51-GUIDE.md) | Security, CI/CD, deployment | JWT, Docker, **k3s**/kubectl, GHCR, GitHub Actions, SAST |
| [52](Week%206%20-%20Capstone%20Project/module-52/lab52/LAB-52-GUIDE.md) | Final defense and retrospective | Architecture review, demo, lessons learned |

| | |
| --- | --- |
| **Why learn it** | Employers hire developers who deliver end-to-end — not isolated exercises. |
| **Industry use** | Mirrors a real cycle: design, build, test, secure, deploy, present. |
