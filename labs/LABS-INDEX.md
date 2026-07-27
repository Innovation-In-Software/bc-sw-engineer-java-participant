# Lab Guides

Hands-on lab guides for the Java Software Engineer Bootcamp.

**Participants — clone handouts + commit in your own repo?** → **[CLONE-AND-OWN-REPO-GUIDE.md](CLONE-AND-OWN-REPO-GUIDE.md)**  
**Participants — which file when?** → **[_PARTICIPANT-FILE-GUIDE.md](_PARTICIPANT-FILE-GUIDE.md)**  
For Week 1 Modules 1–7, also open **`module-NN/README.md`** first (Start here).

- **Lab 0** — pre-course environment setup (`module-00/lab0`) — **timed path:** [`starter/README.md`](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/starter/README.md); full install: **OS how-to** (`LAB-0-WINDOWS.md` or `LAB-0-MACOS.md`)
- **Labs 1–52** — one lab per module under `module-NN/labN`, **grouped by week** — in class use **`labN/starter/`** (~45 min); see **[_STARTER-PATH.md](_STARTER-PATH.md)**
- **Week 1 exercises** — `module-01`…`07/exercises/` (after slides, before the lab)
- **Week 2–6 exercises (Modules 8–52)** — each `module-NN/exercises/` (after slides, before the lab)
- **Capstone 48–52** — starters are a **session block**; multi-day build/defense stays on the full GUIDE path

Instructor curriculum twins (slide PNGs) live in [`../curriculum/`](../curriculum/) with the **same week and `module-NN` names**.

**Kahoot knowledge checks (Modules 1–39 / Weeks 1–4):** instructors import Excel banks from the authoring `curriculum/Week N …/kahoot/` folders; participants join with the classroom PIN at [kahoot.it](https://kahoot.it). Index: [`../curriculum/CURRICULUM-INDEX.md`](../curriculum/CURRICULUM-INDEX.md#kahoot-quizzes).

## How to use these labs

1. Start from **[PARTICIPANT-SETUP-README.md](PARTICIPANT-SETUP-README.md)** and **[Lab 0](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md)** (or macOS) — prefer the [Lab 0 starter checklist](Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/starter/README.md) for the 45-minute block.
2. Read **[_PARTICIPANT-FILE-GUIDE.md](_PARTICIPANT-FILE-GUIDE.md)** and **[_STARTER-PATH.md](_STARTER-PATH.md)** once so you know GUIDE vs WINDOWS vs starter timed path.
3. For each later module: open **`module-NN/README.md`** (Week 1 and Modules 8–52) → exercises (if any) → **one** OS how-to → **`starter/README.md`** (in class) → **`LAB-N-GUIDE.md`** (full path / homework).
4. Follow **How to follow this lab** at the top of each GUIDE: timed path first in class, then Step → Expected → next step on the full path.
5. Mark **Pass criteria** tables in your own notes (**Pass** / **Fail**). GitHub file view cannot tick checkboxes.
6. Keep code under `~/java-bootcamp/examples/` (Windows: `%USERPROFILE%\java-bootcamp\examples`). Capture evidence under workspace-root `notes/screenshots/` (Lab 0) or `notes/screenshots/lab-N/` (Labs 1–52). Do not create a top-level `labs/` folder inside `java-bootcamp`.

**Primary IDE:** IntelliJ IDEA Community · **Optional IDE:** VS Code  

Every lab lives under its module folder as `module-NN/labN/` and includes:
- `LAB-N-GUIDE.md` — full lab steps (**your main file for Labs 1–52**)  
- `starter/` — **45-minute timed path** checklist + templates ([`_STARTER-PATH.md`](_STARTER-PATH.md))  
- `LAB-N-WINDOWS.md` — Windows + IntelliJ how-to (**pick one OS**)  
- `LAB-N-MACOS.md` — macOS + IntelliJ how-to (**pick one OS**)  
- Week 1 also has `module-NN/exercises/` (pre-lab practice after slides) and `module-NN/README.md` (Start here)

| Guide | Purpose |
| ----- | ------- |
| [**Clone + own repo**](CLONE-AND-OWN-REPO-GUIDE.md) | Clone course handouts; commit/push only to your private `java-bootcamp` |
| [**Which file do I open?**](_PARTICIPANT-FILE-GUIDE.md) | Participant sequence + what to ignore |
| [**45-minute timed path**](_STARTER-PATH.md) | Starter templates vs full GUIDE path |
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
├── CLONE-AND-OWN-REPO-GUIDE.md        ← Clone handouts · commit in your own repo
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

| Lab | Module | Module Title | Pre-lab exercises | Lab Title |
| --- | ------ | ------------ | ----------------- | --------- |
| [lab8](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-08/README.md) | 8 | Java Project Structure and Modularization | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-08/exercises/) | Project Structure and Organization |
| [lab9](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-09/README.md) | 9 | Build and Dependency Management with Maven | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-09/exercises/) | Maven Build and Dependencies |
| [lab10](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-10/README.md) | 10 | GitHub Copilot Fundamentals for Java Developers | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-10/exercises/) | AI-Assisted Code Generation |
| [lab11](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-11/README.md) | 11 | GitHub Copilot for Testing and Refactoring | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-11/exercises/) | AI-Assisted Test Generation |
| [lab12](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-12/README.md) | 12 | Java Coding Standards and Best Practices | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-12/exercises/) | Coding Standards and Refactoring |
| [lab13](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-13/README.md) | 13 | SOAP API Design with Java | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-13/exercises/) | SOAP API Design |
| [lab14](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-14/README.md) | 14 | DTOs, Validation and API Contracts | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-14/exercises/) | DTOs and Validation |
| [lab15](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-15/README.md) | 15 | Business Logic and Service Layer Design | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-15/exercises/) | Service Layer Design |
| [lab16](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-16/README.md) | 16 | Exception Handling in Distributed APIs | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-16/exercises/) | API Exception Handling |
| [lab17](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-17/README.md) | 17 | JUnit Testing Fundamentals | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-17/exercises/) | JUnit Testing with AI Assistance |
| [lab18](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-18/README.md) | 18 | Mockito for Test Isolation | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-18/exercises/) | Mockito and Mocking with AI Assistance |
| [lab19](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-19/README.md) | 19 | Integration Testing and UI Test Automation | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-19/exercises/) | Integration and UI Testing with Selenium |
| [lab20](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-20/README.md) | 20 | Logging Frameworks and Diagnostics | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-20/exercises/) | Structured Logging |
| [lab21](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-21/README.md) | 21 | API Observability and Monitoring | [exercises](Week%202%20-%20Backend,%20AI%20Tools%20and%20Testing/module-21/exercises/) | Observability and Monitoring |

