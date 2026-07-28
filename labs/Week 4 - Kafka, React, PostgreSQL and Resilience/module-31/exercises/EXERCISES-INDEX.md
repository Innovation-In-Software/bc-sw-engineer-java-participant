# Module 31 — Pre-Lab Exercises

> **Start here for Module 31:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 31 — Kafka Integration with Spring Boot  
**Next:** [`../lab31/LAB-31-WINDOWS.md`](../lab31/LAB-31-WINDOWS.md) or [`../lab31/LAB-31-MACOS.md`](../lab31/LAB-31-MACOS.md) → [`../lab31/LAB-31-GUIDE.md`](../lab31/LAB-31-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 31.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 31 builds the full graded deliverable.  
> Exercise 3 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-31-exercises | Out-Null
cd examples\module-31-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-31-exercises
cd examples/module-31-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Spring Kafka Roles | Map Spring types to Kafka roles | [`exercise-01-spring-kafka-roles.md`](exercise-01-spring-kafka-roles.md) |
| 2 | Listener Sketch | Design listener contracts | [`exercise-02-listener-sketch.md`](exercise-02-listener-sketch.md) |
| 3 | Fill Spring Kafka TODOs | Complete config and code blanks | [`exercise-03-fill-spring-kafka-todos.md`](exercise-03-fill-spring-kafka-todos.md) |
| 4 | Error and DLT Notes | Document failure handling intent | [`exercise-04-error-dlt-notes.md`](exercise-04-error-dlt-notes.md) |
| 5 | Idempotency Plan | Plan duplicate-safe consumers | [`exercise-05-idempotency-plan.md`](exercise-05-idempotency-plan.md) |
| 6 | Lab 31 Readiness | Pre-lab self-check | [`exercise-06-lab31-readiness.md`](exercise-06-lab31-readiness.md) |
