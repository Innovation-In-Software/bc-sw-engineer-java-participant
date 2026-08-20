# Lab 41 starter — timed path (~45 minutes)

**Theme:** Multi-stage Dockerfile — non-root, health, no secrets in layers

## Two folders

| Folder | You… |
| ------ | ---- |
| **Course clone** (this `starter/` directory) | Read / copy **from** here |
| **`java-bootcamp`** | Copy Lab 40 **to** `examples/lab41-crm`, merge these stubs, build, commit |

Do **not** grade work inside the course `labs/` tree. IntelliJ stays on `java-bootcamp`.

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | Multi-stage · USER 10001 · HEALTHCHECK · no password in Dockerfile |
| **Hard gate** | Pre-lab Pass · Docker · Lab 40 CRM in `java-bootcamp` |

## Copy into your workspace

1. Copy **your** Lab 40 CRM into `java-bootcamp/examples/lab41-crm`.
2. Merge **this** `starter/` on top (Dockerfile, ignore, env example, runbook). Starter is **not** a full Spring app.

**Windows (PowerShell):**

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$courseLab41 = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 5 - DevOps, CI-CD and OpenShift\module-41\lab41"

Copy-Item -Recurse -Force "$jb\examples\lab40-crm" "$jb\examples\lab41-crm"
Copy-Item -Recurse -Force "$courseLab41\starter\*" "$jb\examples\lab41-crm\"
cd "$jb\examples\lab41-crm"
```

**macOS / Linux:**

```bash
JB=~/java-bootcamp
COURSE_LAB41=~/bc-sw-engineer-java-participant/labs/Week\ 5\ -\ DevOps,\ CI-CD\ and\ OpenShift/module-41/lab41

cp -R "$JB/examples/lab40-crm" "$JB/examples/lab41-crm"
cp -R "$COURSE_LAB41/starter/." "$JB/examples/lab41-crm/"
cd "$JB/examples/lab41-crm"
```

Then create database **`crm_lab41`** and fill `.env.local`. See [LAB-41-GUIDE.md](../LAB-41-GUIDE.md) Step 1–2.

## 45-minute checklist

- [ ] Merge actuator snippet + `application-docker.yml` (`CRM_DB_*` → JDBC)
- [ ] Complete `Dockerfile` TODOs (`mvn` + `USER 10001` + `/dev/tcp` HEALTHCHECK)
- [ ] Finish `.dockerignore` (exclude `.env`, `target/`, `.git`)
- [ ] Copy `.env.example` → **`.env.local`** (never commit it; do not run with empty example password)
- [ ] `docker build --pull -t crm-api:lab41 .`; `docker image inspect` user **10001**
- [ ] Fill `docs/container-runbook.md` with exact build/run/stop commands

## Smoke test

From **`java-bootcamp/examples/lab41-crm`** after filling TODOs:

```powershell
# Windows
docker build --pull -t crm-api:lab41 .
docker run -d --name crm-lab41 --network lab37-crm_default --memory=512m --env-file .env.local -p 8080:8080 crm-api:lab41
curl.exe -fsS http://127.0.0.1:8080/actuator/health/readiness
docker exec crm-lab41 id
```

```bash
# macOS / Linux
docker build --pull -t crm-api:lab41 .
docker run -d --name crm-lab41 --network lab37-crm_default \
  --memory=512m --env-file .env.local -p 8080:8080 crm-api:lab41
curl -fsS http://127.0.0.1:8080/actuator/health/readiness
docker exec crm-lab41 id
```

Evidence under `~/java-bootcamp/notes/screenshots/lab-41/` (redact secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Work is in `java-bootcamp/examples/lab41-crm` (not course `labs/`) | Pass / Fail |
| Multi-stage Dockerfile builds | Pass / Fail |
| Runtime user is non-root (UID 10001) | Pass / Fail |
| No password/`CRM_DB_PASSWORD` in Dockerfile | Pass / Fail |
| HEALTHCHECK / readiness path documented | Pass / Fail |

Continue remaining GUIDE steps as homework (networked list smoke, stop, runbook).

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Huge build context | Fix `.dockerignore` |
| `COPY mvnw` | Lab 40 has no wrapper — use `mvn` |
| Jar not found | Rename to `target/app.jar` in the build stage |
| Permission denied | `--chown` before USER 10001 |
| Readiness never UP | `--network lab37-crm_default`; `CRM_DB_HOST=crm-postgres`; `.env.local` password |
