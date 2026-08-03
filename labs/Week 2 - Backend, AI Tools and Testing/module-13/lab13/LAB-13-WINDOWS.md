# Lab 13: SOAP API Design — Northstar Customer Contract (Contract-First) — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven 3.9+ · IntelliJ  
**Full lab steps:** [LAB-13-GUIDE.md](LAB-13-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-13-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)

**Verified (Monday, August 3, 2026):** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11**. Created `examples\lab13-crm` with `contracts\customer.xsd`, `contracts\CustomerService.wsdl` (document/literal; ops Create/Update/Get; placeholder `http://localhost:8080/ws`), eight sample envelopes (CUS-1001 / CUS-1002 / `lab-request-001` + two faults), and docs. PowerShell `[xml]` load → **10/10 well-formed**. Port **8080** was **not** listening (expected — design-only; Lab 24 hosts Spring-WS). No Maven build required for this lab. Instructor walkthrough: `docs/instructor-participant-help/week-2/13-soap-exercises-and-lab13.md`.

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab13-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-13` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-13 | Out-Null
cd examples\lab13-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\lab13-crm\contracts, examples\lab13-crm\samples, examples\lab13-crm\docs, notes\screenshots\lab-13 | Out-Null
cd examples\lab13-crm

# Well-formedness check (xmllint optional — use .NET XmlDocument on Windows)
Get-ChildItem contracts, samples -Recurse -Include *.xsd,*.wsdl,*.xml | ForEach-Object {
  $null = [xml](Get-Content -Raw $_.FullName)
  "OK $($_.Name)"
}
```

Verified: all contracts + samples well-formed; README documents placeholder endpoint (not live).

## Do the lab

Complete every step in **[LAB-13-GUIDE.md](LAB-13-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-13`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab13-crm` as in [LAB-13-GUIDE.md](LAB-13-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-13/` | Pass / Fail |
