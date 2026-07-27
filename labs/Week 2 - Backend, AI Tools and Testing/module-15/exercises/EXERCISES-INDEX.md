# Module 15 — Pre-Lab Exercises

> **Start here for Module 15:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 15 — Business Logic and Service Layer Design  
**Next:** [`../lab15/LAB-15-WINDOWS.md`](../lab15/LAB-15-WINDOWS.md) or [`../lab15/LAB-15-MACOS.md`](../lab15/LAB-15-MACOS.md) → [`../lab15/LAB-15-GUIDE.md`](../lab15/LAB-15-GUIDE.md)

> Complete these exercises after the slides and before Lab 15.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 15 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Layer Diagram | Layering | [`exercise-01-layer-diagram.md`](exercise-01-layer-diagram.md) |
| 2 | Transition Matrix | Status rules | [`exercise-02-transition-matrix.md`](exercise-02-transition-matrix.md) |
| 3 | Interface and Constructor Sketch | Service API design | [`exercise-03-interface-ctor-sketch.md`](exercise-03-interface-ctor-sketch.md) |
| 4 | Fill Activate Ravi Pseudocode TODOs | Service algorithm | [`exercise-04-fill-activate-ravi-todos.md`](exercise-04-fill-activate-ravi-todos.md) |
| 5 | Repository Boundary | Persistence vs domain | [`exercise-05-repo-boundary.md`](exercise-05-repo-boundary.md) |
| 6 | Lab 15 Prep Checklist | Pre-lab self-check | [`exercise-06-lab15-prep-checklist.md`](exercise-06-lab15-prep-checklist.md) |

Keep all work separate from `examples/lab15-crm` (or the lab’s named project folder); that project begins in the full lab.
