# Lab 51 starter — session block (~45 minutes)

**Theme:** Security / deploy checklist + Dockerfile & k8s stub TODOs  

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | checklist · non-root Dockerfile · probes · 401/403 · rollback digest |
| **Hard gate** | Pre-lab Pass · no secrets in Git |

**Target:** `~/java-bootcamp/examples/customer-management-platform/`

Timed-path policy: [`labs/_STARTER-PATH.md`](../../../../_STARTER-PATH.md)

## Copy into your workspace

**Windows (PowerShell)** — from this lab folder:

```powershell
$dest = "$env:USERPROFILE\java-bootcamp\examples\customer-management-platform"
New-Item -ItemType Directory -Force -Path $dest | Out-Null
Copy-Item -Recurse -Force ".\starter\*" $dest\
cd $dest
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/customer-management-platform
cp -R starter/. ~/java-bootcamp/examples/customer-management-platform/
cd ~/java-bootcamp/examples/customer-management-platform
```

## 45-minute session checklist

- [ ] Complete `docs/security-deploy-checklist.md` threat + gate rows
- [ ] Fill Dockerfile TODOs (non-root user, multi-stage, health)
- [ ] Fill `k8s/deployment.yaml` TODOs (probes, resources, image digest placeholder)
- [ ] Write smoke curl notes for 200 (auth) / 401 / 403 using `CUS-1001`
- [ ] Note rollback plan (previous digest)

## Smoke test

```bash
ls docs/security-deploy-checklist.md Dockerfile k8s/deployment.yaml
# When Docker available:
# docker build -t crm-api:session-local .
# kubectl apply --dry-run=client -f k8s/deployment.yaml
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-51/`. Redact tokens.

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Security checklist covers deny-by-default + secret hygiene | Pass / Fail |
| Dockerfile has non-root + multi-stage TODOs addressed or tracked | Pass / Fail |
| k8s stub has readiness/liveness probe TODOs filled | Pass / Fail |
| Smoke matrix lists 401/403 expectations | Pass / Fail |

Full path (multi-day): JWT resource server, GH Actions, image scan, live k3s rollout + rollback — see GUIDE.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Dry-run schema errors | Fix apiVersion/required probe fields |
| Dockerfile still root | Add USER non-root after multi-stage |
| Smoke matrix missing 403 | Add wrong-role case |
| Digest placeholder empty | Note sha256:TODO until build |
