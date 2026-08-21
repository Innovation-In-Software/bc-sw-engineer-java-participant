# Module 44 — Learn → Practice → Review (participant)

**Theme:** Continuous Delivery and Release Management  
**CRM:** Promote Lab 43 `jarSha256` test→staging→prod · gates · checklist · rollback · list-API smoke

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

Write notes in **`java-bootcamp/examples/module-44-exercises/notes/`**, not the course clone.

## Do / don't

| Do now | Don't yet |
| --- | --- |
| Manifest from Lab 43 `SHA256SUMS`; promotion gates; checklist; rollback; list-API smoke plan | Rebuild artifact on deploy host (`mvn package`) |
| Promote Lab 43 package-once **`jarSha256`** | Invent GHCR digest / put env secrets inside the artifact |
| Plan a **root** `crm-cd.yml` | Nested `.github/` under `examples/` as the live file |
| Synthetic CRM fixtures only | Terraform/Ansible apply (Lab 45) / Kafka DLT (Lab 46) |

## Hard gate before Lab 44

- [ ] Ex notes complete in `java-bootcamp/examples/module-44-exercises/notes/` (order 1→2→3→5→4→6)
- [ ] Lab 43 `crm-jar` / `SHA256SUMS` available (`jarSha256` — image digest optional)
- [ ] No secrets or real customer data in plans
