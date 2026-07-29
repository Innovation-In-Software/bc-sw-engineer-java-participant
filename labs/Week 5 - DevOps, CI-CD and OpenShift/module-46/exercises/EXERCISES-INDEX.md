# Module 46 — Pre-Lab Exercises

> **Start here for Module 46:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 46 — Kafka Resilience and Observability  
**Next:** [`../lab46/LAB-46-WINDOWS.md`](../lab46/LAB-46-WINDOWS.md) or [`../lab46/LAB-46-MACOS.md`](../lab46/LAB-46-MACOS.md) → [`../lab46/LAB-46-GUIDE.md`](../lab46/LAB-46-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 46.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-46-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 46 is the graded consolidation. Do **not** finish Lab 46 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab46-failure-taxonomy.md` | Classify Consumer Failures |
| 2 | `notes/lab46-dlt-policy.md` | Draft DLT Policy |
| 3 | `notes/lab46-idempotency-sketch.md` | Sketch Idempotent Handling |
| 4 | `notes/lab46-metrics-todos.md` | Fill Metrics/Alert TODOs |
| 5 | `notes/lab46-replay-runbook.md` | Outline DLT Replay Runbook |
| 6 | `notes/lab46-watch-window.md` | Tie Observability to Release Watch |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

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
New-Item -ItemType Directory -Force -Path examples\module-46-exercises\notes | Out-Null
cd examples\module-46-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-46-exercises/notes
cd examples/module-46-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 46 uses its own `examples/lab46-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Classify Consumer Failures | Analysis exercise | `notes/lab46-failure-taxonomy.md` | [`exercise-01-failure-taxonomy.md`](exercise-01-failure-taxonomy.md) |
| 2 | Draft DLT Policy | Architecture exercise | `notes/lab46-dlt-policy.md` | [`exercise-02-dlt-policy.md`](exercise-02-dlt-policy.md) |
| 3 | Sketch Idempotent Handling | Documentation exercise | `notes/lab46-idempotency-sketch.md` | [`exercise-03-idempotency-sketch.md`](exercise-03-idempotency-sketch.md) |
| 4 | Fill Metrics/Alert TODOs | Hands-on exercise | `notes/lab46-metrics-todos.md` | [`exercise-04-metrics-todos.md`](exercise-04-metrics-todos.md) |
| 5 | Outline DLT Replay Runbook | Documentation exercise | `notes/lab46-replay-runbook.md` | [`exercise-05-replay-runbook.md`](exercise-05-replay-runbook.md) |
| 6 | Tie Observability to Release Watch | Analysis exercise | `notes/lab46-watch-window.md` | [`exercise-06-watch-window.md`](exercise-06-watch-window.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 46 OS guide.
