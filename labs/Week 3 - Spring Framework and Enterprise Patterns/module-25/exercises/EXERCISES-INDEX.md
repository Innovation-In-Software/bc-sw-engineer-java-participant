# Module 25 — Pre-Lab Exercises

> **Start here for Module 25:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 25 — Service and Repository Layers  
**Next:** [`../lab25/LAB-25-WINDOWS.md`](../lab25/LAB-25-WINDOWS.md) or [`../lab25/LAB-25-MACOS.md`](../lab25/LAB-25-MACOS.md) → [`../lab25/LAB-25-GUIDE.md`](../lab25/LAB-25-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 25.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 25 builds the full graded deliverable.  
> Exercise 3 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Separate Controller → Service → Repository responsibilities | JPA/PostgreSQL persistence swap (Week 4 Lab 39) |
| Keep HTTP types out of the service layer | Deep profile secret binding (Lab 26) |
| Plan an in-memory `CustomerRepository` seeded with fixtures | `@Transactional` multi-account transfers (Lab 27) |
| Place lifecycle/uniqueness rules in the service | JWT role matrix (Lab 28) |
| Practice AI review notes (`lab25-001`) without accepting unsafe drafts | Bean Validation `@Valid` global handler polish (Lab 29) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-25-exercises` | `~/java-bootcamp/examples/module-25-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-25-exercises | Out-Null
cd examples\module-25-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-25-exercises
cd examples/module-25-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Layer Boundary Quiz | Assign work to controller/service/repository | [`exercise-01-layer-boundaries.md`](exercise-01-layer-boundaries.md) |
| 2 | Package Sketch | Name packages for layered CRM | [`exercise-02-package-sketch.md`](exercise-02-package-sketch.md) |
| 3 | Service Layer Skeleton (TODOs) | Fill service/repository TODOs in plain Java | [`exercise-03-service-todo-skeleton.md`](exercise-03-service-todo-skeleton.md) |
| 4 | AI Review Policy | Reject unsafe Copilot layering suggestions | [`exercise-04-ai-review-policy.md`](exercise-04-ai-review-policy.md) |
| 5 | Service Test Plan | Plan unit tests with a fake repository | [`exercise-05-test-plan.md`](exercise-05-test-plan.md) |
| 6 | Lab 25 Readiness Checklist | Confirm Boot CRM baseline for layering | [`exercise-06-lab25-readiness.md`](exercise-06-lab25-readiness.md) |
