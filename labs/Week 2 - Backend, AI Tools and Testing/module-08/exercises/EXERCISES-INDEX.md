# Module 8 — Pre-Lab Exercises

> **Start here for Module 8:** [`../README.md`](../README.md)

**Module:** 8 — Java Project Structure and Modularization  
**Next:** [`../lab8/LAB-8-WINDOWS.md`](../lab8/LAB-8-WINDOWS.md) or [`../lab8/LAB-8-MACOS.md`](../lab8/LAB-8-MACOS.md) → [`../lab8/LAB-8-GUIDE.md`](../lab8/LAB-8-GUIDE.md)

> Complete these exercises after the slides and before Lab 8.  
> Use JDK 21 and Maven 3.9+.  
> These exercises design and test small pieces; Lab 8 builds the complete CRM skeleton.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` with your own code, then compile and run.

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
| Mini source folder (Exercise 4) | `mini-src\` | `mini-src/` |
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

### How the Exercise 4 starter works

1. Create the `mini-src/com/northstar/crm/` tree (see [`exercise-04-entity-vs-dto.md`](exercise-04-entity-vs-dto.md)).
2. Paste each skeleton → fill every `_____` / `// TODO` → save.
3. Compile with `javac -d mini-out ...` and run `com.northstar.crm.StructureDemo`.

Scaffolding (packages, imports, class names) is given; the learning parts are blanks. Your finished files must compile — blanks are not valid Java.

## Exercise index

| # | Exercise | New structural skill | File |
| - | -------- | -------------------- | ---- |
| 1 | Read a Maven Layout | Source, resource, test, output locations | [`exercise-01-maven-layout.md`](exercise-01-maven-layout.md) |
| 2 | Plan Package Organization | Fully qualified names and package rules | [`exercise-02-package-plan.md`](exercise-02-package-plan.md) |
| 3 | Assign Layer Responsibilities | Controller/service/repository boundaries | [`exercise-03-layer-responsibilities.md`](exercise-03-layer-responsibilities.md) |
| 4 | Separate Entity and DTO | TODO starter: entity + request/response DTOs | [`exercise-04-entity-vs-dto.md`](exercise-04-entity-vs-dto.md) |
| 5 | Check Dependency Direction | Detect invalid layer coupling | [`exercise-05-dependency-direction.md`](exercise-05-dependency-direction.md) |
| 6 | Trace a Customer Request | Document future end-to-end flow | [`exercise-06-request-flow.md`](exercise-06-request-flow.md) |

Keep all work separate from `examples/lab8-crm`; that project begins in the full lab.
