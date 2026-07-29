# Module 21 — Pre-Lab Exercises

> **Start here for Module 21:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 21 — API Observability and Monitoring  
**Next:** [`../lab21/LAB-21-WINDOWS.md`](../lab21/LAB-21-WINDOWS.md) or [`../lab21/LAB-21-MACOS.md`](../lab21/LAB-21-MACOS.md) → [`../lab21/LAB-21-GUIDE.md`](../lab21/LAB-21-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 21.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-21-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 21 is the graded consolidation. Do **not** finish Lab 21 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab21-cardinality-antipatterns.md` | Cardinality Anti-Patterns |
| 2 | `notes/lab21-actuator-allowlist.md` | Actuator Allow-List |
| 3 | `notes/lab21-prep-checklist.md` | Liveness vs Readiness |
| 4 | `notes/lab21-metric-sketch-todos.md` | Fill Metric Sketch TODOs |
| 5 | `notes/lab21-alert-runbook.md` | Alert from create_failure_total |
| 6 | `notes/lab21-prep-checklist.md` | Lab 21 Prep Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Contrast liveness vs readiness for CRM services | Do not complete the full Lab 21 dashboards in this pre-lab |
| Spot high-cardinality anti-patterns in metric labels | Do not expose every Actuator endpoint publicly |
| Sketch metric TODOs including create_failure_total | Do not label metrics with raw customerId high cardinality |
| Draft an Actuator endpoint allow-list | Do not confuse logs-only debugging with SLOs |
| Plan an alert from create_failure_total threshold | Do not skip documenting alert action owners |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-21-exercises` | `~/java-bootcamp/examples/module-21-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-21-exercises\notes | Out-Null
cd examples\module-21-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-21-exercises/notes
cd examples/module-21-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 21 uses its own `examples/lab21-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Cardinality Anti-Patterns | Analysis exercise | `notes/lab21-cardinality-antipatterns.md` | [`exercise-01-cardinality-antipatterns.md`](exercise-01-cardinality-antipatterns.md) |
| 2 | Actuator Allow-List | Documentation exercise | `notes/lab21-actuator-allowlist.md` | [`exercise-02-actuator-allowlist.md`](exercise-02-actuator-allowlist.md) |
| 3 | Liveness vs Readiness | Analysis exercise | `notes/lab21-prep-checklist.md` | [`exercise-03-liveness-vs-readiness.md`](exercise-03-liveness-vs-readiness.md) |
| 4 | Fill Metric Sketch TODOs | Hands-on exercise | `notes/lab21-metric-sketch-todos.md` | [`exercise-04-fill-metric-sketch-todos.md`](exercise-04-fill-metric-sketch-todos.md) |
| 5 | Alert from create_failure_total | Documentation exercise | `notes/lab21-alert-runbook.md` | [`exercise-05-alert-from-failure-total.md`](exercise-05-alert-from-failure-total.md) |
| 6 | Lab 21 Prep Checklist | Documentation exercise | `notes/lab21-prep-checklist.md` | [`exercise-06-lab21-prep-checklist.md`](exercise-06-lab21-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 21 OS guide.
