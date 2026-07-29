# Module 44 — Pre-Lab Exercises

> **Start here for Module 44:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 44 — Continuous Delivery and Release Management  
**Next:** [`../lab44/LAB-44-WINDOWS.md`](../lab44/LAB-44-WINDOWS.md) or [`../lab44/LAB-44-MACOS.md`](../lab44/LAB-44-MACOS.md) → [`../lab44/LAB-44-GUIDE.md`](../lab44/LAB-44-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 44.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-44-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 44 is the graded consolidation. Do **not** finish Lab 44 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab44-cd-vs-cdeploy.md` | Delivery vs Deployment |
| 2 | `notes/lab44-manifest-fields.md` | Sketch Artifact Manifest |
| 3 | `notes/lab44-promotion-gates.md` | Define Promotion Gates |
| 4 | `notes/lab44-checklist-todos.md` | Fill Release Checklist TODOs |
| 5 | `notes/lab44-rollback-runbook.md` | Outline Rollback Runbook |
| 6 | `notes/lab44-staging-smoke-plan.md` | Plan Staging Smoke |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Distinguish continuous delivery vs continuous deployment | Do not perform a real production promotion as this pre-lab |
| Plan digest-based promotion test → staging → prod | Do not rebuild artifacts on the deploy host |
| Draft release gates, checklist, and rollback runbook headings | Do not put environment secrets into the immutable artifact |
| Sketch `artifact-manifest.json` fields for CRM releases | Do not author Terraform/Ansible apply plans here (Lab 45) |
| Prepare staging smoke using synthetic fixtures only | Do not configure Kafka DLT replay procedures here (Lab 46) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-44-exercises` | `~/java-bootcamp/examples/module-44-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-44-exercises\notes | Out-Null
cd examples\module-44-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-44-exercises/notes
cd examples/module-44-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 44 uses its own `examples/lab44-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Delivery vs Deployment | Analysis exercise | `notes/lab44-cd-vs-cdeploy.md` | [`exercise-01-cd-vs-cdeploy.md`](exercise-01-cd-vs-cdeploy.md) |
| 2 | Sketch Artifact Manifest | Documentation exercise | `notes/lab44-manifest-fields.md` | [`exercise-02-manifest-fields.md`](exercise-02-manifest-fields.md) |
| 3 | Define Promotion Gates | Architecture exercise | `notes/lab44-promotion-gates.md` | [`exercise-03-promotion-gates.md`](exercise-03-promotion-gates.md) |
| 4 | Fill Release Checklist TODOs | Hands-on exercise | `notes/lab44-checklist-todos.md` | [`exercise-04-checklist-todos.md`](exercise-04-checklist-todos.md) |
| 5 | Outline Rollback Runbook | Documentation exercise | `notes/lab44-rollback-runbook.md` | [`exercise-05-rollback-runbook.md`](exercise-05-rollback-runbook.md) |
| 6 | Plan Staging Smoke | Analysis exercise | `notes/lab44-staging-smoke-plan.md` | [`exercise-06-staging-smoke-plan.md`](exercise-06-staging-smoke-plan.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 44 OS guide.
