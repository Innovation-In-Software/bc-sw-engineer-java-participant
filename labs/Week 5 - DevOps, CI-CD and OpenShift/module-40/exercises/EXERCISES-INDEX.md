# Module 40 — Pre-Lab Exercises

> **Start here for Module 40:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 40 — Application Security Testing  
**Next:** [`../lab40/LAB-40-WINDOWS.md`](../lab40/LAB-40-WINDOWS.md) or [`../lab40/LAB-40-MACOS.md`](../lab40/LAB-40-MACOS.md) → [`../lab40/LAB-40-GUIDE.md`](../lab40/LAB-40-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 40.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-40-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 40 is the graded consolidation. Do **not** finish Lab 40 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab40-owasp-surface-map.md` | Map CRM Attack Surfaces |
| 2 | `notes/lab40-dependency-check-plan.md` | Plan Dependency-Check Gate |
| 3 | `notes/lab40-triage-csv-sketch.md` | Sketch Findings Triage CSV |
| 4 | `notes/lab40-sast-todo-notes.md` | Fill SAST Path TODOs |
| 5 | `notes/lab40-assessment-outline.md` | Outline Security Assessment |
| 6 | `notes/lab40-gate-go-nogo.md` | Draft AppSec Go/No-Go Questions |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Map CRM attack surfaces to OWASP-aligned risks | Do not finish the full Lab 40 remediation and re-scan gate |
| Plan OWASP Dependency-Check Maven profile and triage CSV | Do not suppress CVEs without policy justification |
| Sketch focused manual SAST on request-to-sink paths | Do not build or push Docker images (Lab 41) |
| Draft residual-risk language with owner and expiry | Do not write k3s manifests or Ingress (Lab 42) |
| Prepare evidence folders under notes/screenshots/lab-40/ | Do not add GitHub Actions workflow files (Lab 43) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-40-exercises` | `~/java-bootcamp/examples/module-40-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-40-exercises\notes | Out-Null
cd examples\module-40-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-40-exercises/notes
cd examples/module-40-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 40 uses its own `examples/lab40-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Map CRM Attack Surfaces | Analysis exercise | `notes/lab40-owasp-surface-map.md` | [`exercise-01-owasp-surface-map.md`](exercise-01-owasp-surface-map.md) |
| 2 | Plan Dependency-Check Gate | Documentation exercise | `notes/lab40-dependency-check-plan.md` | [`exercise-02-dependency-check-plan.md`](exercise-02-dependency-check-plan.md) |
| 3 | Sketch Findings Triage CSV | Analysis exercise | `notes/lab40-triage-csv-sketch.md` | [`exercise-03-triage-csv-sketch.md`](exercise-03-triage-csv-sketch.md) |
| 4 | Fill SAST Path TODOs | Hands-on exercise | `notes/lab40-sast-todo-notes.md` | [`exercise-04-sast-todo-notes.md`](exercise-04-sast-todo-notes.md) |
| 5 | Outline Security Assessment | Documentation exercise | `notes/lab40-assessment-outline.md` | [`exercise-05-assessment-outline.md`](exercise-05-assessment-outline.md) |
| 6 | Draft AppSec Go/No-Go Questions | Architecture exercise | `notes/lab40-gate-go-nogo.md` | [`exercise-06-gate-go-nogo.md`](exercise-06-gate-go-nogo.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 40 OS guide.
