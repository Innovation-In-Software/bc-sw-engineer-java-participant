# Module 36 — Pre-Lab Exercises

> **Start:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md)

**Module:** 36 — Frontend Security  
**Next:** [`../lab36/LAB-36-GUIDE.md`](../lab36/LAB-36-GUIDE.md)

Complete **in order** after each slide checkpoint. Notes under `examples/module-36-exercises/` — not the graded lab.

## Practice order (interleaved)

| Order | Ex | After CP | Deliverable |
| --- | --- | --- | --- |
| 1 | [Threat sketch](exercise-01-threat-sketch.md) | **A** | `notes/lab36-security.md` |
| 2 | [Token storage](exercise-02-token-storage.md) | **B** | `notes/lab36-token-storage.md` |
| 3 | [XSS and CSP](exercise-03-xss-csp.md) | **C** | `notes/lab36-xss-csp.md` |
| 4 | [CSRF notes](exercise-04-csrf-notes.md) | **C** | `notes/lab36-csrf-notes.md` |
| 5 | [Route guard TODOs](exercise-05-fill-guard-todos.md) | **D** | `notes/lab36-todos.md` |
| 6 | [Lab readiness](exercise-06-lab36-readiness.md) | **D** | `notes/lab36-prep-checklist.md` |

Then **checkpoint E** → Lab 36.

## Scope boundary

| Do now | Do not yet |
| --- | --- |
| Threat model, memory tokens, XSS/CSRF notes, guard UX | localStorage tokens (this lab) / full OIDC provider |
| Plan origin-scoped Authorization | Treating UI guards as server authorization |

## Workspace

| | Windows | macOS |
| --- | --- | --- |
| Folder | `%USERPROFILE%\java-bootcamp\examples\module-36-exercises` | `~/java-bootcamp/examples/module-36-exercises` |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-36-exercises\notes | Out-Null
```

## Done when

All six notes files exist; readiness self-mark **Pass**; Lab 35 http boundary (or starter) ready.
