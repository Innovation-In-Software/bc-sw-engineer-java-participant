# Module 33 — Pre-Lab Exercises

> **Start here for Module 33:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 33 — React Component Development  
**Next:** [`../lab33/LAB-33-WINDOWS.md`](../lab33/LAB-33-WINDOWS.md) or [`../lab33/LAB-33-MACOS.md`](../lab33/LAB-33-MACOS.md) → [`../lab33/LAB-33-GUIDE.md`](../lab33/LAB-33-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 33.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 33 builds the full graded deliverable.  
> Exercise 1 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Identify presentational CRM components (CustomerCard, StatusBadge) | Do not run `npm start` or Vite in this pre-lab |
| Describe props vs children for dashboard widgets | Do not wire fetch/API calls yet (Lab 35) |
| Sketch JSX structure for Amina/Ravi list rows | Do not implement auth/route guards (Lab 36) |
| Note accessibility basics (labels, button roles) | Do not manage complex form state yet (Lab 34) |
| Plan file layout under a future `crm-ui` folder | Do not connect to PostgreSQL from the browser |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-33-exercises` | `~/java-bootcamp/examples/module-33-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-33-exercises | Out-Null
cd examples\module-33-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-33-exercises
cd examples/module-33-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Fill Component TODOs | Complete JSX/prop blanks | [`exercise-01-fill-react-component-todos.md`](exercise-01-fill-react-component-todos.md) |
| 2 | Component Inventory | Break UI into components | [`exercise-02-component-inventory.md`](exercise-02-component-inventory.md) |
| 3 | JSX on Paper | Sketch JSX trees | [`exercise-03-jsx-paper.md`](exercise-03-jsx-paper.md) |
| 4 | Props Sketch | Design props contracts | [`exercise-04-props-sketch.md`](exercise-04-props-sketch.md) |
| 5 | A11y Checklist | Plan accessible CRM UI | [`exercise-05-a11y-checklist.md`](exercise-05-a11y-checklist.md) |
| 6 | Lab 33 Readiness | Pre-lab self-check | [`exercise-06-lab33-readiness.md`](exercise-06-lab33-readiness.md) |
