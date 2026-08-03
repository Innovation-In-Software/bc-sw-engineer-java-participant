# Module 43 — Learn → Practice → Review (participant)

**Theme:** GitHub Actions CI/CD for CRM (Bitbucket comparison awareness)  
**CRM:** PR verify · main/tag package-once + SHA-256 · secrets hygiene · CI runbook

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 92–102 SCM/PR | [Ex 1](exercises/exercise-01-pipeline-policy.md) | ~10–12 |
| **B** | 103–106 Actions | [Ex 4](exercises/exercise-04-workflow-todos.md) | ~12–15 |
| **C** | 107–110 build | [Ex 2](exercises/exercise-02-java21-verify.md) → [3](exercises/exercise-03-immutable-jar.md) | ~20–24 |
| **D** | 111–117 quality/gates | [Ex 5](exercises/exercise-05-secrets-checklist.md) → [6](exercises/exercise-06-ci-runbook-outline.md) | ~16–20 |
| **E** | 118–121 | [Lab 43](lab43/LAB-43-GUIDE.md) timed ~45 min | ~45 |

## Practice order

**1 → 4 → 2 → 3 → 5 → 6** then Lab 43.

## Do / don't

| Do now | Don't yet |
| --- | --- |
| PR/main/tag policy; JDK 21 verify; package-once SHA | Put deploy creds / kubeconfig in YAML |
| Actions secrets checklist; CI runbook | Full CD promotions (Lab 44) |
| Controlled failure + restore plan | Terraform from CI (Lab 45) |

## Hard gate before Lab 43

- [ ] Ex notes complete (order 1→4→2→3→5→6)
- [ ] CRM module compiles/tests under Maven locally
- [ ] GitHub repo with Actions enabled (no secrets in Git)
