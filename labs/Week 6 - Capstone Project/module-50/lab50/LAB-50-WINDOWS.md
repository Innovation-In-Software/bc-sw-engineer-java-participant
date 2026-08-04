# Lab 50: Capstone Frontend and Persistence — Northstar CRM UI→PostgreSQL Journey — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** Capstone: full stack from prior weeks · IntelliJ primary  
**Full lab steps:** [LAB-50-GUIDE.md](LAB-50-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-50-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\customer-management-platform` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-50` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-50 | Out-Null
cd examples\customer-management-platform
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\customer-management-platform
# Timed path (starter): SQL + docs only
Select-String -Path db\migration\V50__customer_interaction.sql -Pattern 'CHECK|INDEX|crm.customer_interaction'
# Full path only (when frontend/ exists):
# cd frontend; npm ci; npm test; npm run build
```


## Do the lab

Complete every step in **[LAB-50-GUIDE.md](LAB-50-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-50`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/customer-management-platform` as in [LAB-50-GUIDE.md](LAB-50-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-50/` | Pass / Fail |
