# Module 34 — Pre-Lab Exercises

> **Start here for Module 34:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 34 — State and Event Management  
**Next:** [`../lab34/LAB-34-WINDOWS.md`](../lab34/LAB-34-WINDOWS.md) or [`../lab34/LAB-34-MACOS.md`](../lab34/LAB-34-MACOS.md) → [`../lab34/LAB-34-GUIDE.md`](../lab34/LAB-34-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 34.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-34-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 34 is the graded consolidation. Do **not** finish Lab 34 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab34-todos.md` | Fill useState TODOs |
| 2 | `notes/lab34-event-handler-map.md` | Event Handler Map |
| 3 | `notes/lab34-controlled-form.md` | Controlled Form Sketch |
| 4 | `notes/lab34-validation-messages.md` | Validation Messages |
| 5 | `notes/lab34-state.md` | Props vs State |
| 6 | `notes/lab34-prep-checklist.md` | Lab 34 Readiness |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Distinguish props vs local useState for CRM forms | Do not run the React app in this pre-lab |
| Sketch controlled inputs for customer create/edit | Do not call the Spring API yet (Lab 35) |
| Plan validation messages for empty name/status | Do not store JWTs or implement guards (Lab 36) |
| Describe event handlers (onChange, onSubmit) on paper | Do not introduce Redux/Zustand unless the lab starter already does |
| Note lifting state for list + selected customer | Do not persist form drafts to PostgreSQL |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-34-exercises` | `~/java-bootcamp/examples/module-34-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-34-exercises\notes | Out-Null
cd examples\module-34-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-34-exercises/notes
cd examples/module-34-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 34 uses its own `examples/lab34-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Fill useState TODOs | Hands-on exercise | `notes/lab34-todos.md` | [`exercise-01-fill-usestate-todos.md`](exercise-01-fill-usestate-todos.md) |
| 2 | Event Handler Map | Documentation exercise | `notes/lab34-event-handler-map.md` | [`exercise-02-event-handler-map.md`](exercise-02-event-handler-map.md) |
| 3 | Controlled Form Sketch | Architecture exercise | `notes/lab34-controlled-form.md` | [`exercise-03-controlled-form.md`](exercise-03-controlled-form.md) |
| 4 | Validation Messages | Documentation exercise | `notes/lab34-validation-messages.md` | [`exercise-04-validation-messages.md`](exercise-04-validation-messages.md) |
| 5 | Props vs State | Analysis exercise | `notes/lab34-state.md` | [`exercise-05-props-vs-state.md`](exercise-05-props-vs-state.md) |
| 6 | Lab 34 Readiness | Analysis exercise | `notes/lab34-prep-checklist.md` | [`exercise-06-lab34-readiness.md`](exercise-06-lab34-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 34 OS guide.
