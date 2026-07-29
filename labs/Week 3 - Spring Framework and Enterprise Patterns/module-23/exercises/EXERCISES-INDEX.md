# Module 23 — Pre-Lab Exercises

> **Start here for Module 23:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 23 — Spring Boot Auto-Configuration  
**Next:** [`../lab23/LAB-23-WINDOWS.md`](../lab23/LAB-23-WINDOWS.md) or [`../lab23/LAB-23-MACOS.md`](../lab23/LAB-23-MACOS.md) → [`../lab23/LAB-23-GUIDE.md`](../lab23/LAB-23-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 23.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-23-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 23 is the graded consolidation. Do **not** finish Lab 23 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/autoconfig-ownership.md` | Auto-Config Versus Ownership |
| 2 | `notes/starters.md` | Boot Starters Inventory |
| 3 | `notes/health-sketch.md` | CrmApplication Stub (TODOs) |
| 4 | `notes/lab23-application-yml-sketch.md` | application.yml Sketch |
| 5 | `notes/rest-smoke-plan.md` | REST Smoke Plan |
| 6 | `notes/lab23-readiness.md` | Lab 23 Readiness Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Identify Spring Boot starters (`web`, `actuator`, `test`) | Contract-first Spring-WS SOAP (Lab 24) |
| Sketch `CrmApplication` + `application.yml` basics | Deep profile/secret externalization (Lab 26) |
| Plan REST `/api/customers` smoke for CUS-1001 / CUS-1002 | `@Transactional` transfers (Lab 27) |
| Explain Actuator `/actuator/health` as a smoke check | JWT SecurityFilterChain (Lab 28) |
| Separate auto-config gifts from ownership (domain rules) | Kafka / React / PostgreSQL (Week 4) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-23-exercises` | `~/java-bootcamp/examples/module-23-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-23-exercises\notes | Out-Null
cd examples\module-23-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-23-exercises/notes
cd examples/module-23-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 23 uses its own `examples/lab23-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Auto-Config Versus Ownership | Documentation exercise | `notes/autoconfig-ownership.md` | [`exercise-01-autoconfig-vs-ownership.md`](exercise-01-autoconfig-vs-ownership.md) |
| 2 | Boot Starters Inventory | Analysis exercise | `notes/starters.md` | [`exercise-02-starters-inventory.md`](exercise-02-starters-inventory.md) |
| 3 | CrmApplication Stub (TODOs) | Hands-on exercise | `notes/health-sketch.md` | [`exercise-03-crm-application-stub.md`](exercise-03-crm-application-stub.md) |
| 4 | application.yml Sketch | Architecture exercise | `notes/lab23-application-yml-sketch.md` | [`exercise-04-application-yml-sketch.md`](exercise-04-application-yml-sketch.md) |
| 5 | REST Smoke Plan | Analysis exercise | `notes/rest-smoke-plan.md` | [`exercise-05-rest-smoke-plan.md`](exercise-05-rest-smoke-plan.md) |
| 6 | Lab 23 Readiness Checklist | Documentation exercise | `notes/lab23-readiness.md` | [`exercise-06-lab23-readiness.md`](exercise-06-lab23-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 23 OS guide.