### Week 3 — Spring Framework and Enterprise Patterns

| Lab | Module | Module Title | Pre-lab exercises | Lab Title |
| --- | ------ | ------------ | ----------------- | --------- |
| [lab22](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-22/README.md) | 22 | Spring Core and Inversion of Control (IoC) | [exercises](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-22/exercises/) | Spring IoC and Dependency Injection |
| [lab23](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-23/README.md) | 23 | Spring Boot Auto-Configuration | [exercises](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-23/exercises/) | Spring Boot Setup and Auto-Configuration |
| [lab24](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-24/README.md) | 24 | SOAP Web Services with Spring WS | [exercises](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-24/exercises/) | Spring-WS SOAP Endpoint Development |
| [lab25](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-25/README.md) | 25 | Service and Repository Layers | [exercises](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-25/exercises/) | Service and Repository Layers with AI Assistance |
| [lab26](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-26/README.md) | 26 | Spring Profiles and Configuration | [exercises](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-26/exercises/) | Spring Profiles and Configuration |
| [lab27](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-27/README.md) | 27 | Transaction Management | [exercises](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-27/exercises/) | Transaction Management with AI Assistance |
| [lab28](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-28/README.md) | 28 | Spring Security Fundamentals | [exercises](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-28/exercises/) | Spring Security Basics |
| [lab29](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-29/README.md) | 29 | Validation and Global Exception Handling | [exercises](Week%203%20-%20Spring%20Framework%20and%20Enterprise%20Patterns/module-29/exercises/) | Validation and Exception Handling |

### Week 4 — Kafka, React, PostgreSQL and Resilience

