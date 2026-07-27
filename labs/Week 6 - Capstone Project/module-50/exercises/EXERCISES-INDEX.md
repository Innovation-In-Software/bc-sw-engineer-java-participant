# Module 50 — Pre-Lab Exercises

> **Start here for Module 50:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 50 — Capstone Frontend and Persistence  
**Next:** [`../lab50/LAB-50-WINDOWS.md`](../lab50/LAB-50-WINDOWS.md) or [`../lab50/LAB-50-MACOS.md`](../lab50/LAB-50-MACOS.md) → [`../lab50/LAB-50-GUIDE.md`](../lab50/LAB-50-GUIDE.md)

> Complete these exercises after the slides and before Lab 50.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 50 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Map the agent UI journey (search → profile → timeline → form) | Do not build the full React journey in this pre-lab |
| Plan typed API client calls and loading/error/empty states | Do not skip accessibility and empty/error states in planning |
| Sketch JPA entities/migrations needed for the journey | Do not store real customer PII in fixtures |
| List UI/component verification evidence to capture | Do not change production DB without migration discipline |
| Prepare end-to-end data-flow notes UI → API → PostgreSQL | Do not start security/CI deploy work here (Lab 51) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-50-exercises` | `~/java-bootcamp/examples/module-50-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-50-exercises | Out-Null
cd examples\module-50-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-50-exercises
cd examples/module-50-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Map Agent UI Journey | UX flow planning | [`exercise-01-journey-map.md`](exercise-01-journey-map.md) |
| 2 | Plan Typed API Client | Frontend contract safety | [`exercise-02-api-client-plan.md`](exercise-02-api-client-plan.md) |
| 3 | Sketch Persistence Changes | JPA/PostgreSQL planning | [`exercise-03-persistence-sketch.md`](exercise-03-persistence-sketch.md) |
| 4 | Fill Accessibility TODOs | Hands-on a11y checklist | [`exercise-04-a11y-todos.md`](exercise-04-a11y-todos.md) |
| 5 | UI Verification Evidence Plan | Test evidence planning | [`exercise-05-verification-plan.md`](exercise-05-verification-plan.md) |
| 6 | Document End-to-End Data Flow | Full-stack tracing | [`exercise-06-data-flow-note.md`](exercise-06-data-flow-note.md) |

Keep all work separate from `examples/lab50-crm` (or the lab’s named project folder); that project begins in the full lab.
