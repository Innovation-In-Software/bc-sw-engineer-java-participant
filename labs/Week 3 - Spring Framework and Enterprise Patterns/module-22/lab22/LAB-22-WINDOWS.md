# Lab 22: Spring IoC and Dependency Injection — Northstar CRM Bean Graph — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-22-GUIDE.md](LAB-22-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-22-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab22-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-22` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-22 | Out-Null
cd examples\lab22-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab22-crm
mvn -B "-Dtest=CustomerServiceTest,CustomerServiceSpringTest" test
mvn -B spring-boot:run
# After Started CrmApplication (second Terminal / PowerShell):
# $headers = @{ "X-Correlation-Id" = "lab-request-001"; "Content-Type" = "application/json" }
# Invoke-WebRequest http://localhost:8080/api/customers -Method POST -Headers $headers -Body '{"id":"CUS-1001","name":"Amina Khan","email":"amina.khan@example.com","status":"ACTIVE"}' -UseBasicParsing
# Invoke-WebRequest http://localhost:8080/api/customers/CUS-1001 -UseBasicParsing
```

Verified (2026-08-03): **Tests run: 2** · **BUILD SUCCESS** (unit + `@SpringBootTest` IT via `-Dtest=…`; plain `mvn test` runs `*Test` only); live POST **201** / GET **200** for `CUS-1001` with `lab-request-001`; log `CustomerService ready` + `customer.created id=CUS-1001 correlationId=lab-request-001`; graceful stop shows `CustomerService shutting down`.

## Do the lab

Complete every step in **[LAB-22-GUIDE.md](LAB-22-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-22`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab22-crm` as in [LAB-22-GUIDE.md](LAB-22-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-22/` | Pass / Fail |
