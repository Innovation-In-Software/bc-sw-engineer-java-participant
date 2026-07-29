# Module 33 — Pre-Lab Exercises

> **Start here for Module 33:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 33 — React Component Development  
**Next:** [`../lab33/LAB-33-WINDOWS.md`](../lab33/LAB-33-WINDOWS.md) or [`../lab33/LAB-33-MACOS.md`](../lab33/LAB-33-MACOS.md) → [`../lab33/LAB-33-GUIDE.md`](../lab33/LAB-33-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 33.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-33-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 33 is the graded consolidation. Do **not** finish Lab 33 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab33-todos.md` | Fill Component TODOs |
| 2 | `notes/lab33-components.md` | Component Inventory |
| 3 | `notes/lab33-jsx-paper.md` | JSX on Paper |
| 4 | `notes/lab33-props-sketch.md` | Props Sketch |
| 5 | `notes/lab33-a11y-checklist.md` | A11y Checklist |
| 6 | `notes/lab33-prep-checklist.md` | Lab 33 Readiness |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Identify presentational CRM components (CustomerCard, StatusBadge) | Do not run `npm start` or Vite in this pre-lab |
| Describe props vs children for dashboard widgets | Do not wire fetch/API calls yet (Lab 35) |
| Sketch JSX structure for Amina/Ravi list rows | Do not implement auth/route guards (Lab 36) |
| Note accessibility basics (labels, button roles) | Do not manage complex form state yet (Lab 34) |
| Plan file layout under a future `crm-ui` folder | Do not connect to PostgreSQL from the browser |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-33-exercises` | `~/java-bootcamp/examples/module-33-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-33-exercises\notes | Out-Null
cd examples\module-33-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-33-exercises/notes
cd examples/module-33-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 33 uses its own `examples/lab33-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Fill Component TODOs | Hands-on exercise | `notes/lab33-todos.md` | [`exercise-01-fill-react-component-todos.md`](exercise-01-fill-react-component-todos.md) |
| 2 | Component Inventory | Analysis exercise | `notes/lab33-components.md` | [`exercise-02-component-inventory.md`](exercise-02-component-inventory.md) |
| 3 | JSX on Paper | Documentation exercise | `notes/lab33-jsx-paper.md` | [`exercise-03-jsx-paper.md`](exercise-03-jsx-paper.md) |
| 4 | Props Sketch | Architecture exercise | `notes/lab33-props-sketch.md` | [`exercise-04-props-sketch.md`](exercise-04-props-sketch.md) |
| 5 | A11y Checklist | Documentation exercise | `notes/lab33-a11y-checklist.md` | [`exercise-05-a11y-checklist.md`](exercise-05-a11y-checklist.md) |
| 6 | Lab 33 Readiness | Analysis exercise | `notes/lab33-prep-checklist.md` | [`exercise-06-lab33-readiness.md`](exercise-06-lab33-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 33 OS guide.
