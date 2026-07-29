# Module 50 — Pre-Lab Exercises

> **Start here for Module 50:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 50 — Capstone Frontend and Persistence  
**Next:** [`../lab50/LAB-50-WINDOWS.md`](../lab50/LAB-50-WINDOWS.md) or [`../lab50/LAB-50-MACOS.md`](../lab50/LAB-50-MACOS.md) → [`../lab50/LAB-50-GUIDE.md`](../lab50/LAB-50-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 50.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-50-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 50 is the graded consolidation. Do **not** finish Lab 50 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab50-journey-map.md` | Map Agent UI Journey |
| 2 | `notes/lab50-api-client-plan.md` | Plan Typed API Client |
| 3 | `notes/lab50-persistence-sketch.md` | Sketch Persistence Changes |
| 4 | `notes/lab50-a11y-todos.md` | Fill Accessibility TODOs |
| 5 | `notes/lab50-verification-plan.md` | UI Verification Evidence Plan |
| 6 | `notes/lab50-data-flow-note.md` | Document End-to-End Data Flow |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Map the agent UI journey (search → profile → timeline → form) | Do not build the full React journey in this pre-lab |
| Plan typed API client calls and loading/error/empty states | Do not skip accessibility and empty/error states in planning |
| Sketch JPA entities/migrations needed for the journey | Do not store real customer PII in fixtures |
| List UI/component verification evidence to capture | Do not change production DB without migration discipline |
| Prepare end-to-end data-flow notes UI → API → PostgreSQL | Do not start security/CI deploy work here (Lab 51) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-50-exercises` | `~/java-bootcamp/examples/module-50-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-50-exercises\notes | Out-Null
cd examples\module-50-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-50-exercises/notes
cd examples/module-50-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 50 uses its own `examples/lab50-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Map Agent UI Journey | Architecture exercise | `notes/lab50-journey-map.md` | [`exercise-01-journey-map.md`](exercise-01-journey-map.md) |
| 2 | Plan Typed API Client | Documentation exercise | `notes/lab50-api-client-plan.md` | [`exercise-02-api-client-plan.md`](exercise-02-api-client-plan.md) |
| 3 | Sketch Persistence Changes | Analysis exercise | `notes/lab50-persistence-sketch.md` | [`exercise-03-persistence-sketch.md`](exercise-03-persistence-sketch.md) |
| 4 | Fill Accessibility TODOs | Hands-on exercise | `notes/lab50-a11y-todos.md` | [`exercise-04-a11y-todos.md`](exercise-04-a11y-todos.md) |
| 5 | UI Verification Evidence Plan | Documentation exercise | `notes/lab50-verification-plan.md` | [`exercise-05-verification-plan.md`](exercise-05-verification-plan.md) |
| 6 | Document End-to-End Data Flow | Analysis exercise | `notes/lab50-data-flow-note.md` | [`exercise-06-data-flow-note.md`](exercise-06-data-flow-note.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 50 OS guide.
