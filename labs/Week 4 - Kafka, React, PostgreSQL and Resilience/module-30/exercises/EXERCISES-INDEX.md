# Module 30 — Pre-Lab Exercises

> **Start here for Module 30:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 30 — Event-Driven Architecture with Kafka  
**Next:** [`../lab30/LAB-30-WINDOWS.md`](../lab30/LAB-30-WINDOWS.md) or [`../lab30/LAB-30-MACOS.md`](../lab30/LAB-30-MACOS.md) → [`../lab30/LAB-30-GUIDE.md`](../lab30/LAB-30-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 30.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-30-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 30 is the graded consolidation. Do **not** finish Lab 30 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab30-prelab-eda.md` | Why Async for CRM |
| 2 | `notes/lab30-topic-map.md` | Topic and Key Map |
| 3 | `notes/lab30-envelope-sketch.md` | Event Envelope Sketch |
| 4 | `notes/lab30-kafka-todos.md` | Fill Kafka Basics TODOs |
| 5 | `notes/lab30-producer-checklist.md` | Producer Checklist |
| 6 | `notes/lab30-prep-checklist.md` | Lab 30 Readiness |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Name CRM topics, partitions, and customer-ID keys for Amina/Ravi events | Do not start Docker Compose or a live Kafka broker yet |
| Sketch producer vs consumer vs consumer-group roles on paper | Do not write Spring Kafka listeners (Lab 31) |
| Define a versioned CustomerCreated / CustomerStatusChanged envelope | Do not add Resilience4j wrappers (Lab 32) |
| Plan a DLQ topic name and when records go there | Do not build React UI or call REST from the browser |
| Document offset, lag, and replay ideas for Northstar CRM | Do not create PostgreSQL tables or JPA entities |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-30-exercises` | `~/java-bootcamp/examples/module-30-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-30-exercises\notes | Out-Null
cd examples\module-30-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-30-exercises/notes
cd examples/module-30-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 30 uses its own `examples/lab30-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Why Async for CRM | Analysis exercise | `notes/lab30-prelab-eda.md` | [`exercise-01-eda-why-async.md`](exercise-01-eda-why-async.md) |
| 2 | Topic and Key Map | Architecture exercise | `notes/lab30-topic-map.md` | [`exercise-02-topic-map.md`](exercise-02-topic-map.md) |
| 3 | Event Envelope Sketch | Documentation exercise | `notes/lab30-envelope-sketch.md` | [`exercise-03-envelope-sketch.md`](exercise-03-envelope-sketch.md) |
| 4 | Fill Kafka Basics TODOs | Hands-on exercise | `notes/lab30-kafka-todos.md` | [`exercise-04-fill-kafka-basics.md`](exercise-04-fill-kafka-basics.md) |
| 5 | Producer Checklist | Documentation exercise | `notes/lab30-producer-checklist.md` | [`exercise-05-producer-checklist.md`](exercise-05-producer-checklist.md) |
| 6 | Lab 30 Readiness | Analysis exercise | `notes/lab30-prep-checklist.md` | [`exercise-06-lab30-readiness.md`](exercise-06-lab30-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 30 OS guide.
