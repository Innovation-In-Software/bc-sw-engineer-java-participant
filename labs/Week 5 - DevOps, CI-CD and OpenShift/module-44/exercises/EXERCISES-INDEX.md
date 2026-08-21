# Module 44 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 44 — Continuous Delivery and Release Management  
**Next:** [`../lab44/LAB-44-GUIDE.md`](../lab44/LAB-44-GUIDE.md)

Complete **in checkpoint order** after each slide pause. Notes under `examples/module-44-exercises/` in **your** `java-bootcamp` — not the course clone, and not the graded lab.

## Practice order (interleaved)

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [CD vs CDeploy](exercise-01-cd-vs-cdeploy.md) | **A** | `notes/lab44-cd-vs-cdeploy.md` |
| 2 | [Manifest fields](exercise-02-manifest-fields.md) | **A** | `notes/lab44-manifest-fields.md` |
| 3 | [Promotion gates](exercise-03-promotion-gates.md) | **B** | `notes/lab44-promotion-gates.md` |
| 4 | [Rollback runbook](exercise-05-rollback-runbook.md) | **C** | `notes/lab44-rollback-runbook.md` |
| 5 | [Release checklist](exercise-04-checklist-todos.md) | **D** | `notes/lab44-checklist-todos.md` |
| 6 | [Staging smoke](exercise-06-staging-smoke-plan.md) | **D** | `notes/lab44-staging-smoke-plan.md` |

Then **checkpoint E** → Lab 44.

> Numbered exercise files stay 01–06; **complete in the order above** (1→2→3→5→4→6).

## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Manifest, gates, checklist, rollback, list-API smoke plan | Rebuild on deploy host; secrets in artifact |
| Plan promote by Lab 43 **`jarSha256`** | Invent GHCR digest; Terraform/Ansible (Lab 45) / Kafka DLT (Lab 46) |
| Plan a **root** `crm-cd.yml` | Nested `.github/` under `examples/` as the live file |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-44-exercises` | `~/java-bootcamp/examples/module-44-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-44-exercises\notes | Out-Null
```

## Done when

All six notes files exist in **`java-bootcamp`**; checklist + rollback self-mark **Pass**; Lab 43 `jarSha256` ready (image digest optional).
