# Module 41 — Pre-Lab Exercises

> **Start here for Module 41:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 41 — Containerization with Docker  
**Next:** [`../lab41/LAB-41-WINDOWS.md`](../lab41/LAB-41-WINDOWS.md) or [`../lab41/LAB-41-MACOS.md`](../lab41/LAB-41-MACOS.md) → [`../lab41/LAB-41-GUIDE.md`](../lab41/LAB-41-GUIDE.md)

> Complete these exercises after the slides and before Lab 41.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 41 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Plan a multi-stage Dockerfile for the Spring CRM JAR | Do not complete the full Lab 41 image build/push gate |
| List non-root, health, and .dockerignore requirements | Do not bake DB passwords into Dockerfile ENV/ARG |
| Separate runtime env from image layers (.env.example) | Do not apply k3s Deployment manifests (Lab 42) |
| Sketch digest/tag discipline for later k3s pull | Do not author GitHub Actions package jobs (Lab 43) |
| Prepare container-runbook section headings | Do not promote digests through staging/prod (Lab 44) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-41-exercises` | `~/java-bootcamp/examples/module-41-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-41-exercises | Out-Null
cd examples\module-41-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-41-exercises
cd examples/module-41-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Sketch Multi-Stage Build | Dockerfile stages | [`exercise-01-multistage-sketch.md`](exercise-01-multistage-sketch.md) |
| 2 | Plan .dockerignore and Env | Image hygiene | [`exercise-02-dockerignore-env.md`](exercise-02-dockerignore-env.md) |
| 3 | Health and Resource Checklist | Operability planning | [`exercise-03-health-resources.md`](exercise-03-health-resources.md) |
| 4 | Fill Dockerfile TODO Skeleton | Hands-on Dockerfile draft | [`exercise-04-dockerfile-todos.md`](exercise-04-dockerfile-todos.md) |
| 5 | Digest vs Latest | Image identity | [`exercise-05-digest-discipline.md`](exercise-05-digest-discipline.md) |
| 6 | Plan Container Smoke | CRM smoke design | [`exercise-06-smoke-plan.md`](exercise-06-smoke-plan.md) |

Keep all work separate from `examples/lab41-crm` (or the lab’s named project folder); that project begins in the full lab.
