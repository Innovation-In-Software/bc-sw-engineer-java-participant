# Module 9 — Pre-Lab Exercises

> **Start here for Module 9:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 9 — Build and Dependency Management with Maven  
**Next:** [`../lab9/LAB-9-WINDOWS.md`](../lab9/LAB-9-WINDOWS.md) or [`../lab9/LAB-9-MACOS.md`](../lab9/LAB-9-MACOS.md) → [`../lab9/LAB-9-GUIDE.md`](../lab9/LAB-9-GUIDE.md)

> Complete these exercises **in order (1→6)** — the same sequence as Module 9. You do **not** need the slideshow to know file names.  
> Use JDK 21 and Maven 3.9+.  
> These exercises design and test small build pieces; Lab 9 expands the full CRM `pom.xml` and lifecycle evidence.  
> Exercise 6 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `<!-- TODO -->` with your own values, then run Maven.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## Everything in one place — guide file vs your notes file

| # | Open this guide | Create / save this notes file |
| - | --------------- | ----------------------------- |
| 1 | [`exercise-01-pom-coordinates.md`](exercise-01-pom-coordinates.md) | `notes/pom-coordinates-notes.md` |
| 2 | [`exercise-02-profiles.md`](exercise-02-profiles.md) | `notes/profiles-notes.md` |
| 3 | [`exercise-03-lifecycle.md`](exercise-03-lifecycle.md) | `notes/lifecycle-notes.md` |
| 4 | [`exercise-04-dependency-scopes.md`](exercise-04-dependency-scopes.md) | `notes/dependency-scopes-notes.md` |
| 5 | [`exercise-05-dependency-tree.md`](exercise-05-dependency-tree.md) | `notes/dependency-tree-notes.md` |
| 6 | [`exercise-06-mini-pom.md`](exercise-06-mini-pom.md) | `notes/mini-maven-notes.md` (+ `mini-maven/` project) |

All paths are relative to `examples/module-09-exercises/`.

## Maven flags (read once)

| Flag | Meaning | When to use |
| ---- | ------- | ----------- |
| *(none)* | Full logs | **Default while learning** — reading test results or `dependency:tree` |
| `-q` | Quiet — hides most lines | Only for quieter rebuilds after you already saw a successful full run |
| `-B` | Batch / non-interactive | CI-style: `mvn -B verify` |

**Never use `-q` with `mvn dependency:tree`** — you need the tree on screen.

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
| Notes folder | `notes\` | `notes/` |
| Mini Maven project (Exercise 6) | `mini-maven\` | `mini-maven/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-09-exercises\notes | Out-Null
cd examples\module-09-exercises
java -version
mvn -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-09-exercises/notes
cd examples/module-09-exercises
java -version
mvn -version
```

**Expected:** Java 21 and Maven 3.9+ are available. If not, return to Lab 0 before continuing.

### How the Exercise 6 starter works

1. Create the `mini-maven/` tree (see [`exercise-06-mini-pom.md`](exercise-06-mini-pom.md)).
2. Paste each skeleton → fill every `_____` / `<!-- TODO -->` → save.
3. From `mini-maven/`, run `mvn test` then `mvn package` (**without** `-q` the first time so you see Surefire output).

Scaffolding (coordinates, plugin names, class names) is given; the learning parts are blanks. Your finished `pom.xml` must build — blanks are not valid Maven.

## Exercise index

Complete in this sequence (Module 9 order):

| # | Exercise | New build skill | Guide | Your notes file |
| - | -------- | --------------- | ----- | --------------- |
| 1 | Read POM Coordinates | `groupId`, `artifactId`, `version`, packaging | [`exercise-01-pom-coordinates.md`](exercise-01-pom-coordinates.md) | `notes/pom-coordinates-notes.md` |
| 2 | Activate Build Profiles | `dev` / `prod`, `-P`, activeByDefault | [`exercise-02-profiles.md`](exercise-02-profiles.md) | `notes/profiles-notes.md` |
| 3 | Walk the Maven Lifecycle | validate → install (and when to avoid deploy) | [`exercise-03-lifecycle.md`](exercise-03-lifecycle.md) | `notes/lifecycle-notes.md` |
| 4 | Choose Dependency Scopes | `compile`, `test`, `runtime`, `provided` | [`exercise-04-dependency-scopes.md`](exercise-04-dependency-scopes.md) | `notes/dependency-scopes-notes.md` |
| 5 | Read a Dependency Tree | Direct vs transitive; `+-` / `\-` legend; CI verify | [`exercise-05-dependency-tree.md`](exercise-05-dependency-tree.md) | `notes/dependency-tree-notes.md` |
| 6 | Fill a Mini POM | TODO starter: coords, JUnit test scope, plugins | [`exercise-06-mini-pom.md`](exercise-06-mini-pom.md) | `notes/mini-maven-notes.md` |

Keep all work separate from `examples/lab9-crm`; that project begins in the full lab.
