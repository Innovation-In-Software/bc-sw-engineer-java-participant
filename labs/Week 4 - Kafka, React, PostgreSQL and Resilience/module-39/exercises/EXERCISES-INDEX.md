# Module 39 — Pre-Lab Exercises

> **Start here for Module 39:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 39 — Spring Data JPA and PostgreSQL  
**Next:** [`../lab39/LAB-39-WINDOWS.md`](../lab39/LAB-39-WINDOWS.md) or [`../lab39/LAB-39-MACOS.md`](../lab39/LAB-39-MACOS.md) → [`../lab39/LAB-39-GUIDE.md`](../lab39/LAB-39-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 39.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-39-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 39 is the graded consolidation. Do **not** finish Lab 39 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab39-jpa.md` | Entity Mapping |
| 2 | `notes/lab39-repository-sketch.md` | Repository Sketch |
| 3 | `notes/lab39-todos.md` | Fill JPA TODOs |
| 4 | `notes/lab39-paging-locking.md` | Paging and Locking Notes |
| 5 | `notes/lab39-flyway-plan.md` | Flyway Plan |
| 6 | `notes/lab39-prep-checklist.md` | Lab 39 Readiness |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Map customer/account tables to JPA entity fields on paper | Do not run Spring Boot, Flyway, or Testcontainers in this pre-lab |
| Plan Flyway versioned migrations for CRM schema | Do not use `ddl-auto=create` as the long-term strategy |
| Sketch repository method names for Amina/Ravi lookups | Do not bypass repositories with string-concatenated SQL in services |
| Note paging and optimistic locking fields (@Version) | Do not expose entities directly as public API DTOs without thought |
| Align Spring datasource config names without starting the app | Do not store secrets in application.yml committed to git |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-39-exercises` | `~/java-bootcamp/examples/module-39-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-39-exercises\notes | Out-Null
cd examples\module-39-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-39-exercises/notes
cd examples/module-39-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 39 uses its own `examples/lab39-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Entity Mapping | Analysis exercise | `notes/lab39-jpa.md` | [`exercise-01-entity-mapping.md`](exercise-01-entity-mapping.md) |
| 2 | Repository Sketch | Documentation exercise | `notes/lab39-repository-sketch.md` | [`exercise-02-repository-sketch.md`](exercise-02-repository-sketch.md) |
| 3 | Fill JPA TODOs | Hands-on exercise | `notes/lab39-todos.md` | [`exercise-03-fill-jpa-todos.md`](exercise-03-fill-jpa-todos.md) |
| 4 | Paging and Locking Notes | Documentation exercise | `notes/lab39-paging-locking.md` | [`exercise-04-paging-locking.md`](exercise-04-paging-locking.md) |
| 5 | Flyway Plan | Architecture exercise | `notes/lab39-flyway-plan.md` | [`exercise-05-flyway-plan.md`](exercise-05-flyway-plan.md) |
| 6 | Lab 39 Readiness | Analysis exercise | `notes/lab39-prep-checklist.md` | [`exercise-06-lab39-readiness.md`](exercise-06-lab39-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 39 OS guide.
