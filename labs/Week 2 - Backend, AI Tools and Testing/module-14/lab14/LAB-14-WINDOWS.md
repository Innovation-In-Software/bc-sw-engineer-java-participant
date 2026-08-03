# Lab 14: DTOs and Validation — Northstar CRM API Contract Boundary — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-14-GUIDE.md](LAB-14-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-14-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified (Monday, August 3, 2026):** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** + Apache Maven **3.9.9**. Copied `examples\lab12-crm` → `examples\lab14-crm`; added Jakarta Validation **3.1.0**, Hibernate Validator **8.0.2.Final**, Expressly **5.0.0**; implemented `CustomerRequestDTO` / `CustomerResponseDTO`, `CustomerMapper`, `CustomerApiFacade` (wired to Lab 12 `createCustomer`/`getCustomer`). `mvn -B clean test` → **Tests run: 13**, Failures: 0 · **BUILD SUCCESS**. Main (with Maven runtime classpath) prints response DTOs for Amina/Ravi and rejects invalid email / unknown id with `lab-request-001`. Bare `java -cp target\classes` fails with `NoClassDefFoundError: jakarta/validation/Validation` — use `dependency:build-classpath` or IntelliJ Run. Instructor walkthrough: `docs/instructor-participant-help/week-2/14-dto-exercises-and-lab14.md`.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab14-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-14` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-14 | Out-Null
cd examples\lab14-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
Copy-Item -Recurse lab12-crm lab14-crm   # once
cd lab14-crm
mvn -q test "-Dtest=CustomerRequestDTOValidationTest"
mvn -B clean test
# Main needs validation jars — not target\classes alone:
mvn -q -DincludeScope=runtime dependency:build-classpath "-Dmdep.outputFile=target\cp.txt"
java -cp "target\classes;$(Get-Content target\cp.txt -Raw)" com.northstar.crm.Main
```

Verified (2026-07-31, Temurin 21.0.11 + Maven 3.9.9 + IntelliJ Terminal): `mvn -q -DskipTests clean package` **BUILD SUCCESS**; Main with dependency classpath prints `CustomerResponseDTO` for `CUS-1001` / `CUS-1002` and blocks invalid email with `[lab-request-001]` (Hibernate Validator 8.0.2). Use the classpath command above — `java -cp target\classes` alone fails with `NoClassDefFoundError: jakarta/validation/Validation`.

## Do the lab

Complete every step in **[LAB-14-GUIDE.md](LAB-14-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-14`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab14-crm` as in [LAB-14-GUIDE.md](LAB-14-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-14/` | Pass / Fail |
