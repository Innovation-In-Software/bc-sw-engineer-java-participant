# Module 24 — Pre-Lab Exercises

> **Start here for Module 24:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 24 — SOAP Web Services with Spring WS  
**Next:** [`../lab24/LAB-24-WINDOWS.md`](../lab24/LAB-24-WINDOWS.md) or [`../lab24/LAB-24-MACOS.md`](../lab24/LAB-24-MACOS.md) → [`../lab24/LAB-24-GUIDE.md`](../lab24/LAB-24-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Order **1 → 2 → 3 → 4 → 5 → 6**.  
> Use JDK 21. Work under `examples/module-24-exercises/` — **notes files**, not the graded lab.  
> Lab 24 is the graded consolidation. Do **not** finish Lab 24 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/contract-first.md` | Contract-First Recall | A |
| 2 | `notes/soap-ops.md` | SOAP Operation Map | B |
| 3 | `notes/lab24-payloadroot-skeleton.md` | PayloadRoot Skeleton (TODOs) | B |
| 4 | `notes/fault-vs-rest.md` | SOAP Fault Versus REST Error | C |
| 5 | `notes/usernametoken-plan.md` | UsernameToken Plan | D |
| 6 | `notes/lab24-readiness.md` | Lab 24 Readiness Checklist | D |

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

**Expected:** Java 21 is available. You create markdown notes here; Lab 24 uses `examples/lab24-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 66–74 (A) | Contract-First Recall | `notes/contract-first.md` | [`exercise-01-contract-first-recall.md`](exercise-01-contract-first-recall.md) |
| 2 | 75–78 (B) | SOAP Operation Map | `notes/soap-ops.md` | [`exercise-02-operation-map.md`](exercise-02-operation-map.md) |
| 3 | 75–78 (B) | PayloadRoot Skeleton (TODOs) | `notes/lab24-payloadroot-skeleton.md` | [`exercise-03-payloadroot-skeleton.md`](exercise-03-payloadroot-skeleton.md) |
| 4 | 79–82 (C) | SOAP Fault Versus REST Error | `notes/fault-vs-rest.md` | [`exercise-04-fault-vs-rest.md`](exercise-04-fault-vs-rest.md) |
| 5 | 83–86 (D) | UsernameToken Plan | `notes/usernametoken-plan.md` | [`exercise-05-usernametoken-plan.md`](exercise-05-usernametoken-plan.md) |
| 6 | 83–86 (D) | Lab 24 Readiness Checklist | `notes/lab24-readiness.md` | [`exercise-06-lab24-readiness.md`](exercise-06-lab24-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 24 OS guide.
