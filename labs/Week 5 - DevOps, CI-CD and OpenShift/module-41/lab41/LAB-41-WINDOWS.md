# Lab 41: Containerize the Spring Boot CRM — Multi-Stage Dockerfile, Non-Root, Health — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9.x · Docker Desktop · PostgreSQL in `crm-postgres` · IntelliJ  
**Full lab steps:** [LAB-41-GUIDE.md](LAB-41-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-41-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** — open **`%USERPROFILE%\java-bootcamp`**, not the course clone
- Docker Desktop engine running (`docker version` shows a Server)
- Lab 40 project under `examples\lab40-crm`

## Paths (Windows)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `%USERPROFILE%\bc-sw-engineer-java-participant\` (adjust if you cloned elsewhere) |
| Your repo (write / run / commit) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab41-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-41` |
| Shell | Windows PowerShell inside IntelliJ |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-41 | Out-Null
cd examples\lab41-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab41-crm
docker build --pull -t crm-api:lab41 .
docker run -d --name crm-lab41 --network lab37-crm_default --memory=512m --env-file .env.local -p 8080:8080 crm-api:lab41
curl.exe -fsS http://127.0.0.1:8080/actuator/health/readiness
curl.exe -fsS -H "X-Correlation-Id: lab-request-001" "http://127.0.0.1:8080/api/customers?status=ACTIVE"
docker exec crm-lab41 id
docker stop --time 20 crm-lab41
```

Verified on this laptop (2026-08-11), Temurin 21.0.11, Maven 3.9.9, Docker Desktop 4.26.1 / Engine 24.0.7, PostgreSQL 16.14 in `crm-postgres`:

- **Copy Lab 40** from `java-bootcamp\examples\lab40-crm` into `examples\lab41-crm`, then **merge** `starter\*` from the **course clone**. Do not grade files left under `labs\`.
- Isolated database **`crm_lab41`**. Do not Flyway-migrate Lab 39/40 DBs.
- JDBC from another container: hostname **`crm-postgres`** on network **`lab37-crm_default`**. `localhost` inside the CRM container is the container itself.
- Compose Postgres user is **`crm` / `change-me`**, not `crm_app`. Map `CRM_DB_*` in `application-docker.yml` (Lab 40 yml alone ignores those keys).
- `.env.example` has an empty `CRM_DB_PASSWORD`. Copy to **`.env.local`** (gitignored). Do not `--env-file .env.example` if the password is blank.
- Lab 40 has **no** `mvnw` — Dockerfile and host commands use **`mvn`**. Image build uses **`-DskipTests`** (Testcontainers cannot run during `docker build`).
- First `docker build --pull` downloaded `maven:3.9-eclipse-temurin-21` + `eclipse-temurin:21-jre` (~several minutes). Image `crm-api:lab41` **404 MB**, `Config.User=10001`. `RepoDigests` empty until push — record Image Id for Lab 42.
- Add `spring-boot-starter-actuator`. JRE image has no curl — HEALTHCHECK uses `/dev/tcp`. Lab 40 has **no** Spring Security — do not expect health **401** unless you added a filter chain.
- Port **8080** may still be held by leftover `mvn spring-boot:run`. `netstat -ano | findstr :8080` then stop that PID.
- Docker Desktop “WSL drive missing” on this laptop was transient — Engine was already healthy. Do **not** `wsl --unregister docker-desktop-data` unless the engine is actually down.
- HTTP smoke on the Lab 40 API is **`GET /api/customers`**. There is no `/api/v1/interactions` and no Basic `admin:change-me` unless you added them.
- `docker stop --time 20` → Tomcat graceful shutdown in **~1.2 s**. Bad `CRM_DB_HOST=no-such-host` → Flyway `UnknownHostException`.

### If it fails

| Symptom | Fix |
| --- | --- |
| `bind: Only one usage of … port 8080` | Kill leftover Java on 8080; `docker rm -f crm-lab41` |
| Readiness never UP | Join `lab37-crm_default`; `CRM_DB_HOST=crm-postgres`; `CRM_DB_NAME=crm_lab41`; `CRM_DB_USER=crm` |
| Password authentication failed | User is `crm`, not `crm_app` |
| `COPY mvnw` / `./mvnw` | Use `mvn` |
| Work ended up in the course clone | Move to `java-bootcamp`; never push homework to the participant remote |


## Do the lab

Complete every step in **[LAB-41-GUIDE.md](LAB-41-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-41`. Redact secrets.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab41-crm` (not the course `labs/` tree) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-41/` | Pass / Fail |
