# Module 1 — Acronym Cheatsheet

**Topic:** JVM Architecture and Runtime Model  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **52** curriculum slide diagram title(s) plus slide text for this module._

---

## Java & JVM

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Bytecode** | — | Platform-neutral instructions the JVM executes. |
| **Class Loader** | — | Loads class files into the JVM. |
| **GC** | Garbage Collection | Automatic memory cleanup of unused objects. |
| **Heap** | — | JVM memory area for objects. |
| **JDK** | Java Development Kit | Tools to write and compile Java (javac, jars, docs). |
| **JIT** | Just-In-Time (compiler) | Turns hot bytecode into native machine code at runtime. |
| **JNI** | Java Native Interface | Lets Java call native (C/C++) libraries. |
| **JRE** | Java Runtime Environment | What you need to run Java programs (no full compiler toolchain). |
| **JVM** | Java Virtual Machine | Runs Java bytecode on your machine; makes Java portable. |
| **Metaspace** | — | JVM area for class metadata (replaces PermGen). |
| **Stack** | — | Per-thread memory for method frames and local primitives. |
| **WORA** | Write Once, Run Anywhere | Compile once to bytecode; run on any JVM. |
| **ZGC** | Z Garbage Collector | Low-pause GC for large heaps. |

---

## Core concepts

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **API** | Application Programming Interface | A defined way for one program to call another. |
| **OOP** | Object-Oriented Programming | Design with objects that hold data and behavior. |

---

## Tooling

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **IDE** | Integrated Development Environment | Your coding app (IntelliJ IDEA, VS Code). |

---

## Resilience

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **HA** | High Availability | Design so the system stays up despite failures. |

---

## Logging & observability

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **SLA** | Service Level Agreement | Contracted reliability promise to customers. |

---

## Persistence

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JPA** | Java Persistence API | Standard API for mapping Java objects to relational tables. |

---

## Kafka & events

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **JMS** | Java Message Service | Java API for async messaging (queues/topics). |

---

## One-line memory aid

> Focus first on: **JDK** · **JRE** · **JVM** · **WORA** · **JNI**.

---

**Related:** [Module 1 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
