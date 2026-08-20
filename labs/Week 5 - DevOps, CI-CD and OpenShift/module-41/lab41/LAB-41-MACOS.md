# Lab 41: Containerize the Spring Boot CRM — Multi-Stage Dockerfile, Non-Root, Health — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven 3.9.x · Docker Desktop · PostgreSQL in `crm-postgres` · IntelliJ  
**Full lab steps:** [LAB-41-GUIDE.md](LAB-41-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-41-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** — open **`~/java-bootcamp`**, not the course clone
- Docker Desktop engine running (`docker version` shows a Server)
- Lab 40 project under `examples/lab40-crm`

## Paths (macOS)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `~/bc-sw-engineer-java-participant/` (adjust if you cloned elsewhere) |
| Your repo (write / run / commit) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab41-crm` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-41` |
| Shell | macOS Terminal inside IntelliJ |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-41
cd examples/lab41-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab41-crm
docker build --pull -t crm-api:lab41 .
docker run -d --name crm-lab41 --network lab37-crm_default \
  --memory=512m --env-file .env.local -p 8080:8080 crm-api:lab41
curl -fsS http://127.0.0.1:8080/actuator/health/readiness
curl -fsS -H "X-Correlation-Id: lab-request-001" "http://127.0.0.1:8080/api/customers?status=ACTIVE"
docker exec crm-lab41 id
docker stop --time 20 crm-lab41
```

Same verification notes as Windows (2026-08-11): copy **Lab 40** then merge **starter** from the course clone, database **`crm_lab41`**, network **`lab37-crm_default`**, host **`crm-postgres`**, user **`crm`**, `.env.local` not empty `.env.example`, Dockerfile uses **`mvn -DskipTests`**, UID **10001**, smoke is **`GET /api/customers`**. Details: [LAB-41-WINDOWS.md](LAB-41-WINDOWS.md) and [LAB-41-GUIDE.md](LAB-41-GUIDE.md).

### If it fails

| Symptom | Fix |
| --- | --- |
| Readiness never UP | `--network lab37-crm_default`; `CRM_DB_HOST=crm-postgres`; `CRM_DB_NAME=crm_lab41` |
| Password authentication failed | `CRM_DB_USER=crm` (Lab 37 compose), not `crm_app` |
| `./mvnw` / `COPY mvnw` | Use `mvn` |
| `--env-file .env.example` fails | Copy to `.env.local` and set the password |
| Work ended up in the course clone | Move to `~/java-bootcamp` |


## Do the lab

Complete every step in **[LAB-41-GUIDE.md](LAB-41-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-41`. Redact secrets.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab41-crm` (not the course `labs/` tree) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-41/` | Pass / Fail |
