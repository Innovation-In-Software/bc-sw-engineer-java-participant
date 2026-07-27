# Module 52 — Pre-Lab Exercises

> **Start here for Module 52:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 52 — Capstone Final Defense and Retrospective  
**Next:** [`../lab52/LAB-52-WINDOWS.md`](../lab52/LAB-52-WINDOWS.md) or [`../lab52/LAB-52-MACOS.md`](../lab52/LAB-52-MACOS.md) → [`../lab52/LAB-52-GUIDE.md`](../lab52/LAB-52-GUIDE.md)

> Complete these exercises after the slides and before Lab 52.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 52 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Outline defense packet files and claim→evidence map | Do not invent evidence you do not have |
| Draft a deterministic demo script using synthetic fixtures | Do not include secrets or real customer data in the packet |
| Prepare architecture/security/ops Q&A stubs with links | Do not skip rehearsal and fallback demo path |
| Plan a blameless retrospective agenda | Do not treat defense as “only a slideshow” |
| Sketch rubric self-assessment evidence pointers | Do not redo the entire capstone build during this warmup |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-52-exercises` | `~/java-bootcamp/examples/module-52-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-52-exercises | Out-Null
cd examples\module-52-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-52-exercises
cd examples/module-52-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Defense Packet Index | Submission structure | [`exercise-01-packet-index.md`](exercise-01-packet-index.md) |
| 2 | Draft Demo Script Skeleton | Deterministic demo planning | [`exercise-02-demo-script.md`](exercise-02-demo-script.md) |
| 3 | Claim → Evidence Map | Evidence discipline | [`exercise-03-evidence-map.md`](exercise-03-evidence-map.md) |
| 4 | Fill Q&A Stubs | Hands-on defense prep | [`exercise-04-qa-stubs.md`](exercise-04-qa-stubs.md) |
| 5 | Blameless Retro Agenda | Team learning | [`exercise-05-retro-agenda.md`](exercise-05-retro-agenda.md) |
| 6 | Rubric Self-Check Warmup | Assessment readiness | [`exercise-06-rubric-self-check.md`](exercise-06-rubric-self-check.md) |

Keep all work separate from `examples/lab52-crm` (or the lab’s named project folder); that project begins in the full lab.
