# Lab 1: JVM and Compilation — macOS

> **Participants:** Start at [`../README.md`](../README.md). Complete [Exercises 1–8](../exercises/EXERCISES-INDEX.md) first. This file = macOS paths/shell only. Do the Steps in [`LAB-1-GUIDE.md`](LAB-1-GUIDE.md). [Which file when?](../../../_PARTICIPANT-FILE-GUIDE.md)

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven not required for Lab 1 (Lab 0 installs Maven for later)  
**Full lab steps:** [LAB-1-GUIDE.md](LAB-1-GUIDE.md)  
**Other OS:** [Windows guide](LAB-1-WINDOWS.md) · [IDE conventions](../../_IDE-CONVENTIONS.md)

- Pre-lab exercises (required before this lab): [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md) — workspace: `~/java-bootcamp/examples/module-01-exercises`

## How Lab 1 is performed on macOS (smooth path)

**Verified pattern:** IntelliJ Terminal (zsh) + JDK 21 on a Lab 0 `java-bootcamp` workspace (same flow as Windows; paths differ).

| What | Where |
| ---- | ----- |
| Guides (this file, exercises, GUIDE) | Participant course clone — open in browser **or** second window |
| Your code | `~/java-bootcamp` open in **IntelliJ** |
| Exercises | `examples/module-01-exercises/` |
| Graded lab | `examples/jvm-compilation-lab/` (flat `.java` files) |
| Screenshots | `notes/screenshots/lab-1/` |

**Day-of rhythm:**

1. IntelliJ Project pane: expand `examples` → confirm `module-01-exercises` has your exercise `.java` files.
2. Terminal may start at `~/java-bootcamp` — **`cd` before every compile**.
3. Finish Exercises 1–8 Pass → then create/use `jvm-compilation-lab` for GUIDE Steps.
4. Capture Terminal output screenshots for LMS; write Pass/Fail in notes.

## Prerequisites (macOS)

