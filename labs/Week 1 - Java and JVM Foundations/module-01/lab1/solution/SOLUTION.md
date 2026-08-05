# Lab 1 — Complete reference solution

> **Finished project.** Attempt the starter first, then compare with these files.
>
> Guide: [`../LAB-1-GUIDE.md`](../LAB-1-GUIDE.md)

## Goal

**JVM compilation — HelloWorld, Calculator, Employee, MemoryDemo**

## How to run

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\jvm-compilation-lab
javac HelloWorld.java Calculator.java Employee.java MemoryDemo.java
java HelloWorld
java Calculator
java Employee
java MemoryDemo
```

**Expected:** Hello, JVM! / Sum = 30 / 101 - Aman / Created 100000 employees

## Complete source files

### `Calculator.java`

```java
public class Calculator {
    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int sum = add(x, y);

        System.out.println("Sum = " + sum);
    }
}
```

### `Employee.java`

```java
public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id + " - " + name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Aman");
        emp.display();
    }
}
```

### `HelloWorld.java`

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, JVM!");
    }
}
```

### `MemoryDemo.java`

```java
import java.util.ArrayList;
import java.util.List;

public class MemoryDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            employees.add(new Employee(i, "Employee-" + i));
        }

        System.out.println("Created " + employees.size() + " employees");
    }
}
```

## Notes

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


