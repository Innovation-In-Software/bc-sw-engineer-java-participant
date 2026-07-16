# Lab Guides

Hands-on lab guides for the Java Software Engineer Bootcamp.

- **Lab 0** — pre-course environment setup (`module-00/lab0`)
- **Labs 1–52** — one lab per module under `module-NN/labN`, **grouped by week**
- **Week 1 exercises** — `module-01`…`07/exercises/` (after slides, before the lab)

Instructor curriculum twins (slide PNGs) live in [`../curriculum/`](../curriculum/) with the **same week and `module-NN` names**.

**Primary IDE:** IntelliJ IDEA Community · **Optional IDE:** VS Code  

Every lab lives under its module folder as `module-NN/labN/` and includes:
- `README.md` — full lab steps  
- `README-windows.md` — Windows + IntelliJ how-to  
- `README-macos.md` — macOS + IntelliJ how-to  
- Week 1 also has `module-NN/exercises/` (pre-lab practice after slides)

| Guide | Purpose |
| ----- | ------- |
| [**Final Lab Environment Setup**](FINAL-SETUP-README.md) | **Authoritative final setup** — shared host Postgres 17, Kafka 4.0, k3s, GHCR |
| [**Participant Setup README**](PARTICIPANT-SETUP-README.md) | Whole environment setup for students (laptop + shared services, accounts, checklists) |
| [**Labs Setup Instructions**](SETUP-INSTRUCTIONS.md) | Tools, versions, ports, and lab-by-lab requirements matrix |
| [Lab 0 — Environment Setup](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/README.md) | Hands-on laptop setup ([Windows](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/README-windows.md) · [macOS](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/README-macos.md)) |
| [Technology Stack Guide](TECHNOLOGY-STACK-GUIDE.md) | Technologies, [acronym full forms](TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms), and learning rationale |

---

## Folder layout

```text
labs/
├── README.md                          ← You are here
├── FINAL-SETUP-README.md              ← Final cohort lab environment (read this)
├── PARTICIPANT-SETUP-README.md
├── SETUP-INSTRUCTIONS.md
├── TECHNOLOGY-STACK-GUIDE.md
├── Week 1 - Java and JVM Foundations/          (module-00/lab0 · module-01…07 = exercises + lab)
├── Week 2 - Backend, AI Tools and Testing/     (module-08…21/labN)
├── Week 3 - Spring Framework and Enterprise Patterns/  (module-22…29/labN)
├── Week 4 - Kafka, React, PostgreSQL and Resilience/       (module-30…39/labN)
├── Week 5 - DevOps, CI-CD and OpenShift/               (module-40…47/labN; cluster = k3s)
└── Week 6 - Capstone Project/                          (module-48…52/labN)
```

| Week folder | Labs | Theme |
| ----------- | ---- | ----- |
| [Week 1 - Java and JVM Foundations](Week%201%20-%20Java%20and%20JVM%20Foundations/) | lab0–lab7 | JVM, syntax, OOP, memory, collections, streams, exceptions |
| [Week 2 - Backend, AI Tools and Testing](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/) | lab8–lab21 | Maven, Copilot, SOAP/DTO/service, JUnit/Mockito, Selenium, logging, observability |
| [Week 3 - Spring Framework and Enterprise Patterns](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/) | lab22–lab29 | Spring IoC/Boot/WS, layers, profiles, transactions, security, validation |
| [Week 4 - Kafka, React, PostgreSQL and Resilience](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/) | lab30–lab39 | Kafka, Resilience4j, React, PostgreSQL, JPA |
| [Week 5 - DevOps, CI-CD and OpenShift](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/) | lab40–lab47 | AppSec, Docker, k3s, GitHub Actions, CD, IaC, Kafka ops, communication |
| [Week 6 - Capstone Project](Week%206%20-%20Capstone%20Project/) | lab48–lab52 | Capstone plan → build → secure/deploy → defense ([master README](Week%206%20-%20Capstone%20Project/README.md) · [brief + rubric](Week%206%20-%20Capstone%20Project/CAPSTONE-BRIEF-AND-RUBRIC.md)) |

---

## Lab Index by Week

### Week 1 — Java and JVM Foundations

