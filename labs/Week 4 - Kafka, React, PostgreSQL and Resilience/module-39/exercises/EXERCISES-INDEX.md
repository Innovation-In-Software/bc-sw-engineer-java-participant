# Module 39 — Pre-Lab Exercises

> **Start here for Module 39:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 39 — Spring Data JPA and PostgreSQL  
**Next:** [`../lab39/LAB-39-WINDOWS.md`](../lab39/LAB-39-WINDOWS.md) or [`../lab39/LAB-39-MACOS.md`](../lab39/LAB-39-MACOS.md) → [`../lab39/LAB-39-GUIDE.md`](../lab39/LAB-39-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 39.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 39 builds the full graded deliverable.  
> Exercise 3 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Map customer/account tables to JPA entity fields on paper | Do not run Spring Boot, Flyway, or Testcontainers in this pre-lab |
| Plan Flyway versioned migrations for CRM schema | Do not use `ddl-auto=create` as the long-term strategy |
| Sketch repository method names for Amina/Ravi lookups | Do not bypass repositories with string-concatenated SQL in services |
| Note paging and optimistic locking fields (@Version) | Do not expose entities directly as public API DTOs without thought |
| Align Spring datasource config names without starting the app | Do not store secrets in application.yml committed to git |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-39-exercises` | `~/java-bootcamp/examples/module-39-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-39-exercises | Out-Null
cd examples\module-39-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-39-exercises
cd examples/module-39-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Entity Mapping | Map tables to entities | [`exercise-01-entity-mapping.md`](exercise-01-entity-mapping.md) |
| 2 | Repository Sketch | Design Spring Data methods | [`exercise-02-repository-sketch.md`](exercise-02-repository-sketch.md) |
| 3 | Fill JPA TODOs | Complete entity/repo blanks | [`exercise-03-fill-jpa-todos.md`](exercise-03-fill-jpa-todos.md) |
| 4 | Paging and Locking Notes | Plan Pageable and @Version use | [`exercise-04-paging-locking.md`](exercise-04-paging-locking.md) |
| 5 | Flyway Plan | Plan versioned migrations | [`exercise-05-flyway-plan.md`](exercise-05-flyway-plan.md) |
| 6 | Lab 39 Readiness | Pre-lab self-check | [`exercise-06-lab39-readiness.md`](exercise-06-lab39-readiness.md) |
