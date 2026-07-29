# Module 51 — Pre-Lab Exercises

> **Start here for Module 51:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 51 — Capstone Security, CI/CD and Deployment  
**Next:** [`../lab51/LAB-51-WINDOWS.md`](../lab51/LAB-51-WINDOWS.md) or [`../lab51/LAB-51-MACOS.md`](../lab51/LAB-51-MACOS.md) → [`../lab51/LAB-51-GUIDE.md`](../lab51/LAB-51-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 51.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-51-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 51 is the graded consolidation. Do **not** finish Lab 51 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab51-threat-checklist.md` | Capstone Threat Checklist |
| 2 | `notes/lab51-rbac-negative-plan.md` | Plan RBAC Negative Tests |
| 3 | `notes/lab51-pipeline-gates.md` | Outline Delivery Gates |
| 4 | `notes/lab51-deploy-evidence-todos.md` | Fill Deploy Evidence TODOs |
| 5 | `notes/lab51-rollback-smoke.md` | Rollback and Smoke Mini-Runbook |
| 6 | `notes/lab51-prep-checklist.md` | Release Readiness Scorecard |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Threat-model capstone endpoints at a checklist level | Do not disable security tests to force a green pipeline |
| Plan JWT/RBAC negative tests and deny-by-default notes | Do not commit kubeconfig, registry passwords, or `.env` |
| Outline GitHub Actions gates including SAST | Do not deploy with `:latest` as the only identity |
| Sketch immutable image + k3s deploy evidence list | Do not treat this warmup as completing Lab 51 release |
| Prepare smoke and rollback proof checklist | Do not skip residual risk owners on accepted findings |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-51-exercises` | `~/java-bootcamp/examples/module-51-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-51-exercises\notes | Out-Null
cd examples\module-51-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-51-exercises/notes
cd examples/module-51-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 51 uses its own `examples/lab51-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Capstone Threat Checklist | Analysis exercise | `notes/lab51-threat-checklist.md` | [`exercise-01-threat-checklist.md`](exercise-01-threat-checklist.md) |
| 2 | Plan RBAC Negative Tests | Documentation exercise | `notes/lab51-rbac-negative-plan.md` | [`exercise-02-rbac-negative-plan.md`](exercise-02-rbac-negative-plan.md) |
| 3 | Outline Delivery Gates | Architecture exercise | `notes/lab51-pipeline-gates.md` | [`exercise-03-pipeline-gates.md`](exercise-03-pipeline-gates.md) |
| 4 | Fill Deploy Evidence TODOs | Hands-on exercise | `notes/lab51-deploy-evidence-todos.md` | [`exercise-04-deploy-evidence-todos.md`](exercise-04-deploy-evidence-todos.md) |
| 5 | Rollback and Smoke Mini-Runbook | Documentation exercise | `notes/lab51-rollback-smoke.md` | [`exercise-05-rollback-smoke.md`](exercise-05-rollback-smoke.md) |
| 6 | Release Readiness Scorecard | Analysis exercise | `notes/lab51-prep-checklist.md` | [`exercise-06-release-readiness.md`](exercise-06-release-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 51 OS guide.
