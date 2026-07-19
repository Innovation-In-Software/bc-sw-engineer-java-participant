# Exercise 8 — Bill Summary (challenge)

**Module 2** · Pre-lab practice · then open [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md)  
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Bill Calculation: Total, Discount, and Final Amount](../../../lab_diagrams/mod02-ex08-bill-summary.png)

> **Combines Exercises 1, 6–7:** product input, arithmetic, money-style `printf`.

## Goal

Create `BillSummary.java` that reads product name, quantity, and unit price; computes total, 10% discount, and final amount; prints a short bill with `%.2f`.

## Starter / reference (with line comments)

```java
import java.util.Scanner;

public class BillSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String name = scanner.nextLine();

        System.out.print("Quantity: ");
        int qty = Integer.parseInt(scanner.nextLine());

        System.out.print("Unit price: ");
        double price = Double.parseDouble(scanner.nextLine());

        double total = qty * price;           // before discount
        double discount = total * 0.10;       // 10% off
        double finalAmount = total - discount;

        System.out.println("--- Bill Summary ---");
        System.out.printf("Product: %s%n", name);
        System.out.printf("Quantity: %d%n", qty);
        System.out.printf("Unit price: %.2f%n", price);
        System.out.printf("Total: %.2f%n", total);
        // %% prints a literal % character inside printf
        System.out.printf("Discount (10%%): %.2f%n", discount);
        System.out.printf("Final amount: %.2f%n", finalAmount);

        scanner.close();
    }
}
```

| Formula | Meaning |
| ------- | ------- |
| `total = qty * price` | Line total before discount |
| `discount = total * 0.10` | 10% of total |
| `finalAmount = total - discount` | Amount to pay |
| `10%%` in `printf` | Prints `10%` (one `%` is special in format strings) |

## Steps

### Step 1 — Create `BillSummary.java`

**Why:** Multi-step calculation + clean money formatting — same habits as Lab 2 averages / tables.

1. **New → File** → `BillSummary.java`.
2. Paste the starter (or write it yourself from the formulas). Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac BillSummary.java
java BillSummary
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac BillSummary.java
java BillSummary
```

**Verified (Windows)** — `Laptop`, qty `3`, price `59.99`:

```text
Product name: Laptop
Quantity: 3
Unit price: 59.99
--- Bill Summary ---
Product: Laptop
Quantity: 3
Unit price: 59.99
Total: 179.97
Discount (10%): 18.00
Final amount: 161.97
```

Check: `3 × 59.99 = 179.97`, `10% = 17.997 → 18.00` displayed, final `161.97`.

## Expected result

Bill shows total, discount, and final amount with two decimal places.

## If it fails

| Problem | Fix |
| ------- | --- |
| `Discount (10%)` looks wrong / missing `%` | Use `10%%` inside the format string |
| Final amount off | Confirm `discount = total * 0.10` then `total - discount` |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Sample `3 × 59.99` yields final **161.97** (or equivalent rounding) | Pass / Fail |
| 2 | You can explain total → discount → final in one sentence | Pass / Fail |
