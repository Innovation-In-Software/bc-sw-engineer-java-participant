# Module 19 — Pre-Lab Exercises

> **Start here for Module 19:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 19 — Integration Testing and UI Test Automation  
**Next:** [`../lab19/LAB-19-WINDOWS.md`](../lab19/LAB-19-WINDOWS.md) or [`../lab19/LAB-19-MACOS.md`](../lab19/LAB-19-MACOS.md) → [`../lab19/LAB-19-GUIDE.md`](../lab19/LAB-19-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 19.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 19 builds the full graded deliverable.  
> Exercise 6 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Test Pyramid for CRM | Architecture exercise | [`exercise-01-test-pyramid.md`](exercise-01-test-pyramid.md) |
| 2 | data-testid Locators | Documentation exercise | [`exercise-02-data-testid-locators.md`](exercise-02-data-testid-locators.md) |
| 3 | Page Object Sketch | Architecture exercise | [`exercise-03-page-object.md`](exercise-03-page-object.md) |
| 4 | Flake and CI Note | Analysis exercise | [`exercise-04-flake-ci-note.md`](exercise-04-flake-ci-note.md) |
| 5 | Lab 19 Prep Checklist | Documentation exercise | [`exercise-05-lab19-prep-checklist.md`](exercise-05-lab19-prep-checklist.md) |
| 6 | Fill Correlation Header TODOs | Hands-on exercise | [`exercise-06-fill-correlation-header-todos.md`](exercise-06-fill-correlation-header-todos.md) |
