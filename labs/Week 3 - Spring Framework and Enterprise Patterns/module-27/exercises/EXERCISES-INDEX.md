# Module 27 — Pre-Lab Exercises

> **Start here for Module 27:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 27 — Transaction Management  
**Next:** [`../lab27/LAB-27-WINDOWS.md`](../lab27/LAB-27-WINDOWS.md) or [`../lab27/LAB-27-MACOS.md`](../lab27/LAB-27-MACOS.md) → [`../lab27/LAB-27-GUIDE.md`](../lab27/LAB-27-GUIDE.md)

> Complete these exercises **in order (1→6)** as they appear in the Module 27 slides, then start Lab 27.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 27 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-27-exercises | Out-Null
cd examples\module-27-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-27-exercises
cd examples/module-27-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | ACID for CRM Transfers | Map ACID to transfer evidence | [`exercise-01-acid-crm.md`](exercise-01-acid-crm.md) |
| 2 | Transaction Boundary Placement | Put `@Transactional` on the service | [`exercise-02-transaction-boundary.md`](exercise-02-transaction-boundary.md) |
| 3 | Rollback Evidence Plan | Plan ACC-FORCE-FAIL observations | [`exercise-03-rollback-plan.md`](exercise-03-rollback-plan.md) |
| 4 | Transfer Pseudocode (TODOs) | Fill transactional transfer TODOs | [`exercise-04-transfer-pseudocode.md`](exercise-04-transfer-pseudocode.md) |
| 5 | Propagation Warnings | Spot unsafe transaction propagation advice | [`exercise-05-propagation-warnings.md`](exercise-05-propagation-warnings.md) |
| 6 | Lab 27 Readiness Checklist | Confirm profiles + layering before TX lab | [`exercise-06-lab27-readiness.md`](exercise-06-lab27-readiness.md) |

Keep all work separate from `examples/lab27-crm` (or the lab’s named project folder); that project begins in the full lab.
