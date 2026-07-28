# Module 34 — Pre-Lab Exercises

> **Start here for Module 34:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 34 — State and Event Management  
**Next:** [`../lab34/LAB-34-WINDOWS.md`](../lab34/LAB-34-WINDOWS.md) or [`../lab34/LAB-34-MACOS.md`](../lab34/LAB-34-MACOS.md) → [`../lab34/LAB-34-GUIDE.md`](../lab34/LAB-34-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 34.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 34 builds the full graded deliverable.  
> Exercise 1 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Distinguish props vs local useState for CRM forms | Do not run the React app in this pre-lab |
| Sketch controlled inputs for customer create/edit | Do not call the Spring API yet (Lab 35) |
| Plan validation messages for empty name/status | Do not store JWTs or implement guards (Lab 36) |
| Describe event handlers (onChange, onSubmit) on paper | Do not introduce Redux/Zustand unless the lab starter already does |
| Note lifting state for list + selected customer | Do not persist form drafts to PostgreSQL |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-34-exercises` | `~/java-bootcamp/examples/module-34-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-34-exercises | Out-Null
cd examples\module-34-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-34-exercises
cd examples/module-34-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Fill useState TODOs | Complete React state blanks | [`exercise-01-fill-usestate-todos.md`](exercise-01-fill-usestate-todos.md) |
| 2 | Event Handler Map | Map DOM events to updates | [`exercise-02-event-handler-map.md`](exercise-02-event-handler-map.md) |
| 3 | Controlled Form Sketch | Design controlled inputs | [`exercise-03-controlled-form.md`](exercise-03-controlled-form.md) |
| 4 | Validation Messages | Plan client validation copy | [`exercise-04-validation-messages.md`](exercise-04-validation-messages.md) |
| 5 | Props vs State | Choose state ownership | [`exercise-05-props-vs-state.md`](exercise-05-props-vs-state.md) |
| 6 | Lab 34 Readiness | Pre-lab self-check | [`exercise-06-lab34-readiness.md`](exercise-06-lab34-readiness.md) |
