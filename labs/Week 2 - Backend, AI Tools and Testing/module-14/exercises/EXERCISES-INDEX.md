# Module 14 — Pre-Lab Exercises

> **Start here for Module 14:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 14 — DTOs, Validation and API Contracts  
**Next:** [`../lab14/LAB-14-WINDOWS.md`](../lab14/LAB-14-WINDOWS.md) or [`../lab14/LAB-14-MACOS.md`](../lab14/LAB-14-MACOS.md) → [`../lab14/LAB-14-GUIDE.md`](../lab14/LAB-14-GUIDE.md)

> Complete these exercises after the slides and before Lab 14.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 14 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Entity vs DTO | API boundary types | [`exercise-01-entity-vs-dto.md`](exercise-01-entity-vs-dto.md) |
| 2 | Annotate Paper DTO | Validation intent on paper | [`exercise-02-annotate-paper-dto.md`](exercise-02-annotate-paper-dto.md) |
| 3 | Mapper No-Leak Rule | Safe mapping | [`exercise-03-mapper-no-leak.md`](exercise-03-mapper-no-leak.md) |
| 4 | Fill ValidatorFactory TODOs | Jakarta validation prep | [`exercise-04-fill-validatorfactory-todos.md`](exercise-04-fill-validatorfactory-todos.md) |
| 5 | Invalid Cases Catalog | Negative contract cases | [`exercise-05-invalid-cases.md`](exercise-05-invalid-cases.md) |
| 6 | Lab 14 Prep Checklist | Pre-lab self-check | [`exercise-06-lab14-prep-checklist.md`](exercise-06-lab14-prep-checklist.md) |

Keep all work separate from `examples/lab14-crm` (or the lab’s named project folder); that project begins in the full lab.
