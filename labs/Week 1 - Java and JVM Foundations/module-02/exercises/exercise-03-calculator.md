# Exercise 3 — Calculations

**Module 2** · Pre-lab practice · then open [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md)  
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

> **Builds on Module 1 types:** operators you already know; numbers come from **input**, not literals.

## Goal

Create `Calculator.java` that reads two numbers and prints sum, difference, product, and quotient (use `double` so division keeps decimals).

## Starter / reference (with line comments)

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("Second number: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.printf("Sum: %.2f%n", a + b);          // addition
        System.out.printf("Difference: %.2f%n", a - b);   // subtraction
        System.out.printf("Product: %.2f%n", a * b);      // multiplication
        System.out.printf("Quotient: %.2f%n", a / b);     // division (double ÷ double)

        scanner.close();
    }
}
```

| Operator | Meaning |
| -------- | ------- |
| `+` | Sum |
| `-` | Difference (`a` minus `b`) |
| `*` | Product |
| `/` | Quotient — with `double`, `12 / 4` → `3.00` (not integer truncation) |

## Steps

### Step 1 — Create `Calculator.java`

**Why:** Warm up arithmetic you will reuse in bill totals and Lab 2 averages.

1. **New → File** → `Calculator.java`.
2. Paste the starter. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac Calculator.java
java Calculator
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac Calculator.java
java Calculator
```

**Verified (Windows)** — inputs `12` and `4`:

```text
First number: 12
Second number: 4
Sum: 16.00
Difference: 8.00
Product: 48.00
Quotient: 3.00
```

## Expected result

Four labeled results print for your two inputs.

## If it fails

| Problem | Fix |
| ------- | --- |
| Quotient is `0` or truncated | Use `double` (not `int`) for both numbers |
| Crash on second input empty | Type a number and press Enter each time |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Four results print correctly | Pass / Fail |
| 2 | You can explain why `double` is preferred for division here | Pass / Fail |