| Lab | Module | Module Title | Pre-lab exercises | Lab Title |
| --- | ------ | ------------ | ----------------- | --------- |
| [lab0](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/README.md) | — | Pre-course | — | Development Environment Setup |
| [lab1](Week%201%20-%20Java%20and%20JVM%20Foundations/module-01/lab1/README.md) | 1 | JVM Architecture and Runtime Model | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-01/exercises/) | JVM and Compilation |
| [lab2](Week%201%20-%20Java%20and%20JVM%20Foundations/module-02/lab2/README.md) | 2 | Java Syntax and Core Constructs | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-02/exercises/) | Java Syntax and I/O |
| [lab3](Week%201%20-%20Java%20and%20JVM%20Foundations/module-03/lab3/README.md) | 3 | Object-Oriented Programming in Java | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-03/exercises/) | Object-Oriented Design |
| [lab4](Week%201%20-%20Java%20and%20JVM%20Foundations/module-04/lab4/README.md) | 4 | Memory Management and Performance | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-04/exercises/) | Memory and Garbage Collection |
| [lab5](Week%201%20-%20Java%20and%20JVM%20Foundations/module-05/lab5/README.md) | 5 | Java Collections Framework | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-05/exercises/) | Java Collections |
| [lab6](Week%201%20-%20Java%20and%20JVM%20Foundations/module-06/lab6/README.md) | 6 | Streams and Functional Programming | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-06/exercises/) | Streams and Lambdas |
| [lab7](Week%201%20-%20Java%20and%20JVM%20Foundations/module-07/lab7/README.md) | 7 | Exception Handling and Error Management | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-07/exercises/) | Exception Handling |

### Week 2 — Backend, AI Tools and Testing

| Lab | Module | Module Title | Lab Title |
| --- | ------ | ------------ | --------- |
| [lab8](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-08/lab8/README.md) | 8 | Java Project Structure and Modularization | Project Structure and Organization |
| [lab9](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-09/lab9/README.md) | 9 | Build and Dependency Management with Maven | Maven Build and Dependencies |
| [lab10](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-10/lab10/README.md) | 10 | GitHub Copilot Fundamentals for Java Developers | AI-Assisted Code Generation |
| [lab11](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-11/lab11/README.md) | 11 | GitHub Copilot for Testing and Refactoring | AI-Assisted Test Generation |
| [lab12](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-12/lab12/README.md) | 12 | Java Coding Standards and Best Practices | Coding Standards and Refactoring |
| [lab13](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-13/lab13/README.md) | 13 | SOAP API Design with Java | SOAP API Design |
| [lab14](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-14/lab14/README.md) | 14 | DTOs, Validation and API Contracts | DTOs and Validation |
| [lab15](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-15/lab15/README.md) | 15 | Business Logic and Service Layer Design | Service Layer Design |
| [lab16](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-16/lab16/README.md) | 16 | Exception Handling in Distributed APIs | API Exception Handling |
| [lab17](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-17/lab17/README.md) | 17 | JUnit Testing Fundamentals | JUnit Testing with AI Assistance |
| [lab18](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-18/lab18/README.md) | 18 | Mockito for Test Isolation | Mockito and Mocking with AI Assistance |
| [lab19](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-19/lab19/README.md) | 19 | Integration Testing and UI Test Automation | Integration and UI Testing with Selenium |
| [lab20](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-20/lab20/README.md) | 20 | Logging Frameworks and Diagnostics | Structured Logging |
| [lab21](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-21/lab21/README.md) | 21 | API Observability and Monitoring | Observability and Monitoring |

### Week 3 — Spring Framework and Enterprise Patterns

| Lab | Module | Module Title | Lab Title |
| --- | ------ | ------------ | --------- |
| [lab22](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-22/lab22/README.md) | 22 | Spring Core and Inversion of Control (IoC) | Spring IoC and Dependency Injection |
| [lab23](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-23/lab23/README.md) | 23 | Spring Boot Auto-Configuration | Spring Boot Setup and Auto-Configuration |
| [lab24](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-24/lab24/README.md) | 24 | SOAP Web Services with Spring WS | Spring-WS SOAP Endpoint Development |
| [lab25](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-25/lab25/README.md) | 25 | Service and Repository Layers | Service and Repository Layers with AI Assistance |
| [lab26](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-26/lab26/README.md) | 26 | Spring Profiles and Configuration | Spring Profiles and Configuration |
| [lab27](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-27/lab27/README.md) | 27 | Transaction Management | Transaction Management with AI Assistance |
| [lab28](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-28/lab28/README.md) | 28 | Spring Security Fundamentals | Spring Security Basics |
| [lab29](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-29/lab29/README.md) | 29 | Validation and Global Exception Handling | Validation and Exception Handling |

### Week 4 — Kafka, React, PostgreSQL and Resilience

