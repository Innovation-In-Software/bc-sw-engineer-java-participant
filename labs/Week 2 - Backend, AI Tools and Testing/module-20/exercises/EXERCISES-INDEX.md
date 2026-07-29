# Module 20 — Pre-Lab Exercises

> **Start here for Module 20:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 20 — Logging Frameworks and Diagnostics  
**Next:** [`../lab20/LAB-20-WINDOWS.md`](../lab20/LAB-20-WINDOWS.md) or [`../lab20/LAB-20-MACOS.md`](../lab20/LAB-20-MACOS.md) → [`../lab20/LAB-20-GUIDE.md`](../lab20/LAB-20-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 20.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-20-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 20 is the graded consolidation. Do **not** finish Lab 20 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab20-level-quiz.md` | Log Level Quiz |
| 2 | `notes/lab20-safe-logs.md` | Rewrite Unsafe Logs |
| 3 | `notes/lab20-mdc-lifecycle.md` | MDC Lifecycle |
| 4 | `notes/lab20-mdc-clear.md` | Clear MDC Finally Drill |
| 5 | `notes/lab20-forbidden-pii-todos.md` | Fill Forbidden PII Checklist TODOs |
| 6 | `notes/lab20-prep-checklist.md` | Lab 20 Prep Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Rewrite unsafe log lines that leak PII | Do not complete the full Lab 20 logging retrofit in this pre-lab |
| Plan MDC put/clear lifecycle around requests | Do not configure full observability metrics yet (Lab 21) |
| Take a log-level quiz for CRM events | Do not log raw payloads containing secrets |
| Build a forbidden PII checklist as TODOs | Do not leave MDC keys set across threads/requests |
| Require clear MDC in finally for lab-request-001 | Do not replace metrics with only log grepping long-term |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-20-exercises` | `~/java-bootcamp/examples/module-20-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-20-exercises\notes | Out-Null
cd examples\module-20-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-20-exercises/notes
cd examples/module-20-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 20 uses its own `examples/lab20-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Log Level Quiz | Analysis exercise | `notes/lab20-level-quiz.md` | [`exercise-01-level-quiz.md`](exercise-01-level-quiz.md) |
| 2 | Rewrite Unsafe Logs | Analysis exercise | `notes/lab20-safe-logs.md` | [`exercise-02-rewrite-unsafe-logs.md`](exercise-02-rewrite-unsafe-logs.md) |
| 3 | MDC Lifecycle | Architecture exercise | `notes/lab20-mdc-lifecycle.md` | [`exercise-03-mdc-lifecycle.md`](exercise-03-mdc-lifecycle.md) |
| 4 | Clear MDC Finally Drill | Documentation exercise | `notes/lab20-mdc-clear.md` | [`exercise-04-clear-mdc-finally.md`](exercise-04-clear-mdc-finally.md) |
| 5 | Fill Forbidden PII Checklist TODOs | Hands-on exercise | `notes/lab20-forbidden-pii-todos.md` | [`exercise-05-fill-forbidden-pii-todos.md`](exercise-05-fill-forbidden-pii-todos.md) |
| 6 | Lab 20 Prep Checklist | Documentation exercise | `notes/lab20-prep-checklist.md` | [`exercise-06-lab20-prep-checklist.md`](exercise-06-lab20-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 20 OS guide.
