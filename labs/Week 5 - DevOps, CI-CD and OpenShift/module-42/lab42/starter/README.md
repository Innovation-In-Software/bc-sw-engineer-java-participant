# Lab 42 starter — timed path (~45 minutes)

**Theme:** k3s / Kubernetes manifests — Deployment, Service, ConfigMap, Ingress, probes

## Two folders

| Folder | You… |
| ------ | ---- |
| **Course clone** (this `starter/` directory) | Read / copy **from** here |
| **`java-bootcamp`** | Copy these YAML stubs **to** `examples/lab42-crm`, fill TODOs, apply to **local k3d**, commit |

Do **not** grade work inside the course `labs/` tree. IntelliJ stays on `java-bootcamp`. Starter is **not** a Spring app and **not** a cluster.

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | dry-run · 3 probes · empty Secret example · runbook undo |
| **Hard gate** | Pre-lab Pass · Lab 41 image `crm-api:lab41` |

## Copy into your workspace

**Windows (PowerShell):**

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$courseLab42 = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 5 - DevOps, CI-CD and OpenShift\module-42\lab42"

New-Item -ItemType Directory -Force -Path "$jb\examples\lab42-crm" | Out-Null
Copy-Item -Recurse -Force "$courseLab42\starter\*" "$jb\examples\lab42-crm\"
cd "$jb\examples\lab42-crm"
```

**macOS / Linux:**

```bash
JB=~/java-bootcamp
COURSE_LAB42=~/bc-sw-engineer-java-participant/labs/Week\ 5\ -\ DevOps,\ CI-CD\ and\ OpenShift/module-42/lab42

mkdir -p "$JB/examples/lab42-crm"
cp -R "$COURSE_LAB42/starter/." "$JB/examples/lab42-crm/"
cd "$JB/examples/lab42-crm"
```

Then create k3d + `crm_lab42` as in [LAB-42-GUIDE.md](../LAB-42-GUIDE.md) Step 1.

## 45-minute checklist

- [ ] Work is in `java-bootcamp/examples/lab42-crm` (not course `labs/`)
- [ ] ConfigMap: profile **`docker`**, `CRM_DB_HOST=host.k3d.internal`, db **`crm_lab42`**, user **`crm`**
- [ ] `secret.example.yaml` documents keys only — **never apply** it
- [ ] Distinct startup / readiness / liveness (startup on **readiness** path)
- [ ] Image `crm-api:lab41` (record Lab 41 Image Id; no fake digest)
- [ ] Dry-run listed files (not `kubectl apply -f k8s/`)
- [ ] Fill `docs/deployment-runbook.md`

## Smoke test

From **`java-bootcamp/examples/lab42-crm`**:

```bash
kubectl apply --dry-run=client -n crm-training \
  -f k8s/configmap.yaml -f k8s/deployment.yaml -f k8s/service.yaml -f k8s/ingress.yaml
```

Live apply (homework / full path) uses the same listed files plus an out-of-band Secret. Host-header smoke:

```bash
curl -fsS -H "Host: crm-api.training.example.test" \
  http://127.0.0.1:8088/actuator/health/readiness
curl -fsS -H "Host: crm-api.training.example.test" \
  -H "X-Correlation-Id: lab-request-001" \
  "http://127.0.0.1:8088/api/customers?status=ACTIVE"
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-42/` (redact kubeconfig/tokens).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Work is in `java-bootcamp/examples/lab42-crm` | Pass / Fail |
| Manifests pass listed-file dry-run | Pass / Fail |
| Three distinct probes configured | Pass / Fail |
| Secret example has no real passwords and is not applied | Pass / Fail |
| Runbook lists apply + Host-header smoke + rollback undo | Pass / Fail |

Continue remaining GUIDE steps as homework (k3d import, live apply, list smoke, undo).

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Dry-run schema errors | Fix API versions/required fields |
| Selector mismatch | Align Service selector with Pod labels |
| Probe copy-paste same | Distinct startup / ready / live |
| Real password in example | Remove; use placeholders only |
| `apply -f k8s/` | That installs the fake Secret — apply listed files only |
