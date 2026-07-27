# Module 44 — Pre-Lab Exercises

> **Start here for Module 44:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 44 — Continuous Delivery and Release Management  
**Next:** [`../lab44/LAB-44-WINDOWS.md`](../lab44/LAB-44-WINDOWS.md) or [`../lab44/LAB-44-MACOS.md`](../lab44/LAB-44-MACOS.md) → [`../lab44/LAB-44-GUIDE.md`](../lab44/LAB-44-GUIDE.md)

> Complete these exercises after the slides and before Lab 44.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 44 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-44-exercises | Out-Null
cd examples\module-44-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-44-exercises
cd examples/module-44-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Delivery vs Deployment | Release vocabulary | [`exercise-01-cd-vs-cdeploy.md`](exercise-01-cd-vs-cdeploy.md) |
| 2 | Sketch Artifact Manifest | Release evidence model | [`exercise-02-manifest-fields.md`](exercise-02-manifest-fields.md) |
| 3 | Define Promotion Gates | Objective release gates | [`exercise-03-promotion-gates.md`](exercise-03-promotion-gates.md) |
| 4 | Fill Release Checklist TODOs | Hands-on checklist draft | [`exercise-04-checklist-todos.md`](exercise-04-checklist-todos.md) |
| 5 | Outline Rollback Runbook | Recovery planning | [`exercise-05-rollback-runbook.md`](exercise-05-rollback-runbook.md) |
| 6 | Plan Staging Smoke | Non-prod verification | [`exercise-06-staging-smoke-plan.md`](exercise-06-staging-smoke-plan.md) |

Keep all work separate from `examples/lab44-crm` (or the lab’s named project folder); that project begins in the full lab.
