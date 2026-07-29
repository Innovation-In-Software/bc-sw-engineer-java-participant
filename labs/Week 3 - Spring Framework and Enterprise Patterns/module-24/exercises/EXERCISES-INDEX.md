# Module 24 — Pre-Lab Exercises

> **Start here for Module 24:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 24 — SOAP Web Services with Spring WS  
**Next:** [`../lab24/LAB-24-WINDOWS.md`](../lab24/LAB-24-WINDOWS.md) or [`../lab24/LAB-24-MACOS.md`](../lab24/LAB-24-MACOS.md) → [`../lab24/LAB-24-GUIDE.md`](../lab24/LAB-24-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 24.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-24-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 24 is the graded consolidation. Do **not** finish Lab 24 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/contract-first.md` | Contract-First Recall |
| 2 | `notes/soap-ops.md` | SOAP Operation Map |
| 3 | `notes/lab24-payloadroot-skeleton.md` | PayloadRoot Skeleton (TODOs) |
| 4 | `notes/fault-vs-rest.md` | SOAP Fault Versus REST Error |
| 5 | `notes/usernametoken-plan.md` | UsernameToken Plan |
| 6 | `notes/lab24-readiness.md` | Lab 24 Readiness Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Recall contract-first XSD → WSDL flow from Lab 13 | Replace REST with SOAP (keep both sharing CustomerService) |
| Map four SOAP operations to CustomerService methods | Full Spring Security JWT filter chain (Lab 28) |
| Plan JAXB request/response types and a mapper | Kafka event publishing (Week 4) |
| Distinguish SOAP faults from REST error JSON | React UI for SOAP (N/A) |
| Sketch UsernameToken as message-level lab security | Production IdP / OAuth for SOAP partners |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-24-exercises` | `~/java-bootcamp/examples/module-24-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-24-exercises\notes | Out-Null
cd examples\module-24-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-24-exercises/notes
cd examples/module-24-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 24 uses its own `examples/lab24-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Contract-First Recall | Analysis exercise | `notes/contract-first.md` | [`exercise-01-contract-first-recall.md`](exercise-01-contract-first-recall.md) |
| 2 | SOAP Operation Map | Architecture exercise | `notes/soap-ops.md` | [`exercise-02-operation-map.md`](exercise-02-operation-map.md) |
| 3 | PayloadRoot Skeleton (TODOs) | Hands-on exercise | `notes/lab24-payloadroot-skeleton.md` | [`exercise-03-payloadroot-skeleton.md`](exercise-03-payloadroot-skeleton.md) |
| 4 | SOAP Fault Versus REST Error | Documentation exercise | `notes/fault-vs-rest.md` | [`exercise-04-fault-vs-rest.md`](exercise-04-fault-vs-rest.md) |
| 5 | UsernameToken Plan | Analysis exercise | `notes/usernametoken-plan.md` | [`exercise-05-usernametoken-plan.md`](exercise-05-usernametoken-plan.md) |
| 6 | Lab 24 Readiness Checklist | Documentation exercise | `notes/lab24-readiness.md` | [`exercise-06-lab24-readiness.md`](exercise-06-lab24-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 24 OS guide.
