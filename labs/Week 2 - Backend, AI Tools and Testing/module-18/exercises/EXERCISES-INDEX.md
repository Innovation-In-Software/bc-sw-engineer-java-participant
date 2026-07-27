# Module 18 — Pre-Lab Exercises

> **Start here for Module 18:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 18 — Mockito for Test Isolation  
**Next:** [`../lab18/LAB-18-WINDOWS.md`](../lab18/LAB-18-WINDOWS.md) or [`../lab18/LAB-18-MACOS.md`](../lab18/LAB-18-MACOS.md) → [`../lab18/LAB-18-GUIDE.md`](../lab18/LAB-18-GUIDE.md)

> Complete these exercises after the slides and before Lab 18.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 18 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-18-exercises | Out-Null
cd examples\module-18-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-18-exercises
cd examples/module-18-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Stub vs Verify | Mockito vocabulary | [`exercise-01-stub-vs-verify.md`](exercise-01-stub-vs-verify.md) |
| 2 | When to Keep Real Validator | Partial isolation judgment | [`exercise-02-keep-real-validator.md`](exercise-02-keep-real-validator.md) |
| 3 | Mockito Anti-Patterns | Reject bad AI mocks | [`exercise-03-anti-patterns.md`](exercise-03-anti-patterns.md) |
| 4 | Fill Activate Interaction Sequence TODOs | Interaction testing | [`exercise-04-fill-activate-interaction-todos.md`](exercise-04-fill-activate-interaction-todos.md) |
| 5 | ArgumentCaptor Preview | Captor usage sketch | [`exercise-05-argumentcaptor-preview.md`](exercise-05-argumentcaptor-preview.md) |
| 6 | Lab 18 Prep Checklist | Pre-lab self-check | [`exercise-06-lab18-prep-checklist.md`](exercise-06-lab18-prep-checklist.md) |

Keep all work separate from `examples/lab18-crm` (or the lab’s named project folder); that project begins in the full lab.
