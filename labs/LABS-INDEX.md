# Lab Guides

Hands-on lab guides for the Java Software Engineer Bootcamp.

- **Lab 0** — pre-course environment setup (`module-00/lab0`)
- **Labs 1–52** — one lab per module under `module-NN/labN`, **grouped by week**
- **Week 1 exercises** — `module-01`…`07/exercises/` (after slides, before the lab)

Instructor curriculum twins (slide PNGs) live in [`../curriculum/`](../curriculum/) with the **same week and `module-NN` names**.

## How to use these labs

1. Start from **[PARTICIPANT-SETUP-README.md](PARTICIPANT-SETUP-README.md)** and **[Lab 0](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-GUIDE.md)**.
2. Open the week folder → module-NN/labN/ → read **LAB-N-GUIDE.md** plus your OS how-to (LAB-N-WINDOWS.md or LAB-N-MACOS.md).
3. Follow **How to follow this lab** at the top of each guide: Step → Expected → next step.
4. Mark **Pass criteria** tables in your own notes (**Pass** / **Fail**). GitHub file view cannot tick checkboxes.
5. Keep code under `~/java-bootcamp/examples/` (Windows: `%USERPROFILE%\java-bootcamp\examples`). Capture evidence under `notes/screenshots/` (Lab 0) or `examples/<lab>/notes/screenshots/` (later labs).

**Primary IDE:** IntelliJ IDEA Community · **Optional IDE:** VS Code  

Every lab lives under its module folder as `module-NN/labN/` and includes:
- `LAB-N-GUIDE.md` — full lab steps  
- `LAB-N-WINDOWS.md` — Windows + IntelliJ how-to  
- `LAB-N-MACOS.md` — macOS + IntelliJ how-to  
- Week 1 also has `module-NN/exercises/` (pre-lab practice after slides)

| Guide | Purpose |
| ----- | ------- |
| [**Final Lab Environment Setup**](FINAL-SETUP-README.md) | **Authoritative final setup** — shared host Postgres 17, Kafka 4.0, k3s, GHCR |
| [**Participant Setup README**](PARTICIPANT-SETUP-README.md) | Whole environment setup for students (laptop + shared services, accounts, pass criteria) |
| [**Labs Setup Instructions**](SETUP-INSTRUCTIONS.md) | Tools, versions, ports, and lab-by-lab requirements matrix |
| [Lab 0 — Environment Setup](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-GUIDE.md) | Hands-on laptop setup ([Windows](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) · [macOS](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md)) |
| [Technology Stack Guide](TECHNOLOGY-STACK-GUIDE.md) | Technologies, [acronym full forms](TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms), and learning rationale |

---

## Folder layout

