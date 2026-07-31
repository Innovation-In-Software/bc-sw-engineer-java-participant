# Module 4 — Acronym Cheatsheet

**Topic:** Memory Management and Performance  
**Use when:** reviewing slides, pre-lab exercises, or the module lab. Quick meanings in plain language; full forms match how this module’s deck uses each term.

_Derived from **17** curriculum slide diagram title(s) plus slide text for this module._

---

## Java & JVM

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **G1 GC** | Garbage-First Garbage Collector | Default modern JVM collector that balances pause time and throughput. |
| **GC** | Garbage Collection | Automatic memory cleanup of unused objects. |
| **Heap** | — | JVM memory area for objects. |
| **JIT** | Just-In-Time (compiler) | Turns hot bytecode into native machine code at runtime. |
| **JVM** | Java Virtual Machine | Runs Java bytecode on your machine; makes Java portable. |
| **Metaspace** | — | JVM area for class metadata (replaces PermGen). |
| **Stack** | — | Per-thread memory for method frames and local primitives. |
| **try-with-resources** | — | Auto-closes resources (files, connections) in a try block. |
| **ZGC** | Z Garbage Collector | Low-pause GC for large heaps. |

---

## Logging & observability

| Term | Full form | Simple meaning |
| --- | --- | --- |
| **Latency** | — | How long one request/message takes end-to-end. |
| **Throughput** | — | How much work/messages processed per unit time. |

---

## One-line memory aid

> Focus first on: **JVM** · **GC** · **G1 GC** · **ZGC** · **Heap**.

---

**Related:** [Module 4 start](README.md) · [Technology Stack Guide](../../TECHNOLOGY-STACK-GUIDE.md#acronyms-and-full-forms) · [Cheatsheet index](../../ACRONYM-CHEATSHEETS-INDEX.md)
