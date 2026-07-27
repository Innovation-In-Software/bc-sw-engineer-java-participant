# Module 20 — Pre-Lab Exercises

> **Start here for Module 20:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 20 — Logging Frameworks and Diagnostics  
**Next:** [`../lab20/LAB-20-WINDOWS.md`](../lab20/LAB-20-WINDOWS.md) or [`../lab20/LAB-20-MACOS.md`](../lab20/LAB-20-MACOS.md) → [`../lab20/LAB-20-GUIDE.md`](../lab20/LAB-20-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 20.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 20 builds the full graded deliverable.  
> Exercise 5 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Rewrite unsafe log lines that leak PII | Do not complete the full Lab 20 logging retrofit in this pre-lab |
| Plan MDC put/clear lifecycle around requests | Do not configure full observability metrics yet (Lab 21) |
| Take a log-level quiz for CRM events | Do not log raw payloads containing secrets |
| Build a forbidden PII checklist as TODOs | Do not leave MDC keys set across threads/requests |
| Require clear MDC in finally for lab-request-001 | Do not replace metrics with only log grepping long-term |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-20-exercises` | `~/java-bootcamp/examples/module-20-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-20-exercises | Out-Null
cd examples\module-20-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-20-exercises
cd examples/module-20-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Log Level Quiz | Analysis exercise | [`exercise-01-level-quiz.md`](exercise-01-level-quiz.md) |
| 2 | Rewrite Unsafe Logs | Analysis exercise | [`exercise-02-rewrite-unsafe-logs.md`](exercise-02-rewrite-unsafe-logs.md) |
| 3 | MDC Lifecycle | Architecture exercise | [`exercise-03-mdc-lifecycle.md`](exercise-03-mdc-lifecycle.md) |
| 4 | Clear MDC Finally Drill | Documentation exercise | [`exercise-04-clear-mdc-finally.md`](exercise-04-clear-mdc-finally.md) |
| 5 | Fill Forbidden PII Checklist TODOs | Hands-on exercise | [`exercise-05-fill-forbidden-pii-todos.md`](exercise-05-fill-forbidden-pii-todos.md) |
| 6 | Lab 20 Prep Checklist | Documentation exercise | [`exercise-06-lab20-prep-checklist.md`](exercise-06-lab20-prep-checklist.md) |
