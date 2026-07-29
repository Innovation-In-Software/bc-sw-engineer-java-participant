# Module 29 — Pre-Lab Exercises

> **Start here for Module 29:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 29 — Validation and Global Exception Handling  
**Next:** [`../lab29/LAB-29-WINDOWS.md`](../lab29/LAB-29-WINDOWS.md) or [`../lab29/LAB-29-MACOS.md`](../lab29/LAB-29-MACOS.md) → [`../lab29/LAB-29-GUIDE.md`](../lab29/LAB-29-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 29.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-29-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 29 is the graded consolidation. Do **not** finish Lab 29 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/dto-constraints.md` | DTO Constraint Plan |
| 2 | `notes/lab29-handler-todos.md` | GlobalExceptionHandler TODOs |
| 3 | `notes/error-envelope.md` | ErrorResponse Envelope |
| 4 | `notes/exception-status-map.md` | Exception to Status Map |
| 5 | `notes/mockmvc-body-plan.md` | Lab 29 Readiness Checklist |
| 6 | `notes/mockmvc-body-plan.md` | MockMvc Body Assertions Plan |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Annotate request DTOs with Bean Validation | Kafka retry/DLQ error models (Week 4) |
| Enable `@Valid` on controller parameters | React form libraries (Week 4) |
| Design a consistent `ErrorResponse` envelope | Replacing Spring Security with validation |
| Map validation/not-found/duplicate/illegal-transition to HTTP statuses | Returning stack-trace HTML to clients |
| Plan MockMvc assertions on status **and** body shape | Terraform alert wiring (Week 5) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-29-exercises` | `~/java-bootcamp/examples/module-29-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-29-exercises\notes | Out-Null
cd examples\module-29-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-29-exercises/notes
cd examples/module-29-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 29 uses its own `examples/lab29-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | DTO Constraint Plan | Analysis exercise | `notes/dto-constraints.md` | [`exercise-01-dto-constraints.md`](exercise-01-dto-constraints.md) |
| 2 | GlobalExceptionHandler TODOs | Hands-on exercise | `notes/lab29-handler-todos.md` | [`exercise-02-handler-todos.md`](exercise-02-handler-todos.md) |
| 3 | ErrorResponse Envelope | Architecture exercise | `notes/error-envelope.md` | [`exercise-03-error-envelope.md`](exercise-03-error-envelope.md) |
| 4 | Exception to Status Map | Documentation exercise | `notes/exception-status-map.md` | [`exercise-04-exception-status-map.md`](exercise-04-exception-status-map.md) |
| 5 | Lab 29 Readiness Checklist | Documentation exercise | `notes/mockmvc-body-plan.md` | [`exercise-05-lab29-readiness.md`](exercise-05-lab29-readiness.md) |
| 6 | MockMvc Body Assertions Plan | Analysis exercise | `notes/mockmvc-body-plan.md` | [`exercise-06-mockmvc-body-assertions.md`](exercise-06-mockmvc-body-assertions.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 29 OS guide.
