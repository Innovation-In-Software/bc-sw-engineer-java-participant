# Module 32 — Pre-Lab Exercises

> **Start here for Module 32:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 32 — Resilience and Fault Tolerance  
**Next:** [`../lab32/LAB-32-WINDOWS.md`](../lab32/LAB-32-WINDOWS.md) or [`../lab32/LAB-32-MACOS.md`](../lab32/LAB-32-MACOS.md) → [`../lab32/LAB-32-GUIDE.md`](../lab32/LAB-32-GUIDE.md)

> Complete these exercises after the slides and before Lab 32.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 32 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Name Resilience4j patterns: retry, circuit breaker, timeout, fallback | Do not run the Account Profile mock or Spring Boot yet |
| Map each pattern to a Northstar outbound Account Profile call | Do not tune production cluster-wide circuit thresholds |
| Sketch failure states (closed/open/half-open) on paper | Do not replace Kafka with resilience patterns |
| Define fallback behavior when the dependency is down | Do not build React error toasts yet (later modules) |
| List metrics/log fields you will watch in the lab | Do not change database transaction isolation here |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-32-exercises` | `~/java-bootcamp/examples/module-32-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-32-exercises | Out-Null
cd examples\module-32-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-32-exercises
cd examples/module-32-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Why Resilience | Motivate fault tolerance | [`exercise-01-why-resilience.md`](exercise-01-why-resilience.md) |
| 2 | Pattern Map | Match patterns to CRM calls | [`exercise-02-pattern-map.md`](exercise-02-pattern-map.md) |
| 3 | Circuit States | Describe breaker state machine | [`exercise-03-circuit-states.md`](exercise-03-circuit-states.md) |
| 4 | Fill Resilience TODOs | Complete annotation/config blanks | [`exercise-04-fill-resilience-todos.md`](exercise-04-fill-resilience-todos.md) |
| 5 | Fallback Contract | Define degraded UX honestly | [`exercise-05-fallback-contract.md`](exercise-05-fallback-contract.md) |
| 6 | Lab 32 Readiness | Pre-lab self-check | [`exercise-06-lab32-readiness.md`](exercise-06-lab32-readiness.md) |

Keep all work separate from `examples/lab32-crm` (or the lab’s named project folder); that project begins in the full lab.
