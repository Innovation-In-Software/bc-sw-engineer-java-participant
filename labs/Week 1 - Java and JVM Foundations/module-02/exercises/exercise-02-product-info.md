# Exercise 2 — Product Information

**Module 2** · Pre-lab practice · then open [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md)  
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

> **Builds on Exercise 1:** same `Scanner` idea; prefer **`nextLine()` + parse** (Lab 2’s safer style) so leftover newlines do not bite you.

## Goal

Create `ProductInfo.java` that reads product name, quantity (`int`), and price (`double`), then prints the details.

## Starter / reference (with line comments)

```java
import java.util.Scanner;

public class ProductInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String name = scanner.nextLine();   // text may include spaces

        System.out.print("Quantity: ");
        // Read a full line, then convert — avoids nextInt leftover-newline issues
        int qty = Integer.parseInt(scanner.nextLine());

        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        // %.2f = show two digits after the decimal (money-style)
        System.out.printf("Product: %s | Qty: %d | Price: %.2f%n", name, qty, price);

        scanner.close();
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| `Integer.parseInt(...)` | Turn text `"3"` into `int` `3` |
| `Double.parseDouble(...)` | Turn text `"59.99"` into `double` `59.99` |
| Always `nextLine()` | One read style → no mixed `nextInt` / `nextLine` bugs |
| `%.2f` | Format a decimal with 2 places |

## Steps

### Step 1 — Create `ProductInfo.java`

**Why:** Lab 2 will ask for quantities and marks — same parse pattern.

1. **New → File** → `ProductInfo.java` under `module-02-exercises`.
2. Paste the starter. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac ProductInfo.java
java ProductInfo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac ProductInfo.java
java ProductInfo
```

**Verified (Windows)** — sample session:

```text
Product name: Laptop
Quantity: 3
Price: 59.99
Product: Laptop | Qty: 3 | Price: 59.99
```

## Expected result

Product name, quantity, and price print correctly (price with two decimals).

## If it fails

| Problem | Fix |
| ------- | --- |
| `NumberFormatException` | Quantity/price must be numeric (`3`, `59.99`) — no letters |
| Wrong price formatting | Use `%.2f` in `printf` |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Code compiles and runs; all three fields print | Pass / Fail |
| 2 | You can explain why `nextLine()` + parse is safer than mixing `nextInt` / `nextDouble` | Pass / Fail |