| Lab | Module | Module Title | Pre-lab exercises | Lab Title |
| --- | ------ | ------------ | ----------------- | --------- |
| [lab30](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-30/README.md) | 30 | Event-Driven Architecture with Kafka | [exercises](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-30/exercises/) | Event-Driven Architecture with Kafka |
| [lab31](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-31/README.md) | 31 | Kafka Integration with Spring Boot | [exercises](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-31/exercises/) | Kafka Integration |
| [lab32](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-32/README.md) | 32 | Resilience and Fault Tolerance | [exercises](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-32/exercises/) | Resilience and Fault Tolerance |
| [lab33](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-33/README.md) | 33 | React Component Development | [exercises](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-33/exercises/) | React Component Development |
| [lab34](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-34/README.md) | 34 | State and Event Management | [exercises](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-34/exercises/) | State and Event Management |
| [lab35](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-35/README.md) | 35 | Frontend and API Integration | [exercises](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-35/exercises/) | Frontend and API Integration |
| [lab36](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-36/README.md) | 36 | Frontend Security | [exercises](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-36/exercises/) | Frontend Security |
| [lab37](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-37/README.md) | 37 | PostgreSQL Design | [exercises](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-37/exercises/) | PostgreSQL Design |
| [lab38](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-38/README.md) | 38 | SQL and Query Performance | [exercises](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-38/exercises/) | SQL and Query Performance |
| [lab39](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-39/README.md) | 39 | Spring Data JPA and PostgreSQL | [exercises](Week%204%20-%20Kafka,%20React,%20PostgreSQL%20and%20Resilience/module-39/exercises/) | Spring Data JPA and PostgreSQL |

### Week 5 — DevOps, CI/CD and Kubernetes (k3s)

| Lab | Module | Module Title | Pre-lab exercises | Lab Title |
| --- | ------ | ------------ | ----------------- | --------- |
| [lab40](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-40/README.md) | 40 | Application Security Testing | [exercises](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-40/exercises/) | Application Security Testing |
| [lab41](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-41/README.md) | 41 | Containerization with Docker | [exercises](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-41/exercises/) | Containerization |
| [lab42](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-42/README.md) | 42 | Kubernetes (k3s) Deployment | [exercises](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-42/exercises/) | Kubernetes (k3s) Deployment |
| [lab43](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-43/README.md) | 43 | GitHub Actions and CI/CD Integration | [exercises](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-43/exercises/) | GitHub CI/CD Pipeline |
| [lab44](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-44/README.md) | 44 | Continuous Delivery and Release Management | [exercises](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-44/exercises/) | Continuous Delivery Pipeline |
| [lab45](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-45/README.md) | 45 | Infrastructure as Code with Terraform and Ansible | [exercises](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-45/exercises/) | Infrastructure as Code with AI Assistance |
| [lab46](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-46/README.md) | 46 | Kafka Resilience and Observability | [exercises](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-46/exercises/) | Kafka Resilience and Observability |
| [lab47](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-47/README.md) | 47 | Professional Communication and Collaboration | [exercises](Week%205%20-%20DevOps,%20CI-CD%20and%20OpenShift/module-47/exercises/) | Professional Communication and Collaboration |

### Week 6 — Capstone Project

**Master document:** [Week 6 Capstone index](Week%206%20-%20Capstone%20Project/WEEK-LABS-INDEX.md) · [Brief DOCX](../Java_Software_Engineer_Capstone.docx) · [Rubric DOCX](../Java_Software_Engineer_Capstone_Rubric.docx) · [Markdown brief](Week%206%20-%20Capstone%20Project/CAPSTONE-BRIEF-AND-RUBRIC.md)

| Lab | Module | Module Title | Pre-lab exercises | Lab Title |
| --- | ------ | ------------ | ----------------- | --------- |
| [lab48](Week%206%20-%20Capstone%20Project/module-48/README.md) | 48 | Capstone Planning and Architecture | [exercises](Week%206%20-%20Capstone%20Project/module-48/exercises/) | Capstone Planning and Architecture |
| [lab49](Week%206%20-%20Capstone%20Project/module-49/README.md) | 49 | Capstone Backend and Messaging | [exercises](Week%206%20-%20Capstone%20Project/module-49/exercises/) | Capstone Backend and Messaging |
| [lab50](Week%206%20-%20Capstone%20Project/module-50/README.md) | 50 | Capstone Frontend and Persistence | [exercises](Week%206%20-%20Capstone%20Project/module-50/exercises/) | Capstone Frontend and Persistence |
| [lab51](Week%206%20-%20Capstone%20Project/module-51/README.md) | 51 | Capstone Security, CI/CD and Deployment | [exercises](Week%206%20-%20Capstone%20Project/module-51/exercises/) | Capstone Delivery and Deployment |
| [lab52](Week%206%20-%20Capstone%20Project/module-52/README.md) | 52 | Capstone Final Defense and Retrospective | [exercises](Week%206%20-%20Capstone%20Project/module-52/exercises/) | Capstone Final Defense |
