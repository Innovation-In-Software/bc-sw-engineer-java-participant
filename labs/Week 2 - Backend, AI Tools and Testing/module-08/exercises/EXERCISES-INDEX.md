# Module 8 — Pre-Lab Exercises

> **Start here for Module 8:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 8 — Java Project Structure and Modularization  
**Next:** [`../lab8/LAB-8-WINDOWS.md`](../lab8/LAB-8-WINDOWS.md) or [`../lab8/LAB-8-MACOS.md`](../lab8/LAB-8-MACOS.md) → [`../lab8/LAB-8-GUIDE.md`](../lab8/LAB-8-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the Module 8 slides, then start Lab 8.  
> Use JDK 21 and Maven 3.9+.  
> These exercises design and test small pieces; Lab 8 builds the complete CRM skeleton.  
> Exercise 3 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` with your own code, then compile and run.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| ------ | -------------- |
| Maven directory vocabulary | Spring Boot dependencies |
| Layer/package responsibilities | Controllers with HTTP annotations |
| Plain Java entity and DTO stubs | JPA entities/database mappings |
| Dependency-direction reasoning | PostgreSQL, Kafka, React |
| Request-flow documentation | Real customer persistence |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-08-exercises` | `~/java-bootcamp/examples/module-08-exercises` |
| Mini source folder (Exercise 3) | `mini-src\` | `mini-src/` |
| Compiled output | `mini-out\` | `mini-out/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-08-exercises | Out-Null
cd examples\module-08-exercises
java -version
mvn -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-08-exercises
cd examples/module-08-exercises
java -version
mvn -version
```

**Expected:** Java 21 and Maven 3.9+ are available. If not, return to Lab 0 before continuing.

### How the Exercise 3 starter works

1. Create the `mini-src/com/northstar/crm/` tree (see [`exercise-03-entity-vs-dto.md`](exercise-03-entity-vs-dto.md)).
2. Paste each skeleton → fill every `_____` / `// TODO` → save.
3. Compile with `javac -d mini-out ...` and run `com.northstar.crm.StructureDemo`.

Scaffolding (packages, imports, class names) is given; the learning parts are blanks. Your finished files must compile — blanks are not valid Java.

## Exercise index

Complete in this sequence (matches Module slide order):

Complete in this sequence (matches Module 8 slide order):

| # | Exercise | New structural skill | File |
| - | -------- | -------------------- | ---- |
| 1 | Read a Maven Layout | Source, resource, test, output locations | [`exercise-01-maven-layout.md`](exercise-01-maven-layout.md) |
| 2 | Plan Package Organization | Fully qualified names and package rules | [`exercise-02-package-plan.md`](exercise-02-package-plan.md) |
| 3 | Separate Entity and DTO | TODO starter: entity + request/response DTOs | [`exercise-03-entity-vs-dto.md`](exercise-03-entity-vs-dto.md) |
| 4 | Assign Layer Responsibilities | Controller/service/repository boundaries | [`exercise-04-layer-responsibilities.md`](exercise-04-layer-responsibilities.md) |
| 5 | Trace a Customer Request | Document future end-to-end flow | [`exercise-05-request-flow.md`](exercise-05-request-flow.md) |
| 6 | Check Dependency Direction | Detect invalid layer coupling | [`exercise-06-dependency-direction.md`](exercise-06-dependency-direction.md) |

Keep all work separate from `examples/lab8-crm`; that project begins in the full lab.
