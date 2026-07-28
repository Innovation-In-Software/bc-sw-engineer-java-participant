# Module 36 — Pre-Lab Exercises

> **Start here for Module 36:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 36 — Frontend Security  
**Next:** [`../lab36/LAB-36-WINDOWS.md`](../lab36/LAB-36-WINDOWS.md) or [`../lab36/LAB-36-MACOS.md`](../lab36/LAB-36-MACOS.md) → [`../lab36/LAB-36-GUIDE.md`](../lab36/LAB-36-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 36.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 36 builds the full graded deliverable.  
> Exercise 5 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Identify XSS risks in CRM UI rendering | Do not run the SPA or IdP login flows in this pre-lab |
| Plan token storage tradeoffs (memory vs localStorage) | Do not hardcode real secrets or production tokens |
| Sketch route-guard logic for authenticated pages | Do not disable browser security for convenience |
| Note CSRF and CSP ideas for the SPA | Do not implement full OAuth/OIDC provider setup here |
| Document what never belongs in frontend code | Do not skip backend authorization (UI guards are not enough) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-36-exercises` | `~/java-bootcamp/examples/module-36-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-36-exercises | Out-Null
cd examples\module-36-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-36-exercises
cd examples/module-36-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Threat Sketch | Spot SPA security risks | [`exercise-01-threat-sketch.md`](exercise-01-threat-sketch.md) |
| 2 | Token Storage Options | Compare storage choices | [`exercise-02-token-storage.md`](exercise-02-token-storage.md) |
| 3 | XSS and CSP Notes | Prevent unsafe HTML | [`exercise-03-xss-csp.md`](exercise-03-xss-csp.md) |
| 4 | CSRF Notes | Document CSRF relevance | [`exercise-04-csrf-notes.md`](exercise-04-csrf-notes.md) |
| 5 | Fill Route Guard TODOs | Complete guard pseudocode | [`exercise-05-fill-guard-todos.md`](exercise-05-fill-guard-todos.md) |
| 6 | Lab 36 Readiness | Pre-lab self-check | [`exercise-06-lab36-readiness.md`](exercise-06-lab36-readiness.md) |
