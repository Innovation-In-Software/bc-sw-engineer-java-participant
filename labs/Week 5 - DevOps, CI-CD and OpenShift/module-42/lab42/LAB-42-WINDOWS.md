# Lab 42: Kubernetes (k3s) Deployment — Deployment, Service, ConfigMap, Ingress, Probes, Rollout — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** Docker Desktop · k3d · kubectl · Lab 41 image `crm-api:lab41` · IntelliJ  
**Full lab steps:** [LAB-42-GUIDE.md](LAB-42-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-42-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete
- IntelliJ with **Project SDK 21** — open **`%USERPROFILE%\java-bootcamp`**, not the course clone
- Docker Desktop engine running (`docker version` shows a Server)
- Lab 41 image `crm-api:lab41` on this machine (`docker image inspect crm-api:lab41`)
- `crm-postgres` running (Lab 37 compose) with host port **5432**
- `k3d` and `kubectl` on PATH (this laptop: `%USERPROFILE%\bin`)

## Paths (Windows)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `%USERPROFILE%\bc-sw-engineer-java-participant\` (adjust if you cloned elsewhere) |
| Your repo (write / run / commit) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab42-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-42` |
| k3d kubeconfig | `%USERPROFILE%\.config\k3d\kubeconfig-lab42.yaml` |
| Shell | Windows PowerShell inside IntelliJ |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-42 | Out-Null
cd examples\lab42-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab42-crm
$env:Path = "$env:USERPROFILE\bin;" + $env:Path
$env:KUBECONFIG = "$env:USERPROFILE\.config\k3d\kubeconfig-lab42.yaml"

kubectl apply --dry-run=client -n crm-training `
  -f k8s/configmap.yaml -f k8s/deployment.yaml -f k8s/service.yaml -f k8s/ingress.yaml

kubectl apply -f k8s/configmap.yaml -n crm-training
kubectl apply -f k8s/deployment.yaml -f k8s/service.yaml -f k8s/ingress.yaml -n crm-training
kubectl rollout status deployment/crm-api -n crm-training --timeout=180s

curl.exe -fsS -H "Host: crm-api.training.example.test" http://127.0.0.1:8088/actuator/health/readiness
curl.exe -fsS -H "Host: crm-api.training.example.test" -H "X-Correlation-Id: lab-request-001" `
  "http://127.0.0.1:8088/api/customers?status=ACTIVE"
```

Do **not** `kubectl apply -f k8s/` — that applies `secret.example.yaml`.

Verified on this laptop (2026-08-11), Docker Desktop 4.26.1 / Engine 24.0.7, k3d **5.9.0**, kubectl **1.28.2**:

- **Copy starter** from the **course clone** into `java-bootcamp\examples\lab42-crm`. Do not grade files left under `labs\`. Starter is YAML only — not a CRM and not a cluster.
- No instructor kubeconfig for `100.22.136.97:6443`. Local cluster: `k3d cluster create lab42 --image rancher/k3s:v1.28.15-k3s1 -p "8088:80@loadbalancer"`.
- Default k3s **v1.35.5** fails: kubelet rejects **cgroup v1** on this Docker Desktop. Pin **v1.28.15-k3s1**.
- Rewrite kubeconfig `server:` from `host.docker.internal` to **`https://127.0.0.1:<mapped-port>`** — otherwise kubectl hits a LAN IP and times out.
- `k3d image import crm-api:lab41 -c lab42` then `imagePullPolicy: IfNotPresent`. Do not pin `@sha256:REPLACE_…` — Lab 41 `RepoDigests` is empty until push; record **Image Id**.
- Isolated database **`crm_lab42`**. JDBC host from a k3d **pod** is **`host.k3d.internal`** (host-published 5432). `crm-postgres` is Docker-network DNS only — pods cannot use it. Compose user is **`crm` / `change-me`**, not `crm_app`.
- ConfigMap **`SPRING_PROFILES_ACTIVE=docker`** so Lab 41 `application-docker.yml` maps `CRM_DB_*` and enables actuator probes. Profile `k8s` / `kubernetes` 404s probes and JDBC-connects to localhost.
- Secret out-of-band (`kubectl create secret generic`). Never apply `secret.example.yaml`.
- Ingress smoke: Host `crm-api.training.example.test` on **localhost:8088**. Do not curl the hostname without a hosts-file entry.
- HTTP smoke on the Lab 41 API is **`GET /api/customers`**. There is no `/api/v1/interactions` and no Basic `admin:change-me`.
- Rollback: `kubectl set image … crm-api=crm-api:does-not-exist` → `ErrImagePull` → `rollout undo`.
- Namespace **`crm-training`** (`kubectl create namespace` if missing). Always pass `-n crm-training`.

### If it fails

| Symptom | Fix |
| --- | --- |
| kubelet cgroup v1 unsupported | Use `rancher/k3s:v1.28.15-k3s1` |
| kubectl to `:8080` or LAN timeout | Set `KUBECONFIG` to the k3d file; rewrite `host.docker.internal` → `127.0.0.1` |
| ImagePullBackOff | `k3d image import crm-api:lab41 -c lab42`; drop fake digest |
| Readiness never UP / probe 404 | Profile `docker`; `CRM_DB_HOST=host.k3d.internal`; `CRM_DB_NAME=crm_lab42`; `CRM_DB_USER=crm` |
| Password authentication failed | User is `crm`, not `crm_app` |
| curl hostname NXDOMAIN | Host header + `http://127.0.0.1:8088` |
| 404 `/api/v1/interactions` | Use `GET /api/customers` |
| Work ended up in the course clone | Move to `java-bootcamp`; never push homework to the participant remote |


## Do the lab

Complete every step in **[LAB-42-GUIDE.md](LAB-42-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-42`. Redact secrets and kubeconfig.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ | Pass / Fail |
| 2 | Lab project under `examples/lab42-crm` (not the course `labs/` tree) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-42/` | Pass / Fail |
