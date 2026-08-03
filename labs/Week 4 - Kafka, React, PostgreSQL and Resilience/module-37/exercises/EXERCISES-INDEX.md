# Module 37 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 37 — PostgreSQL Design  
**Next:** [`../lab37/LAB-37-GUIDE.md`](../lab37/LAB-37-GUIDE.md)

Complete **in order** after each slide checkpoint. Notes under `examples/module-37-exercises/` — not the graded lab.

## Practice order (interleaved)

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [CRM entities](exercise-01-entities.md) | **A** | `notes/lab37-design.md` |
| 2 | [ER sketch](exercise-02-er-sketch.md) | **B** | `notes/lab37-er-sketch.md` |
| 3 | [Constraints](exercise-03-constraints.md) | **C** | `notes/lab37-constraints.md` |
| 4 | [DDL TODOs](exercise-04-fill-ddl-todos.md) | **D** | `notes/lab37-ddl-todos.md` |
| 5 | [Seed and verify](exercise-05-seed-and-verify-plan.md) | **D** | `notes/lab37-seed-and-verify-plan.md` |
| 6 | [Lab readiness](exercise-06-lab37-readiness.md) | **D** | `notes/lab37-prep-checklist.md` |

Then **checkpoint E** → Lab 37.

## Scope boundary

| Do now | Do not yet |
| --- | --- |
| ER, constraints, offline DDL, seed/verify plan | JPA (Lab 39) / deep EXPLAIN (Lab 38) |
| PostgreSQL-first types | Passwords in Git / running Docker in pre-lab |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-37-exercises` | `~/java-bootcamp/examples/module-37-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-37-exercises\notes | Out-Null
```

## Done when

All six notes files exist; readiness self-mark **Pass**; Postgres/Docker or shared instance plan ready.
