# Module 18 — Pre-Lab Exercises

> **Start here for Module 18:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 18 — Mockito for Test Isolation  
**Next:** [`../lab18/LAB-18-WINDOWS.md`](../lab18/LAB-18-WINDOWS.md) or [`../lab18/LAB-18-MACOS.md`](../lab18/LAB-18-MACOS.md) → [`../lab18/LAB-18-GUIDE.md`](../lab18/LAB-18-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 18.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-18-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 18 is the graded consolidation. Do **not** finish Lab 18 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab18-keep-real-validator.md` | When to Keep Real Validator |
| 2 | `notes/lab18-stub-verify.md` | Stub vs Verify |
| 3 | `notes/lab18-argumentcaptor-preview.md` | ArgumentCaptor Preview |
| 4 | `notes/lab18-activate-interaction-todos.md` | Fill Activate Interaction Sequence TODOs |
| 5 | `notes/lab18-anti-patterns.md` | Mockito Anti-Patterns |
| 6 | `notes/lab18-prep-checklist.md` | Lab 18 Prep Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Contrast stub vs verify for CustomerRepository | Do not complete the full Lab 18 suite in this pre-lab |
| Decide when to keep a real validator collaborator | Do not mock everything including value objects unnecessarily |
| Draft activate interaction sequence TODOs | Do not start Selenium IT (Lab 19) |
| List Mockito anti-patterns to reject from AI | Do not skip verifying interaction order where it matters |
| Preview ArgumentCaptor for saved Customer status | Do not accept AI mocks of JDK types without cause |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-18-exercises` | `~/java-bootcamp/examples/module-18-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-18-exercises\notes | Out-Null
cd examples\module-18-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-18-exercises/notes
cd examples/module-18-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 18 uses its own `examples/lab18-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | When to Keep Real Validator | Architecture exercise | `notes/lab18-keep-real-validator.md` | [`exercise-01-keep-real-validator.md`](exercise-01-keep-real-validator.md) |
| 2 | Stub vs Verify | Analysis exercise | `notes/lab18-stub-verify.md` | [`exercise-02-stub-vs-verify.md`](exercise-02-stub-vs-verify.md) |
| 3 | ArgumentCaptor Preview | Documentation exercise | `notes/lab18-argumentcaptor-preview.md` | [`exercise-03-argumentcaptor-preview.md`](exercise-03-argumentcaptor-preview.md) |
| 4 | Fill Activate Interaction Sequence TODOs | Hands-on exercise | `notes/lab18-activate-interaction-todos.md` | [`exercise-04-fill-activate-interaction-todos.md`](exercise-04-fill-activate-interaction-todos.md) |
| 5 | Mockito Anti-Patterns | Analysis exercise | `notes/lab18-anti-patterns.md` | [`exercise-05-anti-patterns.md`](exercise-05-anti-patterns.md) |
| 6 | Lab 18 Prep Checklist | Documentation exercise | `notes/lab18-prep-checklist.md` | [`exercise-06-lab18-prep-checklist.md`](exercise-06-lab18-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 18 OS guide.
