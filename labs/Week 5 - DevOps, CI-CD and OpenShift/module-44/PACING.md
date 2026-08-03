# Module 44 — Learn → Practice → Review (participant)

**Theme:** Continuous Delivery and Release Management  
**CRM:** Immutable promote test→staging→prod · gates · checklist · rollback · staging smoke

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 122–127 CD basics | [Ex 1](exercises/exercise-01-cd-vs-cdeploy.md) → [2](exercises/exercise-02-manifest-fields.md) | ~18–22 |
| **B** | 128–131 environments | [Ex 3](exercises/exercise-03-promotion-gates.md) | ~12–15 |
| **C** | 132–138 strategies/rollback | [Ex 5](exercises/exercise-05-rollback-runbook.md) | ~10–12 |
| **D** | 139–143 governance | [Ex 4](exercises/exercise-04-checklist-todos.md) → [6](exercises/exercise-06-staging-smoke-plan.md) | ~18–22 |
| **E** | 144–147 | [Lab 44](lab44/LAB-44-GUIDE.md) timed ~45 min | ~45 |

## Practice order

**1 → 2 → 3 → 5 → 4 → 6** then Lab 44.

## Do / don't

| Do now | Don't yet |
| --- | --- |
| Manifest digests; promotion gates; checklist; rollback; staging smoke plan | Rebuild artifact on deploy host |
| Promote Lab 43 package-once identity | Put env secrets inside the artifact |
| Synthetic CRM fixtures only | Terraform/Ansible apply (Lab 45) / Kafka DLT (Lab 46) |

## Hard gate before Lab 44

- [ ] Ex notes complete (order 1→2→3→5→4→6)
- [ ] Lab 43 package-once SHA / digest available
- [ ] No secrets or real customer data in plans
