# Module 32 — Pre-Lab Exercises

> **Start here for Module 32:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 32 — Resilience and Fault Tolerance  
**Next:** [`../lab32/LAB-32-WINDOWS.md`](../lab32/LAB-32-WINDOWS.md) or [`../lab32/LAB-32-MACOS.md`](../lab32/LAB-32-MACOS.md) → [`../lab32/LAB-32-GUIDE.md`](../lab32/LAB-32-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 32.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-32-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 32 is the graded consolidation. Do **not** finish Lab 32 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab32-resilience.md` | Why Resilience |
| 2 | `notes/lab32-circuit-states.md` | Circuit States |
| 3 | `notes/lab32-fallback-contract.md` | Fallback Contract |
| 4 | `notes/lab32-pattern-map.md` | Pattern Map |
| 5 | `notes/lab32-todos.md` | Fill Resilience TODOs |
| 6 | `notes/lab32-prep-checklist.md` | Lab 32 Readiness |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Name Resilience4j patterns: retry, circuit breaker, timeout, fallback | Do not run the Account Profile mock or Spring Boot yet |
| Map each pattern to a Northstar outbound Account Profile call | Do not tune production cluster-wide circuit thresholds |
| Sketch failure states (closed/open/half-open) on paper | Do not replace Kafka with resilience patterns |
| Define fallback behavior when the dependency is down | Do not build React error toasts yet (later modules) |
| List metrics/log fields you will watch in the lab | Do not change database transaction isolation here |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-32-exercises` | `~/java-bootcamp/examples/module-32-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-32-exercises\notes | Out-Null
cd examples\module-32-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-32-exercises/notes
cd examples/module-32-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 32 uses its own `examples/lab32-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Why Resilience | Analysis exercise | `notes/lab32-resilience.md` | [`exercise-01-why-resilience.md`](exercise-01-why-resilience.md) |
| 2 | Circuit States | Documentation exercise | `notes/lab32-circuit-states.md` | [`exercise-02-circuit-states.md`](exercise-02-circuit-states.md) |
| 3 | Fallback Contract | Documentation exercise | `notes/lab32-fallback-contract.md` | [`exercise-03-fallback-contract.md`](exercise-03-fallback-contract.md) |
| 4 | Pattern Map | Architecture exercise | `notes/lab32-pattern-map.md` | [`exercise-04-pattern-map.md`](exercise-04-pattern-map.md) |
| 5 | Fill Resilience TODOs | Hands-on exercise | `notes/lab32-todos.md` | [`exercise-05-fill-resilience-todos.md`](exercise-05-fill-resilience-todos.md) |
| 6 | Lab 32 Readiness | Analysis exercise | `notes/lab32-prep-checklist.md` | [`exercise-06-lab32-readiness.md`](exercise-06-lab32-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 32 OS guide.
