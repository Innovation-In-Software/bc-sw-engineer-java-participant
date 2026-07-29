# Module 45 — Pre-Lab Exercises

> **Start here for Module 45:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 45 — Infrastructure as Code with Terraform and Ansible  
**Next:** [`../lab45/LAB-45-WINDOWS.md`](../lab45/LAB-45-WINDOWS.md) or [`../lab45/LAB-45-MACOS.md`](../lab45/LAB-45-MACOS.md) → [`../lab45/LAB-45-GUIDE.md`](../lab45/LAB-45-GUIDE.md)

> Complete these exercises **in order** after the slides and **before** Lab 45.  
> Use JDK 21 (and any tools named in the exercises). Work under `examples/module-45-exercises/` — these are **notes files**, not the graded lab project.  
> Lab 45 is the graded consolidation. Do **not** finish Lab 45 during pre-lab.

> **Tip:** Each exercise starts with a **Worked example** — read it, then produce your own file. Submit only the files listed under **What you produce**.

## What you produce (all exercises)

| # | Your deliverable file | Type |
| - | --------------------- | ---- |
| 1 | `notes/lab45-infra-contract.md` | Draft Infra Contract |
| 2 | `notes/lab45-terraform-checks.md` | Plan Terraform Checks |
| 3 | `notes/lab45-ansible-idempotence.md` | Ansible Idempotence Notes |
| 4 | `notes/lab45-ai-prompt-todos.md` | Fill AI Prompt TODOs |
| 5 | `notes/lab45-ai-review-record.md` | Outline AI IaC Review Record |
| 6 | `notes/lab45-cost-exposure-quiz.md` | Cost and Exposure Quiz |

Each exercise page has: **Goal → Deliverable → Steps (copy/paste template) → Expected result → If it fails → Pass criteria**.

## Scope boundary — do not build later technology yet

| Do now | Do not add yet |
| --- | --- |
| Write a bounded infra contract for CRM non-prod environments | Do not `terraform apply` to destroy shared training infra without approval |
| Plan Terraform validate/plan checks and remote-state narrative | Do not commit `*.tfstate`, real tfvars, or cloud keys |
| Sketch idempotent Ansible responsibilities | Do not accept AI output that opens a public database |
| Draft AI prompt constraints and review record fields | Do not embed Amina/Ravi PII in infrastructure code |
| Keep customer fixtures out of `.tf` and inventory | Do not replace app CI/CD labs with infra-only work |

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-45-exercises` | `~/java-bootcamp/examples/module-45-exercises` |
| Notes / mini work | `notes\` | `notes/` |

### Setup

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-45-exercises\notes | Out-Null
cd examples\module-45-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-45-exercises/notes
cd examples/module-45-exercises
java -version
```

**Expected:** Java 21 is available. You create markdown notes here; Lab 45 uses its own `examples/lab45-*/` (or module lab folder) project.

## Exercise index

Complete in this sequence (matches Module slide order):

| # | Exercise | New skill | Deliverable | File |
| --- | --- | --- | --- | --- |
| 1 | Draft Infra Contract | Architecture exercise | `notes/lab45-infra-contract.md` | [`exercise-01-infra-contract.md`](exercise-01-infra-contract.md) |
| 2 | Plan Terraform Checks | Documentation exercise | `notes/lab45-terraform-checks.md` | [`exercise-02-terraform-checks.md`](exercise-02-terraform-checks.md) |
| 3 | Ansible Idempotence Notes | Analysis exercise | `notes/lab45-ansible-idempotence.md` | [`exercise-03-ansible-idempotence.md`](exercise-03-ansible-idempotence.md) |
| 4 | Fill AI Prompt TODOs | Hands-on exercise | `notes/lab45-ai-prompt-todos.md` | [`exercise-04-ai-prompt-todos.md`](exercise-04-ai-prompt-todos.md) |
| 5 | Outline AI IaC Review Record | Documentation exercise | `notes/lab45-ai-review-record.md` | [`exercise-05-ai-review-record.md`](exercise-05-ai-review-record.md) |
| 6 | Cost and Exposure Quiz | Analysis exercise | `notes/lab45-cost-exposure-quiz.md` | [`exercise-06-cost-exposure-quiz.md`](exercise-06-cost-exposure-quiz.md) |

## Done when

All notes files in **What you produce** exist, fixtures match Amina `CUS-1001`/`ACTIVE` and Ravi `CUS-1002`/`PROSPECT` when used, and the prep/readiness checklist self-mark is **Pass**. Then open the Lab 45 OS guide.
