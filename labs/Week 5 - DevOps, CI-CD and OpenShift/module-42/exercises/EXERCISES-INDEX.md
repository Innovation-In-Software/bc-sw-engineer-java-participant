# Module 42 — Pre-Lab Exercises

> **Start here for Module 42:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 42 — Kubernetes (k3s) Deployment  
**Next:** [`../lab42/LAB-42-WINDOWS.md`](../lab42/LAB-42-WINDOWS.md) or [`../lab42/LAB-42-MACOS.md`](../lab42/LAB-42-MACOS.md) → [`../lab42/LAB-42-GUIDE.md`](../lab42/LAB-42-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 42.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-42-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 42 is the graded consolidation. Do **not** finish Lab 42 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab42-manifest-map.md` | Map k3s Manifests |
| 2 | `notes/lab42-config-vs-secret.md` | ConfigMap vs Secret Split |
| 3 | `notes/lab42-probe-design.md` | Design Three Probes |
| 4 | `notes/lab42-yaml-todos.md` | Fill Deployment YAML TODOs |
| 5 | `notes/lab42-rollout-rollback.md` | Rollout and Rollback Checklist |
| 6 | `notes/lab42-runbook-outline.md` | Outline Deployment Runbook |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Sketch Deployment, Service, ConfigMap, Ingress for CRM | Do not apply manifests to the shared k3s cluster as the finished lab |
| Separate ConfigMap vs Secret responsibilities | Do not commit kubeconfig, tokens, or Secret values |
| Plan startup, readiness, and liveness probes | Do not invent OpenShift Routes if the cohort uses Traefik Ingress |
| Outline rollout and rollback rehearsal steps | Do not create GitHub Actions deploy workflows (Labs 43–44) |
| Prepare deployment-runbook headings and evidence paths | Do not author Terraform/Ansible for the cluster (Lab 45) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-42-exercises` | `~/java-bootcamp/examples/module-42-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-42-exercises\notes | Out-Null
cd examples\module-42-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-42-exercises/notes
cd examples/module-42-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 42 uses its own `examples/lab42-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Map k3s Manifests | Architecture exercise | `notes/lab42-manifest-map.md` | [`exercise-01-manifest-map.md`](exercise-01-manifest-map.md) |
| 2 | ConfigMap vs Secret Split | Analysis exercise | `notes/lab42-config-vs-secret.md` | [`exercise-02-config-vs-secret.md`](exercise-02-config-vs-secret.md) |
| 3 | Design Three Probes | Documentation exercise | `notes/lab42-probe-design.md` | [`exercise-03-probe-design.md`](exercise-03-probe-design.md) |
| 4 | Fill Deployment YAML TODOs | Hands-on exercise | `notes/lab42-yaml-todos.md` | [`exercise-04-yaml-todos.md`](exercise-04-yaml-todos.md) |
| 5 | Rollout and Rollback Checklist | Documentation exercise | `notes/lab42-rollout-rollback.md` | [`exercise-05-rollout-rollback.md`](exercise-05-rollout-rollback.md) |
| 6 | Outline Deployment Runbook | Analysis exercise | `notes/lab42-runbook-outline.md` | [`exercise-06-runbook-outline.md`](exercise-06-runbook-outline.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 42 OS guide.
