# Module 51 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 51 — Capstone Security, CI/CD and Deployment  
**Next:** [`../lab51/LAB-51-GUIDE.md`](../lab51/LAB-51-GUIDE.md)

Complete **in checkpoint order** after each slide pause. Notes under `examples/module-51-exercises/` — not the graded lab.

## Practice order (interleaved)

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Threat checklist](exercise-01-threat-checklist.md) | **A** | `notes/lab51-threat-checklist.md` |
| 2 | [RBAC negatives](exercise-02-rbac-negative-plan.md) | **A** | `notes/lab51-rbac-negative-plan.md` |
| 3 | [Pipeline gates](exercise-03-pipeline-gates.md) | **B** | `notes/lab51-pipeline-gates.md` |
| 4 | [Deploy evidence](exercise-04-deploy-evidence-todos.md) | **C** | `notes/lab51-deploy-evidence-todos.md` |
| 5 | [Rollback/smoke](exercise-05-rollback-smoke.md) | **D** | `notes/lab51-rollback-smoke.md` |
| 6 | [Readiness scorecard](exercise-06-release-readiness.md) | **D** | `notes/lab51-prep-checklist.md` |

Then **checkpoint E** → Lab 51.

## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Threat/RBAC, gates, digest evidence, smoke/rollback, readiness | Commit secrets/kubeconfig; skip security tests |
| Pin digests; deny-by-default | Treat warmup as finished release; Lab 52 defense packet |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-51-exercises` | `~/java-bootcamp/examples/module-51-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-51-exercises\notes | Out-Null
```

## Done when

All six notes files exist; readiness scorecard self-mark **Pass**.
