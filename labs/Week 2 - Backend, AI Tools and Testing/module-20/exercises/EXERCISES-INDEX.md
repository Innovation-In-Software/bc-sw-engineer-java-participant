# Module 20 — Pre-Lab Exercises

> **Start here for Module 20:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 20 — Logging Frameworks and Diagnostics  
**Next:** [`../lab20/LAB-20-WINDOWS.md`](../lab20/LAB-20-WINDOWS.md) or [`../lab20/LAB-20-MACOS.md`](../lab20/LAB-20-MACOS.md) → [`../lab20/LAB-20-GUIDE.md`](../lab20/LAB-20-GUIDE.md)

> Complete these exercises after the slides and before Lab 20.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 20 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Rewrite Unsafe Logs | Safe logging | [`exercise-01-rewrite-unsafe-logs.md`](exercise-01-rewrite-unsafe-logs.md) |
| 2 | MDC Lifecycle | Diagnostic context | [`exercise-02-mdc-lifecycle.md`](exercise-02-mdc-lifecycle.md) |
| 3 | Log Level Quiz | Level selection | [`exercise-03-level-quiz.md`](exercise-03-level-quiz.md) |
| 4 | Fill Forbidden PII Checklist TODOs | PII exclusion | [`exercise-04-fill-forbidden-pii-todos.md`](exercise-04-fill-forbidden-pii-todos.md) |
| 5 | Clear MDC Finally Drill | Context cleanup | [`exercise-05-clear-mdc-finally.md`](exercise-05-clear-mdc-finally.md) |
| 6 | Lab 20 Prep Checklist | Pre-lab self-check | [`exercise-06-lab20-prep-checklist.md`](exercise-06-lab20-prep-checklist.md) |

Keep all work separate from `examples/lab20-crm` (or the lab’s named project folder); that project begins in the full lab.
