# Lab 2: Java Syntax and Input/Output — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven not required for Lab 2 (Lab 0 installs Maven for later)  
**Full lab steps:** [LAB-2-GUIDE.md](LAB-2-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-2-MACOS.md) · [IDE conventions](../../_IDE-CONVENTIONS.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\Lab2-JavaSyntax` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-2` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-2 | Out-Null
cd examples\Lab2-JavaSyntax
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\Lab2-JavaSyntax
javac -d out `
  src\com\academy\student\Student.java `
  src\com\academy\student\StudentManager.java `
  src\com\academy\student\Main.java
java -cp out com.academy.student.Main
# Starter menu may show options 1–10 (bonus 6–10); core graded path is still 1–5
```


## Do the lab

Complete every step in **[LAB-2-GUIDE.md](LAB-2-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-2`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/Lab2-JavaSyntax` as in [LAB-2-GUIDE.md](LAB-2-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-2/` | Pass / Fail |
