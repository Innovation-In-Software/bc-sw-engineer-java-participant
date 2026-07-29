# Module 12 — Pre-Lab Exercises

> **Start here for Module 12:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 12 — Java Coding Standards and Best Practices  
**Next:** [`../lab12/LAB-12-WINDOWS.md`](../lab12/LAB-12-WINDOWS.md) or [`../lab12/LAB-12-MACOS.md`](../lab12/LAB-12-MACOS.md) → [`../lab12/LAB-12-GUIDE.md`](../lab12/LAB-12-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 12.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-12-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 12 is the graded consolidation. Do **not** finish Lab 12 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab12-target-api-sketch.md` | Target API Sketch |
| 2 | `notes/lab12-solid-scope.md` | SOLID Apply vs Defer |
| 3 | `notes/lab12-smell-bingo.md` | Smell Bingo |
| 4 | `notes/lab12-equals-vs-eqeq.md` | Equals vs == |
| 5 | `notes/lab12-correlation-todos.md` | Fill Correlation One-Liner TODOs |
| 6 | `notes/lab12-prep-checklist.md` | Lab 12 Prep Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Play smell bingo on a Northstar Customer snippet | Do not complete the full Lab 12 refactor in this pre-lab |
| Contrast equals vs == for status and id checks | Do not introduce SOAP contracts yet (Lab 13) |
| Sketch a small target API before refactoring | Do not add Spring Boot hosting or @ControllerAdvice |
| Draft correlation one-liner TODOs for lab-request-001 | Do not rewrite the entire CRM codebase |
| Decide which SOLID ideas to apply now vs defer | Do not skip documenting deferred SOLID items |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-12-exercises` | `~/java-bootcamp/examples/module-12-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-12-exercises\notes | Out-Null
cd examples\module-12-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-12-exercises/notes
cd examples/module-12-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 12 uses its own `examples/lab12-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Target API Sketch | Architecture exercise | `notes/lab12-target-api-sketch.md` | [`exercise-01-target-api-sketch.md`](exercise-01-target-api-sketch.md) |
| 2 | SOLID Apply vs Defer | Documentation exercise | `notes/lab12-solid-scope.md` | [`exercise-02-solid-apply-defer.md`](exercise-02-solid-apply-defer.md) |
| 3 | Smell Bingo | Analysis exercise | `notes/lab12-smell-bingo.md` | [`exercise-03-smell-bingo.md`](exercise-03-smell-bingo.md) |
| 4 | Equals vs == | Analysis exercise | `notes/lab12-equals-vs-eqeq.md` | [`exercise-04-equals-vs-eqeq.md`](exercise-04-equals-vs-eqeq.md) |
| 5 | Fill Correlation One-Liner TODOs | Hands-on exercise | `notes/lab12-correlation-todos.md` | [`exercise-05-fill-correlation-oneliner-todos.md`](exercise-05-fill-correlation-oneliner-todos.md) |
| 6 | Lab 12 Prep Checklist | Documentation exercise | `notes/lab12-prep-checklist.md` | [`exercise-06-lab12-prep-checklist.md`](exercise-06-lab12-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 12 OS guide.
