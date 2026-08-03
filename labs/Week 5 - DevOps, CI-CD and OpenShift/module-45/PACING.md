# Module 45 — Learn → Practice → Review (participant)

**Theme:** Infrastructure as Code (Terraform + Ansible) with AI assistance  
**CRM:** Bounded non-prod contract · validate/plan · idempotent Ansible · AI review · cost/exposure

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 148–153 IaC | [Ex 1](exercises/exercise-01-infra-contract.md) | ~12–15 |
| **B** | 154–164 Terraform/state | [Ex 2](exercises/exercise-02-terraform-checks.md) | ~10–12 |
| **C** | 165–171 Ansible | [Ex 3](exercises/exercise-03-ansible-idempotence.md) | ~10–12 |
| **D** | 172–173 together/best practices | [Ex 4](exercises/exercise-04-ai-prompt-todos.md) → [5](exercises/exercise-05-ai-review-record.md) → [6](exercises/exercise-06-cost-exposure-quiz.md) | ~26–32 |
| **E** | 174–177 | [Lab 45](lab45/LAB-45-GUIDE.md) timed ~45 min | ~45 |

## Practice order

**1 → 2 → 3 → 4 → 5 → 6** then Lab 45.

## Do / don't

| Do now | Don't yet |
| --- | --- |
| Infra contract; fmt/validate/plan narrative; idempotent Ansible sketch | Commit tfstate / real tfvars / cloud keys |
| Constrained AI prompts + review record (≥1 harden/reject) | Unapproved destroy of shared training infra |
| Cost/exposure awareness | Embed CRM PII in IaC; Kafka DLT procedures (Lab 46) |

## Hard gate before Lab 45

- [ ] Ex notes complete
- [ ] Contract forbids public DB / unbounded cost
- [ ] No secrets or state files planned for Git
