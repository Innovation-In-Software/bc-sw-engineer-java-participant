# Module 37 — Pre-Lab Exercises

> **Start here for Module 37:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 37 — PostgreSQL Design  
**Next:** [`../lab37/LAB-37-WINDOWS.md`](../lab37/LAB-37-WINDOWS.md) or [`../lab37/LAB-37-MACOS.md`](../lab37/LAB-37-MACOS.md) → [`../lab37/LAB-37-GUIDE.md`](../lab37/LAB-37-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 37.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-37-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 37 is the graded consolidation. Do **not** finish Lab 37 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab37-design.md` | CRM Entities |
| 2 | `notes/lab37-er-sketch.md` | ER Sketch |
| 3 | `notes/lab37-constraints.md` | Constraints Checklist |
| 4 | `notes/lab37-ddl-todos.md` | Fill DDL TODOs |
| 5 | `notes/lab37-seed-and-verify-plan.md` | Seed and Verify Plan |
| 6 | `notes/lab37-prep-checklist.md` | Lab 37 Readiness |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Design customers and accounts tables for Northstar CRM | Do not start Docker Postgres or run migrations yet |
| Choose primary keys, FKs, and unique constraints on paper | Do not add JPA entities yet (Lab 39) |
| Sketch ER relationships and seed rows for Amina/Ravi | Do not tune indexes for EXPLAIN yet (Lab 38) |
| Write offline DDL drafts (CREATE TABLE) without running psql | Do not store passwords in plaintext columns |
| Document naming and NOT NULL rules | Do not use Oracle-only types (NUMBER, CASCADE CONSTRAINTS PURGE) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-37-exercises` | `~/java-bootcamp/examples/module-37-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-37-exercises\notes | Out-Null
cd examples\module-37-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-37-exercises/notes
cd examples/module-37-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 37 uses its own `examples/lab37-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | CRM Entities | Analysis exercise | `notes/lab37-design.md` | [`exercise-01-entities.md`](exercise-01-entities.md) |
| 2 | ER Sketch | Architecture exercise | `notes/lab37-er-sketch.md` | [`exercise-02-er-sketch.md`](exercise-02-er-sketch.md) |
| 3 | Constraints Checklist | Documentation exercise | `notes/lab37-constraints.md` | [`exercise-03-constraints.md`](exercise-03-constraints.md) |
| 4 | Fill DDL TODOs | Hands-on exercise | `notes/lab37-ddl-todos.md` | [`exercise-04-fill-ddl-todos.md`](exercise-04-fill-ddl-todos.md) |
| 5 | Seed and Verify Plan | Documentation exercise | `notes/lab37-seed-and-verify-plan.md` | [`exercise-05-seed-and-verify-plan.md`](exercise-05-seed-and-verify-plan.md) |
| 6 | Lab 37 Readiness | Analysis exercise | `notes/lab37-prep-checklist.md` | [`exercise-06-lab37-readiness.md`](exercise-06-lab37-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 37 OS guide.
