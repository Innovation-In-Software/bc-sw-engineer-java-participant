# Exercise — Methods and Parameters

**Module 1** · Pre-lab practice · finish all 8, then [`../lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md)  
**Folder:** `examples/module-01-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Method Calls, Parameters, and Return Values](../../../lab_diagrams/mod01-ex06-methods.png)

## Goal

Create `Methods.java` with at least two methods that take parameters and return a value; call them from `main`.

## Starter (fill in the TODOs)

Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
public class Methods {
    public static void main(String[] args) {
        // TODO: call add(10, 20) and store the result; print it (expect 30)
        int sum = _____;
        System.out.println(sum);

        // TODO: call greet("Aman") and store the result; print it (expect Hello, Aman!)
        String message = _____;
        System.out.println(message);
    }

    // TODO: return the sum of two ints
    public static int add(int a, int b) {
        _____
    }

    // TODO: return a greeting String — "Hello, " + name + "!"
    public static String greet(String name) {
        _____
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| Parameter | Input value the method receives (`a`, `b`, `name`) |
| Return | Value sent back to the caller (`return …`) |
| Call from `main` | `main` pauses, runs the method, then continues with the result |

**Stack hint:** Each method call gets its own short-lived frame (locals + return address) on the **stack**.

## Steps

### Step 1 — Create `Methods.java`

**Why:** Methods let you reuse logic and pass data in/out.

1. Create `Methods.java` with **New → File** (not Java Class) under `module-01-exercises`.
2. Paste the starter, fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

| Command | Easy meaning |
| ------- | ------------ |
| `javac Methods.java` | Compile |
| `java Methods` | Run `main` → calls `add` and `greet` |

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Methods.java
java Methods
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac Methods.java
java Methods
```

**Expected:** Prints `30` and `Hello, Aman!` (or your equivalent).

**Verified (Windows):**

```text
30
Hello, Aman!
```

## Expected result

Method results print; you can explain stack frames for the calls.

## If it fails

| Problem | Fix |
| ------- | --- |
| `illegal start of expression` near `_____` | Replace every blank with real Java — blanks are not valid code |
| `missing return statement` | Every non-void method must `return` a value on every path |
| `cannot find symbol` on method call | Method must be `static` to call from `static main` without an object |
| Wrong greeting format | Use `"Hello, " + name + "!"` — `+` joins strings |

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Code compiles and runs (or notes complete if analysis-only) | Pass / Fail |
| 2 | You can explain the result in one sentence | Pass / Fail |
