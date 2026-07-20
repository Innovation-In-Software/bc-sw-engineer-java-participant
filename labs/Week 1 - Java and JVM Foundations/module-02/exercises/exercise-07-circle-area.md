# Exercise 7 — Area of Circle

**Module 2** · Pre-lab practice · finish core 1–7 Pass, then [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md)  
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Math: Calculating the Area of a Circle](../../../lab_diagrams/mod02-ex07-circle-area.png)

> **New for Module 2:** `Math.PI` and `printf` decimal formatting (Lab 2 uses `printf` for tables).

## Goal

Create `CircleArea.java` that reads a radius (`double`) and prints the area using `Math.PI`, formatted to 2 decimal places.

## Starter / reference (with line comments)

```java
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius: ");
        double r = Double.parseDouble(scanner.nextLine());

        // Area of a circle: π × r²
        double area = Math.PI * r * r;

        System.out.printf("Area: %.2f%n", area);   // %.2f → two decimal places

        scanner.close();
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| `Math.PI` | Built-in constant for π (≈ 3.14159…) |
| `r * r` | Radius squared |
| `%.2f` | Round/display with 2 digits after the decimal |

## Steps

### Step 1 — Create `CircleArea.java`

**Why:** Practice library constants + formatted output before Lab 2’s student table.

1. **New → File** → `CircleArea.java`.
2. Paste the starter. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac CircleArea.java
java CircleArea
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac CircleArea.java
java CircleArea
```

**Verified (Windows)** — radius `5`:

```text
Radius: 5
Area: 78.54
```

(Exact display may vary slightly by rounding; ≈ `78.54` is expected.)

## Expected result

Area matches π × r × r and prints with two decimals.

## If it fails

| Problem | Fix |
| ------- | --- |
| `cannot find symbol PI` | Use `Math.PI` (capital `PI`) — no import needed |
| Many decimal places | Use `printf` with `%.2f`, not bare `println(area)` |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Area prints with two decimals for your radius | Pass / Fail |
| 2 | You can write the formula `Math.PI * r * r` from memory | Pass / Fail |

---

## Next

Core Exercises **1–7** complete → open **one** OS how-to → [`../lab2/LAB-2-WINDOWS.md`](../lab2/LAB-2-WINDOWS.md) or [`../lab2/LAB-2-MACOS.md`](../lab2/LAB-2-MACOS.md) → then graded [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md) (builds on these exercises; separate folder `examples/Lab2-JavaSyntax/`).

Optional: continue to Exercises 8–9 (challenge/bonus) before or during Lab extended time.
