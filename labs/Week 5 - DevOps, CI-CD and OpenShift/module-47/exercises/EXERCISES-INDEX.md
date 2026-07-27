# Module 47 — Pre-Lab Exercises

> **Start here for Module 47:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 47 — Professional Communication and Collaboration  
**Next:** [`../lab47/LAB-47-WINDOWS.md`](../lab47/LAB-47-WINDOWS.md) or [`../lab47/LAB-47-MACOS.md`](../lab47/LAB-47-MACOS.md) → [`../lab47/LAB-47-GUIDE.md`](../lab47/LAB-47-GUIDE.md)

> Complete these exercises after the slides and before Lab 47.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 47 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-47-exercises | Out-Null
cd examples\module-47-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-47-exercises
cd examples/module-47-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Build Shared Fact Base | Incident facts discipline | [`exercise-01-fact-base.md`](exercise-01-fact-base.md) |
| 2 | Draft Incident Update Skeleton | Blameless status writing | [`exercise-02-incident-update.md`](exercise-02-incident-update.md) |
| 3 | PR Description Outline | Reviewable change communication | [`exercise-03-pr-description.md`](exercise-03-pr-description.md) |
| 4 | Fill Stakeholder Email TODOs | Hands-on plain-language draft | [`exercise-04-stakeholder-todos.md`](exercise-04-stakeholder-todos.md) |
| 5 | Peer Review Rewrite Practice | Specific feedback | [`exercise-05-peer-review-practice.md`](exercise-05-peer-review-practice.md) |
| 6 | Communication Packet Index | Submission readiness | [`exercise-06-packet-index.md`](exercise-06-packet-index.md) |

Keep all work separate from `examples/lab47-crm` (or the lab’s named project folder); that project begins in the full lab.