```text
labs/
├── LABS-INDEX.md                     ← You are here
├── README.md                          ← GitHub pointer
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
| [Week 6 - Capstone Project](Week%206%20-%20Capstone%20Project/) | lab48–lab52 | Capstone plan → build → secure/deploy → defense ([week index](Week%206%20-%20Capstone%20Project/WEEK-LABS-INDEX.md) · [brief + rubric](Week%206%20-%20Capstone%20Project/CAPSTONE-BRIEF-AND-RUBRIC.md)) |

---

## Lab Index by Week

### Week 1 — Java and JVM Foundations

| Lab | Module | Module Title | Pre-lab exercises | Lab Title |
| --- | ------ | ------------ | ----------------- | --------- |
| [lab0](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-GUIDE.md) | — | Pre-course | — | Development Environment Setup |
| [lab1](Week%201%20-%20Java%20and%20JVM%20Foundations/module-01/lab1/LAB-1-GUIDE.md) | 1 | JVM Architecture and Runtime Model | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-01/exercises/) | JVM and Compilation |
| [lab2](Week%201%20-%20Java%20and%20JVM%20Foundations/module-02/lab2/LAB-2-GUIDE.md) | 2 | Java Syntax and Core Constructs | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-02/exercises/) | Java Syntax and I/O |
| [lab3](Week%201%20-%20Java%20and%20JVM%20Foundations/module-03/lab3/LAB-3-GUIDE.md) | 3 | Object-Oriented Programming in Java | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-03/exercises/) | Object-Oriented Design |
| [lab4](Week%201%20-%20Java%20and%20JVM%20Foundations/module-04/lab4/LAB-4-GUIDE.md) | 4 | Memory Management and Performance | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-04/exercises/) | Memory and Garbage Collection |
| [lab5](Week%201%20-%20Java%20and%20JVM%20Foundations/module-05/lab5/LAB-5-GUIDE.md) | 5 | Java Collections Framework | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-05/exercises/) | Java Collections |
| [lab6](Week%201%20-%20Java%20and%20JVM%20Foundations/module-06/lab6/LAB-6-GUIDE.md) | 6 | Streams and Functional Programming | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-06/exercises/) | Streams and Lambdas |
| [lab7](Week%201%20-%20Java%20and%20JVM%20Foundations/module-07/lab7/LAB-7-GUIDE.md) | 7 | Exception Handling and Error Management | [exercises](Week%201%20-%20Java%20and%20JVM%20Foundations/module-07/exercises/) | Exception Handling |

### Week 2 — Backend, AI Tools and Testing

| Lab | Module | Module Title | Lab Title |
| --- | ------ | ------------ | --------- |
| [lab8](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-08/lab8/LAB-8-GUIDE.md) | 8 | Java Project Structure and Modularization | Project Structure and Organization |
| [lab9](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-09/lab9/LAB-9-GUIDE.md) | 9 | Build and Dependency Management with Maven | Maven Build and Dependencies |
| [lab10](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-10/lab10/LAB-10-GUIDE.md) | 10 | GitHub Copilot Fundamentals for Java Developers | AI-Assisted Code Generation |
| [lab11](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-11/lab11/LAB-11-GUIDE.md) | 11 | GitHub Copilot for Testing and Refactoring | AI-Assisted Test Generation |
| [lab12](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-12/lab12/LAB-12-GUIDE.md) | 12 | Java Coding Standards and Best Practices | Coding Standards and Refactoring |
| [lab13](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-13/lab13/LAB-13-GUIDE.md) | 13 | SOAP API Design with Java | SOAP API Design |
| [lab14](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-14/lab14/LAB-14-GUIDE.md) | 14 | DTOs, Validation and API Contracts | DTOs and Validation |
| [lab15](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-15/lab15/LAB-15-GUIDE.md) | 15 | Business Logic and Service Layer Design | Service Layer Design |
| [lab16](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-16/lab16/LAB-16-GUIDE.md) | 16 | Exception Handling in Distributed APIs | API Exception Handling |
| [lab17](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-17/lab17/LAB-17-GUIDE.md) | 17 | JUnit Testing Fundamentals | JUnit Testing with AI Assistance |
| [lab18](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-18/lab18/LAB-18-GUIDE.md) | 18 | Mockito for Test Isolation | Mockito and Mocking with AI Assistance |
| [lab19](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-19/lab19/LAB-19-GUIDE.md) | 19 | Integration Testing and UI Test Automation | Integration and UI Testing with Selenium |
| [lab20](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-20/lab20/LAB-20-GUIDE.md) | 20 | Logging Frameworks and Diagnostics | Structured Logging |
| [lab21](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-21/lab21/LAB-21-GUIDE.md) | 21 | API Observability and Monitoring | Observability and Monitoring |

### Week 3 — Spring Framework and Enterprise Patterns

| Lab | Module | Module Title | Lab Title |
| --- | ------ | ------------ | --------- |
| [lab22](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-22/lab22/LAB-22-GUIDE.md) | 22 | Spring Core and Inversion of Control (IoC) | Spring IoC and Dependency Injection |
| [lab23](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-23/lab23/LAB-23-GUIDE.md) | 23 | Spring Boot Auto-Configuration | Spring Boot Setup and Auto-Configuration |
| [lab24](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-24/lab24/LAB-24-GUIDE.md) | 24 | SOAP Web Services with Spring WS | Spring-WS SOAP Endpoint Development |
| [lab25](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-25/lab25/LAB-25-GUIDE.md) | 25 | Service and Repository Layers | Service and Repository Layers with AI Assistance |
| [lab26](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-26/lab26/LAB-26-GUIDE.md) | 26 | Spring Profiles and Configuration | Spring Profiles and Configuration |
| [lab27](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-27/lab27/LAB-27-GUIDE.md) | 27 | Transaction Management | Transaction Management with AI Assistance |
| [lab28](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-28/lab28/LAB-28-GUIDE.md) | 28 | Spring Security Fundamentals | Spring Security Basics |
| [lab29](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-29/lab29/LAB-29-GUIDE.md) | 29 | Validation and Global Exception Handling | Validation and Exception Handling |

### Week 4 — Kafka, React, PostgreSQL and Resilience

| Lab | Module | Module Title | Lab Title |
| --- | ------ | ------------ | --------- |
| [lab30](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-30/lab30/LAB-30-GUIDE.md) | 30 | Event-Driven Architecture with Kafka | Event-Driven Architecture with Kafka |
| [lab31](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-31/lab31/LAB-31-GUIDE.md) | 31 | Kafka Integration with Spring Boot | Kafka Integration |
| [lab32](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-32/lab32/LAB-32-GUIDE.md) | 32 | Resilience and Fault Tolerance | Resilience and Fault Tolerance |
| [lab33](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-33/lab33/LAB-33-GUIDE.md) | 33 | React Component Development | React Component Development |
| [lab34](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-34/lab34/LAB-34-GUIDE.md) | 34 | State and Event Management | State and Event Management |
| [lab35](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-35/lab35/LAB-35-GUIDE.md) | 35 | Frontend and API Integration | Frontend and API Integration |
| [lab36](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-36/lab36/LAB-36-GUIDE.md) | 36 | Frontend Security | Frontend Security |
| [lab37](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-37/lab37/LAB-37-GUIDE.md) | 37 | PostgreSQL Design | PostgreSQL Design |
| [lab38](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-38/lab38/LAB-38-GUIDE.md) | 38 | SQL and Query Performance | SQL and Query Performance |
| [lab39](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-39/lab39/LAB-39-GUIDE.md) | 39 | Spring Data JPA and PostgreSQL | Spring Data JPA and PostgreSQL |

### Week 5 — DevOps, CI/CD and Kubernetes (k3s)

| Lab | Module | Module Title | Lab Title |
| --- | ------ | ------------ | --------- |
| [lab40](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-40/lab40/LAB-40-GUIDE.md) | 40 | Application Security Testing | Application Security Testing |
| [lab41](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-41/lab41/LAB-41-GUIDE.md) | 41 | Containerization with Docker | Containerization |
| [lab42](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-42/lab42/LAB-42-GUIDE.md) | 42 | Kubernetes (k3s) Deployment | Kubernetes (k3s) Deployment |
| [lab43](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-43/lab43/LAB-43-GUIDE.md) | 43 | GitHub Actions and CI/CD Integration | GitHub CI/CD Pipeline |
| [lab44](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-44/lab44/LAB-44-GUIDE.md) | 44 | Continuous Delivery and Release Management | Continuous Delivery Pipeline |
| [lab45](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-45/lab45/LAB-45-GUIDE.md) | 45 | Infrastructure as Code with Terraform and Ansible | Infrastructure as Code with AI Assistance |
| [lab46](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-46/lab46/LAB-46-GUIDE.md) | 46 | Kafka Resilience and Observability | Kafka Resilience and Observability |
| [lab47](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-47/lab47/LAB-47-GUIDE.md) | 47 | Professional Communication and Collaboration | Professional Communication and Collaboration |

### Week 6 — Capstone Project

**Master document:** [Week 6 Capstone index](Week%206%20-%20Capstone%20Project/WEEK-LABS-INDEX.md) · [Brief DOCX](../Java_Software_Engineer_Capstone.docx) · [Rubric DOCX](../Java_Software_Engineer_Capstone_Rubric.docx) · [Markdown brief](Week%206%20-%20Capstone%20Project/CAPSTONE-BRIEF-AND-RUBRIC.md)

| Lab | Module | Module Title | Lab Title |
| --- | ------ | ------------ | --------- |
| [lab48](Week%206%20-%20Capstone%20Project/module-48/lab48/LAB-48-GUIDE.md) | 48 | Capstone Planning and Architecture | Capstone Planning and Architecture |
| [lab49](Week%206%20-%20Capstone%20Project/module-49/lab49/LAB-49-GUIDE.md) | 49 | Capstone Backend and Messaging | Capstone Backend and Messaging |
| [lab50](Week%206%20-%20Capstone%20Project/module-50/lab50/LAB-50-GUIDE.md) | 50 | Capstone Frontend and Persistence | Capstone Frontend and Persistence |
| [lab51](Week%206%20-%20Capstone%20Project/module-51/lab51/LAB-51-GUIDE.md) | 51 | Capstone Security, CI/CD and Deployment | Capstone Delivery and Deployment |
| [lab52](Week%206%20-%20Capstone%20Project/module-52/lab52/LAB-52-GUIDE.md) | 52 | Capstone Final Defense and Retrospective | Capstone Final Defense |

---

## Quick path reference

| Labs | Path under `labs/` |
| ---- | ------------------ |
| 0–7 | `Week 1 - Java and JVM Foundations/module-NN/labN/` |
| 8–21 | `Week 2 - Backend, AI Tools and Testing/module-NN/labN/` |
| 22–29 | `Week 3 - Spring Framework and Enterprise Patterns/module-NN/labN/` |
| 30–39 | `Week 4 - Kafka, React, PostgreSQL and Resilience/module-NN/labN/` |
| 40–47 | `Week 5 - DevOps, CI-CD and OpenShift/module-NN/labN/` |
| 48–52 | `Week 6 - Capstone Project/module-NN/labN/` |
