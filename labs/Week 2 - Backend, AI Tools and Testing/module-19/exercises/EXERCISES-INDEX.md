# Module 19 — Pre-Lab Exercises

> **Start here for Module 19:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 19 — Integration Testing and UI Test Automation  
**Next:** [`../lab19/LAB-19-WINDOWS.md`](../lab19/LAB-19-WINDOWS.md) or [`../lab19/LAB-19-MACOS.md`](../lab19/LAB-19-MACOS.md) → [`../lab19/LAB-19-GUIDE.md`](../lab19/LAB-19-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 19.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-19-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 19 is the graded consolidation. Do **not** finish Lab 19 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab19-pyramid.md` | Test Pyramid for CRM |
| 2 | `notes/lab19-locators.md` | data-testid Locators |
| 3 | `notes/lab19-page-object.md` | Page Object Sketch |
| 4 | `notes/lab19-flake-ci.md` | Flake and CI Note |
| 5 | `notes/lab19-correlation-header-todos.md` | Lab 19 Prep Checklist |
| 6 | `notes/lab19-correlation-header-todos.md` | Fill Correlation Header TODOs |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

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
New-Item -ItemType Directory -Force -Path examples\module-19-exercises\notes | Out-Null
cd examples\module-19-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-19-exercises/notes
cd examples/module-19-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 19 uses its own `examples/lab19-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Test Pyramid for CRM | Architecture exercise | `notes/lab19-pyramid.md` | [`exercise-01-test-pyramid.md`](exercise-01-test-pyramid.md) |
| 2 | data-testid Locators | Documentation exercise | `notes/lab19-locators.md` | [`exercise-02-data-testid-locators.md`](exercise-02-data-testid-locators.md) |
| 3 | Page Object Sketch | Architecture exercise | `notes/lab19-page-object.md` | [`exercise-03-page-object.md`](exercise-03-page-object.md) |
| 4 | Flake and CI Note | Analysis exercise | `notes/lab19-flake-ci.md` | [`exercise-04-flake-ci-note.md`](exercise-04-flake-ci-note.md) |
| 5 | Lab 19 Prep Checklist | Documentation exercise | `notes/lab19-correlation-header-todos.md` | [`exercise-05-lab19-prep-checklist.md`](exercise-05-lab19-prep-checklist.md) |
| 6 | Fill Correlation Header TODOs | Hands-on exercise | `notes/lab19-correlation-header-todos.md` | [`exercise-06-fill-correlation-header-todos.md`](exercise-06-fill-correlation-header-todos.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 19 OS guide.
