# Module 51 — Pre-Lab Exercises

> **Start here for Module 51:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 51 — Capstone Security, CI/CD and Deployment  
**Next:** [`../lab51/LAB-51-WINDOWS.md`](../lab51/LAB-51-WINDOWS.md) or [`../lab51/LAB-51-MACOS.md`](../lab51/LAB-51-MACOS.md) → [`../lab51/LAB-51-GUIDE.md`](../lab51/LAB-51-GUIDE.md)

> Complete these exercises after the slides and before Lab 51.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 51 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-51-exercises | Out-Null
cd examples\module-51-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-51-exercises
cd examples/module-51-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Capstone Threat Checklist | Threat modeling warmup | [`exercise-01-threat-checklist.md`](exercise-01-threat-checklist.md) |
| 2 | Plan RBAC Negative Tests | Authorization proof | [`exercise-02-rbac-negative-plan.md`](exercise-02-rbac-negative-plan.md) |
| 3 | Outline Delivery Gates | CI/CD gate planning | [`exercise-03-pipeline-gates.md`](exercise-03-pipeline-gates.md) |
| 4 | Fill Deploy Evidence TODOs | Hands-on evidence checklist | [`exercise-04-deploy-evidence-todos.md`](exercise-04-deploy-evidence-todos.md) |
| 5 | Rollback and Smoke Mini-Runbook | Recovery readiness | [`exercise-05-rollback-smoke.md`](exercise-05-rollback-smoke.md) |
| 6 | Release Readiness Scorecard | Go/no-go warmup | [`exercise-06-release-readiness.md`](exercise-06-release-readiness.md) |

Keep all work separate from `examples/lab51-crm` (or the lab’s named project folder); that project begins in the full lab.
