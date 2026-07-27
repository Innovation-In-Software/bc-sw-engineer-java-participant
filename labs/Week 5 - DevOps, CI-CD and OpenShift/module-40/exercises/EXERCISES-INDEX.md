# Module 40 — Pre-Lab Exercises

> **Start here for Module 40:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 40 — Application Security Testing  
**Next:** [`../lab40/LAB-40-WINDOWS.md`](../lab40/LAB-40-WINDOWS.md) or [`../lab40/LAB-40-MACOS.md`](../lab40/LAB-40-MACOS.md) → [`../lab40/LAB-40-GUIDE.md`](../lab40/LAB-40-GUIDE.md)

> Complete these exercises after the slides and before Lab 40.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 40 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Map CRM attack surfaces to OWASP-aligned risks | Do not finish the full Lab 40 remediation and re-scan gate |
| Plan OWASP Dependency-Check Maven profile and triage CSV | Do not suppress CVEs without policy justification |
| Sketch focused manual SAST on request-to-sink paths | Do not build or push Docker images (Lab 41) |
| Draft residual-risk language with owner and expiry | Do not write k3s manifests or Ingress (Lab 42) |
| Prepare evidence folders under notes/screenshots/lab-40/ | Do not add GitHub Actions workflow files (Lab 43) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-40-exercises` | `~/java-bootcamp/examples/module-40-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-40-exercises | Out-Null
cd examples\module-40-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-40-exercises
cd examples/module-40-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Map CRM Attack Surfaces | Threat surface mapping | [`exercise-01-owasp-surface-map.md`](exercise-01-owasp-surface-map.md) |
| 2 | Plan Dependency-Check Gate | Maven security profile planning | [`exercise-02-dependency-check-plan.md`](exercise-02-dependency-check-plan.md) |
| 3 | Sketch Findings Triage CSV | CVE triage vocabulary | [`exercise-03-triage-csv-sketch.md`](exercise-03-triage-csv-sketch.md) |
| 4 | Fill SAST Path TODOs | Manual SAST checklist | [`exercise-04-sast-todo-notes.md`](exercise-04-sast-todo-notes.md) |
| 5 | Outline Security Assessment | Assessment structure | [`exercise-05-assessment-outline.md`](exercise-05-assessment-outline.md) |
| 6 | Draft AppSec Go/No-Go Questions | Release gate thinking | [`exercise-06-gate-go-nogo.md`](exercise-06-gate-go-nogo.md) |

Keep all work separate from `examples/lab40-crm` (or the lab’s named project folder); that project begins in the full lab.
