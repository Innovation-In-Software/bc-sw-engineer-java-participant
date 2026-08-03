# Lab 1: JVM and Compilation — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** JDK 21 · Maven not required for Lab 1 (Lab 0 installs Maven for later)  
**Full lab steps:** [LAB-1-GUIDE.md](LAB-1-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-1-WINDOWS.md) · [IDE conventions](../../_IDE-CONVENTIONS.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../module-00/lab0/LAB-0-MACOS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../_IDE-CONVENTIONS.md))

## Paths (macOS)

| Item | macOS |
| ---- | ------- |
| Workspace (open in IDE) | `~/java-bootcamp` |
| This lab project | `~/java-bootcamp/examples/jvm-compilation-lab` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-1` |
| Shell | macOS Terminal inside IntelliJ |
| Path style | Forward slashes |

```bash
cd ~/java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
mkdir -p notes/screenshots/lab-1
cd examples/jvm-compilation-lab
```

### Commands this lab typically uses

```bash
cd ~/java-bootcamp/examples/jvm-compilation-lab
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


## Do the lab

Complete every step in **[LAB-1-GUIDE.md](LAB-1-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-1`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/jvm-compilation-lab` as in [LAB-1-GUIDE.md](LAB-1-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-1/` | Pass / Fail |
