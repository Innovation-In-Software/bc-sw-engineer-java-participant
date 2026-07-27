# Module 14 — Pre-Lab Exercises

> **Start here for Module 14:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 14 — DTOs, Validation and API Contracts  
**Next:** [`../lab14/LAB-14-WINDOWS.md`](../lab14/LAB-14-WINDOWS.md) or [`../lab14/LAB-14-MACOS.md`](../lab14/LAB-14-MACOS.md) → [`../lab14/LAB-14-GUIDE.md`](../lab14/LAB-14-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 14.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 14 builds the full graded deliverable.  
> Exercise 5 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Separate entity vs DTO responsibilities for Customer | Do not complete the full Lab 14 wiring in this pre-lab |
| Annotate a paper DTO for create/activate requests | Do not use live Spring `@Valid` controllers yet |
| Plan a mapper that does not leak persistence fields | Do not deepen full service transition rules (Lab 15) |
| Draft ValidatorFactory TODOs for invalid cases | Do not expose JPA entities as API bodies |
| List invalid payloads for Amina/Ravi-shaped requests | Do not skip documenting mapper no-leak rules |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-14-exercises` | `~/java-bootcamp/examples/module-14-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-14-exercises | Out-Null
cd examples\module-14-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-14-exercises
cd examples/module-14-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Entity vs DTO | Analysis exercise | [`exercise-01-entity-vs-dto.md`](exercise-01-entity-vs-dto.md) |
| 2 | Mapper No-Leak Rule | Architecture exercise | [`exercise-02-mapper-no-leak.md`](exercise-02-mapper-no-leak.md) |
| 3 | Annotate Paper DTO | Documentation exercise | [`exercise-03-annotate-paper-dto.md`](exercise-03-annotate-paper-dto.md) |
| 4 | Invalid Cases Catalog | Analysis exercise | [`exercise-04-invalid-cases.md`](exercise-04-invalid-cases.md) |
| 5 | Fill ValidatorFactory TODOs | Hands-on exercise | [`exercise-05-fill-validatorfactory-todos.md`](exercise-05-fill-validatorfactory-todos.md) |
| 6 | Lab 14 Prep Checklist | Documentation exercise | [`exercise-06-lab14-prep-checklist.md`](exercise-06-lab14-prep-checklist.md) |