- [Lab 0 (macOS)](../../module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- Module 1 [Exercises 1–8](../exercises/EXERCISES-INDEX.md) Pass criteria marked **Pass** in your notes
- IntelliJ IDEA Community with **Project SDK 21**
- Optional: VS Code + Extension Pack for Java

### Exercise smoke check (run before GUIDE Step 0)

```bash
cd ~/java-bootcamp/examples/module-01-exercises
java Hello
java Variables
java Methods
java Person
java ControlFlow
java -verbose:class Hello 2>&1 | grep Hello
javap -c Person | head -12
```

**Expected themes:** `Hello, JVM!` · numeric / String prints · `30` / `Hello, Aman!` · `Aman is …` · control-flow lines · a `Hello` class-load line · `javap` constructor bytecode. If one fails, fix that exercise first.

## Open this lab in IntelliJ (primary)

1. Start **IntelliJ IDEA Community**.
2. **File → Open…** → `~/java-bootcamp` (Lab 0 workspace root — same folder every lab).  
   Keep this root open for the whole bootcamp; do **not** open only `jvm-compilation-lab` as a separate project.
3. Trust the project if prompted.
4. **File → Project Structure → Project** → SDK = **21**, language level **21**.
5. **Do not** mark `jvm-compilation-lab` or `module-01-exercises` as Sources Root — sources are **flat** `.java` files. Keep only Lab 0 `HelloJava/src` (and later labs that use `src/`) as Sources Root.
6. **View → Tool Windows → Terminal** → confirm prompt, then `cd` as below when ready.

## Optional: VS Code

1. **File → Open Folder…** → `~/java-bootcamp` (same Lab 0 workspace).
2. Confirm **Extension Pack for Java** (and Maven for Java when needed) are installed.
3. **Terminal → New Terminal** → `cd examples/jvm-compilation-lab` for this lab’s commands.

## Paths (macOS)

| Item | macOS |
| ---- | ----- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| Pre-lab exercises (already done) | `~/java-bootcamp/examples/module-01-exercises` |
| This lab project | `~/java-bootcamp/examples/jvm-compilation-lab` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-1` |
| Shell | zsh / bash inside IntelliJ |
| Path style | Forward slashes; case-sensitive |

```bash
cd ~/java-bootcamp
# Confirm exercises exist before the graded lab folder
ls examples/module-01-exercises/*.java
# Lab 0 layout: evidence at workspace root; code under examples/
mkdir -p notes/screenshots/lab-1
mkdir -p examples/jvm-compilation-lab
cd examples/jvm-compilation-lab
pwd   # must end with .../jvm-compilation-lab
```

### Commands this lab typically uses

Flat files in `jvm-compilation-lab` (no `src/` / `out/` tree). **Always** `cd` into that folder first.

```bash
javac HelloWorld.java
java HelloWorld
# Expected: Hello, JVM!
javap -c HelloWorld

javac Calculator.java
java Calculator
# Expected: Sum = 30
javap -c Calculator   # look for iadd, invokestatic, iload, istore

javac Employee.java
java Employee
# Expected: 101 - Aman
java -verbose:class Employee 2>&1 | grep Employee

javac Employee.java MemoryDemo.java
java MemoryDemo
# Expected: Created 100000 employees

# Clean rebuild (GUIDE Step 11)
rm -f *.class
javac HelloWorld.java Calculator.java Employee.java MemoryDemo.java
java HelloWorld; java Calculator; java Employee; java MemoryDemo
```

## Run configurations (IntelliJ)

1. Open the class with `public static void main`.
2. Green ▶ → **Run** (optional convenience).
3. **Run → Edit Configurations…** → set **Working directory** to `examples/jvm-compilation-lab` when needed.
4. **Graders want Terminal proof:** still run `javac` / `java` / `javap` in the IntelliJ Terminal for screenshots.

## Do the lab

After Exercises 1–8 Pass, complete **every step** in **[LAB-1-GUIDE.md](LAB-1-GUIDE.md)** — start with **Step 0** (create your personal `java-bootcamp` GitHub repo and first commit), then Steps 1–11, then **Step 12** (commit/push Lab 1).  
Prefer IntelliJ for Java editing and runs; use VS Code only if you already prefer it.

### Step 0 quick reference (macOS) — full detail in the GUIDE

```bash
cd ~/java-bootcamp
# Create .gitignore (see LAB-1-GUIDE Step 0), then:
git init
git add .
git commit -m "Initial java-bootcamp workspace (Lab 1 Step 0)"
git branch -M main
git remote add origin https://github.com/<your-github-username>/java-bootcamp.git
git push -u origin main
```

## Evidence / screenshots

Save screenshots under `~/java-bootcamp/notes/screenshots/lab-1` (Lab 0 workspace layout). Capture IntelliJ (project tree + Run/Terminal) on macOS. Redact passwords, tokens, and kubeconfig contents.

**Full submit list:** see **What you'll submit** and **Expected Deliverables** in [LAB-1-GUIDE.md](LAB-1-GUIDE.md).

**Minimum Terminal captures:** `java HelloWorld`, `java Calculator`, `javap -c Calculator`, `java Employee`, one `-verbose:class` snippet, `java MemoryDemo`.

## If it fails (macOS)

| Symptom | Fix |
| ------- | --- |
| `Could not find or load main class HelloWorld` | `pwd` must end with `jvm-compilation-lab`; run `javac` first; use `java HelloWorld` not `java HelloWorld.java` |
| Banner *outside of the module source root* | Expected — ignore; use **New → File** + Terminal |
| `examples` Sources Root / invalid package name | Unmark `examples` as Sources Root |
| Guide not in Project pane | Guides are in the **course clone** — open README/GUIDE there or in browser |

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 0 | Module 1 Exercises 1–8 Pass before Lab Steps 2+ | Pass / Fail |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Personal GitHub repo `java-bootcamp` created + first push (GUIDE Step 0) | Pass / Fail |
| 3 | Lab project under `examples/jvm-compilation-lab` as in [LAB-1-GUIDE.md](LAB-1-GUIDE.md) | Pass / Fail |
| 4 | Lab pass criteria / deliverables in the GUIDE are complete | Pass / Fail |
| 5 | Lab 1 committed and pushed (GUIDE Step 12) | Pass / Fail |
| 6 | Screenshots (if required) saved under `notes/screenshots/lab-1/` | Pass / Fail |
