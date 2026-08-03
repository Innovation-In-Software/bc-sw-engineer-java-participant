# Lab 28: Spring Security Basics — Northstar CRM JWT and Roles — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-28-GUIDE.md](LAB-28-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-28-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab28-crm` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-28` |
| Shell | macOS Terminal inside IntelliJ |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
mkdir -p notes/screenshots/lab-28
cd examples/lab28-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab28-crm
mvn -B test
mvn -B spring-boot:run
```

Verified (2026-08-03): **Tests run: 5** · **BUILD SUCCESS** twice (`SecurityIntegrationTest`); health **200**; no-token customers **401**; bad login **401**; agent login → Bearer GET `CUS-1001` **200** (Amina ACTIVE); agent → `/api/admin/ping` **403**; admin → admin ping **200**; agent GET `CUS-1002` **200**. Lab users `agent1`/`agent1`, `admin1`/`admin1`. Permit `/error` so live Tomcat does not rewrite 403→401. No `.env` committed.

## Do the lab

Complete every step in **[LAB-28-GUIDE.md](LAB-28-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-28`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab28-crm` as in [LAB-28-GUIDE.md](LAB-28-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-28/` | Pass / Fail |
