# Module 32 — Pre-Lab Exercises

> **Start here for Module 32:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 32 — Resilience and Fault Tolerance  
**Next:** [`../lab32/LAB-32-WINDOWS.md`](../lab32/LAB-32-WINDOWS.md) or [`../lab32/LAB-32-MACOS.md`](../lab32/LAB-32-MACOS.md) → [`../lab32/LAB-32-GUIDE.md`](../lab32/LAB-32-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 32.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 32 builds the full graded deliverable.  
> Exercise 5 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Why Resilience | Motivate fault tolerance | [`exercise-01-why-resilience.md`](exercise-01-why-resilience.md) |
| 2 | Circuit States | Describe breaker state machine | [`exercise-02-circuit-states.md`](exercise-02-circuit-states.md) |
| 3 | Fallback Contract | Define degraded UX honestly | [`exercise-03-fallback-contract.md`](exercise-03-fallback-contract.md) |
| 4 | Pattern Map | Match patterns to CRM calls | [`exercise-04-pattern-map.md`](exercise-04-pattern-map.md) |
| 5 | Fill Resilience TODOs | Complete annotation/config blanks | [`exercise-05-fill-resilience-todos.md`](exercise-05-fill-resilience-todos.md) |
| 6 | Lab 32 Readiness | Pre-lab self-check | [`exercise-06-lab32-readiness.md`](exercise-06-lab32-readiness.md) |
