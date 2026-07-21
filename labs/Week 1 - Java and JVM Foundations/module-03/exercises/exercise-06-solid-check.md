# Exercise 6 — SOLID Spot-Check: SRP

**Module 3** · Pre-lab practice · finish all 8 Pass, then [`../lab3/LAB-3-GUIDE.md`](../lab3/LAB-3-GUIDE.md)  
**Folder:** `examples/module-03-exercises/` ([setup](EXERCISES-INDEX.md))

![Single Responsibility Principle Refactoring](../../../lab_diagrams/mod03-ex06-solid-srp.svg)

> **Focused scope:** SOLID has five principles. This warm-up practices only **S — Single Responsibility Principle (SRP)** before Lab 3 separates model, service, and menu responsibilities.

## Goal

Refactor one method that mixes interest calculation and console formatting. Create `SolidDemo.java` with separate calculation and display methods.

## Before — mixed responsibilities

```java
static void calculateAndPrintInterest(
        double balance, double ratePercent) {
    double interest = balance * ratePercent / 100.0;
    System.out.printf(
            "Interest earned: %.2f%n", interest);
}
```

This method has two reasons to change:

1. the bank changes its interest formula;
2. the UI changes how interest is displayed.

## Starter (fill in the TODOs)

Paste this skeleton, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs or blanks in your finished file.

```java
public class SolidDemo {
    // Business calculation: returns data; does not print.
    static double calculateInterest(
            double balance, double ratePercent) {
        // TODO: return balance * ratePercent / 100.0 (no System.out here)
        return _____;
    }

    // Presentation: formats a value; does not calculate it.
    static void printInterest(double interest) {
        // TODO: printf "Interest earned: %.2f%n"
        System.out.printf(_____, interest);
    }

    public static void main(String[] args) {
        // TODO: calculate interest for 10_000 at 5%, then print it
        double interest = _____;
        _____;
    }
}
```

| Method | One responsibility |
| ------ | ------------------ |
| `calculateInterest` | Apply the interest formula |
| `printInterest` | Format and display a result |
| `main` | Coordinate the small workflow |

## Steps

### Step 1 — Identify the two reasons to change

**Why:** SRP is about reasons to change, not merely making methods short.

In `notes.md`, add:

```markdown
## SRP spot-check

The original method could change because the formula changes or because
the output format changes. These are separate responsibilities.
```

### Step 2 — Create `SolidDemo.java`

**Why:** Returning the calculated value makes the business logic reusable and independently testable.

Create `SolidDemo.java`. Paste the starter. Fill every `_____` / `// TODO`. Save.

### Step 3 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-03-exercises
javac SolidDemo.java
java SolidDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-03-exercises
javac SolidDemo.java
java SolidDemo
```

**Verified (Windows):**

```text
Interest earned: 500.00
```

### Step 4 — Test calculation without console output

**Why:** Separation lets you check the formula without parsing printed text.

Temporarily add inside `main`:

```java
if (interest != 500.00) {
    throw new AssertionError(
            "Expected 500.00, got " + interest);
}
```

Recompile and run. No assertion error means the calculation passed.

### Step 5 — Connect SRP to Lab 3

Add one sentence to `notes.md`:

> `Main` should manage menu input, `BankService` should coordinate banking operations, and domain classes should protect their own state.

## Expected result

The program prints `500.00`; calculation has no `System.out`, and display code does not contain the interest formula.

## If it fails

| Problem | Fix |
| ------- | --- |
| `illegal start of expression` near `_____` | Replace blanks with formula, format string, and method calls |
| Interest prints `50000.00` | Divide percentage by `100.0` |
| Calculation still prints | Return `double`; print only in `printInterest` |
| `main` repeats the formula | Call `calculateInterest` instead |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Output is `Interest earned: 500.00` | Pass / Fail |
| 2 | Calculation and display are separate methods | Pass / Fail |
| 3 | You can name both reasons the original method might change | Pass / Fail |
| 4 | You can connect SRP to Main / BankService / domain classes | Pass / Fail |
