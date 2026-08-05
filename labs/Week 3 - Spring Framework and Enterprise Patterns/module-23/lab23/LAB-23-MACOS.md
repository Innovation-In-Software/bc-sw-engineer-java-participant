# Lab 23: Spring Boot Setup and Auto-Configuration — Northstar CRM First Boot App — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-23-GUIDE.md](LAB-23-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-23-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/lab23-crm` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-23` |
| Shell | macOS Terminal inside IntelliJ |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
mkdir -p notes/screenshots/lab-23
cd examples/lab23-crm
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/lab23-crm
# Timed path (starter has CrmApplicationTests only):
mvn -B "-Dtest=CrmApplicationTests" test
# Full path after you add CustomerControllerHttpTest (Step 8 homework):
mvn -B test
mvn -B spring-boot:run
# After Started CrmApplication (second Terminal):
# curl -s http://localhost:8080/actuator/health
# curl create/get CUS-1001 with X-Correlation-Id: lab-request-001  (header read, not echoed)
# curl -s -o /dev/null -w "%{http_code}\n" http://localhost:8080/api/customers/CUS-MISSING  # timed: 500
# Profile teaser: mvn -B spring-boot:run "-Dspring-boot.run.profiles=dev"
# Packaged JAR name: target/lab23-crm-0.0.1-SNAPSHOT.jar
```

Verified (2026-08-03): **Timed:** `CrmApplicationTests` — **Tests run: 1**. **Full / homework:** `CrmApplicationTests` + `CustomerControllerHttpTest` — **Tests run: 2** · **BUILD SUCCESS**. Live health **UP**; POST **201** / GET **200** for `CUS-1001` with request header `lab-request-001` (header **read**, not echoed); `CUS-MISSING` → **500** (Boot default; no `@ControllerAdvice` in starter/solution); profile `dev` teaser; `/actuator/info` shows `northstar-crm` when `info.*` + `management.info.env.enabled=true`. (`CustomerController` **provided** — verify/call, do not rewrite.)
## Do the lab

Complete every step in **[LAB-23-GUIDE.md](LAB-23-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-23`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab23-crm` as in [LAB-23-GUIDE.md](LAB-23-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-23/` | Pass / Fail |
