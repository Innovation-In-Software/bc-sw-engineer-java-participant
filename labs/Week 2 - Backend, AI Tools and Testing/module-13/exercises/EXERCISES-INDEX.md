# Module 13 — Pre-Lab Exercises

> **Start here for Module 13:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 13 — SOAP API Design with Java  
**Next:** [`../lab13/LAB-13-WINDOWS.md`](../lab13/LAB-13-WINDOWS.md) or [`../lab13/LAB-13-MACOS.md`](../lab13/LAB-13-MACOS.md) → [`../lab13/LAB-13-GUIDE.md`](../lab13/LAB-13-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 13.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-13-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 13 is the graded consolidation. Do **not** finish Lab 13 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab13-fault-todos.md` | Fill Fault Envelope TODOs |
| 2 | `notes/lab13-operation-matrix.md` | Operation Matrix |
| 3 | `notes/lab13-java-xsd-map.md` | Java to XSD Map |
| 4 | `notes/lab13-contract-first.md` | Contract-First Mindset |
| 5 | `notes/lab13-placeholder-honesty.md` | Placeholder Endpoint Honesty |
| 6 | `notes/lab13-prep-checklist.md` | Lab 13 Prep Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Practice contract-first thinking for Customer SOAP operations | Do not complete the full Lab 13 implementation in this pre-lab |
| Map Java fields to XSD types for Amina/Ravi payloads | Do not host with Spring-WS / Spring Boot yet (Lab 24) |
| Build an operation matrix (in/out/fault) | Do not invent live WSDL deployment on a server |
| Draft fault envelope TODOs for CUS-9999 not found | Do not deepen DTO validation frameworks (Lab 14) |
| State placeholder endpoint honesty before Spring-WS hosting | Do not skip documenting placeholder endpoint limits |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-13-exercises` | `~/java-bootcamp/examples/module-13-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-13-exercises\notes | Out-Null
cd examples\module-13-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-13-exercises/notes
cd examples/module-13-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 13 uses its own `examples/lab13-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Fill Fault Envelope TODOs | Hands-on exercise | `notes/lab13-fault-todos.md` | [`exercise-01-fill-fault-envelope-todos.md`](exercise-01-fill-fault-envelope-todos.md) |
| 2 | Operation Matrix | Architecture exercise | `notes/lab13-operation-matrix.md` | [`exercise-02-operation-matrix.md`](exercise-02-operation-matrix.md) |
| 3 | Java to XSD Map | Documentation exercise | `notes/lab13-java-xsd-map.md` | [`exercise-03-java-xsd-map.md`](exercise-03-java-xsd-map.md) |
| 4 | Contract-First Mindset | Analysis exercise | `notes/lab13-contract-first.md` | [`exercise-04-contract-first.md`](exercise-04-contract-first.md) |
| 5 | Placeholder Endpoint Honesty | Documentation exercise | `notes/lab13-placeholder-honesty.md` | [`exercise-05-placeholder-endpoint-honesty.md`](exercise-05-placeholder-endpoint-honesty.md) |
| 6 | Lab 13 Prep Checklist | Documentation exercise | `notes/lab13-prep-checklist.md` | [`exercise-06-lab13-prep-checklist.md`](exercise-06-lab13-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 13 OS guide.
