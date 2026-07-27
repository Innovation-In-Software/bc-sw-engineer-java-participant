# Module 45 — Pre-Lab Exercises

> **Start here for Module 45:** [`../README.md`](../README.md) · **Clone + own repo:** [`../../../CLONE-AND-OWN-REPO-GUIDE.md`](../../../CLONE-AND-OWN-REPO-GUIDE.md)

**Module:** 45 — Infrastructure as Code with Terraform and Ansible  
**Next:** [`../lab45/LAB-45-WINDOWS.md`](../lab45/LAB-45-WINDOWS.md) or [`../lab45/LAB-45-MACOS.md`](../lab45/LAB-45-MACOS.md) → [`../lab45/LAB-45-GUIDE.md`](../lab45/LAB-45-GUIDE.md)

> Complete these exercises after the slides and before Lab 45.  
> Use JDK 21 and the tools this module requires.  
> These exercises design and test small pieces; Lab 45 builds the full graded deliverable.  
> Exercise 4 includes a **TODO / fill-in-the-blank starter** (not a complete solution). Replace every `_____` and `// TODO` / `<!-- TODO -->` before moving on.

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
New-Item -ItemType Directory -Force -Path examples\module-45-exercises | Out-Null
cd examples\module-45-exercises
java -version
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-45-exercises
cd examples/module-45-exercises
java -version
```

**Expected:** Java 21 is available (and any module-specific tools named in the exercises). If not, return to Lab 0 / setup before continuing.

## Exercise index

| # | Exercise | New skill | File |
| --- | --- | --- | --- |
| 1 | Draft Infra Contract | IaC requirements bounding | [`exercise-01-infra-contract.md`](exercise-01-infra-contract.md) |
| 2 | Plan Terraform Checks | Validate before apply | [`exercise-02-terraform-checks.md`](exercise-02-terraform-checks.md) |
| 3 | Ansible Idempotence Notes | Config management basics | [`exercise-03-ansible-idempotence.md`](exercise-03-ansible-idempotence.md) |
| 4 | Fill AI Prompt TODOs | Hands-on constrained prompting | [`exercise-04-ai-prompt-todos.md`](exercise-04-ai-prompt-todos.md) |
| 5 | Outline AI IaC Review Record | Human accountability | [`exercise-05-ai-review-record.md`](exercise-05-ai-review-record.md) |
| 6 | Cost and Exposure Quiz | Risk sensing | [`exercise-06-cost-exposure-quiz.md`](exercise-06-cost-exposure-quiz.md) |

Keep all work separate from `examples/lab45-crm` (or the lab’s named project folder); that project begins in the full lab.
