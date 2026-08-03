# Module 39 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 39 — Spring Data JPA and PostgreSQL  
**Next:** [`../lab39/LAB-39-GUIDE.md`](../lab39/LAB-39-GUIDE.md)

Complete **in order** after each slide checkpoint. Notes under `examples/module-39-exercises/` — not the graded lab.

## Practice order (interleaved)

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Entity mapping](exercise-01-entity-mapping.md) | **A** | `notes/lab39-jpa.md` |
| 2 | [Repository sketch](exercise-02-repository-sketch.md) | **B** | `notes/lab39-repository-sketch.md` |
| 3 | [JPA TODOs](exercise-03-fill-jpa-todos.md) | **B** | `notes/lab39-todos.md` |
| 4 | [Paging and locking](exercise-04-paging-locking.md) | **C** | `notes/lab39-paging-locking.md` |
| 5 | [Flyway plan](exercise-05-flyway-plan.md) | **D** | `notes/lab39-flyway-plan.md` |
| 6 | [Lab readiness](exercise-06-lab39-readiness.md) | **D** | `notes/lab39-prep-checklist.md` |

Then **checkpoint E** → Lab 39.

## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Entity/repo/Flyway/paging/@Version plans | Running Boot/Flyway/Testcontainers in pre-lab |
| Env-based datasource names | `ddl-auto=create` long-term / H2-as-Postgres IT |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-39-exercises` | `~/java-bootcamp/examples/module-39-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-39-exercises\notes | Out-Null
```

## Done when

All six notes files exist; readiness self-mark **Pass**; Postgres + Lab 37/38 DDL alignment ready.
