# Lab 37: PostgreSQL Design for Customers and Accounts — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · Node 22 (React labs) · shared Kafka/PostgreSQL from Week 4 · IntelliJ  
**Full lab steps:** [LAB-37-GUIDE.md](LAB-37-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-37-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab37-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-37` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-37 | Out-Null
cd examples\lab37-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab37-crm
docker compose up -d
# PowerShell has no POSIX `<` redirect into docker exec — pipe the file:
Get-Content .\database\01_create_user.sql -Raw | docker exec -i crm-postgres psql -U crm -d crm -v ON_ERROR_STOP=1
Get-Content .\database\02_schema.sql -Raw | docker exec -i -e PGPASSWORD=$env:POSTGRES_APP_PASSWORD crm-postgres psql -U crm_app -d crm -v ON_ERROR_STOP=1
```

**Verified 2026-08-11:** `postgres:16` image pull + `crm-postgres` `0.0.0.0:5432->5432/tcp`. `pg_isready` before the first `psql`. App role `crm_app` / schema `crm_app`. Full-path DDL (ADDRESS + HISTORY) applied; seed showed Amina `ACTIVE` + `ACCT-1001-01` and Ravi `PROSPECT`. Negatives: `ck_customer_status` / `uk_customer_email` / `fk_account_customer`. `05_drop.sql` then recreate re-seeded both fixtures.


## Do the lab

Complete every step in **[LAB-37-GUIDE.md](LAB-37-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-37`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab37-crm` as in [LAB-37-GUIDE.md](LAB-37-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-37/` | Pass / Fail |
