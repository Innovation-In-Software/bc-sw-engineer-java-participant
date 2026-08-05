# Lab 24: SOAP Web Service Endpoints — Northstar CRM Spring-WS — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · Spring Boot 3.x · IntelliJ  
**Full lab steps:** [LAB-24-GUIDE.md](LAB-24-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-24-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab24-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-24` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-24 | Out-Null
cd examples\lab24-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab24-crm
# Until Step 8: starter TODO stubs fail — replace stubs or smoke via spring-boot:run + curls
mvn -B test
# After Step 8 (or on solution): Tests run: 2
mvn -B spring-boot:run
# After Started CrmApplication (second Terminal):
# Invoke-WebRequest http://localhost:8080/ws/customers.wsdl -UseBasicParsing
# Timed: requests\get-customer.xml (unsecured DOM getCustomer). Port type CustomersPort.
# UsernameToken / JAXB four-ops / SoapFaultMappingExceptionResolver = full-path only (not wired timed).
# Invoke-RestMethod http://localhost:8080/api/customers/CUS-1001
```

Verified: **After Step 8 / solution:** **Tests run: 2** · **BUILD SUCCESS** (`CustomerEndpointTest.getCustomerReturnsCus1001` + `CrmApplicationTests.contextLoadsAndRestSeedVisible`). **Before Step 8:** starter shows **Tests run: 2** with Failures (TODO stubs). WSDL **200** at `/ws/customers.wsdl` (**CustomersPort**, getCustomer); unsecured get-customer.xml returns **CUS-1001** / **name=Amina Khan**; REST GET `CUS-1001` still works. UsernameToken **not wired** in timed starter/solution.

Verified on this instructor laptop (2026-08-04): Temurin JDK **21.0.11**, Maven **3.9.9**. Solutions copied to %USERPROFILE%\java-bootcamp\examples\labNN-crm and mvn -B test → **BUILD SUCCESS**.
## Do the lab

Complete every step in **[LAB-24-GUIDE.md](LAB-24-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-24`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab24-crm` as in [LAB-24-GUIDE.md](LAB-24-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-24/` | Pass / Fail |
