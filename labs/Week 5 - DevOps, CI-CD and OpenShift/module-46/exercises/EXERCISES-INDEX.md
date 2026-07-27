# Module 46 — Pre-Lab Exercises

> **Start here for Module 46:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 46 — Kafka Resilience and Observability  
**Next:** [`../lab46/LAB-46-WINDOWS.md`](../lab46/LAB-46-WINDOWS.md) or [`../lab46/LAB-46-MACOS.md`](../lab46/LAB-46-MACOS.md) → [`../lab46/LAB-46-GUIDE.md`](../lab46/LAB-46-GUIDE.md)

> Complete these exercises after the slides and before Lab 46.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 46 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Classify consumer failure modes for CRM events | Do not leave infinite retry as the error strategy |
| Plan bounded retry + DLT behavior and headers | Do not dump production Kafka topics for evidence |
| Sketch idempotent handling for CUS-1001/CUS-1002 events | Do not use raw emails as high-cardinality metric tags |
| List lag/metrics panels and alert ideas | Do not implement the full Lab 46 consumer rewire as this warmup |
| Outline a safe DLT replay runbook (dry-run first) | Do not skip correlation headers on poison-message drills |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-46-exercises` | `~/java-bootcamp/examples/module-46-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-46-exercises | Out-Null
cd examples\module-46-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-46-exercises
cd examples/module-46-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Classify Consumer Failures | Failure mode analysis | [`exercise-01-failure-taxonomy.md`](exercise-01-failure-taxonomy.md) |
| 2 | Draft DLT Policy | Dead-letter design | [`exercise-02-dlt-policy.md`](exercise-02-dlt-policy.md) |
| 3 | Sketch Idempotent Handling | Exactly-once side effects thinking | [`exercise-03-idempotency-sketch.md`](exercise-03-idempotency-sketch.md) |
| 4 | Fill Metrics/Alert TODOs | Hands-on observability checklist | [`exercise-04-metrics-todos.md`](exercise-04-metrics-todos.md) |
| 5 | Outline DLT Replay Runbook | Safe recovery procedure | [`exercise-05-replay-runbook.md`](exercise-05-replay-runbook.md) |
| 6 | Tie Observability to Release Watch | Ops + release linkage | [`exercise-06-watch-window.md`](exercise-06-watch-window.md) |

Keep all work separate from `examples/lab46-crm` (or the lab’s named project folder); that project begins in the full lab.
