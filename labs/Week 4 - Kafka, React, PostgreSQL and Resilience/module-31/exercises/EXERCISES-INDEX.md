# Module 31 — Pre-Lab Exercises

> **Start here for Module 31:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 31 — Kafka Integration with Spring Boot  
**Next:** [`../lab31/LAB-31-WINDOWS.md`](../lab31/LAB-31-WINDOWS.md) or [`../lab31/LAB-31-MACOS.md`](../lab31/LAB-31-MACOS.md) → [`../lab31/LAB-31-GUIDE.md`](../lab31/LAB-31-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 31.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-31-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 31 is the graded consolidation. Do **not** finish Lab 31 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab31-spring-kafka.md` | Spring Kafka Roles |
| 2 | `notes/lab31-listener-sketch.md` | Listener Sketch |
| 3 | `notes/lab31-todos.md` | Fill Spring Kafka TODOs |
| 4 | `notes/lab31-error-dlt-notes.md` | Error and DLT Notes |
| 5 | `notes/lab31-idempotency-plan.md` | Idempotency Plan |
| 6 | `notes/lab31-prep-checklist.md` | Lab 31 Readiness |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Map Spring `KafkaTemplate` publish to Lab 30 topic names | Do not start Kafka or Spring Boot in this pre-lab |
| Sketch `@KafkaListener` method signatures for CRM events | Do not add Resilience4j (Lab 32) |
| Plan consumer idempotency keys for Amina/Ravi duplicates | Do not build React components |
| Document DLT / error-handler intent for poison messages | Do not change PostgreSQL schemas |
| Note Spring Boot config property names you will fill in lab | Do not implement full production multi-cluster failover |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-31-exercises` | `~/java-bootcamp/examples/module-31-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-31-exercises\notes | Out-Null
cd examples\module-31-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-31-exercises/notes
cd examples/module-31-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 31 uses its own `examples/lab31-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Spring Kafka Roles | Analysis exercise | `notes/lab31-spring-kafka.md` | [`exercise-01-spring-kafka-roles.md`](exercise-01-spring-kafka-roles.md) |
| 2 | Listener Sketch | Architecture exercise | `notes/lab31-listener-sketch.md` | [`exercise-02-listener-sketch.md`](exercise-02-listener-sketch.md) |
| 3 | Fill Spring Kafka TODOs | Hands-on exercise | `notes/lab31-todos.md` | [`exercise-03-fill-spring-kafka-todos.md`](exercise-03-fill-spring-kafka-todos.md) |
| 4 | Error and DLT Notes | Documentation exercise | `notes/lab31-error-dlt-notes.md` | [`exercise-04-error-dlt-notes.md`](exercise-04-error-dlt-notes.md) |
| 5 | Idempotency Plan | Documentation exercise | `notes/lab31-idempotency-plan.md` | [`exercise-05-idempotency-plan.md`](exercise-05-idempotency-plan.md) |
| 6 | Lab 31 Readiness | Analysis exercise | `notes/lab31-prep-checklist.md` | [`exercise-06-lab31-readiness.md`](exercise-06-lab31-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 31 OS guide.
