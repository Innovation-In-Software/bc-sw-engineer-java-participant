# Lab 42 starter — timed path (~45 minutes)

**Theme:** k3s / Kubernetes manifests — Deployment, Service, ConfigMap, Ingress, probes

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | dry-run · 3 probes · empty Secret example · runbook undo |
| **Hard gate** | Pre-lab Pass · Lab 41 digest |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab42-crm`.

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab42-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab42-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab42-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab42-crm
cp -R starter/. ~/java-bootcamp/examples/lab42-crm/
cd ~/java-bootcamp/examples/lab42-crm
```

## 45-minute checklist

- [ ] Fill TODOs in `k8s/configmap.yaml`, `deployment.yaml`, `service.yaml`, `ingress.yaml`
- [ ] Complete `k8s/secret.example.yaml` (structure only — no real values)
- [ ] Set distinct startup / readiness / liveness probes
- [ ] Pin image digest (from Lab 41); set resources + non-root securityContext
- [ ] Dry-run apply; document commands in `docs/deployment-runbook.md`

## Smoke test

```bash
kubectl apply --dry-run=client -f k8s/
# When kubeconfig + namespace ready (instructor k3s):
# kubectl apply -f k8s/
# kubectl rollout status deployment/crm-api -n <your-ns>
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-42/` (redact kubeconfig/tokens).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Manifests pass `kubectl apply --dry-run=client` | Pass / Fail |
| Three distinct probes configured | Pass / Fail |
| Secret example has no real passwords | Pass / Fail |
| Runbook lists apply + rollback undo | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Dry-run schema errors | Fix API versions/required fields |
| Selector mismatch | Align Service selector with Pod labels |
| Probe copy-paste same | Distinct startup/ready/live |
| Real password in example | Remove; use placeholders only |
