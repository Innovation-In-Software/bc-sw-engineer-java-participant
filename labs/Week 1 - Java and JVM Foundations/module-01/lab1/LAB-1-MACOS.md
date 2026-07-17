# Lab 1: JVM and Compilation — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven not required for most Week 1 labs (Lab 0 installs Maven for later)  
**Full lab steps:** [LAB-1-GUIDE.md](LAB-1-GUIDE.md)  
**Other OS:** [Windows guide](LAB-1-WINDOWS.md) · [IDE conventions](../../_IDE-CONVENTIONS.md)

- Pre-lab exercises: [`../exercises/`](../exercises/) — macOS workspace: `~/java-bootcamp/examples/module-01-exercises` (create once; see [EXERCISES-INDEX.md](../exercises/EXERCISES-INDEX.md))

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ IDEA Community with **Project SDK 21**
- Optional: VS Code + Extension Pack for Java

## Open this lab in IntelliJ (primary)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → `~/java-bootcamp` (Lab 0 workspace root — same folder every lab).  
   If `examples/jvm-compilation-lab` does not exist yet, create it as the lab GUIDE describes; keep the workspace open at `~/java-bootcamp`.
3. Trust the project if prompted.
4. **File → Project Structure → Project** → SDK = **21**, language level **21**.
5. Mark `src` as **Sources Root** when the lab uses a `src/` tree (right-click → **Mark Directory as → Sources Root**).
6. **View → Tool Windows → Terminal** → `cd ~/java-bootcamp` then `cd examples/jvm-compilation-lab` when ready.

## Optional: VS Code

1. **File → Open Folder…** → `~/java-bootcamp` (same Lab 0 workspace).
2. Confirm **Extension Pack for Java** (and Maven for Java when needed) are installed.
3. **Terminal → New Terminal** → `cd examples/jvm-compilation-lab` for this lab’s commands.

## Paths (macOS)

| Item | macOS |
| ---- | ----- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/jvm-compilation-lab` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-1` |
| Shell | zsh / bash inside IntelliJ |
| Path style | Forward slashes; case-sensitive |

```bash
cd ~/java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
mkdir -p notes/screenshots/lab-1
cd examples/jvm-compilation-lab
```

### Commands this lab typically uses

```text
javac -d out src/.../*.java
java -cp out ...Main
```

## Run configurations (IntelliJ)

1. Open the class with `public static void main`.
2. Green ▶ → **Run**.
3. **Run → Edit Configurations…** → set **Working directory** to `examples/jvm-compilation-lab` when the lab reads relative files.
4. Use the IntelliJ terminal for `javac` / `java` proof when the GUIDE asks for CLI output.

## Do the lab

Complete **every step** in **[LAB-1-GUIDE.md](LAB-1-GUIDE.md)**.  
Wherever that guide shows `~/java-bootcamp`, on macOS use `~/java-bootcamp`. Prefer IntelliJ for Java editing and runs; use VS Code only if you already prefer it.

## Evidence / screenshots

Save screenshots under `~/java-bootcamp/notes/screenshots/lab-1` (Lab 0 workspace layout). Capture IntelliJ (project tree + Run/Terminal) on macOS. Redact passwords, tokens, and kubeconfig contents.

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/jvm-compilation-lab` as in [LAB-1-GUIDE.md](LAB-1-GUIDE.md) | Pass / Fail |
| 3 | Lab pass criteria / deliverables in the GUIDE are complete | Pass / Fail |
| 4 | Commands above succeed in the IntelliJ terminal (or as the lab specifies) | Pass / Fail |
| 5 | Screenshots (if required) saved under `notes/screenshots/lab-1/` | Pass / Fail |
