# Module 36 — Pre-Lab Exercises

> **Start here for Module 36:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 36 — Frontend Security  
**Next:** [`../lab36/LAB-36-WINDOWS.md`](../lab36/LAB-36-WINDOWS.md) or [`../lab36/LAB-36-MACOS.md`](../lab36/LAB-36-MACOS.md) → [`../lab36/LAB-36-GUIDE.md`](../lab36/LAB-36-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 36.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-36-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 36 is the graded consolidation. Do **not** finish Lab 36 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab36-security.md` | Threat Sketch |
| 2 | `notes/lab36-token-storage.md` | Token Storage Options |
| 3 | `notes/lab36-xss-csp.md` | XSS and CSP Notes |
| 4 | `notes/lab36-csrf-notes.md` | CSRF Notes |
| 5 | `notes/lab36-todos.md` | Fill Route Guard TODOs |
| 6 | `notes/lab36-prep-checklist.md` | Lab 36 Readiness |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Identify XSS risks in CRM UI rendering | Do not run the SPA or IdP login flows in this pre-lab |
| Plan token storage tradeoffs (memory vs localStorage) | Do not hardcode real secrets or production tokens |
| Sketch route-guard logic for authenticated pages | Do not disable browser security for convenience |
| Note CSRF and CSP ideas for the SPA | Do not implement full OAuth/OIDC provider setup here |
| Document what never belongs in frontend code | Do not skip backend authorization (UI guards are not enough) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-36-exercises` | `~/java-bootcamp/examples/module-36-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-36-exercises\notes | Out-Null
cd examples\module-36-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-36-exercises/notes
cd examples/module-36-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 36 uses its own `examples/lab36-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Threat Sketch | Analysis exercise | `notes/lab36-security.md` | [`exercise-01-threat-sketch.md`](exercise-01-threat-sketch.md) |
| 2 | Token Storage Options | Architecture exercise | `notes/lab36-token-storage.md` | [`exercise-02-token-storage.md`](exercise-02-token-storage.md) |
| 3 | XSS and CSP Notes | Documentation exercise | `notes/lab36-xss-csp.md` | [`exercise-03-xss-csp.md`](exercise-03-xss-csp.md) |
| 4 | CSRF Notes | Documentation exercise | `notes/lab36-csrf-notes.md` | [`exercise-04-csrf-notes.md`](exercise-04-csrf-notes.md) |
| 5 | Fill Route Guard TODOs | Hands-on exercise | `notes/lab36-todos.md` | [`exercise-05-fill-guard-todos.md`](exercise-05-fill-guard-todos.md) |
| 6 | Lab 36 Readiness | Analysis exercise | `notes/lab36-prep-checklist.md` | [`exercise-06-lab36-readiness.md`](exercise-06-lab36-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 36 OS guide.
