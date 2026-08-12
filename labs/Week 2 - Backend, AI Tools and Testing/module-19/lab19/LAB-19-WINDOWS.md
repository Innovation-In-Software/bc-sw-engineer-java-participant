# Lab 19: Integration and UI Testing with Selenium — Northstar CRM Regression Suite — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-19-GUIDE.md](LAB-19-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-19-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified (Tuesday, August 4, 2026):** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** + Apache Maven **3.9.9** + Chrome **150.0.7871.187**. Lab 19 solution under `%USERPROFILE%\java-bootcamp\examples\_week2-verify\lab19-solution`; WebDriverManager chromedriver **150.0.7871.124**. Surefire **includes `*IT.java`**. Timed suite: `CustomerApiIT` (3: get Amina, create **CUS-1901**, 404) + `CustomerUiIT` (1: **CUS-2001** / Ui Customer). `mvn -B clean test` → **Tests run: 4**, Failures: 0 · **BUILD SUCCESS**. Instructor walkthrough: `docs/instructor-participant-help/week-2/19-selenium-exercises-and-lab19.md`.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab19-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-19` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-19 | Out-Null
cd examples\lab19-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab19-crm
mvn -B "-Dtest=CustomerApiIT" test
mvn -B "-Dtest=CustomerUiIT" test
mvn -B clean verify
# optional manual UI:
# mvn spring-boot:run   # then http://localhost:8080/customers.html
```

Verified (2026-08-03): **Tests run: 4** (ApiIT 3 + UiIT 1) · **BUILD SUCCESS** via Surefire `-Dtest=CustomerApiIT,CustomerUiIT`.

Full path (copy `lab18-crm` + Boot 3.3.5, 2026-08-11): Chrome **151.0.7922.76** at `C:\Program Files\Google\Chrome\Application\chrome.exe`. WebDriverManager chromedriver **151.0.7922.77**. REST adapter uses Lab 15 `addCustomer`/`findById` (no starter `model.Customer`). Timed pin `CustomerApiIT,CustomerUiIT` → **Tests run: 4**. Full `mvn -B test` → **Tests run: 44**. Broken `data-testid=submit-customer-WRONG` → `NoSuchElementException` + `target/ui-failure.png`.

## Do the lab

Complete every step in **[LAB-19-GUIDE.md](LAB-19-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-19`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab19-crm` as in [LAB-19-GUIDE.md](LAB-19-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-19/` | Pass / Fail |

