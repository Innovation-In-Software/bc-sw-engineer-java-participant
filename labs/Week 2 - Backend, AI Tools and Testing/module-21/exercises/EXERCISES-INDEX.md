# Module 21 — Pre-Lab Exercises

> **Start here for Module 21:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 21 — API Observability and Monitoring  
**Next:** [`../lab21/LAB-21-WINDOWS.md`](../lab21/LAB-21-WINDOWS.md) or [`../lab21/LAB-21-MACOS.md`](../lab21/LAB-21-MACOS.md) → [`../lab21/LAB-21-GUIDE.md`](../lab21/LAB-21-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 21.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 21 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Contrast liveness vs readiness for CRM services | Do not complete the full Lab 21 dashboards in this pre-lab |
| Spot high-cardinality anti-patterns in metric labels | Do not expose every Actuator endpoint publicly |
| Sketch metric TODOs including create_failure_total | Do not label metrics with raw customerId high cardinality |
| Draft an Actuator endpoint allow-list | Do not confuse logs-only debugging with SLOs |
| Plan an alert from create_failure_total threshold | Do not skip documenting alert action owners |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-21-exercises` | `~/java-bootcamp/examples/module-21-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-21-exercises | Out-Null
cd examples\module-21-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-21-exercises
cd examples/module-21-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Cardinality Anti-Patterns | Analysis exercise | [`exercise-01-cardinality-antipatterns.md`](exercise-01-cardinality-antipatterns.md) |
| 2 | Actuator Allow-List | Documentation exercise | [`exercise-02-actuator-allowlist.md`](exercise-02-actuator-allowlist.md) |
| 3 | Liveness vs Readiness | Analysis exercise | [`exercise-03-liveness-vs-readiness.md`](exercise-03-liveness-vs-readiness.md) |
| 4 | Fill Metric Sketch TODOs | Hands-on exercise | [`exercise-04-fill-metric-sketch-todos.md`](exercise-04-fill-metric-sketch-todos.md) |
| 5 | Alert from create_failure_total | Documentation exercise | [`exercise-05-alert-from-failure-total.md`](exercise-05-alert-from-failure-total.md) |
| 6 | Lab 21 Prep Checklist | Documentation exercise | [`exercise-06-lab21-prep-checklist.md`](exercise-06-lab21-prep-checklist.md) |
