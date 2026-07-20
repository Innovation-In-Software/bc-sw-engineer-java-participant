# Lab 4: Memory Management and Garbage Collection — Windows

> **Participants:** Start at [`../README.md`](../README.md). Complete [Exercises 1–7](../exercises/EXERCISES-INDEX.md) first. This file = Windows paths/shell only. Do the Steps in [`LAB-4-GUIDE.md`](LAB-4-GUIDE.md). [Which file when?](../../../_PARTICIPANT-FILE-GUIDE.md)

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven not required for Lab 4 (Lab 0 installs Maven for later)  
**Full lab steps:** [LAB-4-GUIDE.md](LAB-4-GUIDE.md)  
**Other OS:** [macOS guide](LAB-4-MACOS.md) · [IDE conventions](../../_IDE-CONVENTIONS.md)

- Pre-lab exercises (required before this lab): [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md) — workspace: `%USERPROFILE%\java-bootcamp\examples\module-04-exercises`

## Prerequisites (Windows)

- [Lab 0 (Windows)](../../module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- Module 4 [Exercises 1–7](../exercises/EXERCISES-INDEX.md) Pass criteria marked **Pass** in your notes
- IntelliJ IDEA Community with **Project SDK 21**
- Optional: VS Code + Extension Pack for Java

## Open this lab in IntelliJ (primary)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → `%USERPROFILE%\java-bootcamp` (Lab 0 workspace root — same folder every lab).  
   If `examples\Lab4-MemoryManagement` does not exist yet, create it as the lab GUIDE describes; keep the workspace open at `%USERPROFILE%\java-bootcamp`.
3. Trust the project if prompted.
4. **File → Project Structure → Project** → SDK = **21**, language level **21**.
5. **Do not** mark `Lab4-MemoryManagement` or `module-04-exercises` as Sources Root — this lab uses **flat** `.java` files (same pattern as Lab 1 / Module 4 exercises).
6. **View → Tool Windows → Terminal** (PowerShell) → `cd $env:USERPROFILE\java-bootcamp` then `cd examples\Lab4-MemoryManagement` when ready.

## Optional: VS Code

1. **File → Open Folder…** → `%USERPROFILE%\java-bootcamp` (same Lab 0 workspace).
2. Confirm **Extension Pack for Java** (and Maven for Java when needed) are installed.
3. **Terminal → New Terminal** (PowerShell) → `cd examples\Lab4-MemoryManagement` for this lab’s commands.

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| Pre-lab exercises (already done) | `%USERPROFILE%\java-bootcamp\examples\module-04-exercises` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\Lab4-MemoryManagement` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-4` |
| Shell | PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
Get-ChildItem examples\module-04-exercises
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-4 | Out-Null
New-Item -ItemType Directory -Force -Path examples\Lab4-MemoryManagement | Out-Null
cd examples\Lab4-MemoryManagement
```

### Commands this lab typically uses

Flat files (no `src/` / `out/` tree). Prefer naming files explicitly in PowerShell:

```powershell
javac Person.java MemoryMonitor.java StackExample.java HeapExample.java ObjectLifecycle.java GarbageCollectionDemo.java MemoryLeakDemo.java WeakReferenceDemo.java PerformanceTest.java
java StackExample
java HeapExample
java ObjectLifecycle
java -Xms16m -Xmx64m -Xlog:gc GarbageCollectionDemo
java MemoryLeakDemo
```

## Run configurations (IntelliJ)

1. Open the class with `public static void main`.
2. Green ▶ → **Run**.
3. **Run → Edit Configurations…** → set **Working directory** to `examples/Lab4-MemoryManagement`; add VM options (`-Xlog:gc`, `-Xmx…`) when the GUIDE asks.
4. Use the IntelliJ terminal for `javac` / `java` proof when the GUIDE asks for CLI output.

## Do the lab

After Exercises 1–7 Pass, complete **every step** in **[LAB-4-GUIDE.md](LAB-4-GUIDE.md)**.  
Wherever that guide shows `$HOME/java-bootcamp`, on Windows use `%USERPROFILE%\java-bootcamp`. Prefer IntelliJ for Java editing and runs; use VS Code only if you already prefer it.

## Evidence / screenshots

Save screenshots under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-4` (Lab 0 workspace layout). Capture IntelliJ (project tree + Run/Terminal) on Windows. Redact passwords, tokens, and kubeconfig contents. **Do not** commit heap dumps (`.hprof`).

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 0 | Module 4 Exercises 1–7 Pass before Lab Steps 2+ | Pass / Fail |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/Lab4-MemoryManagement` as in [LAB-4-GUIDE.md](LAB-4-GUIDE.md) | Pass / Fail |
| 3 | Lab pass criteria / deliverables in the GUIDE are complete | Pass / Fail |
| 4 | Flat `javac` / `java` commands succeed in the IntelliJ terminal | Pass / Fail |
| 5 | Screenshots (if required) saved under `notes/screenshots/lab-4/` | Pass / Fail |