| Lab | Module | Module Title | Lab Title |
| --- | ------ | ------------ | --------- |
| [lab30](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-30/lab30/README.md) | 30 | Event-Driven Architecture with Kafka | Event-Driven Architecture with Kafka |
| [lab31](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-31/lab31/README.md) | 31 | Kafka Integration with Spring Boot | Kafka Integration |
| [lab32](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-32/lab32/README.md) | 32 | Resilience and Fault Tolerance | Resilience and Fault Tolerance |
| [lab33](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-33/lab33/README.md) | 33 | React Component Development | React Component Development |
| [lab34](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-34/lab34/README.md) | 34 | State and Event Management | State and Event Management |
| [lab35](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-35/lab35/README.md) | 35 | Frontend and API Integration | Frontend and API Integration |
| [lab36](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-36/lab36/README.md) | 36 | Frontend Security | Frontend Security |
| [lab37](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-37/lab37/README.md) | 37 | PostgreSQL Design | PostgreSQL Design |
| [lab38](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-38/lab38/README.md) | 38 | SQL and Query Performance | SQL and Query Performance |
| [lab39](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-39/lab39/README.md) | 39 | Spring Data JPA and PostgreSQL | Spring Data JPA and PostgreSQL |

### Week 5 — DevOps, CI/CD and Kubernetes (k3s)

| Lab | Module | Module Title | Lab Title |
| --- | ------ | ------------ | --------- |
| [lab40](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-40/lab40/README.md) | 40 | Application Security Testing | Application Security Testing |
| [lab41](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-41/lab41/README.md) | 41 | Containerization with Docker | Containerization |
| [lab42](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-42/lab42/README.md) | 42 | Kubernetes (k3s) Deployment | Kubernetes (k3s) Deployment |
| [lab43](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-43/lab43/README.md) | 43 | GitHub Actions and CI/CD Integration | GitHub CI/CD Pipeline |
| [lab44](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-44/lab44/README.md) | 44 | Continuous Delivery and Release Management | Continuous Delivery Pipeline |
| [lab45](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-45/lab45/README.md) | 45 | Infrastructure as Code with Terraform and Ansible | Infrastructure as Code with AI Assistance |
| [lab46](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-46/lab46/README.md) | 46 | Kafka Resilience and Observability | Kafka Resilience and Observability |
| [lab47](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-47/lab47/README.md) | 47 | Professional Communication and Collaboration | Professional Communication and Collaboration |

### Week 6 — Capstone Project

**Master document:** [Week 6 Capstone README](Week%206%20-%20Capstone%20Project/README.md) · [Brief DOCX](../Java_Software_Engineer_Capstone.docx) · [Rubric DOCX](../Java_Software_Engineer_Capstone_Rubric.docx) · [Markdown brief](Week%206%20-%20Capstone%20Project/CAPSTONE-BRIEF-AND-RUBRIC.md)

| Lab | Module | Module Title | Lab Title |
| --- | ------ | ------------ | --------- |
| [lab48](Week%206%20-%20Capstone%20Project/module-48/lab48/README.md) | 48 | Capstone Planning and Architecture | Capstone Planning and Architecture |
| [lab49](Week%206%20-%20Capstone%20Project/module-49/lab49/README.md) | 49 | Capstone Backend and Messaging | Capstone Backend and Messaging |
| [lab50](Week%206%20-%20Capstone%20Project/module-50/lab50/README.md) | 50 | Capstone Frontend and Persistence | Capstone Frontend and Persistence |
| [lab51](Week%206%20-%20Capstone%20Project/module-51/lab51/README.md) | 51 | Capstone Security, CI/CD and Deployment | Capstone Delivery and Deployment |
| [lab52](Week%206%20-%20Capstone%20Project/module-52/lab52/README.md) | 52 | Capstone Final Defense and Retrospective | Capstone Final Defense |

---

## Quick path reference

| Labs | Path under `labs/` |
| ---- | ------------------ |
| 0–7 | `Week 1 - Java and JVM Foundations/labN/` |
| 8–21 | `Week 2 - Backend, AI Tools and Testing/labN/` |
| 22–29 | `Week 3 - Spring Framework and Enterprise Patterns/labN/` |
| 30–39 | `Week 4 - Kafka, React, PostgreSQL and Resilience/labN/` |
| 40–47 | `Week 5 - DevOps, CI-CD and OpenShift/labN/` |
| 48–52 | `Week 6 - Capstone Project/labN/` |
