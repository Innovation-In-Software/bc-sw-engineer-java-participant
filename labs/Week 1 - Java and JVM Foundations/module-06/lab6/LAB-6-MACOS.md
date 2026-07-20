# Lab 6: Streams and Lambda Expressions — Employee Analytics System — macOS

> **Participants:** Start at [`../README.md`](../README.md). Complete [Exercises 1–7](../exercises/EXERCISES-INDEX.md) first. This file = macOS paths/shell only. Do the Steps in [`LAB-6-GUIDE.md`](LAB-6-GUIDE.md). [Which file when?](../../../_PARTICIPANT-FILE-GUIDE.md)

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven not required for most Week 1 labs (Lab 0 installs Maven for later)  
**Full lab steps:** [LAB-6-GUIDE.md](LAB-6-GUIDE.md)  
**Other OS:** [Windows guide](LAB-6-WINDOWS.md) · [IDE conventions](../../_IDE-CONVENTIONS.md)

- Pre-lab exercises (required before this lab): [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md) — workspace: `~/java-bootcamp/examples/module-06-exercises`

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- Module 6 [Exercises 1–7](../exercises/EXERCISES-INDEX.md) Pass criteria marked **Pass** in your notes
- IntelliJ IDEA Community with **Project SDK 21**
- Optional: VS Code + Extension Pack for Java

## Open this lab in IntelliJ (primary)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → `~/java-bootcamp` (Lab 0 workspace root — same folder every lab).  
   If `examples/Lab6-EmployeeAnalytics` does not exist yet, create it as the lab GUIDE describes; keep the workspace open at `~/java-bootcamp`.
3. Trust the project if prompted.
4. **File → Project Structure → Project** → SDK = **21**, language level **21**.
5. Mark `src` as **Sources Root** when the lab uses a `src/` tree (right-click → **Mark Directory as → Sources Root**).
6. **View → Tool Windows → Terminal** → `cd ~/java-bootcamp` then `cd examples/Lab6-EmployeeAnalytics` when ready.

## Optional: VS Code

1. **File → Open Folder…** → `~/java-bootcamp` (same Lab 0 workspace).
2. Confirm **Extension Pack for Java** (and Maven for Java when needed) are installed.
3. **Terminal → New Terminal** → `cd examples/Lab6-EmployeeAnalytics` for this lab’s commands.

## Paths (macOS)

| Item | macOS |
| ---- | ----- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/Lab6-EmployeeAnalytics` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-6` |
| Shell | zsh / bash inside IntelliJ |
| Path style | Forward slashes; case-sensitive |

```bash
cd ~/java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
mkdir -p notes/screenshots/lab-6
cd examples/Lab6-EmployeeAnalytics
```

### Commands this lab typically uses

```bash
mkdir -p out
javac -d out src/com/academy/analytics/*.java
java -cp out com.academy.analytics.Main
```

## Run configurations (IntelliJ)

1. Open the class with `public static void main`.
2. Green ▶ → **Run**.
3. **Run → Edit Configurations…** → set **Working directory** to `examples/Lab6-EmployeeAnalytics` when the lab reads relative files.
4. Use the IntelliJ terminal for `javac` / `java` proof when the GUIDE asks for CLI output.

## Do the lab

After Exercises 1–7 Pass, complete **every step** in **[LAB-6-GUIDE.md](LAB-6-GUIDE.md)**.  
Wherever that guide shows `$HOME/java-bootcamp`, on macOS use `~/java-bootcamp`. Prefer IntelliJ for Java editing and runs; use VS Code only if you already prefer it.

## Evidence / screenshots

Save screenshots under `~/java-bootcamp/notes/screenshots/lab-6` (Lab 0 workspace layout). Capture IntelliJ (project tree + Run/Terminal) on macOS. Redact passwords, tokens, and kubeconfig contents.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 0 | Module 6 Exercises 1–7 Pass before Lab Step 1 | Pass / Fail |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/Lab6-EmployeeAnalytics` as in [LAB-6-GUIDE.md](LAB-6-GUIDE.md) | Pass / Fail |
| 3 | Lab pass criteria / deliverables in the GUIDE are complete | Pass / Fail |
| 4 | Commands above succeed in the IntelliJ terminal (or as the lab specifies) | Pass / Fail |
| 5 | Screenshots (if required) saved under `notes/screenshots/lab-6/` | Pass / Fail |
