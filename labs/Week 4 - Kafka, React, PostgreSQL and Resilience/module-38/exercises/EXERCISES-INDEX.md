# Module 38 — Pre-Lab Exercises

> **Start here for Module 38:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 38 — SQL and Query Performance  
**Next:** [`../lab38/LAB-38-WINDOWS.md`](../lab38/LAB-38-WINDOWS.md) or [`../lab38/LAB-38-MACOS.md`](../lab38/LAB-38-MACOS.md) → [`../lab38/LAB-38-GUIDE.md`](../lab38/LAB-38-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 38.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 38 builds the full graded deliverable.  
> Exercise 3 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-38-exercises | Out-Null
cd examples\module-38-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-38-exercises
cd examples/module-38-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Access Patterns | Name CRM query patterns | [`exercise-01-access-patterns.md`](exercise-01-access-patterns.md) |
| 2 | Index Tradeoffs | Weigh write vs read cost | [`exercise-02-index-tradeoffs.md`](exercise-02-index-tradeoffs.md) |
| 3 | Fill SQL/Index TODOs | Complete paper SQL optimizations | [`exercise-03-fill-sql-index-todos.md`](exercise-03-fill-sql-index-todos.md) |
| 4 | EXPLAIN Checklist | Read plans offline | [`exercise-04-explain-checklist.md`](exercise-04-explain-checklist.md) |
| 5 | Sargability | Spot index-friendly predicates | [`exercise-05-sargability.md`](exercise-05-sargability.md) |
| 6 | Lab 38 Readiness | Pre-lab self-check | [`exercise-06-lab38-readiness.md`](exercise-06-lab38-readiness.md) |
