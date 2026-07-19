# Exercise 4 — Methods

**Module 2** · Pre-lab practice · then open [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md)  
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

> **New for Module 2:** declaring your own methods, passing parameters, returning a value, and overloading.

## Goal

Create `MethodsDemo.java` with a `square` method that takes an `int` and returns its square, plus a second, overloaded `square` that takes a `double`.

## Starter / reference (with line comments)

```java
public class MethodsDemo {
    // Takes an int parameter; returns an int
    public static int square(int n) {
        return n * n;
    }

    // Overload: same method name, different parameter type
    public static double square(double n) {
        return n * n;
    }

    public static void main(String[] args) {
        int intResult = square(4);          // calls the int version
        double doubleResult = square(2.5);  // calls the double version — compiler picks by argument type

        System.out.println("square(4) = " + intResult);
        System.out.println("square(2.5) = " + doubleResult);
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| Parameter | Input value a method receives (`n`) |
| Return type | The type of value sent back (`int`, `double`) |
| Overloading | Same method name, different parameter types — the compiler picks which one to call |

## Steps

### Step 1 — Create `MethodsDemo.java`

**Why:** Lab 2's student menu app calls named methods for each menu option instead of one giant `main`.

1. **New → File** → `MethodsDemo.java`.
2. Paste the starter. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac MethodsDemo.java
java MethodsDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac MethodsDemo.java
java MethodsDemo
```

**Verified (Windows):**

```text
square(4) = 16
square(2.5) = 6.25
```

## Expected result

Both calls print the correct square, and the program compiles even though two methods share the name `square`.

## If it fails

| Problem | Fix |
| ------- | --- |
| `error: square(int) is already defined` | The two overloads must differ in parameter **type**, not just variable name |
| Wrong result for the `double` call | Confirm you called `square(2.5)`, not `square((int) 2.5)` |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Both `square` calls print the correct result | Pass / Fail |
| 2 | You can explain how Java chooses which overload to call | Pass / Fail |
