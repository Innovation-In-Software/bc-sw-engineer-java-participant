# Module 17 — Pre-Lab Exercises

> **Start here for Module 17:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 17 — JUnit Testing Fundamentals  
**Next:** [`../lab17/LAB-17-WINDOWS.md`](../lab17/LAB-17-WINDOWS.md) or [`../lab17/LAB-17-MACOS.md`](../lab17/LAB-17-MACOS.md) → [`../lab17/LAB-17-GUIDE.md`](../lab17/LAB-17-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the Module 17 slides, then start Lab 17.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 17 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Practice expressive JUnit 5 test names for CRM cases | Do not complete the full Lab 17 suite in this pre-lab |
| Design a CsvSource table for status inputs | Do not deep-dive Mockito (Lab 18) |
| Prefer meaningful asserts over assertNotNull-only | Do not treat AI-generated tests as final without review |
| Narrate a JaCoCo gate goal as TODOs | Do not skip parameterized case design |
| Plan AAA service tests without deep Mockito | Do not configure Selenium UI tests here (Lab 19) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-17-exercises` | `~/java-bootcamp/examples/module-17-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-17-exercises | Out-Null
cd examples\module-17-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-17-exercises
cd examples/module-17-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Expressive Test Names | JUnit naming | [`exercise-01-test-names.md`](exercise-01-test-names.md) |
| 2 | CsvSource Table Design | Parameterized tests | [`exercise-02-csvsource-table.md`](exercise-02-csvsource-table.md) |
| 3 | Meaningful Asserts | Assertion quality | [`exercise-03-meaningful-asserts.md`](exercise-03-meaningful-asserts.md) |
| 4 | Fill JaCoCo Gate Narrative TODOs | Coverage gate planning | [`exercise-04-fill-jacoco-gate-todos.md`](exercise-04-fill-jacoco-gate-todos.md) |
| 5 | AAA Service Tests Plan | Service test outline | [`exercise-05-aaa-service-tests-plan.md`](exercise-05-aaa-service-tests-plan.md) |
| 6 | Lab 17 Prep Checklist | Pre-lab self-check | [`exercise-06-lab17-prep-checklist.md`](exercise-06-lab17-prep-checklist.md) |

Keep all work separate from `examples/lab17-crm` (or the lab’s named project folder); that project begins in the full lab.
