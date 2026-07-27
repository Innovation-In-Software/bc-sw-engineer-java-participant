# Module 16 — Pre-Lab Exercises

> **Start here for Module 16:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 16 — Exception Handling in Distributed APIs  
**Next:** [`../lab16/LAB-16-WINDOWS.md`](../lab16/LAB-16-WINDOWS.md) or [`../lab16/LAB-16-MACOS.md`](../lab16/LAB-16-MACOS.md) → [`../lab16/LAB-16-GUIDE.md`](../lab16/LAB-16-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 16.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 16 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Map domain failures to HTTP/SOAP status ideas | Do not complete the full Lab 16 implementation in this pre-lab |
| Draft ErrorResponse JSON for not-found and conflict | Do not wire live `@ControllerAdvice` in a running app yet |
| Order catch blocks from specific to general | Do not return raw exception messages with PII |
| Write message hygiene TODOs (no stack traces to clients) | Do not skip correlation on error paths |
| Require correlation id on every error response sketch | Do not deepen logging frameworks (Lab 20) beyond error shape |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-16-exercises` | `~/java-bootcamp/examples/module-16-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-16-exercises | Out-Null
cd examples\module-16-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-16-exercises
cd examples/module-16-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Catch Order | Architecture exercise | [`exercise-01-catch-order.md`](exercise-01-catch-order.md) |
| 2 | ErrorResponse JSON Draft | Documentation exercise | [`exercise-02-errorresponse-json.md`](exercise-02-errorresponse-json.md) |
| 3 | Failure to Status Map | Analysis exercise | [`exercise-03-failure-status-map.md`](exercise-03-failure-status-map.md) |
| 4 | Fill Message Hygiene TODOs | Hands-on exercise | [`exercise-04-fill-message-hygiene-todos.md`](exercise-04-fill-message-hygiene-todos.md) |
| 5 | Correlation on Every Error | Documentation exercise | [`exercise-05-correlation-always.md`](exercise-05-correlation-always.md) |
| 6 | Lab 16 Prep Checklist | Documentation exercise | [`exercise-06-lab16-prep-checklist.md`](exercise-06-lab16-prep-checklist.md) |
