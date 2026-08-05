# Lab 1 Reference Solution — JVM and Compilation

Instructor reference only. Students should write these files themselves **after** completing Module 1 Exercises 1–8, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\jvm-compilation-lab`
* macOS / Linux: `~/java-bootcamp/examples/jvm-compilation-lab`

Do not confuse with exercise sources in `examples/module-01-exercises/` (`Hello`, `Person`, …).

**Participant path reminder:** IntelliJ opens `java-bootcamp`; guides stay in the participant course clone. Flat files + Terminal `cd` into `jvm-compilation-lab` before `javac` / `java` / `javap`.

## Pass criteria

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | All four sources compile with JDK 21 | |
| 2 | Smoke-test console matches expected transcript | |
| 3 | Evidence under `notes/screenshots/lab-1/` (run output + recommended `javap`) | |
| 4 | Student can explain stack vs heap using `Employee` / `MemoryDemo` | |

Timed path: starter TODOs + smoke test. Full path adds `javap`, `-verbose:class`, GitHub push, short answers.

## Expected smoke transcript

```text
Hello, JVM!
Sum = 30
101 - Aman
Created 100000 employees
```

**Windows PowerShell** (from `jvm-compilation-lab`):

```powershell
javac HelloWorld.java Calculator.java Employee.java MemoryDemo.java
java HelloWorld
java Calculator
java Employee
java MemoryDemo
```

## What starter leaves for students

| File | Already done | Student fills |
| ---- | ------------ | ------------- |
| `HelloWorld.java` | Complete — prints `Hello, JVM!` | Confirm only (skip recreate) |
| `Calculator.java` | Class shell | `add` method + `main` print `Sum = 30` |
| `Employee.java` | `id` / `name` fields | Constructor, `display()`, `main` |
| `MemoryDemo.java` | Class shell | Loop creating employees + size print |

**Timed path:** skip GUIDE create Steps for these four files; fill TODOs + evidence only.

## Common mistakes

| Mistake | Fix |
| ------- | --- |
| Recreating `HelloWorld` from scratch on timed path | Use starter; it is already complete |
| Wrong cwd (`java-bootcamp` root) | `cd examples\jvm-compilation-lab` before `javac` |
| Compile `MemoryDemo` alone | Also compile `Employee.java` |
| Confusing exercise `Hello` / `Person` with lab names | Graded names are `HelloWorld` / `Employee` |
| Forgetting recompile after edits | Run `javac` again before `java` |

## Files

| File | Expected output |
| ---- | --------------- |
| `HelloWorld.java` | `Hello, JVM!` |
| `Calculator.java` | `Sum = 30` |
| `Employee.java` | `101 - Aman` |
| `MemoryDemo.java` | `Created 100000 employees` |

## How to compile and run

From this `solution/` directory (JDK 21 on `PATH`):

**Windows PowerShell:**

```powershell
javac HelloWorld.java Calculator.java Employee.java MemoryDemo.java
java HelloWorld
java Calculator
java Employee
java MemoryDemo
```

**macOS / Linux:**

```bash
javac *.java
java HelloWorld
java Calculator
java Employee
java MemoryDemo
```

Optional checks:

```powershell
javap -c HelloWorld
java -verbose:class Employee
java -Xms64m -Xmx64m MemoryDemo
```

## Clean

```powershell
Remove-Item -Force *.class   # PowerShell
# rm -f *.class              # bash
```
