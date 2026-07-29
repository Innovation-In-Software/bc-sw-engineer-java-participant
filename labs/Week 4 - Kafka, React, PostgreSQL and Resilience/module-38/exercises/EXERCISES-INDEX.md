# Module 38 — Pre-Lab Exercises

> **Start here for Module 38:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 38 — SQL and Query Performance  
**Next:** [`../lab38/LAB-38-WINDOWS.md`](../lab38/LAB-38-WINDOWS.md) or [`../lab38/LAB-38-MACOS.md`](../lab38/LAB-38-MACOS.md) → [`../lab38/LAB-38-GUIDE.md`](../lab38/LAB-38-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 38.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-38-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 38 is the graded consolidation. Do **not** finish Lab 38 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab38-perf.md` | Access Patterns |
| 2 | `notes/lab38-index-tradeoffs.md` | Index Tradeoffs |
| 3 | `notes/lab38-sql-index-todos.md` | Fill SQL/Index TODOs |
| 4 | `notes/lab38-explain-checklist.md` | EXPLAIN Checklist |
| 5 | `notes/lab38-sargability.md` | Sargability |
| 6 | `notes/lab38-prep-checklist.md` | Lab 38 Readiness |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Explain sargable vs non-sargable predicates on paper | Do not require a live Postgres session for these exercises |
| Draft indexes for customer/account lookup patterns | Do not use Oracle DBMS_XPLAN / DBMS_STATS wording as the primary path |
| Write offline EXPLAIN reading checklist (PostgreSQL) | Do not add random indexes on every column |
| Sketch pagination queries for CRM lists | Do not skip Lab 37 design fundamentals |
| Contrast baseline vs optimized SQL without running DB | Do not tune production without measuring (lab will measure later) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-38-exercises` | `~/java-bootcamp/examples/module-38-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-38-exercises\notes | Out-Null
cd examples\module-38-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-38-exercises/notes
cd examples/module-38-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 38 uses its own `examples/lab38-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Access Patterns | Analysis exercise | `notes/lab38-perf.md` | [`exercise-01-access-patterns.md`](exercise-01-access-patterns.md) |
| 2 | Index Tradeoffs | Documentation exercise | `notes/lab38-index-tradeoffs.md` | [`exercise-02-index-tradeoffs.md`](exercise-02-index-tradeoffs.md) |
| 3 | Fill SQL/Index TODOs | Hands-on exercise | `notes/lab38-sql-index-todos.md` | [`exercise-03-fill-sql-index-todos.md`](exercise-03-fill-sql-index-todos.md) |
| 4 | EXPLAIN Checklist | Documentation exercise | `notes/lab38-explain-checklist.md` | [`exercise-04-explain-checklist.md`](exercise-04-explain-checklist.md) |
| 5 | Sargability | Architecture exercise | `notes/lab38-sargability.md` | [`exercise-05-sargability.md`](exercise-05-sargability.md) |
| 6 | Lab 38 Readiness | Analysis exercise | `notes/lab38-prep-checklist.md` | [`exercise-06-lab38-readiness.md`](exercise-06-lab38-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 38 OS guide.
