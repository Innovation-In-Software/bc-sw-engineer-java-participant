# Lab 1 Reference Solution — JVM and Compilation

Instructor reference only. Students should write these files themselves **after** completing Module 1 Exercises 1–8, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\jvm-compilation-lab`
* macOS / Linux: `~/java-bootcamp/examples/jvm-compilation-lab`

Do not confuse with exercise sources in `examples/module-01-exercises/` (`Hello`, `Person`, …).

**Participant path reminder:** IntelliJ opens `java-bootcamp`; guides stay in the participant course clone. Flat files + Terminal `cd` into `jvm-compilation-lab` before `javac` / `java` / `javap`.

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
