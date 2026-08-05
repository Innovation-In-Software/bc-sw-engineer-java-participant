# Lab 22: Spring IoC and Dependency Injection — Northstar CRM Bean Graph — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-22-GUIDE.md](LAB-22-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-22-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab22-crm` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-22` |
| Shell | macOS Terminal inside IntelliJ |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
mkdir -p notes/screenshots/lab-22
cd examples/lab22-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab22-crm
# Timed path (starter has unit test only until Step 7 homework):
mvn -B "-Dtest=CustomerServiceTest" test
# Full verify after you add CustomerServiceSpringTest (homework Step 7):
mvn -B "-Dtest=CustomerServiceTest,CustomerServiceSpringTest" test
mvn -B spring-boot:run
```

Verified (2026-08-03): **Timed:** `CustomerServiceTest` only — **Tests run: 1**. **Full / homework:** `CustomerServiceTest` + `CustomerServiceSpringTest` via `-Dtest=…` — **Tests run: 2** · **BUILD SUCCESS**. Live POST **201** / GET **200** for `CUS-1001` with `lab-request-001`; log `CustomerService ready` + `customer.created id=CUS-1001 correlationId=lab-request-001`; graceful stop shows `CustomerService shutting down`. (`CustomerController` is **provided** in starter — verify, do not rewrite.)
## Do the lab

Complete every step in **[LAB-22-GUIDE.md](LAB-22-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-22`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab22-crm` as in [LAB-22-GUIDE.md](LAB-22-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-22/` | Pass / Fail |
