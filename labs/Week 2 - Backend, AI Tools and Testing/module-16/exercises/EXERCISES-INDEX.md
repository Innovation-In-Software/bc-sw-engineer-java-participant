# Module 16 — Pre-Lab Exercises

> **Start here for Module 16:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 16 — Exception Handling in Distributed APIs  
**Next:** [`../lab16/LAB-16-WINDOWS.md`](../lab16/LAB-16-WINDOWS.md) or [`../lab16/LAB-16-MACOS.md`](../lab16/LAB-16-MACOS.md) → [`../lab16/LAB-16-GUIDE.md`](../lab16/LAB-16-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 16.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-16-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 16 is the graded consolidation. Do **not** finish Lab 16 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab16-catch-order.md` | Catch Order |
| 2 | `notes/lab16-errorresponse-json.md` | ErrorResponse JSON Draft |
| 3 | `notes/lab16-status-map.md` | Failure to Status Map |
| 4 | `notes/lab16-message-hygiene-todos.md` | Fill Message Hygiene TODOs |
| 5 | `notes/lab16-correlation-always.md` | Correlation on Every Error |
| 6 | `notes/lab16-prep-checklist.md` | Lab 16 Prep Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Map domain failures to HTTP/SOAP status ideas | Do not complete the full Lab 16 implementation in this pre-lab |
| Draft ErrorResponse JSON for not-found and conflict | Do not wire live `@ControllerAdvice` in a running app yet |
| Order catch blocks from specific to general | Do not return raw exception messages with PII |
| Write message hygiene TODOs (no stack traces to clients) | Do not skip correlation on error paths |
| Require correlation id on every error response sketch | Do not deepen logging frameworks (Lab 20) beyond error shape |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-16-exercises` | `~/java-bootcamp/examples/module-16-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-16-exercises\notes | Out-Null
cd examples\module-16-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-16-exercises/notes
cd examples/module-16-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 16 uses its own `examples/lab16-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Catch Order | Architecture exercise | `notes/lab16-catch-order.md` | [`exercise-01-catch-order.md`](exercise-01-catch-order.md) |
| 2 | ErrorResponse JSON Draft | Documentation exercise | `notes/lab16-errorresponse-json.md` | [`exercise-02-errorresponse-json.md`](exercise-02-errorresponse-json.md) |
| 3 | Failure to Status Map | Analysis exercise | `notes/lab16-status-map.md` | [`exercise-03-failure-status-map.md`](exercise-03-failure-status-map.md) |
| 4 | Fill Message Hygiene TODOs | Hands-on exercise | `notes/lab16-message-hygiene-todos.md` | [`exercise-04-fill-message-hygiene-todos.md`](exercise-04-fill-message-hygiene-todos.md) |
| 5 | Correlation on Every Error | Documentation exercise | `notes/lab16-correlation-always.md` | [`exercise-05-correlation-always.md`](exercise-05-correlation-always.md) |
| 6 | Lab 16 Prep Checklist | Documentation exercise | `notes/lab16-prep-checklist.md` | [`exercise-06-lab16-prep-checklist.md`](exercise-06-lab16-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 16 OS guide.
