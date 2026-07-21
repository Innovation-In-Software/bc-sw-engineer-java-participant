# Lab 7: Exception Handling and Error Management — ATM Banking System — Windows

> **Participants:** Start at [`../README.md`](../README.md). Complete [Exercises 1–8](../exercises/EXERCISES-INDEX.md) first. This file = Windows paths/shell only. Do the Steps in [`LAB-7-GUIDE.md`](LAB-7-GUIDE.md). [Which file when?](../../../_PARTICIPANT-FILE-GUIDE.md)

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven not required for most Week 1 labs (Lab 0 installs Maven for later)  
**Full lab steps:** [LAB-7-GUIDE.md](LAB-7-GUIDE.md)  
**Other OS:** [macOS guide](LAB-7-MACOS.md) · [IDE conventions](../../_IDE-CONVENTIONS.md)

**Verified:** IntelliJ Terminal (PowerShell) + Temurin OpenJDK **21.0.11** on Lab 0 workspace `%USERPROFILE%\java-bootcamp`. Participant path: `examples\Lab7-ATMSystem` with `src\com\academy\atm\` + `transactions.txt` + `logs\`. Named `javac -d out` of the nine sources succeeded. **Must run `java` from the project root.** Sample: login `1001`/`1234` → withdraw `20000` → `Insufficient Balance` (menu continues) → deposit `-100` rejected → deposit `1000` → balance `12000` → mini statement reads file → exit `Thank You`; `logs\application.log` contains ERROR/INFO lines.

- Pre-lab exercises (required before this lab): [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md) — workspace: `%USERPROFILE%\java-bootcamp\examples\module-07-exercises`

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- Module 7 [Exercises 1–8](../exercises/EXERCISES-INDEX.md) Pass criteria marked **Pass** in your notes
- IntelliJ IDEA Community with **Project SDK 21**
- Optional: VS Code + Extension Pack for Java

## Open this lab in IntelliJ (primary)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → `%USERPROFILE%\java-bootcamp` (Lab 0 workspace root — same folder every lab).  
   If `examples\Lab7-ATMSystem` does not exist yet, create it as the lab GUIDE describes; keep the workspace open at `%USERPROFILE%\java-bootcamp`.
3. Trust the project if prompted.
4. **File → Project Structure → Project** → SDK = **21**, language level **21**.
5. Mark `src` as **Sources Root** when the lab uses a `src/` tree (right-click → **Mark Directory as → Sources Root**).
6. **View → Tool Windows → Terminal** (PowerShell) → `cd $env:USERPROFILE\java-bootcamp` then `cd examples\Lab7-ATMSystem` when ready.

## Optional: VS Code

1. **File → Open Folder…** → `%USERPROFILE%\java-bootcamp` (same Lab 0 workspace).
2. Confirm **Extension Pack for Java** (and Maven for Java when needed) are installed.
3. **Terminal → New Terminal** (PowerShell) → `cd examples\Lab7-ATMSystem` for this lab’s commands.

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\Lab7-ATMSystem` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-7` |
| Shell | PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
Get-ChildItem examples\module-07-exercises -ErrorAction SilentlyContinue
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-7 | Out-Null
New-Item -ItemType Directory -Force -Path examples\Lab7-ATMSystem\src\com\academy\atm, examples\Lab7-ATMSystem\logs | Out-Null
cd examples\Lab7-ATMSystem
```

### Commands this lab typically uses

From `examples\Lab7-ATMSystem` (PowerShell — name files explicitly; avoid relying on `*.java` globs). **Always `cd` here before `java`** so `transactions.txt` and `logs/` resolve:

```powershell
Remove-Item -Recurse -Force out -ErrorAction SilentlyContinue
javac -d out `
  src\com\academy\atm\InvalidAmountException.java `
  src\com\academy\atm\InsufficientFundsException.java `
  src\com\academy\atm\InvalidPinException.java `
  src\com\academy\atm\AccountNotFoundException.java `
  src\com\academy\atm\Transaction.java `
  src\com\academy\atm\Account.java `
  src\com\academy\atm\LoggerUtil.java `
  src\com\academy\atm\ATMService.java `
  src\com\academy\atm\Main.java
java -cp out com.academy.atm.Main
Get-Content logs\application.log -Tail 40
```

## Run configurations (IntelliJ)

1. Open the class with `public static void main`.
2. Green ▶ → **Run**.
3. **Run → Edit Configurations…** → set **Working directory** to `examples/Lab7-ATMSystem` when the lab reads relative files.
4. Use the IntelliJ terminal for `javac` / `java` proof when the GUIDE asks for CLI output.

## Do the lab

After Exercises 1–8 Pass, complete **every step** in **[LAB-7-GUIDE.md](LAB-7-GUIDE.md)**.  
Wherever that guide shows `$HOME/java-bootcamp`, on Windows use `%USERPROFILE%\java-bootcamp`. Prefer IntelliJ for Java editing and runs; use VS Code only if you already prefer it. Always run `java` from `examples\Lab7-ATMSystem` so relative `transactions.txt` and `logs/` paths work.

## Evidence / screenshots

Save screenshots under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-7` (Lab 0 workspace layout). Capture IntelliJ (project tree + Run/Terminal) on Windows. Redact passwords, tokens, and kubeconfig contents.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 0 | Module 7 Exercises 1–8 Pass before Lab Step 1 | Pass / Fail |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/Lab7-ATMSystem` as in [LAB-7-GUIDE.md](LAB-7-GUIDE.md) | Pass / Fail |
| 3 | Lab pass criteria / deliverables in the GUIDE are complete | Pass / Fail |
| 4 | Commands above succeed in the IntelliJ terminal (or as the lab specifies) | Pass / Fail |
| 5 | Screenshots (if required) saved under `notes/screenshots/lab-7/` | Pass / Fail |

### Verified smoke commands (participant laptop)

**Verified result (Temurin 21.0.11):** nine `.class` files under `out\com\academy\atm\`; login → over-withdraw → invalid deposit → successful deposit `12000` → mini statement (session + `transactions.txt`) → `Thank You`; `logs\application.log` records `InsufficientFundsException` / `InvalidAmountException`. Do **not** skip Module 7 Exercises 1–8 — if `examples\module-07-exercises` is empty, finish [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md) first. Mark `src` as Sources Root; set IntelliJ Run working directory to `examples/Lab7-ATMSystem`.
