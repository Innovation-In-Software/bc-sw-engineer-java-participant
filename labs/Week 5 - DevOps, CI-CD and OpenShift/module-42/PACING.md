# Module 42 — Learn → Practice → Review (participant)

**Theme:** Kubernetes (k3s) Deployment (OpenShift comparison awareness)  
**CRM:** Deployment + Service + ConfigMap + Secret refs + Ingress · Lab 41 image `crm-api:lab41` on **local k3d**

## Checkpoint map

| CP | After slides | Practice | Minutes |
| -- | ------------ | -------- | ------- |
| **A** | 61–73 resources | [Ex 1](exercises/exercise-01-manifest-map.md) → [2](exercises/exercise-02-config-vs-secret.md) | ~22–27 |
| **B** | 74–77 rollout | [Ex 3](exercises/exercise-03-probe-design.md) → [4](exercises/exercise-04-yaml-todos.md) → [5](exercises/exercise-05-rollout-rollback.md) | ~34–42 |
| **C** | 78–84 k3s/OpenShift | Instructor map: Traefik Ingress vs Routes (no new file) | ~10–15 |
| **D** | 85–87 ops | [Ex 6](exercises/exercise-06-runbook-outline.md) | ~8–10 |
| **E** | 88–91 | [Lab 42](lab42/LAB-42-GUIDE.md) timed ~45 min | ~45 |

## Practice order

**1 → 2 → 3 → 4 → 5 → 6** then Lab 42.

## Do / don't

| Do now | Don't yet |
| --- | --- |
| Manifests, probes, ConfigMap/Secret split, rollback plan | Commit Secret values / kubeconfig |
| Local k3d + imported `crm-api:lab41`; Traefik Ingress | Invent Routes; apply `secret.example.yaml` |
| Runbook outline | GitHub Actions deploy (43–44) / Terraform cluster (45) |

## Hard gate before Lab 42

- [ ] Ex notes complete in `java-bootcamp/examples/module-42-exercises/notes/`
- [ ] Lab 41 image `crm-api:lab41` on the laptop (Image Id recorded)
- [ ] Docker Desktop + k3d plan (no secrets in Git)
