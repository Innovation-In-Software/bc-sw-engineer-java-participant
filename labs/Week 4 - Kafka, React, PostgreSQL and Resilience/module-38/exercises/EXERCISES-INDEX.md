# Module 38 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 38 — SQL and Query Performance  
**Next:** [`../lab38/LAB-38-GUIDE.md`](../lab38/LAB-38-GUIDE.md)

Complete **in order** after each slide checkpoint. Notes under `examples/module-38-exercises/` — not the graded lab.

## Practice order (interleaved)

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Access patterns](exercise-01-access-patterns.md) | **A** | `notes/lab38-perf.md` |
| 2 | [Index tradeoffs](exercise-02-index-tradeoffs.md) | **B** | `notes/lab38-index-tradeoffs.md` |
| 3 | [EXPLAIN checklist](exercise-04-explain-checklist.md) | **B** | `notes/lab38-explain-checklist.md` |
| 4 | [Sargability](exercise-05-sargability.md) | **C** | `notes/lab38-sargability.md` |
| 5 | [SQL/index TODOs](exercise-03-fill-sql-index-todos.md) | **C** | `notes/lab38-sql-index-todos.md` |
| 6 | [Lab readiness](exercise-06-lab38-readiness.md) | **D** | `notes/lab38-prep-checklist.md` |

Then **checkpoint E** → Lab 38.

## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Patterns, EXPLAIN literacy, sargability, index tradeoffs | JPA (Lab 39) |
| Offline plans (live DB in lab) | Index-everything / untuned production changes |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-38-exercises` | `~/java-bootcamp/examples/module-38-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-38-exercises\notes | Out-Null
```

## Done when

All six notes files exist; readiness self-mark **Pass**; Lab 37 schema ready for volume + EXPLAIN.
