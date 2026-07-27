# Module 15 — Pre-Lab Exercises

> **Start here for Module 15:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 15 — Business Logic and Service Layer Design  
**Next:** [`../lab15/LAB-15-WINDOWS.md`](../lab15/LAB-15-WINDOWS.md) or [`../lab15/LAB-15-MACOS.md`](../lab15/LAB-15-MACOS.md) → [`../lab15/LAB-15-GUIDE.md`](../lab15/LAB-15-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 15.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 15 builds the full graded deliverable.  
> Exercise 5 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Draw a controller/service/repository layer diagram | Do not complete the full Lab 15 implementation in this pre-lab |
| Build a status transition matrix for PROSPECT/ACTIVE | Do not implement @ControllerAdvice exception mapping (Lab 16) |
| Sketch CustomerService interface and constructor injection | Do not put transition rules inside repository adapters |
| Draft activate Ravi pseudocode TODOs | Do not host SOAP/REST frameworks beyond a sketch |
| State repository boundary (no business rules in repo) | Do not skip documenting illegal transitions |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-15-exercises` | `~/java-bootcamp/examples/module-15-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-15-exercises | Out-Null
cd examples\module-15-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-15-exercises
cd examples/module-15-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Layer Diagram | Architecture exercise | [`exercise-01-layer-diagram.md`](exercise-01-layer-diagram.md) |
| 2 | Repository Boundary | Analysis exercise | [`exercise-02-repo-boundary.md`](exercise-02-repo-boundary.md) |
| 3 | Transition Matrix | Documentation exercise | [`exercise-03-transition-matrix.md`](exercise-03-transition-matrix.md) |
| 4 | Interface and Constructor Sketch | Architecture exercise | [`exercise-04-interface-ctor-sketch.md`](exercise-04-interface-ctor-sketch.md) |
| 5 | Fill Activate Ravi Pseudocode TODOs | Hands-on exercise | [`exercise-05-fill-activate-ravi-todos.md`](exercise-05-fill-activate-ravi-todos.md) |
| 6 | Lab 15 Prep Checklist | Documentation exercise | [`exercise-06-lab15-prep-checklist.md`](exercise-06-lab15-prep-checklist.md) |
