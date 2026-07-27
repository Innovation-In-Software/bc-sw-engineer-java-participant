# Module 10 — Pre-Lab Exercises

> **Start here for Module 10:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 10 — GitHub Copilot Fundamentals for Java Developers  
**Next:** [`../lab10/LAB-10-WINDOWS.md`](../lab10/LAB-10-WINDOWS.md) or [`../lab10/LAB-10-MACOS.md`](../lab10/LAB-10-MACOS.md) → [`../lab10/LAB-10-GUIDE.md`](../lab10/LAB-10-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 10.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 10 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Compare weak vs strong Copilot prompts for Northstar CRM sketches | Do not complete the full Lab 10 deliverable in this pre-lab |
| Spot phantom annotations and invented APIs in AI suggestions | Do not invent Spring Boot SOAP hosting (Labs 13/24) |
| Draft a Customer sketch for CUS-1001 Amina Khan on paper | Do not generate full JUnit suites yet (Labs 11, 17–18) |
| Plan review-log TODOs before accepting any Copilot hunk | Do not paste secrets or production PII into prompts |
| Confirm JDK 21 and Maven habits for the upcoming lab workspace | Do not skip human review of every accepted suggestion |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-10-exercises` | `~/java-bootcamp/examples/module-10-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-10-exercises | Out-Null
cd examples\module-10-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-10-exercises
cd examples/module-10-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Weak vs Strong Prompts | Analysis exercise | [`exercise-01-weak-vs-strong-prompts.md`](exercise-01-weak-vs-strong-prompts.md) |
| 2 | Customer Sketch for Amina | Architecture exercise | [`exercise-02-customer-sketch.md`](exercise-02-customer-sketch.md) |
| 3 | Phantom Annotation Hunt | Analysis exercise | [`exercise-03-phantom-annotation-hunt.md`](exercise-03-phantom-annotation-hunt.md) |
| 4 | Fill Review-Log TODOs | Hands-on exercise | [`exercise-04-fill-review-log-todos.md`](exercise-04-fill-review-log-todos.md) |
| 5 | JDK 21 / Maven Habit | Documentation exercise | [`exercise-05-jdk-maven-habit.md`](exercise-05-jdk-maven-habit.md) |
| 6 | Lab 10 Prep Checklist | Documentation exercise | [`exercise-06-lab10-prep-checklist.md`](exercise-06-lab10-prep-checklist.md) |
