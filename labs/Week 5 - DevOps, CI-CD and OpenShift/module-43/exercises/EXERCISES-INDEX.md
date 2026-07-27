# Module 43 — Pre-Lab Exercises

> **Start here for Module 43:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 43 — GitHub Actions and CI/CD Integration  
**Next:** [`../lab43/LAB-43-WINDOWS.md`](../lab43/LAB-43-WINDOWS.md) or [`../lab43/LAB-43-MACOS.md`](../lab43/LAB-43-MACOS.md) → [`../lab43/LAB-43-GUIDE.md`](../lab43/LAB-43-GUIDE.md)

> Complete these exercises after the slides and before Lab 43.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 43 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Draft PR vs main vs tag pipeline policy for CRM | Do not treat a green Actions run as finishing Lab 43 |
| Plan JDK 21 setup, Maven cache, and `clean verify` | Do not put deploy credentials or kubeconfig in workflow YAML |
| Sketch package-once + SHA-256 artifact identity | Do not skip tests with `-DskipTests` on the verify job |
| List secret handling rules for Actions variables | Do not implement full continuous delivery promotions (Lab 44) |
| Outline `docs/ci-runbook.md` for peer re-runs | Do not apply Terraform from CI in this pre-lab (Lab 45) |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-43-exercises` | `~/java-bootcamp/examples/module-43-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-43-exercises | Out-Null
cd examples\module-43-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-43-exercises
cd examples/module-43-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Define Pipeline Triggers | CI policy design | [`exercise-01-pipeline-policy.md`](exercise-01-pipeline-policy.md) |
| 2 | Plan JDK 21 Verify Job | Maven CI habits | [`exercise-02-java21-verify.md`](exercise-02-java21-verify.md) |
| 3 | Package-Once Identity | Artifact immutability | [`exercise-03-immutable-jar.md`](exercise-03-immutable-jar.md) |
| 4 | Fill ci.yml TODOs | Hands-on workflow draft | [`exercise-04-workflow-todos.md`](exercise-04-workflow-todos.md) |
| 5 | Actions Secrets Checklist | Secret hygiene | [`exercise-05-secrets-checklist.md`](exercise-05-secrets-checklist.md) |
| 6 | Outline CI Runbook | Peer operability | [`exercise-06-ci-runbook-outline.md`](exercise-06-ci-runbook-outline.md) |

Keep all work separate from `examples/lab43-crm` (or the lab’s named project folder); that project begins in the full lab.
