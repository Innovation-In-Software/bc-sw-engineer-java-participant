# Module 49 — Pre-Lab Exercises

> **Start here for Module 49:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 49 — Capstone Backend and Messaging  
**Next:** [`../lab49/LAB-49-WINDOWS.md`](../lab49/LAB-49-WINDOWS.md) or [`../lab49/LAB-49-MACOS.md`](../lab49/LAB-49-MACOS.md) → [`../lab49/LAB-49-GUIDE.md`](../lab49/LAB-49-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 49.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-49-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 49 is the graded consolidation. Do **not** finish Lab 49 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab49-slice-selection.md` | Select Backend Vertical Slice |
| 2 | `notes/lab49-layer-checklist.md` | Controller-Service-Repository Checklist |
| 3 | `notes/lab49-event-contract.md` | Sketch Event Contract |
| 4 | `notes/lab49-test-matrix-todos.md` | Fill Test Matrix TODOs |
| 5 | `notes/lab49-backend-demo-outline.md` | Outline Backend Demo Notes |
| 6 | `notes/lab49-definition-of-done.md` | Backend Slice DoD |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Choose one vertical API slice for the CRM backend | Do not implement the full Lab 49 vertical slice in this warmup |
| Plan DTO validation and transaction boundaries | Do not skip failure-path tests in your plan |
| Sketch versioned Kafka event contract fields | Do not publish unversioned event payloads as “done” |
| List happy-path and failure-path tests to write later | Do not weaken validation to make demos green |
| Outline `docs/backend-demo.md` reproduction notes | Do not start React UI work here (Lab 50) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-49-exercises` | `~/java-bootcamp/examples/module-49-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-49-exercises\notes | Out-Null
cd examples\module-49-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-49-exercises/notes
cd examples/module-49-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 49 uses its own `examples/lab49-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Select Backend Vertical Slice | Architecture exercise | `notes/lab49-slice-selection.md` | [`exercise-01-slice-selection.md`](exercise-01-slice-selection.md) |
| 2 | Controller-Service-Repository Checklist | Documentation exercise | `notes/lab49-layer-checklist.md` | [`exercise-02-layer-checklist.md`](exercise-02-layer-checklist.md) |
| 3 | Sketch Event Contract | Analysis exercise | `notes/lab49-event-contract.md` | [`exercise-03-event-contract.md`](exercise-03-event-contract.md) |
| 4 | Fill Test Matrix TODOs | Hands-on exercise | `notes/lab49-test-matrix-todos.md` | [`exercise-04-test-matrix-todos.md`](exercise-04-test-matrix-todos.md) |
| 5 | Outline Backend Demo Notes | Documentation exercise | `notes/lab49-backend-demo-outline.md` | [`exercise-05-backend-demo-outline.md`](exercise-05-backend-demo-outline.md) |
| 6 | Backend Slice DoD | Analysis exercise | `notes/lab49-definition-of-done.md` | [`exercise-06-definition-of-done.md`](exercise-06-definition-of-done.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 49 OS guide.
