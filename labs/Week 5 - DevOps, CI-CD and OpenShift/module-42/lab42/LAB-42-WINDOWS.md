# Lab 42: Kubernetes (k3s) Deployment — Deployment, Service, ConfigMap, Ingress, Probes, Rollout — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven · Docker as assigned · kubectl + kubeconfig · GitHub Actions · IntelliJ  
**Full lab steps:** [LAB-42-GUIDE.md](LAB-42-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-42-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab42-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-42` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-42 | Out-Null
cd examples\lab42-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab42-crm
$env:Path = "$env:USERPROFILE\bin;" + $env:Path
$env:KUBECONFIG = "$env:USERPROFILE\.config\k3d\kubeconfig-lab42.yaml"
kubectl apply --dry-run=client -f k8s/ -n crm-training
kubectl apply -f k8s/configmap.yaml -n crm-training
kubectl rollout status deployment/crm-api -n crm-training --timeout=180s
curl.exe -fsS -H "Host: crm-api.training.example.test" http://127.0.0.1:8088/actuator/health/readiness
```

Verified on this laptop (2026-08-11), Docker Desktop 4.26.1 / Engine 24.0.7, k3d **5.9.0**, kubectl **1.28.2**:

- No instructor kubeconfig for `100.22.136.97:6443`. Local substitute: `k3d cluster create lab42 --image rancher/k3s:v1.28.15-k3s1 -p "8088:80@loadbalancer"`.
- Default k3s **v1.35.5** fails: kubelet rejects **cgroup v1** on this Docker Desktop. Pin **v1.28.15-k3s1**.
- Rewrite kubeconfig `server:` from `host.docker.internal` to **`https://127.0.0.1:<mapped-port>`** — otherwise kubectl hits a LAN IP and times out.
- `k3d image import crm-api:lab41 -c lab42` then `imagePullPolicy: IfNotPresent`. Isolated DB **`crm_lab42`**, JDBC host **`host.k3d.internal`**.
- Secret out-of-band (`kubectl create secret generic`). Do not apply `secret.example.yaml` with real passwords.
- Ingress smoke: Host `crm-api.training.example.test` on **localhost:8088**. Rollback: `set image …:does-not-exist` → `ErrImagePull` → `rollout undo`.

### If it fails

| Symptom | Fix |
| --- | --- |
| kubelet cgroup v1 unsupported | Use `rancher/k3s:v1.28.15-k3s1` |
| kubectl to `:8080` | Set `KUBECONFIG` to k3d file; not default localhost |
| `host.docker.internal` timeout | Replace with `127.0.0.1` in kubeconfig |
| ImagePullBackOff | `k3d image import` + `IfNotPresent` |

## Do the lab

Complete every step in **[LAB-42-GUIDE.md](LAB-42-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-42`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab42-crm` as in [LAB-42-GUIDE.md](LAB-42-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-42/` | Pass / Fail |
