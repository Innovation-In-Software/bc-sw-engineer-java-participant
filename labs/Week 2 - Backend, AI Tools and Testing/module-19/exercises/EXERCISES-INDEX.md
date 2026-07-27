# Module 19 — Pre-Lab Exercises

> **Start here for Module 19:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 19 — Integration Testing and UI Test Automation  
**Next:** [`../lab19/LAB-19-WINDOWS.md`](../lab19/LAB-19-WINDOWS.md) or [`../lab19/LAB-19-MACOS.md`](../lab19/LAB-19-MACOS.md) → [`../lab19/LAB-19-GUIDE.md`](../lab19/LAB-19-GUIDE.md)

> Complete these exercises after the slides and before Lab 19.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 19 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Place unit/IT/UI on a test pyramid for Northstar | Do not complete the full Lab 19 automation in this pre-lab |
| Sketch a Page Object for a customer status screen | Do not add Actuator probes here (Lab 21) |
| Prefer data-testid locators over brittle CSS | Do not rely on absolute XPaths as the primary strategy |
| Draft correlation header TODOs for IT calls | Do not replace unit tests with only UI tests |
| Note flake and CI constraints before running browsers | Do not ignore flake notes for CI agents |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-19-exercises` | `~/java-bootcamp/examples/module-19-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-19-exercises | Out-Null
cd examples\module-19-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-19-exercises
cd examples/module-19-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Test Pyramid for CRM | Test strategy | [`exercise-01-test-pyramid.md`](exercise-01-test-pyramid.md) |
| 2 | Page Object Sketch | Selenium structure | [`exercise-02-page-object.md`](exercise-02-page-object.md) |
| 3 | data-testid Locators | Stable selectors | [`exercise-03-data-testid-locators.md`](exercise-03-data-testid-locators.md) |
| 4 | Fill Correlation Header TODOs | IT header hygiene | [`exercise-04-fill-correlation-header-todos.md`](exercise-04-fill-correlation-header-todos.md) |
| 5 | Flake and CI Note | Automation realism | [`exercise-05-flake-ci-note.md`](exercise-05-flake-ci-note.md) |
| 6 | Lab 19 Prep Checklist | Pre-lab self-check | [`exercise-06-lab19-prep-checklist.md`](exercise-06-lab19-prep-checklist.md) |

Keep all work separate from `examples/lab19-crm` (or the lab’s named project folder); that project begins in the full lab.
