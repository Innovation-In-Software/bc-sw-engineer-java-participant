# Lab 41 starter — timed path (~45 minutes)

**Theme:** Multi-stage Dockerfile — non-root, health, no secrets in layers

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | Multi-stage · USER 10001 · HEALTHCHECK · no password in Dockerfile |
| **Hard gate** | Pre-lab Pass · Docker · CRM sources beside starter |

## Copy into your workspace

Do **not** grade work only inside the course `labs/` clone. Copy this `starter/` into your bootcamp examples tree as `lab41-crm` (beside your CRM `pom.xml` / `src`).

**Windows (PowerShell)** — from this lab folder:

```powershell
New-Item -ItemType Directory -Force -Path "$env:USERPROFILE\java-bootcamp\examples\lab41-crm" | Out-Null
Copy-Item -Recurse -Force ".\starter\*" "$env:USERPROFILE\java-bootcamp\examples\lab41-crm\"
cd $env:USERPROFILE\java-bootcamp\examples\lab41-crm
```

**macOS / Linux:**

```bash
mkdir -p ~/java-bootcamp/examples/lab41-crm
cp -R starter/. ~/java-bootcamp/examples/lab41-crm/
cd ~/java-bootcamp/examples/lab41-crm
```

## 45-minute checklist

- [ ] Complete `Dockerfile` TODOs (build stage + `USER 10001` + `HEALTHCHECK`)
- [ ] Finish `.dockerignore` (exclude `.env`, `target/`, `.git`)
- [ ] Copy `.env.example` → local `.env` (never commit `.env`)
- [ ] Build `crm-api:lab41`; confirm non-root user
- [ ] Fill `docs/container-runbook.md` with exact build/run/stop commands

## Smoke test

```bash
docker build -t crm-api:lab41 .
docker run --rm --name crm-lab41 --env-file .env.example -p 8080:8080 crm-api:lab41
# In another terminal (once healthy):
# curl -s http://127.0.0.1:8080/actuator/health/readiness
docker stop crm-lab41
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-41/` (redact secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Multi-stage Dockerfile builds | Pass / Fail |
| Runtime user is non-root (UID 10001) | Pass / Fail |
| No password/`CRM_DB_PASSWORD` in Dockerfile | Pass / Fail |
| HEALTHCHECK / readiness path documented | Pass / Fail |

Continue remaining GUIDE steps as homework / full path if needed.


### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Huge build context | Fix `.dockerignore` |
| Jar not found | Match Boot jar name in COPY |
| Permission denied | `--chown` before USER 10001 |
| Health 401 | Permit actuator health paths |
