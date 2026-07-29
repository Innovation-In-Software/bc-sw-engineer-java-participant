# Module 52 — Pre-Lab Exercises

> **Start here for Module 52:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 52 — Capstone Final Defense and Retrospective  
**Next:** [`../lab52/LAB-52-WINDOWS.md`](../lab52/LAB-52-WINDOWS.md) or [`../lab52/LAB-52-MACOS.md`](../lab52/LAB-52-MACOS.md) → [`../lab52/LAB-52-GUIDE.md`](../lab52/LAB-52-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 52.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-52-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 52 is the graded consolidation. Do **not** finish Lab 52 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab52-packet-index.md` | Defense Packet Index |
| 2 | `notes/lab52-demo-script.md` | Draft Demo Script Skeleton |
| 3 | `notes/lab52-evidence-map.md` | Claim → Evidence Map |
| 4 | `notes/lab52-qa-stubs.md` | Fill Q&A Stubs |
| 5 | `notes/lab52-retro-agenda.md` | Blameless Retro Agenda |
| 6 | `notes/lab52-rubric-self-check.md` | Rubric Self-Check Warmup |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Outline defense packet files and claim→evidence map | Do not invent evidence you do not have |
| Draft a deterministic demo script using synthetic fixtures | Do not include secrets or real customer data in the packet |
| Prepare architecture/security/ops Q&A stubs with links | Do not skip rehearsal and fallback demo path |
| Plan a blameless retrospective agenda | Do not treat defense as “only a slideshow” |
| Sketch rubric self-assessment evidence pointers | Do not redo the entire capstone build during this warmup |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-52-exercises` | `~/java-bootcamp/examples/module-52-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-52-exercises\notes | Out-Null
cd examples\module-52-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-52-exercises/notes
cd examples/module-52-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 52 uses its own `examples/lab52-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Defense Packet Index | Documentation exercise | `notes/lab52-packet-index.md` | [`exercise-01-packet-index.md`](exercise-01-packet-index.md) |
| 2 | Draft Demo Script Skeleton | Architecture exercise | `notes/lab52-demo-script.md` | [`exercise-02-demo-script.md`](exercise-02-demo-script.md) |
| 3 | Claim → Evidence Map | Analysis exercise | `notes/lab52-evidence-map.md` | [`exercise-03-evidence-map.md`](exercise-03-evidence-map.md) |
| 4 | Fill Q&A Stubs | Hands-on exercise | `notes/lab52-qa-stubs.md` | [`exercise-04-qa-stubs.md`](exercise-04-qa-stubs.md) |
| 5 | Blameless Retro Agenda | Documentation exercise | `notes/lab52-retro-agenda.md` | [`exercise-05-retro-agenda.md`](exercise-05-retro-agenda.md) |
| 6 | Rubric Self-Check Warmup | Analysis exercise | `notes/lab52-rubric-self-check.md` | [`exercise-06-rubric-self-check.md`](exercise-06-rubric-self-check.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 52 OS guide.
