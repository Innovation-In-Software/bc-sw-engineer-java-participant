# Module 51 — Learn → Practice → Review (participant)

**Theme:** Capstone Security, CI/CD and Deployment  
**CRM:** Threat/RBAC · pipeline gates · digest-pinned k3s deploy · smoke/rollback · readiness

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 89–96 security | [Ex 1](exercises/exercise-01-threat-checklist.md) → [2](exercises/exercise-02-rbac-negative-plan.md) | ~20–24 |
| **B** | 97–104 container/CI | [Ex 3](exercises/exercise-03-pipeline-gates.md) | ~10–12 |
| **C** | 108–111 k3s | [Ex 4](exercises/exercise-04-deploy-evidence-todos.md) | ~10–12 |
| **D** | 112–115 readiness | [Ex 5](exercises/exercise-05-rollback-smoke.md) → [6](exercises/exercise-06-release-readiness.md) | ~16–20 |
| **E** | 116–119 | [Lab 51](lab51/LAB-51-GUIDE.md) session ~45 min | ~45 |

Slides 105–107 (Terraform/Ansible): awareness only—execute with GitHub Actions + k3s.

## Practice order

**1 → 2 → 3 → 4 → 5 → 6** then Lab 51.

## Do / don't

| Do now | Don't yet |
| --- | --- |
| Threat/RBAC plan; gates; digest evidence; smoke/rollback; readiness | Commit kubeconfig / registry passwords / `.env` |
| Pin image digest; deny-by-default | `:latest` as only identity; skip security tests |
| Residual risk owners | Treat warmup as finished Lab 51 release |

## Hard gate before Lab 51

- [ ] Ex notes complete
- [ ] 401/403 smoke matrix drafted
- [ ] Digest + rollback target named (placeholders OK)
