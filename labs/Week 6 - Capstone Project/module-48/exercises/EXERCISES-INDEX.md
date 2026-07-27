# Module 48 — Pre-Lab Exercises

> **Start here for Module 48:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 48 — Capstone Planning and Architecture  
**Next:** [`../lab48/LAB-48-WINDOWS.md`](../lab48/LAB-48-WINDOWS.md) or [`../lab48/LAB-48-MACOS.md`](../lab48/LAB-48-MACOS.md) → [`../lab48/LAB-48-GUIDE.md`](../lab48/LAB-48-GUIDE.md)

> Complete these exercises after the slides and before Lab 48.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 48 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Outline context and container diagrams for the CRM platform | Do not implement Spring/React features in this pre-lab |
| Draft measurable NFR placeholders with evidence ideas | Do not skip measurable NFRs in favor of vague adjectives |
| Sketch vertical backlog stories with acceptance criteria | Do not treat planning docs as optional for later labs |
| List ADR topics and risk-register columns | Do not commit secrets while drafting architecture notes |
| Prepare docs/ folder checklist for Lab 48 | Do not redo Weeks 1–5 labs instead of planning the capstone |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-48-exercises` | `~/java-bootcamp/examples/module-48-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-48-exercises | Out-Null
cd examples\module-48-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-48-exercises
cd examples/module-48-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Sketch Context Diagram | C4 context warmup | [`exercise-01-context-sketch.md`](exercise-01-context-sketch.md) |
| 2 | Draft Measurable NFRs | NFR measurability | [`exercise-02-nfr-placeholders.md`](exercise-02-nfr-placeholders.md) |
| 3 | Sketch Vertical Stories | Backlog slicing | [`exercise-03-backlog-slice.md`](exercise-03-backlog-slice.md) |
| 4 | Fill ADR Topic TODOs | Hands-on ADR planning | [`exercise-04-adr-todos.md`](exercise-04-adr-todos.md) |
| 5 | Outline Risk Register | Risk ownership | [`exercise-05-risk-register.md`](exercise-05-risk-register.md) |
| 6 | Planning Docs Checklist | Evidence gate warmup | [`exercise-06-docs-checklist.md`](exercise-06-docs-checklist.md) |

Keep all work separate from `examples/lab48-crm` (or the lab’s named project folder); that project begins in the full lab.
