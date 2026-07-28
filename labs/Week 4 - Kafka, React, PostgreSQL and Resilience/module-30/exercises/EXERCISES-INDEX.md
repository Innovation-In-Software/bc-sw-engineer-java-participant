# Module 30 — Pre-Lab Exercises

> **Start here for Module 30:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 30 — Event-Driven Architecture with Kafka  
**Next:** [`../lab30/LAB-30-WINDOWS.md`](../lab30/LAB-30-WINDOWS.md) or [`../lab30/LAB-30-MACOS.md`](../lab30/LAB-30-MACOS.md) → [`../lab30/LAB-30-GUIDE.md`](../lab30/LAB-30-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the Module 30 slides, then start Lab 30.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 30 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-30-exercises | Out-Null
cd examples\module-30-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-30-exercises
cd examples/module-30-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Why Async for CRM | Motivate event-driven fan-out | [`exercise-01-eda-why-async.md`](exercise-01-eda-why-async.md) |
| 2 | Topic and Key Map | Design topics and keys | [`exercise-02-topic-map.md`](exercise-02-topic-map.md) |
| 3 | Event Envelope Sketch | Versioned event JSON design | [`exercise-03-envelope-sketch.md`](exercise-03-envelope-sketch.md) |
| 4 | Fill Kafka Basics TODOs | Recall broker vocabulary | [`exercise-04-fill-kafka-basics.md`](exercise-04-fill-kafka-basics.md) |
| 5 | Producer Checklist | Plan reliable produce settings | [`exercise-05-producer-checklist.md`](exercise-05-producer-checklist.md) |
| 6 | Lab 30 Readiness | Pre-lab self-check | [`exercise-06-lab30-readiness.md`](exercise-06-lab30-readiness.md) |

Keep all work separate from `examples/lab30-crm` (or the lab’s named project folder); that project begins in the full lab.
