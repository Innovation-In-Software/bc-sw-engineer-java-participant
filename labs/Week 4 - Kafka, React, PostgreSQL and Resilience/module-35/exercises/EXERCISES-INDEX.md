# Module 35 — Pre-Lab Exercises

> **Start here for Module 35:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 35 — Frontend and API Integration  
**Next:** [`../lab35/LAB-35-WINDOWS.md`](../lab35/LAB-35-WINDOWS.md) or [`../lab35/LAB-35-MACOS.md`](../lab35/LAB-35-MACOS.md) → [`../lab35/LAB-35-GUIDE.md`](../lab35/LAB-35-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 35.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-35-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 35 is the graded consolidation. Do **not** finish Lab 35 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab35-error-ux.md` | Error UX Copy |
| 2 | `notes/lab35-fetch-flow.md` | Fetch Flow |
| 3 | `notes/lab35-cors-and-headers.md` | CORS and Headers |
| 4 | `notes/lab35-api.md` | Endpoint Map |
| 5 | `notes/lab35-todos.md` | Fill Fetch TODOs |
| 6 | `notes/lab35-prep-checklist.md` | Lab 35 Readiness |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Map CRM UI actions to Spring REST endpoints on paper | Do not run Spring Boot or Vite for this pre-lab |
| Sketch typed fetch helpers and error handling | Do not implement JWT login UI yet (Lab 36) |
| Plan AbortController / loading / empty states | Do not write JPA repositories (Lab 39) |
| Note CORS origin expectations for local Vite ↔ Spring | Do not call Kafka from the browser |
| Document request correlation header for lab-request-001 | Do not disable CORS with wildcard * in production notes |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-35-exercises` | `~/java-bootcamp/examples/module-35-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-35-exercises\notes | Out-Null
cd examples\module-35-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-35-exercises/notes
cd examples/module-35-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 35 uses its own `examples/lab35-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Error UX Copy | Documentation exercise | `notes/lab35-error-ux.md` | [`exercise-01-error-ux.md`](exercise-01-error-ux.md) |
| 2 | Fetch Flow | Architecture exercise | `notes/lab35-fetch-flow.md` | [`exercise-02-fetch-flow.md`](exercise-02-fetch-flow.md) |
| 3 | CORS and Headers | Documentation exercise | `notes/lab35-cors-and-headers.md` | [`exercise-03-cors-and-headers.md`](exercise-03-cors-and-headers.md) |
| 4 | Endpoint Map | Analysis exercise | `notes/lab35-api.md` | [`exercise-04-endpoint-map.md`](exercise-04-endpoint-map.md) |
| 5 | Fill Fetch TODOs | Hands-on exercise | `notes/lab35-todos.md` | [`exercise-05-fill-fetch-todos.md`](exercise-05-fill-fetch-todos.md) |
| 6 | Lab 35 Readiness | Analysis exercise | `notes/lab35-prep-checklist.md` | [`exercise-06-lab35-readiness.md`](exercise-06-lab35-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 35 OS guide.
