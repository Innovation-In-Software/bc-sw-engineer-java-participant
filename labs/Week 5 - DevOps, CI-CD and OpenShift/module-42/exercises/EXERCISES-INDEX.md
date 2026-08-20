# Module 42 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 42 — Kubernetes (k3s) Deployment  
**Next:** [`../lab42/LAB-42-GUIDE.md`](../lab42/LAB-42-GUIDE.md)

Complete **in order** after each slide checkpoint. Notes under `examples/module-42-exercises/` in **your** `java-bootcamp` — not the course clone, and not the graded lab.

## Practice order (interleaved)

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Manifest map](exercise-01-manifest-map.md) | **A** | `notes/lab42-manifest-map.md` |
| 2 | [ConfigMap vs Secret](exercise-02-config-vs-secret.md) | **A** | `notes/lab42-config-vs-secret.md` |
| 3 | [Probe design](exercise-03-probe-design.md) | **B** | `notes/lab42-probe-design.md` |
| 4 | [YAML TODOs](exercise-04-yaml-todos.md) | **B** | `notes/lab42-yaml-todos.md` |
| 5 | [Rollout/rollback](exercise-05-rollout-rollback.md) | **B** | `notes/lab42-rollout-rollback.md` |
| 6 | [Runbook outline](exercise-06-runbook-outline.md) | **D** | `notes/lab42-runbook-outline.md` |

Checkpoint **C** (slides 78–84) is instructor discussion: Traefik Ingress vs OpenShift Routes.  
Then **checkpoint E** → Lab 42.

## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Manifests, probes, secret split, rollback plan | Commit Secret values / kubeconfig |
| Image tag `crm-api:lab41` + record Image Id | GHA deploy (43–44) / Terraform cluster (45) |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-42-exercises` | `~/java-bootcamp/examples/module-42-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-42-exercises\notes | Out-Null
```

## Done when

All six notes files exist; runbook outline self-mark **Pass**; Lab 41 Image Id recorded for Lab 42.
