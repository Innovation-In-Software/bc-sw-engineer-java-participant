# Module 42 — Pre-Lab Exercises

> **Start here for Module 42:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 42 — Kubernetes (k3s) Deployment  
**Next:** [`../lab42/LAB-42-WINDOWS.md`](../lab42/LAB-42-WINDOWS.md) or [`../lab42/LAB-42-MACOS.md`](../lab42/LAB-42-MACOS.md) → [`../lab42/LAB-42-GUIDE.md`](../lab42/LAB-42-GUIDE.md)

> Complete these exercises after the slides and before Lab 42.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 42 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-42-exercises | Out-Null
cd examples\module-42-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-42-exercises
cd examples/module-42-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Map k3s Manifests | Workload object mapping | [`exercise-01-manifest-map.md`](exercise-01-manifest-map.md) |
| 2 | ConfigMap vs Secret Split | Configuration hygiene | [`exercise-02-config-vs-secret.md`](exercise-02-config-vs-secret.md) |
| 3 | Design Three Probes | Probe semantics | [`exercise-03-probe-design.md`](exercise-03-probe-design.md) |
| 4 | Fill Deployment YAML TODOs | Hands-on manifest draft | [`exercise-04-yaml-todos.md`](exercise-04-yaml-todos.md) |
| 5 | Rollout and Rollback Checklist | Release recovery planning | [`exercise-05-rollout-rollback.md`](exercise-05-rollout-rollback.md) |
| 6 | Outline Deployment Runbook | Ops documentation | [`exercise-06-runbook-outline.md`](exercise-06-runbook-outline.md) |

Keep all work separate from `examples/lab42-crm` (or the lab’s named project folder); that project begins in the full lab.
