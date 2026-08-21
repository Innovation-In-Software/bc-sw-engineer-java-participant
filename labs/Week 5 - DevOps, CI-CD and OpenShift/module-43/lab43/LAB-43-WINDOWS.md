# Lab 43: GitHub CI/CD Pipeline for the CRM — Northstar Delivery Gates — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9.x · GitHub Actions on **your** `java-bootcamp` remote · IntelliJ  
**Full lab steps:** [LAB-43-GUIDE.md](LAB-43-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-43-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven, Git)
- IntelliJ with **Project SDK 21** — open **`%USERPROFILE%\java-bootcamp`**, not the course clone
- Lab 41 project under `examples\lab41-crm`
- GitHub Actions enabled on **your** `java-bootcamp` remote

## Paths (Windows)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `%USERPROFILE%\bc-sw-engineer-java-participant\` (adjust if you cloned elsewhere) |
| Your repo (write / run / commit / push) | `%USERPROFILE%\java-bootcamp` |
| This lab CRM | `%USERPROFILE%\java-bootcamp\examples\lab43-crm` |
| Workflow GitHub actually runs | `%USERPROFILE%\java-bootcamp\.github\workflows\crm-ci.yml` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-43` |
| Shell | Windows PowerShell inside IntelliJ |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-43 | Out-Null
cd examples\lab43-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab43-crm
mvn -B -ntp clean verify "-Dspring.datasource.url=jdbc:postgresql://localhost:5432/crm_lab43" `
  "-Dspring.datasource.username=crm" "-Dspring.datasource.password=change-me"
mvn -B -ntp "-DskipTests" package
Get-ChildItem .\target\*.jar | Where-Object { $_.Name -notlike '*.original' } |
  ForEach-Object { Get-FileHash $_ -Algorithm SHA256 }
```

Quote every Maven `-D…` in PowerShell.

Verified on this laptop (2026-08-11), Temurin 21.0.11, Maven 3.9.9, PostgreSQL 16.14:

- **Copy Lab 41** from `java-bootcamp\examples\lab41-crm` into `examples\lab43-crm`, then copy starter **docs** and copy `starter\.github\workflows\ci.yml` to **`java-bootcamp\.github\workflows\crm-ci.yml`**. Do not copy Lab 42 (no `pom.xml`). Do not grade files left under `labs\`.
- Isolated database **`crm_lab43`**. Host ITs use **`SPRING_DATASOURCE_*`**. GitHub job uses a **postgres:16** service and the same user **`crm` / `change-me`**.
- Lab 41 has **no** `mvnw` — workflow and host commands use **`mvn`**. Verify must **not** use `-DskipTests`.
- GitHub only auto-runs workflows from the **repository root**. `examples\lab43-crm\.github\workflows\*.yml` is ignored. Root workflow uses `working-directory: examples/lab43-crm` and `cache-dependency-path: examples/lab43-crm/pom.xml`. Artifact paths are repo-relative (`examples/lab43-crm/target/...`).
- Do **not** hash a made-up `lab43-crm-0.0.1-SNAPSHOT.jar` — Lab 41 keeps its existing `artifactId`. Glob `target\*.jar` excluding `*.original`.
- Lab 41 has **no** Spring Security. Failure experiment: break a **real** unit test under `src\test\java`, then restore. There is no `anonymousReadIs401`.
- Optional `-Psecurity-scan` needs Actions secret `NVD_API_KEY` (Lab 40). Training workflow may `continue-on-error`.
- `crm-jar` is produced on **`main`** or tag **`v*`**, not on a PR-only run.
- HTTP smoke (if you curl locally) is **`GET /api/customers`**. No `/api/v1/interactions`, no Basic `admin:change-me`.

### If it fails

| Symptom | Fix |
| --- | --- |
| Actions never starts | Workflow must be `java-bootcamp\.github\workflows\crm-ci.yml` |
| `pom.xml` not found in CI | `working-directory` + `cache-dependency-path` |
| `./mvnw` not found | Use `mvn` |
| Copied Lab 42 / starter only | Copy **Lab 41** first |
| `anonymousReadIs401` missing | Break any real unit test |
| PowerShell eats `-D…` | Quote the whole `-D` argument |
| Work ended up in the course clone | Move to `java-bootcamp`; never push homework to the participant remote |


## Do the lab

Complete every step in **[LAB-43-GUIDE.md](LAB-43-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-43`. Redact secrets and NVD keys.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ | Pass / Fail |
| 2 | CRM under `examples/lab43-crm` and workflow at **repo root** | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-43/` | Pass / Fail |
