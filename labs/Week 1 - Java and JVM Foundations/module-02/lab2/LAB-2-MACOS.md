# Lab 2: Java Syntax and Input/Output — macOS

> **Participants:** Start at [`../README.md`](../README.md). Complete [Exercises 1–7](../exercises/EXERCISES-INDEX.md) first (8–9 recommended). This file = macOS paths/shell only. Do the Steps in [`LAB-2-GUIDE.md`](LAB-2-GUIDE.md). [Which file when?](../../../_PARTICIPANT-FILE-GUIDE.md)

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven not required for Lab 2 (Lab 0 installs Maven for later)  
**Full lab steps:** [LAB-2-GUIDE.md](LAB-2-GUIDE.md)  
**Other OS:** [Windows guide](LAB-2-WINDOWS.md) · [IDE conventions](../../_IDE-CONVENTIONS.md)

- Pre-lab exercises (required before this lab): [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md) — workspace: `~/java-bootcamp/examples/module-02-exercises`

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- Module 2 [Exercises 1–7](../exercises/EXERCISES-INDEX.md) Pass criteria marked **Pass** in your notes
- IntelliJ IDEA Community with **Project SDK 21**
- Optional: VS Code + Extension Pack for Java

## Open this lab in IntelliJ (primary)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → `~/java-bootcamp` (Lab 0 workspace root — same folder every lab).  
   If `examples/Lab2-JavaSyntax` does not exist yet, create it as the lab GUIDE describes; keep the workspace open at `~/java-bootcamp`.
3. Trust the project if prompted.
4. **File → Project Structure → Project** → SDK = **21**, language level **21**.
5. Mark `examples/Lab2-JavaSyntax/src` as **Sources Root** (right-click → **Mark Directory as → Sources Root**). Do **not** mark `module-02-exercises` as Sources Root.
6. **View → Tool Windows → Terminal** → `cd ~/java-bootcamp` then `cd examples/Lab2-JavaSyntax` when ready.

## Optional: VS Code

1. **File → Open Folder…** → `~/java-bootcamp` (same Lab 0 workspace).
2. Confirm **Extension Pack for Java** (and Maven for Java when needed) are installed.
3. **Terminal → New Terminal** → `cd examples/Lab2-JavaSyntax` for this lab’s commands.

## Paths (macOS)

| Item | macOS |
| ---- | ----- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| Pre-lab exercises (already done) | `~/java-bootcamp/examples/module-02-exercises` |
| This lab project | `~/java-bootcamp/examples/Lab2-JavaSyntax` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-2` |
| Shell | zsh / bash inside IntelliJ |
| Path style | Forward slashes; case-sensitive |

```bash
cd ~/java-bootcamp
ls examples/module-02-exercises
mkdir -p notes/screenshots/lab-2
mkdir -p examples/Lab2-JavaSyntax/src/com/academy/student
cd examples/Lab2-JavaSyntax
```

### Commands this lab typically uses

From `examples/Lab2-JavaSyntax`:

```bash
javac -d out src/com/academy/student/*.java
java -cp out com.academy.student.Main
```

## Run configurations (IntelliJ)

1. Open `Main` (class with `public static void main`).
2. Green ▶ → **Run**.
3. **Run → Edit Configurations…** → set **Working directory** to `examples/Lab2-JavaSyntax` when the lab reads relative files.
4. Use the IntelliJ terminal for `javac` / `java` proof when the GUIDE asks for CLI output.

## Do the lab

After Exercises 1–7 Pass, complete **every step** in **[LAB-2-GUIDE.md](LAB-2-GUIDE.md)**.  
Prefer IntelliJ for Java editing and runs; use VS Code only if you already prefer it.

## Evidence / screenshots

Save screenshots under `~/java-bootcamp/notes/screenshots/lab-2` (Lab 0 workspace layout). Capture IntelliJ (project tree + Run/Terminal) on macOS. Redact passwords, tokens, and kubeconfig contents.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 0 | Module 2 Exercises 1–7 Pass before Lab Steps 3+ | Pass / Fail |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/Lab2-JavaSyntax` as in [LAB-2-GUIDE.md](LAB-2-GUIDE.md) | Pass / Fail |
| 3 | Lab pass criteria / deliverables in the GUIDE are complete | Pass / Fail |
| 4 | `javac -d out` / `java -cp out com.academy.student.Main` succeed in the IntelliJ terminal | Pass / Fail |
| 5 | Screenshots (if required) saved under `notes/screenshots/lab-2/` | Pass / Fail |
