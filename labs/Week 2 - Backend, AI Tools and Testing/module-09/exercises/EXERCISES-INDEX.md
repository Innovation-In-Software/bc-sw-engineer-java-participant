# Module 9 — Pre-Lab Exercises

> **Start here for Module 9:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 9 — Build and Dependency Management with Maven  
**Next:** [`../lab9/LAB-9-WINDOWS.md`](../lab9/LAB-9-WINDOWS.md) or [`../lab9/LAB-9-MACOS.md`](../lab9/LAB-9-MACOS.md) → [`../lab9/LAB-9-GUIDE.md`](../lab9/LAB-9-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the Module 9 slides, then start Lab 9.  
> Use JDK 21 and Maven 3.9+.  
> These exercises design and test small build pieces; Lab 9 expands the full CRM `pom.xml` and lifecycle evidence.  
> Exercise 6 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `<!-- TODO -->` with your own values, then run Maven.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| ------ | -------------- |
| POM coordinates and packaging | Spring Boot application code |
| Dependency scopes (`compile`, `test`, `runtime`, `provided`) | JPA / database drivers as required runtime |
| Maven lifecycle phases | Kafka clients |
| Compiler / Surefire / jar plugin vocabulary | React UI or frontend tooling |
| Profiles and `mvn -B verify` habit | Deploying to a remote artifact repository |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-09-exercises` | `~/java-bootcamp/examples/module-09-exercises` |
| Mini Maven project (Exercise 6) | `mini-maven\` | `mini-maven/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-09-exercises | Out-Null
cd examples\module-09-exercises
java -version
mvn -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-09-exercises
cd examples/module-09-exercises
java -version
mvn -version
```

**Expected:** Java 21 and Maven 3.9+ are available. If not, return to Lab 0 before continuing.

### How the Exercise 6 starter works

1. Create the `mini-maven/` tree (see [`exercise-06-mini-pom.md`](exercise-06-mini-pom.md)).
2. Paste each skeleton → fill every `_____` / `<!-- TODO -->` → save.
3. From `mini-maven/`, run `mvn -q test` then `mvn -q package`.

Scaffolding (coordinates, plugin names, class names) is given; the learning parts are blanks. Your finished `pom.xml` must build — blanks are not valid Maven.

## Exercise index

Complete in this sequence (matches Module slide order):

Complete in this sequence (matches Module 9 slide order):

| # | Exercise | New build skill | File |
| - | -------- | --------------- | ---- |
| 1 | Read POM Coordinates | `groupId`, `artifactId`, `version`, packaging | [`exercise-01-pom-coordinates.md`](exercise-01-pom-coordinates.md) |
| 2 | Activate Build Profiles | `dev` / `prod`, `-P`, activeByDefault | [`exercise-02-profiles.md`](exercise-02-profiles.md) |
| 3 | Walk the Maven Lifecycle | validate → install (and when to avoid deploy) | [`exercise-03-lifecycle.md`](exercise-03-lifecycle.md) |
| 4 | Choose Dependency Scopes | `compile`, `test`, `runtime`, `provided` | [`exercise-04-dependency-scopes.md`](exercise-04-dependency-scopes.md) |
| 5 | Read a Dependency Tree | Direct vs transitive; CI `mvn -B verify` | [`exercise-05-dependency-tree.md`](exercise-05-dependency-tree.md) |
| 6 | Fill a Mini POM | TODO starter: coords, JUnit test scope, plugins | [`exercise-06-mini-pom.md`](exercise-06-mini-pom.md) |

Keep all work separate from `examples/lab9-crm`; that project begins in the full lab.
