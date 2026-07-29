# Module 27 — Pre-Lab Exercises

> **Start here for Module 27:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 27 — Transaction Management  
**Next:** [`../lab27/LAB-27-WINDOWS.md`](../lab27/LAB-27-WINDOWS.md) or [`../lab27/LAB-27-MACOS.md`](../lab27/LAB-27-MACOS.md) → [`../lab27/LAB-27-GUIDE.md`](../lab27/LAB-27-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 27.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-27-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 27 is the graded consolidation. Do **not** finish Lab 27 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/acid-crm.md` | ACID for CRM Transfers |
| 2 | `notes/tx-boundary.md` | Transaction Boundary Placement |
| 3 | `notes/rollback-plan.md` | Rollback Evidence Plan |
| 4 | `notes/lab27-transfer-pseudocode.md` | Transfer Pseudocode (TODOs) |
| 5 | `notes/propagation-warnings.md` | Propagation Warnings |
| 6 | `notes/lab27-readiness.md` | Lab 27 Readiness Checklist |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Explain ACID with CRM transfer observations | JWT SecurityFilterChain (Lab 28) |
| Place `@Transactional` on service methods (not controllers) | Distributed sagas / Kafka transactions (Week 4) |
| Plan debit + credit + log as one unit of work | Manual `EntityManager` commit APIs as primary style |
| Design rollback evidence using `ACC-FORCE-FAIL` | Putting `@Transactional` on controllers |
| Review AI drafts for swallowed exceptions / wrong propagation | Production multi-DB XA configuration |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-27-exercises` | `~/java-bootcamp/examples/module-27-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-27-exercises\notes | Out-Null
cd examples\module-27-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-27-exercises/notes
cd examples/module-27-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 27 uses its own `examples/lab27-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | ACID for CRM Transfers | Analysis exercise | `notes/acid-crm.md` | [`exercise-01-acid-crm.md`](exercise-01-acid-crm.md) |
| 2 | Transaction Boundary Placement | Architecture exercise | `notes/tx-boundary.md` | [`exercise-02-transaction-boundary.md`](exercise-02-transaction-boundary.md) |
| 3 | Rollback Evidence Plan | Documentation exercise | `notes/rollback-plan.md` | [`exercise-03-rollback-plan.md`](exercise-03-rollback-plan.md) |
| 4 | Transfer Pseudocode (TODOs) | Hands-on exercise | `notes/lab27-transfer-pseudocode.md` | [`exercise-04-transfer-pseudocode.md`](exercise-04-transfer-pseudocode.md) |
| 5 | Propagation Warnings | Analysis exercise | `notes/propagation-warnings.md` | [`exercise-05-propagation-warnings.md`](exercise-05-propagation-warnings.md) |
| 6 | Lab 27 Readiness Checklist | Documentation exercise | `notes/lab27-readiness.md` | [`exercise-06-lab27-readiness.md`](exercise-06-lab27-readiness.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 27 OS guide.
