# Module 12 — Pre-Lab Exercises

> **Start here for Module 12:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 12 — Java Coding Standards and Best Practices  
**Next:** [`../lab12/LAB-12-WINDOWS.md`](../lab12/LAB-12-WINDOWS.md) or [`../lab12/LAB-12-MACOS.md`](../lab12/LAB-12-MACOS.md) → [`../lab12/LAB-12-GUIDE.md`](../lab12/LAB-12-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 12.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 12 builds the full graded deliverable.  
> Exercise 5 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-12-exercises | Out-Null
cd examples\module-12-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-12-exercises
cd examples/module-12-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Target API Sketch | Architecture exercise | [`exercise-01-target-api-sketch.md`](exercise-01-target-api-sketch.md) |
| 2 | SOLID Apply vs Defer | Documentation exercise | [`exercise-02-solid-apply-defer.md`](exercise-02-solid-apply-defer.md) |
| 3 | Smell Bingo | Analysis exercise | [`exercise-03-smell-bingo.md`](exercise-03-smell-bingo.md) |
| 4 | Equals vs == | Analysis exercise | [`exercise-04-equals-vs-eqeq.md`](exercise-04-equals-vs-eqeq.md) |
| 5 | Fill Correlation One-Liner TODOs | Hands-on exercise | [`exercise-05-fill-correlation-oneliner-todos.md`](exercise-05-fill-correlation-oneliner-todos.md) |
| 6 | Lab 12 Prep Checklist | Documentation exercise | [`exercise-06-lab12-prep-checklist.md`](exercise-06-lab12-prep-checklist.md) |
