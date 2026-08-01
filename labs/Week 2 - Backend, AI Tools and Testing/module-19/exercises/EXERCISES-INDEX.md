# Module 19 — Pre-Lab Exercises

> **Start here for Module 19:** [`../README.md`](../README.md) · **Pacing:** [`../PACING.md`](../PACING.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 19 — Integration Testing and UI Test Automation  
**Next:** [`../lab19/LAB-19-WINDOWS.md`](../lab19/LAB-19-WINDOWS.md) or [`../lab19/LAB-19-MACOS.md`](../lab19/LAB-19-MACOS.md) → [`../lab19/LAB-19-GUIDE.md`](../lab19/LAB-19-GUIDE.md)

> Complete these exercises **at the checkpoints** (not all slides first). Classroom order **1 → 2 → 3 → 4 → 6 → 5**.  
> Use JDK 21. Work under `examples/module-19-exercises/` — **notes files**, not the graded lab.  
> Lab 19 is the graded consolidation. Do **not** finish Lab 19 during pre-lab.

> **Tip:** Each exercise has an **Activity card**, **Worked example**, **Predict/Debug**, and **Troubleshooting**. Optional starter shells: [`starter/`](starter/README.md).

## What you produce (all exercises)

| # | Your deliverable file | Type | Checkpoint |
| - | --------------------- | ---- | ---------- |
| 1 | `notes/lab19-pyramid.md` | Test Pyramid for CRM | A |
| 2 | `notes/lab19-locators.md` | data-testid Locators | B |
| 3 | `notes/lab19-page-object.md` | Page Object Sketch | C |
| 4 | `notes/lab19-flake-ci.md` | Flake and CI Note | D |
| 6 | `notes/lab19-correlation-header-todos.md` | Fill Correlation Header TODOs | D |
| 5 | `notes/lab19-prep-checklist.md` | Lab 19 Prep Checklist (gate last) | D |

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Place unit/IT/UI on a test pyramid for Northstar | Do not complete the full Lab 19 automation in this pre-lab |
| Sketch a Page Object for a customer form/status screen | Do not add Actuator probes here (Lab 21) |
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

**Expected:** Java 21 is available. You create markdown notes here; Lab 19 uses `examples/lab19-crm/`.

## Exercise index (classroom interleave)

| # | After slides | Exercise | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | 220–225 (A) | Test Pyramid for CRM | `notes/lab19-pyramid.md` | [`exercise-01-test-pyramid.md`](exercise-01-test-pyramid.md) |
| 2 | 226–229 (B) | data-testid Locators | `notes/lab19-locators.md` | [`exercise-02-data-testid-locators.md`](exercise-02-data-testid-locators.md) |
| 3 | 230–231 (C) | Page Object Sketch | `notes/lab19-page-object.md` | [`exercise-03-page-object.md`](exercise-03-page-object.md) |
| 4 | 232 (D) | Flake and CI Note | `notes/lab19-flake-ci.md` | [`exercise-04-flake-ci-note.md`](exercise-04-flake-ci-note.md) |
| 6 | 232 (D) | Fill Correlation Header TODOs | `notes/lab19-correlation-header-todos.md` | [`exercise-06-fill-correlation-header-todos.md`](exercise-06-fill-correlation-header-todos.md) |
| 5 | 232 (D) | Lab 19 Prep Checklist | `notes/lab19-prep-checklist.md` | [`exercise-05-lab19-prep-checklist.md`](exercise-05-lab19-prep-checklist.md) |

**Classroom practice order:** **1 → 2 → 3 → 4 → 6 → 5**

## Done when

All notes files in **What you produce** exist (including correlation TODOs), fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep checklist self-mark is **Pass**. Then open the Lab 19 OS guide.
