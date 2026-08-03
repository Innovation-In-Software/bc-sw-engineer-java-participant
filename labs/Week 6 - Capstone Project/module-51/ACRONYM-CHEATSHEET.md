# Module 51 — Acronym Cheatsheet

**Topic:** Capstone Security, CI/CD and Deployment  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Capstone / text module: terms taken from slide text and the module topic (few or no slide diagram PNGs)._

---

## Security testing

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **CORS** | Cross-Origin Resource Sharing | Browser-origin protection reviewed alongside CSRF and actuator exposure as part of application hardening. |
| **CSRF** | Cross-Site Request Forgery | Attack class covered in the "CORS/CSRF/actuator protection" hardening theory block. |
| **CVE** | Common Vulnerabilities and Exposures | Identifier for a known-vulnerable dependency; the dependency scan checks resolved libraries against CVE databases. |
| **DAST** | Dynamic Application Security Testing | Find security issues by attacking a running app. |
| **OWASP** | Open Worldwide Application Security Project | Community standards and top risks for app security. |
| **RBAC** | Role-Based Access Control | AGENT/MANAGER authorization model; negative tests prove anonymous → 401, wrong role → 403, correct role → 200. |
| **SAST** | Static Application Security Testing | Find security issues by scanning source/binaries without running the app. |
| **SQL** | Structured Query Language | SAST specifically catches SQL-injection-prone patterns in source. |

---

## DevOps & delivery

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Bitbucket Pipelines** | — | CI/CD on Bitbucket (compared in the course). |
| **CD** | Continuous Delivery / Deployment | Automatically prepare or ship releases. |
| **CI** | Continuous Integration | Automatically build/test on every change. |
| **CI/CD** | Continuous Integration and Continuous Delivery | Automated build, test, and release pipeline. |
| **GitHub Actions** | — | CI/CD workflows that run on GitHub events. |
| **IaC** | Infrastructure as Code | Declarative, reviewable Terraform/Ansible definitions instead of undocumented manual cluster changes. |
| **JPA** | Java Persistence API | The `verify` pipeline stage reruns Module 49's unit/MockMvc/JPA/Kafka test suite as a hard gate. |
| **Pipeline** | — | Automated sequence: build → test → package → deploy. |
| **PR** | Pull Request | Infrastructure-as-code changes go through the same PR review discipline as application code. |
| **SHA** | Secure Hash Algorithm (git commit SHA) | The commit hash baked into the immutable image tag (`crm-api:<version>-<gitsha>`) and the release-identity record. |

---

## Containers & Kubernetes

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Deployment** | — | K8s object that manages replica Pods and rolling updates. |
| **Docker** | — | Tool to package apps as portable container images. |
| **GHCR** | GitHub Container Registry | GitHub-hosted place to store container images. |
| **JDK** | Java Development Kit | Full build toolchain (compiler + JRE); used in the build stage but stripped from the slim runtime image. |
| **JRE** | Java Runtime Environment | Minimal runtime-only base preferred for the final container stage instead of a full JDK. |
| **k3s** | — | Lightweight Kubernetes distribution used in this course. |
| **Kubernetes** | — | Container orchestration platform (often abbreviated K8s). |
| **OS** | Operating System | Image scans inspect OS packages and layers baked into the built container. |

---

## Security

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JWT** | JSON Web Token | Compact signed token used for auth between systems; hardened here to deny-by-default. |
| **SSH** | Secure Shell | Manual remote-login access explicitly discouraged for fixing config drift — re-run the playbook instead. |
| **WAF** | Web Application Firewall | Example compensating control named in a time-bounded security exception record. |
| **YAML** | YAML Ain't Markup Language | Format for GitHub Actions workflow files and Kubernetes manifests; secrets must never be typed directly into it. |

---

## Process

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Capstone** | — | Final multi-module project integrating the full stack. |

---

## One-line memory aid

> Focus first on: **SAST** · **DAST** · **CVE** · **CI/CD** · **Docker** · **k3s** · **SHA/digest**.

---

**Related:** [Module 51 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
