# Module 47 — Pre-Lab Exercises

> **Start here for Module 47:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 47 — Professional Communication and Collaboration  
**Next:** [`../lab47/LAB-47-WINDOWS.md`](../lab47/LAB-47-WINDOWS.md) or [`../lab47/LAB-47-MACOS.md`](../lab47/LAB-47-MACOS.md) → [`../lab47/LAB-47-GUIDE.md`](../lab47/LAB-47-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 47.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-47-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 47 is the graded consolidation. Do **not** finish Lab 47 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab47-fact-base.md` | Build Shared Fact Base |
| 2 | `notes/lab47-incident-update.md` | Draft Incident Update Skeleton |
| 3 | `notes/lab47-pr-description.md` | PR Description Outline |
| 4 | `notes/lab47-stakeholder-todos.md` | Fill Stakeholder Email TODOs |
| 5 | `notes/lab47-peer-review-practice.md` | Peer Review Rewrite Practice |
| 6 | `notes/lab47-packet-index.md` | Communication Packet Index |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Collect one consistent fact base for a SEV-2 CRM scenario | Do not invent contradictory severity or root cause |
| Draft audience-specific updates without contradictory facts | Do not blame individuals in incident updates |
| Practice PR description structure with verify/rollback | Do not include secrets, tokens, or real customer data |
| Plan stakeholder email in plain language | Do not treat this as finishing Labs 43–46 technical work |
| Prepare peer-review rewrite habits and secrecy scrub | Do not skip the shared fact base before writing four artifacts |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-47-exercises` | `~/java-bootcamp/examples/module-47-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-47-exercises\notes | Out-Null
cd examples\module-47-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-47-exercises/notes
cd examples/module-47-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 47 uses its own `examples/lab47-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Build Shared Fact Base | Analysis exercise | `notes/lab47-fact-base.md` | [`exercise-01-fact-base.md`](exercise-01-fact-base.md) |
| 2 | Draft Incident Update Skeleton | Documentation exercise | `notes/lab47-incident-update.md` | [`exercise-02-incident-update.md`](exercise-02-incident-update.md) |
| 3 | PR Description Outline | Documentation exercise | `notes/lab47-pr-description.md` | [`exercise-03-pr-description.md`](exercise-03-pr-description.md) |
| 4 | Fill Stakeholder Email TODOs | Hands-on exercise | `notes/lab47-stakeholder-todos.md` | [`exercise-04-stakeholder-todos.md`](exercise-04-stakeholder-todos.md) |
| 5 | Peer Review Rewrite Practice | Analysis exercise | `notes/lab47-peer-review-practice.md` | [`exercise-05-peer-review-practice.md`](exercise-05-peer-review-practice.md) |
| 6 | Communication Packet Index | Architecture exercise | `notes/lab47-packet-index.md` | [`exercise-06-packet-index.md`](exercise-06-packet-index.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 47 OS guide.
