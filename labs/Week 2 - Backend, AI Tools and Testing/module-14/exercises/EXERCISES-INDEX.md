# Module 14 — Pre-Lab Exercises

> **Start here for Module 14:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 14 — DTOs, Validation and API Contracts  
**Next:** [`../lab14/LAB-14-WINDOWS.md`](../lab14/LAB-14-WINDOWS.md) or [`../lab14/LAB-14-MACOS.md`](../lab14/LAB-14-MACOS.md) → [`../lab14/LAB-14-GUIDE.md`](../lab14/LAB-14-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 14.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-14-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 14 is the graded consolidation. Do **not** finish Lab 14 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab14-entity-vs-dto.md` | Entity vs DTO |
| 2 | `notes/lab14-mapper-no-leak.md` | Mapper No-Leak Rule |
| 3 | `notes/lab14-annotate-dto.md` | Annotate Paper DTO |
| 4 | `notes/lab14-invalid-cases.md` | Invalid Cases Catalog |
| 5 | `notes/lab14-validatorfactory-todos.md` | Fill ValidatorFactory TODOs |
| 6 | `notes/lab14-prep-checklist.md` | Lab 14 Prep Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Separate entity vs DTO responsibilities for Customer | Do not complete the full Lab 14 wiring in this pre-lab |
| Annotate a paper DTO for create/activate requests | Do not use live Spring `@Valid` controllers yet |
| Plan a mapper that does not leak persistence fields | Do not deepen full service transition rules (Lab 15) |
| Draft ValidatorFactory TODOs for invalid cases | Do not expose JPA entities as API bodies |
| List invalid payloads for Amina/Ravi-shaped requests | Do not skip documenting mapper no-leak rules |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-14-exercises` | `~/java-bootcamp/examples/module-14-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-14-exercises\notes | Out-Null
cd examples\module-14-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-14-exercises/notes
cd examples/module-14-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 14 uses its own `examples/lab14-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Entity vs DTO | Analysis exercise | `notes/lab14-entity-vs-dto.md` | [`exercise-01-entity-vs-dto.md`](exercise-01-entity-vs-dto.md) |
| 2 | Mapper No-Leak Rule | Architecture exercise | `notes/lab14-mapper-no-leak.md` | [`exercise-02-mapper-no-leak.md`](exercise-02-mapper-no-leak.md) |
| 3 | Annotate Paper DTO | Documentation exercise | `notes/lab14-annotate-dto.md` | [`exercise-03-annotate-paper-dto.md`](exercise-03-annotate-paper-dto.md) |
| 4 | Invalid Cases Catalog | Analysis exercise | `notes/lab14-invalid-cases.md` | [`exercise-04-invalid-cases.md`](exercise-04-invalid-cases.md) |
| 5 | Fill ValidatorFactory TODOs | Hands-on exercise | `notes/lab14-validatorfactory-todos.md` | [`exercise-05-fill-validatorfactory-todos.md`](exercise-05-fill-validatorfactory-todos.md) |
| 6 | Lab 14 Prep Checklist | Documentation exercise | `notes/lab14-prep-checklist.md` | [`exercise-06-lab14-prep-checklist.md`](exercise-06-lab14-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 14 OS guide.
