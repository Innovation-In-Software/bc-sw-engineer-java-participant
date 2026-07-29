# Module 15 — Pre-Lab Exercises

> **Start here for Module 15:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 15 — Business Logic and Service Layer Design  
**Next:** [`../lab15/LAB-15-WINDOWS.md`](../lab15/LAB-15-WINDOWS.md) or [`../lab15/LAB-15-MACOS.md`](../lab15/LAB-15-MACOS.md) → [`../lab15/LAB-15-GUIDE.md`](../lab15/LAB-15-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 15.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-15-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 15 is the graded consolidation. Do **not** finish Lab 15 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab15-layers.md` | Layer Diagram |
| 2 | `notes/lab15-repo-boundary.md` | Repository Boundary |
| 3 | `notes/lab15-transition-matrix.md` | Transition Matrix |
| 4 | `notes/lab15-interface-ctor-sketch.md` | Interface and Constructor Sketch |
| 5 | `notes/lab15-activate-ravi-todos.md` | Fill Activate Ravi Pseudocode TODOs |
| 6 | `notes/lab15-prep-checklist.md` | Lab 15 Prep Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

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
New-Item -ItemType Directory -Force -Path examples\module-15-exercises\notes | Out-Null
cd examples\module-15-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-15-exercises/notes
cd examples/module-15-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 15 uses its own `examples/lab15-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Layer Diagram | Architecture exercise | `notes/lab15-layers.md` | [`exercise-01-layer-diagram.md`](exercise-01-layer-diagram.md) |
| 2 | Repository Boundary | Analysis exercise | `notes/lab15-repo-boundary.md` | [`exercise-02-repo-boundary.md`](exercise-02-repo-boundary.md) |
| 3 | Transition Matrix | Documentation exercise | `notes/lab15-transition-matrix.md` | [`exercise-03-transition-matrix.md`](exercise-03-transition-matrix.md) |
| 4 | Interface and Constructor Sketch | Architecture exercise | `notes/lab15-interface-ctor-sketch.md` | [`exercise-04-interface-ctor-sketch.md`](exercise-04-interface-ctor-sketch.md) |
| 5 | Fill Activate Ravi Pseudocode TODOs | Hands-on exercise | `notes/lab15-activate-ravi-todos.md` | [`exercise-05-fill-activate-ravi-todos.md`](exercise-05-fill-activate-ravi-todos.md) |
| 6 | Lab 15 Prep Checklist | Documentation exercise | `notes/lab15-prep-checklist.md` | [`exercise-06-lab15-prep-checklist.md`](exercise-06-lab15-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 15 OS guide.
