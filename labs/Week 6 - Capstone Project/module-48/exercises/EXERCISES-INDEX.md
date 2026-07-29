# Module 48 — Pre-Lab Exercises

> **Start here for Module 48:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 48 — Capstone Planning and Architecture  
**Next:** [`../lab48/LAB-48-WINDOWS.md`](../lab48/LAB-48-WINDOWS.md) or [`../lab48/LAB-48-MACOS.md`](../lab48/LAB-48-MACOS.md) → [`../lab48/LAB-48-GUIDE.md`](../lab48/LAB-48-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 48.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-48-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 48 is the graded consolidation. Do **not** finish Lab 48 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab48-context-sketch.md` | Sketch Context Diagram |
| 2 | `notes/lab48-nfr-placeholders.md` | Draft Measurable NFRs |
| 3 | `notes/lab48-backlog-slice.md` | Sketch Vertical Stories |
| 4 | `notes/lab48-adr-todos.md` | Fill ADR Topic TODOs |
| 5 | `notes/lab48-risk-register.md` | Outline Risk Register |
| 6 | `notes/lab48-docs-checklist.md` | Planning Docs Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Outline context and container diagrams for the CRM platform | Do not implement Spring/React features in this pre-lab |
| Draft measurable NFR placeholders with evidence ideas | Do not skip measurable NFRs in favor of vague adjectives |
| Sketch vertical backlog stories with acceptance criteria | Do not treat planning docs as optional for later labs |
| List ADR topics and risk-register columns | Do not commit secrets while drafting architecture notes |
| Prepare docs/ folder checklist for Lab 48 | Do not redo Weeks 1–5 labs instead of planning the capstone |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-48-exercises` | `~/java-bootcamp/examples/module-48-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-48-exercises\notes | Out-Null
cd examples\module-48-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-48-exercises/notes
cd examples/module-48-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 48 uses its own `examples/lab48-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Sketch Context Diagram | Architecture exercise | `notes/lab48-context-sketch.md` | [`exercise-01-context-sketch.md`](exercise-01-context-sketch.md) |
| 2 | Draft Measurable NFRs | Documentation exercise | `notes/lab48-nfr-placeholders.md` | [`exercise-02-nfr-placeholders.md`](exercise-02-nfr-placeholders.md) |
| 3 | Sketch Vertical Stories | Analysis exercise | `notes/lab48-backlog-slice.md` | [`exercise-03-backlog-slice.md`](exercise-03-backlog-slice.md) |
| 4 | Fill ADR Topic TODOs | Hands-on exercise | `notes/lab48-adr-todos.md` | [`exercise-04-adr-todos.md`](exercise-04-adr-todos.md) |
| 5 | Outline Risk Register | Documentation exercise | `notes/lab48-risk-register.md` | [`exercise-05-risk-register.md`](exercise-05-risk-register.md) |
| 6 | Planning Docs Checklist | Analysis exercise | `notes/lab48-docs-checklist.md` | [`exercise-06-docs-checklist.md`](exercise-06-docs-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 48 OS guide.
