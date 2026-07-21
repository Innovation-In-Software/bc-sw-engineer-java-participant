# Exercise — Variables and Data Types

**Module 1** · Pre-lab practice · finish all 8, then [`../lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md)  
**Folder:** `examples/module-01-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Variables, Primitive Values, and Reference Types](../../../lab_diagrams/mod01-ex05-variables.png)

## Goal

Create `Variables.java` with local variables of several primitive types and one `String`; print each.

## Starter (fill in the TODOs)

Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
public class Variables {
    public static void main(String[] args) {
        // TODO: declare and initialize one variable of each type below
        int age = _____;                       // whole number — try 21
        long population = _____;               // large whole number — use L suffix (e.g. 8_000_000_000L)
        double price = _____;                  // decimal — try 19.99
        boolean enrolled = _____;              // true or false
        char grade = _____;                    // single character in single quotes — try 'A'
        String name = _____;                   // text in double quotes — try "Aman"

        // TODO: print each variable on its own line (six println calls)
        _____
    }
}
```

| Type | Easy meaning | Example |
| ---- | ------------ | ------- |
| `int` | Small/medium whole numbers | `21` |
| `long` | Large whole numbers | `8_000_000_000L` |
| `double` | Decimals | `19.99` |
| `boolean` | Yes/no flag | `true` |
| `char` | One character | `'A'` |
| `String` | Text (not a primitive) | `"Aman"` |

## Steps

### Step 1 — Create `Variables.java`

**Why:** Practice storing different kinds of data in named boxes (variables).

1. Right-click `module-01-exercises` → **New → File** (not Java Class).
2. Name it exactly `Variables.java`.
3. Paste the starter, fill every `_____` / `// TODO`. Save (**Ctrl+S** / **⌘S**).

Ignore any yellow *outside of the module source root* banner.

### Step 2 — Compile and run

**Why:** Confirm the types compile and print correctly.

| Command | Easy meaning |
| ------- | ------------ |
| `javac Variables.java` | Compile source → `Variables.class` |
| `java Variables` | Run `main` |

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Variables.java
java Variables
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac Variables.java
java Variables
```

**Expected:** Six lines print (age, population, price, enrolled, grade, name) with no errors.

**Verified (Windows):**

```text
21
8000000000
19.99
true
A
Aman
```

## Expected result

All declared values print without compile/runtime errors.

## If it fails

| Problem | Fix |
| ------- | --- |
| `illegal start of expression` near `_____` | Replace every blank with real Java — blanks are not valid code |
| `integer number too large` on population | Use `long` with an `L` suffix: `8_000_000_000L` |
| `unclosed character literal` | `char` uses single quotes: `'A'`, not `"A"` |
| `cannot find symbol` on String | Capital S — `String` is a class name |

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Code compiles and runs (or notes complete if analysis-only) | Pass / Fail |
| 2 | You can explain the result in one sentence | Pass / Fail |
