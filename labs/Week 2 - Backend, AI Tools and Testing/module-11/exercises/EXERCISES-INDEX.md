# Module 11 — Pre-Lab Exercises

> **Start here for Module 11:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 11 — GitHub Copilot for Testing and Refactoring  
**Next:** [`../lab11/LAB-11-WINDOWS.md`](../lab11/LAB-11-WINDOWS.md) or [`../lab11/LAB-11-MACOS.md`](../lab11/LAB-11-MACOS.md) → [`../lab11/LAB-11-GUIDE.md`](../lab11/LAB-11-GUIDE.md)

> Complete these exercises **in order (1→6)** after the slides and **before** Lab 11.  
> Use JDK 21. Work under `examples/module-11-exercises/` — these are **notes files**, not a Maven project.  
> Lab 11 is the graded consolidation (tests + notifier + Copilot notes). Do **not** finish Lab 11 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all six)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab11-aaa-template.md` | AAA outline for Ravi activate |
| 2 | `notes/lab11-notifier-extract-plan.md` | `CustomerNotifier` extract sketch |
| 3 | `notes/lab11-prelab-asserts.md` | Trivial vs real asserts |
| 4 | `notes/lab11-acceptance-todos.md` | Filled acceptance checklist |
| 5 | `notes/lab11-coverage-gaps.md` | Lab 11 vs Labs 17–18 map |
| 6 | `notes/lab11-prep-checklist.md` | Readiness Pass/Fail |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Write the six `notes/lab11-*.md` files with the templates provided | Do not complete the full Lab 11 suite in this pre-lab |
| Draft AAA for Ravi `CUS-1002` PROSPECT → ACTIVE | Do not deep-dive Mockito (Lab 18) or full JUnit curriculum (Lab 17) |
| Sketch `CustomerNotifier.notifyStatusChange(...)` | Do not claim 100% coverage from Copilot alone |
| Fill acceptance TODOs; reject trivial asserts | Do not implement Spring/Kafka notifiers |
| Name coverage gaps for Labs 17–18 | Do not skip human review of generated assertions |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-11-exercises` | `~/java-bootcamp/examples/module-11-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-11-exercises\notes | Out-Null
cd examples\module-11-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-11-exercises/notes
cd examples/module-11-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 11 later uses `examples/lab11-crm/`.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | AAA Template for Status | Documentation | `notes/lab11-aaa-template.md` | [`exercise-01-aaa-template.md`](exercise-01-aaa-template.md) |
| 2 | Notifier Extract Plan | Architecture | `notes/lab11-notifier-extract-plan.md` | [`exercise-02-notifier-extract.md`](exercise-02-notifier-extract.md) |
| 3 | Trivial vs Real Asserts | Analysis | `notes/lab11-prelab-asserts.md` | [`exercise-03-trivial-vs-real-asserts.md`](exercise-03-trivial-vs-real-asserts.md) |
| 4 | Fill Acceptance Checklist TODOs | Hands-on | `notes/lab11-acceptance-todos.md` | [`exercise-04-fill-acceptance-checklist-todos.md`](exercise-04-fill-acceptance-checklist-todos.md) |
| 5 | Coverage Gaps Map | Analysis | `notes/lab11-coverage-gaps.md` | [`exercise-05-coverage-gaps.md`](exercise-05-coverage-gaps.md) |
| 6 | Lab 11 Prep Checklist | Documentation | `notes/lab11-prep-checklist.md` | [`exercise-06-lab11-prep-checklist.md`](exercise-06-lab11-prep-checklist.md) |

## Done when

All six files exist under `notes/`, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT`, and Exercise 6 self-mark is **Pass**. Then open the Lab 11 OS guide.
