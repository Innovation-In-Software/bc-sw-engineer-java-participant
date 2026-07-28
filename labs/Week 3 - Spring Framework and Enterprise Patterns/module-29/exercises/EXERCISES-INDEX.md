# Module 29 — Pre-Lab Exercises

> **Start here for Module 29:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 29 — Validation and Global Exception Handling  
**Next:** [`../lab29/LAB-29-WINDOWS.md`](../lab29/LAB-29-WINDOWS.md) or [`../lab29/LAB-29-MACOS.md`](../lab29/LAB-29-MACOS.md) → [`../lab29/LAB-29-GUIDE.md`](../lab29/LAB-29-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the slides, then and before Lab 29.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 29 builds the full graded deliverable.  
> Exercise 2 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-29-exercises | Out-Null
cd examples\module-29-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-29-exercises
cd examples/module-29-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | DTO Constraint Plan | Choose Bean Validation annotations | [`exercise-01-dto-constraints.md`](exercise-01-dto-constraints.md) |
| 2 | GlobalExceptionHandler TODOs | Fill handler method blanks | [`exercise-02-handler-todos.md`](exercise-02-handler-todos.md) |
| 3 | ErrorResponse Envelope | Design a stable error JSON shape | [`exercise-03-error-envelope.md`](exercise-03-error-envelope.md) |
| 4 | Exception to Status Map | Map domain exceptions to HTTP codes | [`exercise-04-exception-status-map.md`](exercise-04-exception-status-map.md) |
| 5 | Lab 29 Readiness Checklist | Unify Labs 14/16 ideas into Boot | [`exercise-05-lab29-readiness.md`](exercise-05-lab29-readiness.md) |
| 6 | MockMvc Body Assertions Plan | Assert status and envelope fields | [`exercise-06-mockmvc-body-assertions.md`](exercise-06-mockmvc-body-assertions.md) |
