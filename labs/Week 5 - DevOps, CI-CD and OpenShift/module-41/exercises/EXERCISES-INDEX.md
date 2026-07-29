# Module 41 — Pre-Lab Exercises

> **Start here for Module 41:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 41 — Containerization with Docker  
**Next:** [`../lab41/LAB-41-WINDOWS.md`](../lab41/LAB-41-WINDOWS.md) or [`../lab41/LAB-41-MACOS.md`](../lab41/LAB-41-MACOS.md) → [`../lab41/LAB-41-GUIDE.md`](../lab41/LAB-41-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 41.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-41-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 41 is the graded consolidation. Do **not** finish Lab 41 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab41-multistage-sketch.md` | Sketch Multi-Stage Build |
| 2 | `notes/lab41-dockerignore-env.md` | Plan .dockerignore and Env |
| 3 | `notes/lab41-health-resources.md` | Health and Resource Checklist |
| 4 | `notes/lab41-dockerfile-todos.md` | Fill Dockerfile TODO Skeleton |
| 5 | `notes/lab41-digest-discipline.md` | Digest vs Latest |
| 6 | `notes/lab41-smoke-plan.md` | Plan Container Smoke |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

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
New-Item -ItemType Directory -Force -Path examples\module-41-exercises\notes | Out-Null
cd examples\module-41-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-41-exercises/notes
cd examples/module-41-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 41 uses its own `examples/lab41-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Sketch Multi-Stage Build | Architecture exercise | `notes/lab41-multistage-sketch.md` | [`exercise-01-multistage-sketch.md`](exercise-01-multistage-sketch.md) |
| 2 | Plan .dockerignore and Env | Documentation exercise | `notes/lab41-dockerignore-env.md` | [`exercise-02-dockerignore-env.md`](exercise-02-dockerignore-env.md) |
| 3 | Health and Resource Checklist | Analysis exercise | `notes/lab41-health-resources.md` | [`exercise-03-health-resources.md`](exercise-03-health-resources.md) |
| 4 | Fill Dockerfile TODO Skeleton | Hands-on exercise | `notes/lab41-dockerfile-todos.md` | [`exercise-04-dockerfile-todos.md`](exercise-04-dockerfile-todos.md) |
| 5 | Digest vs Latest | Analysis exercise | `notes/lab41-digest-discipline.md` | [`exercise-05-digest-discipline.md`](exercise-05-digest-discipline.md) |
| 6 | Plan Container Smoke | Documentation exercise | `notes/lab41-smoke-plan.md` | [`exercise-06-smoke-plan.md`](exercise-06-smoke-plan.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 41 OS guide.
