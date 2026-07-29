# Module 17 — Pre-Lab Exercises

> **Start here for Module 17:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 17 — JUnit Testing Fundamentals  
**Next:** [`../lab17/LAB-17-WINDOWS.md`](../lab17/LAB-17-WINDOWS.md) or [`../lab17/LAB-17-MACOS.md`](../lab17/LAB-17-MACOS.md) → [`../lab17/LAB-17-GUIDE.md`](../lab17/LAB-17-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 17.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-17-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 17 is the graded consolidation. Do **not** finish Lab 17 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab17-test-names.md` | Expressive Test Names |
| 2 | `notes/lab17-csvsource-table.md` | CsvSource Table Design |
| 3 | `notes/lab17-meaningful-asserts.md` | Meaningful Asserts |
| 4 | `notes/lab17-jacoco-gate-todos.md` | Fill JaCoCo Gate Narrative TODOs |
| 5 | `notes/lab17-aaa-plan.md` | AAA Service Tests Plan |
| 6 | `notes/lab17-prep-checklist.md` | Lab 17 Prep Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Practice expressive JUnit 5 test names for CRM cases | Do not complete the full Lab 17 suite in this pre-lab |
| Design a CsvSource table for status inputs | Do not deep-dive Mockito (Lab 18) |
| Prefer meaningful asserts over assertNotNull-only | Do not treat AI-generated tests as final without review |
| Narrate a JaCoCo gate goal as TODOs | Do not skip parameterized case design |
| Plan AAA service tests without deep Mockito | Do not configure Selenium UI tests here (Lab 19) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-17-exercises` | `~/java-bootcamp/examples/module-17-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-17-exercises\notes | Out-Null
cd examples\module-17-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-17-exercises/notes
cd examples/module-17-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 17 uses its own `examples/lab17-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Expressive Test Names | Documentation exercise | `notes/lab17-test-names.md` | [`exercise-01-test-names.md`](exercise-01-test-names.md) |
| 2 | CsvSource Table Design | Documentation exercise | `notes/lab17-csvsource-table.md` | [`exercise-02-csvsource-table.md`](exercise-02-csvsource-table.md) |
| 3 | Meaningful Asserts | Analysis exercise | `notes/lab17-meaningful-asserts.md` | [`exercise-03-meaningful-asserts.md`](exercise-03-meaningful-asserts.md) |
| 4 | Fill JaCoCo Gate Narrative TODOs | Hands-on exercise | `notes/lab17-jacoco-gate-todos.md` | [`exercise-04-fill-jacoco-gate-todos.md`](exercise-04-fill-jacoco-gate-todos.md) |
| 5 | AAA Service Tests Plan | Architecture exercise | `notes/lab17-aaa-plan.md` | [`exercise-05-aaa-service-tests-plan.md`](exercise-05-aaa-service-tests-plan.md) |
| 6 | Lab 17 Prep Checklist | Documentation exercise | `notes/lab17-prep-checklist.md` | [`exercise-06-lab17-prep-checklist.md`](exercise-06-lab17-prep-checklist.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 17 OS guide.
