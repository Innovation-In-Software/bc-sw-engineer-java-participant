# Lab 42: Kubernetes (k3s) Deployment — Deployment, Service, ConfigMap, Ingress, Probes, Rollout — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Docker Desktop · k3d · kubectl · Lab 41 image `crm-api:lab41` · IntelliJ  
**Full lab steps:** [LAB-42-GUIDE.md](LAB-42-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-42-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete
- IntelliJ with **Project SDK 21** — open **`~/java-bootcamp`**, not the course clone
- Docker Desktop engine running (`docker version` shows a Server)
- Lab 41 image `crm-api:lab41` on this machine (`docker image inspect crm-api:lab41`)
- `crm-postgres` running (Lab 37 compose) with host port **5432**
- `k3d` and `kubectl` on PATH

## Paths (macOS)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `~/bc-sw-engineer-java-participant/` (adjust if you cloned elsewhere) |
| Your repo (write / run / commit) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab42-crm` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-42` |
| k3d kubeconfig | `~/.config/k3d/kubeconfig-lab42.yaml` |
| Shell | macOS Terminal inside IntelliJ |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-42
cd examples/lab42-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab42-crm
export KUBECONFIG="${HOME}/.config/k3d/kubeconfig-lab42.yaml"

kubectl apply --dry-run=client -n crm-training \
  -f k8s/configmap.yaml -f k8s/deployment.yaml -f k8s/service.yaml -f k8s/ingress.yaml

kubectl apply -f k8s/configmap.yaml -n crm-training
kubectl apply -f k8s/deployment.yaml -f k8s/service.yaml -f k8s/ingress.yaml -n crm-training
kubectl rollout status deployment/crm-api -n crm-training --timeout=180s

curl -fsS -H "Host: crm-api.training.example.test" \
  http://127.0.0.1:8088/actuator/health/readiness
curl -fsS -H "Host: crm-api.training.example.test" \
  -H "X-Correlation-Id: lab-request-001" \
  "http://127.0.0.1:8088/api/customers?status=ACTIVE"
```

Do **not** `kubectl apply -f k8s/` — that applies `secret.example.yaml`.

Same verification notes as Windows (2026-08-11): copy **starter** from the course clone, k3d pin **`rancher/k3s:v1.28.15-k3s1`**, port **`8088:80@loadbalancer`**, rewrite kubeconfig `host.docker.internal` → **`127.0.0.1`**, `k3d image import crm-api:lab41`, database **`crm_lab42`**, JDBC **`host.k3d.internal`**, user **`crm`**, profile **`docker`**, smoke **`GET /api/customers`** with Host header. Details: [LAB-42-WINDOWS.md](LAB-42-WINDOWS.md) and [LAB-42-GUIDE.md](LAB-42-GUIDE.md).

### If it fails

| Symptom | Fix |
| --- | --- |
| kubelet cgroup v1 unsupported | Pin `rancher/k3s:v1.28.15-k3s1` |
| kubectl timeout | `export KUBECONFIG=…/kubeconfig-lab42.yaml`; rewrite `host.docker.internal` → `127.0.0.1` |
| ImagePullBackOff | `k3d image import crm-api:lab41 -c lab42`; no fake digest |
| Readiness never UP | Profile `docker`; `CRM_DB_HOST=host.k3d.internal`; `CRM_DB_NAME=crm_lab42`; `CRM_DB_USER=crm` |
| Password authentication failed | User is `crm`, not `crm_app` |
| curl hostname NXDOMAIN | Host header + `http://127.0.0.1:8088` |
| 404 `/api/v1/interactions` | Use `GET /api/customers` |
| Work ended up in the course clone | Move to `~/java-bootcamp` |


## Do the lab

Complete every step in **[LAB-42-GUIDE.md](LAB-42-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-42`. Redact secrets and kubeconfig.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ | Pass / Fail |
| 2 | Lab project under `examples/lab42-crm` (not the course `labs/` tree) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-42/` | Pass / Fail |
