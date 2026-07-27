# Module 49 — Pre-Lab Exercises

> **Start here for Module 49:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 49 — Capstone Backend and Messaging  
**Next:** [`../lab49/LAB-49-WINDOWS.md`](../lab49/LAB-49-WINDOWS.md) or [`../lab49/LAB-49-MACOS.md`](../lab49/LAB-49-MACOS.md) → [`../lab49/LAB-49-GUIDE.md`](../lab49/LAB-49-GUIDE.md)

> Complete these exercises after the slides and before Lab 49.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 49 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Choose one vertical API slice for the CRM backend | Do not implement the full Lab 49 vertical slice in this warmup |
| Plan DTO validation and transaction boundaries | Do not skip failure-path tests in your plan |
| Sketch versioned Kafka event contract fields | Do not publish unversioned event payloads as “done” |
| List happy-path and failure-path tests to write later | Do not weaken validation to make demos green |
| Outline `docs/backend-demo.md` reproduction notes | Do not start React UI work here (Lab 50) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-49-exercises` | `~/java-bootcamp/examples/module-49-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-49-exercises | Out-Null
cd examples\module-49-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-49-exercises
cd examples/module-49-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Select Backend Vertical Slice | Scope control | [`exercise-01-slice-selection.md`](exercise-01-slice-selection.md) |
| 2 | Controller-Service-Repository Checklist | Layering discipline | [`exercise-02-layer-checklist.md`](exercise-02-layer-checklist.md) |
| 3 | Sketch Event Contract | Messaging contract design | [`exercise-03-event-contract.md`](exercise-03-event-contract.md) |
| 4 | Fill Test Matrix TODOs | Hands-on test planning | [`exercise-04-test-matrix-todos.md`](exercise-04-test-matrix-todos.md) |
| 5 | Outline Backend Demo Notes | Reproduction documentation | [`exercise-05-backend-demo-outline.md`](exercise-05-backend-demo-outline.md) |
| 6 | Backend Slice DoD | Evidence gate | [`exercise-06-definition-of-done.md`](exercise-06-definition-of-done.md) |

Keep all work separate from `examples/lab49-crm` (or the lab’s named project folder); that project begins in the full lab.
