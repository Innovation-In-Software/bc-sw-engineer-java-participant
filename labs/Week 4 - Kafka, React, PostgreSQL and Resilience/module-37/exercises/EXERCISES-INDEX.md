# Module 37 — Pre-Lab Exercises

> **Start here for Module 37:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 37 — PostgreSQL Design  
**Next:** [`../lab37/LAB-37-WINDOWS.md`](../lab37/LAB-37-WINDOWS.md) or [`../lab37/LAB-37-MACOS.md`](../lab37/LAB-37-MACOS.md) → [`../lab37/LAB-37-GUIDE.md`](../lab37/LAB-37-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the Module 37 slides, then start Lab 37.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 37 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-37-exercises | Out-Null
cd examples\module-37-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-37-exercises
cd examples/module-37-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | CRM Entities | Identify persistent entities | [`exercise-01-entities.md`](exercise-01-entities.md) |
| 2 | ER Sketch | Model relationships | [`exercise-02-er-sketch.md`](exercise-02-er-sketch.md) |
| 3 | Constraints Checklist | Choose integrity constraints | [`exercise-03-constraints.md`](exercise-03-constraints.md) |
| 4 | Fill DDL TODOs | Complete paper PostgreSQL DDL | [`exercise-04-fill-ddl-todos.md`](exercise-04-fill-ddl-todos.md) |
| 5 | Seed and Verify Plan | Plan seed/verify scripts | [`exercise-05-seed-and-verify-plan.md`](exercise-05-seed-and-verify-plan.md) |
| 6 | Lab 37 Readiness | Pre-lab self-check | [`exercise-06-lab37-readiness.md`](exercise-06-lab37-readiness.md) |

Keep all work separate from `examples/lab37-crm` (or the lab’s named project folder); that project begins in the full lab.
