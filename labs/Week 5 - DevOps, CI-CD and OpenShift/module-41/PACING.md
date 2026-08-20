# Module 41 — Learn → Practice → Review (participant)

**Theme:** Containerization with Docker  
**CRM:** multi-stage `crm-api:lab41` · non-root UID `10001` · HEALTHCHECK · no secrets in layers

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 30–45 images/optimize | [Ex 1](exercises/exercise-01-multistage-sketch.md) | ~12–15 |
| **B** | 46–49 Dockerfile | [Ex 4](exercises/exercise-04-dockerfile-todos.md) → [2](exercises/exercise-02-dockerignore-env.md) | ~22–27 |
| **C** | 50–54 run/env | [Ex 3](exercises/exercise-03-health-resources.md) | ~10–12 |
| **D** | 55–56 registry | [Ex 5](exercises/exercise-05-digest-discipline.md) → [6](exercises/exercise-06-smoke-plan.md) | ~18–22 |
| **E** | 57–60 | [Lab 41](lab41/LAB-41-GUIDE.md) timed ~45 min | ~45 |

## Practice order

**1 → 4 → 2 → 3 → 5 → 6** then Lab 41.

## Do / don't

| Do now | Don't yet |
| --- | --- |
| Multi-stage, non-root, dockerignore, env at runtime | Secrets in Dockerfile ARG/ENV |
| HEALTHCHECK + digest notes | k3s Deployments (Lab 42) / GHA package (Lab 43) |
| Smoke plan for readiness + CUS-1001 | `:latest`-only as the release contract |

## Hard gate before Lab 41

- [ ] Ex notes complete in `java-bootcamp/examples/module-41-exercises/notes/`
- [ ] Docker Desktop/engine available (`docker version` shows a Server)
- [ ] Lab 40 CRM in `java-bootcamp/examples/lab40-crm`
