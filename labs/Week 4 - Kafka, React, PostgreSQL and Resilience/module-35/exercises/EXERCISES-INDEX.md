# Module 35 — Pre-Lab Exercises

> **Start here for Module 35:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 35 — Frontend and API Integration  
**Next:** [`../lab35/LAB-35-WINDOWS.md`](../lab35/LAB-35-WINDOWS.md) or [`../lab35/LAB-35-MACOS.md`](../lab35/LAB-35-MACOS.md) → [`../lab35/LAB-35-GUIDE.md`](../lab35/LAB-35-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 35.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 35 builds the full graded deliverable.  
> Exercise 5 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Map CRM UI actions to Spring REST endpoints on paper | Do not run Spring Boot or Vite for this pre-lab |
| Sketch typed fetch helpers and error handling | Do not implement JWT login UI yet (Lab 36) |
| Plan AbortController / loading / empty states | Do not write JPA repositories (Lab 39) |
| Note CORS origin expectations for local Vite ↔ Spring | Do not call Kafka from the browser |
| Document request correlation header for lab-request-001 | Do not disable CORS with wildcard * in production notes |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-35-exercises` | `~/java-bootcamp/examples/module-35-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-35-exercises | Out-Null
cd examples\module-35-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-35-exercises
cd examples/module-35-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Error UX Copy | Write API error UX | [`exercise-01-error-ux.md`](exercise-01-error-ux.md) |
| 2 | Fetch Flow | Design async UI states | [`exercise-02-fetch-flow.md`](exercise-02-fetch-flow.md) |
| 3 | CORS and Headers | Plan browser↔API concerns | [`exercise-03-cors-and-headers.md`](exercise-03-cors-and-headers.md) |
| 4 | Endpoint Map | Map UI to REST | [`exercise-04-endpoint-map.md`](exercise-04-endpoint-map.md) |
| 5 | Fill Fetch TODOs | Complete typed fetch blanks | [`exercise-05-fill-fetch-todos.md`](exercise-05-fill-fetch-todos.md) |
| 6 | Lab 35 Readiness | Pre-lab self-check | [`exercise-06-lab35-readiness.md`](exercise-06-lab35-readiness.md) |
