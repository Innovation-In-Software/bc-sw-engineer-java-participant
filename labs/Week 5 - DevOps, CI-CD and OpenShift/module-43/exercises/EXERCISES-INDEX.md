# Module 43 — Pre-Lab Exercises

> **Start here for Module 43:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 43 — GitHub Actions and CI/CD Integration  
**Next:** [`../lab43/LAB-43-WINDOWS.md`](../lab43/LAB-43-WINDOWS.md) or [`../lab43/LAB-43-MACOS.md`](../lab43/LAB-43-MACOS.md) → [`../lab43/LAB-43-GUIDE.md`](../lab43/LAB-43-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 43.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-43-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 43 is the graded consolidation. Do **not** finish Lab 43 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab43-pipeline-policy.md` | Define Pipeline Triggers |
| 2 | `notes/lab43-java21-verify.md` | Plan JDK 21 Verify Job |
| 3 | `notes/lab43-immutable-jar.md` | Package-Once Identity |
| 4 | `notes/lab43-workflow-todos.md` | Fill ci.yml TODOs |
| 5 | `notes/lab43-secrets-checklist.md` | Actions Secrets Checklist |
| 6 | `notes/lab43-ci-runbook-outline.md` | Outline CI Runbook |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

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
New-Item -ItemType Directory -Force -Path examples\module-43-exercises\notes | Out-Null
cd examples\module-43-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-43-exercises/notes
cd examples/module-43-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 43 uses its own `examples/lab43-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Define Pipeline Triggers | Architecture exercise | `notes/lab43-pipeline-policy.md` | [`exercise-01-pipeline-policy.md`](exercise-01-pipeline-policy.md) |
| 2 | Plan JDK 21 Verify Job | Documentation exercise | `notes/lab43-java21-verify.md` | [`exercise-02-java21-verify.md`](exercise-02-java21-verify.md) |
| 3 | Package-Once Identity | Analysis exercise | `notes/lab43-immutable-jar.md` | [`exercise-03-immutable-jar.md`](exercise-03-immutable-jar.md) |
| 4 | Fill ci.yml TODOs | Hands-on exercise | `notes/lab43-workflow-todos.md` | [`exercise-04-workflow-todos.md`](exercise-04-workflow-todos.md) |
| 5 | Actions Secrets Checklist | Documentation exercise | `notes/lab43-secrets-checklist.md` | [`exercise-05-secrets-checklist.md`](exercise-05-secrets-checklist.md) |
| 6 | Outline CI Runbook | Analysis exercise | `notes/lab43-ci-runbook-outline.md` | [`exercise-06-ci-runbook-outline.md`](exercise-06-ci-runbook-outline.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 43 OS guide.
