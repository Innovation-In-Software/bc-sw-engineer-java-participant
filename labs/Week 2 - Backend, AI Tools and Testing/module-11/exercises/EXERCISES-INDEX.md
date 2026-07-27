# Module 11 — Pre-Lab Exercises

> **Start here for Module 11:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 11 — GitHub Copilot for Testing and Refactoring  
**Next:** [`../lab11/LAB-11-WINDOWS.md`](../lab11/LAB-11-WINDOWS.md) or [`../lab11/LAB-11-MACOS.md`](../lab11/LAB-11-MACOS.md) → [`../lab11/LAB-11-GUIDE.md`](../lab11/LAB-11-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 11.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 11 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Spot trivial vs meaningful asserts in AI-generated tests | Do not complete the full Lab 11 suite in this pre-lab |
| Draft an AAA template for Northstar customer status checks | Do not deep-dive Mockito (Lab 18) or full JUnit curriculum (Lab 17) |
| Plan a notifier extract refactor before Copilot rewrites | Do not claim 100% coverage from Copilot alone |
| Build an acceptance checklist of TODOs for AI test output | Do not refactor production packages outside the prep sketch |
| Name coverage gaps that Labs 17–18 will deepen later | Do not skip human review of generated assertions |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-11-exercises` | `~/java-bootcamp/examples/module-11-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-11-exercises | Out-Null
cd examples\module-11-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-11-exercises
cd examples/module-11-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | AAA Template for Status | Documentation exercise | [`exercise-01-aaa-template.md`](exercise-01-aaa-template.md) |
| 2 | Notifier Extract Plan | Architecture exercise | [`exercise-02-notifier-extract.md`](exercise-02-notifier-extract.md) |
| 3 | Trivial vs Real Asserts | Analysis exercise | [`exercise-03-trivial-vs-real-asserts.md`](exercise-03-trivial-vs-real-asserts.md) |
| 4 | Fill Acceptance Checklist TODOs | Hands-on exercise | [`exercise-04-fill-acceptance-checklist-todos.md`](exercise-04-fill-acceptance-checklist-todos.md) |
| 5 | Coverage Gaps Map | Analysis exercise | [`exercise-05-coverage-gaps.md`](exercise-05-coverage-gaps.md) |
| 6 | Lab 11 Prep Checklist | Documentation exercise | [`exercise-06-lab11-prep-checklist.md`](exercise-06-lab11-prep-checklist.md) |
