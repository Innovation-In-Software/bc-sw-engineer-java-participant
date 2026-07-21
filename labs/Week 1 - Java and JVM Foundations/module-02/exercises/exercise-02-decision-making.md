# Exercise 2 — Decision Making

**Module 2** · Pre-lab practice · finish core 1–7 Pass, then [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md)  
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Decisions: if/else-if versus switch](../../../lab_diagrams/mod02-ex02-decision-making.png)

> **New for Module 2:** `if` / `else if` / `else` and `switch` — the two ways Java picks a path.

## Goal

Create `DecisionDemo.java` that reads a numeric score and prints a letter grade with `if`/`else if`/`else`, then reads a day number (1–7) and prints its name with `switch`.

## Starter (fill in the TODOs)

Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.Scanner;

public class DecisionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Score (0-100): ");
        int score = Integer.parseInt(scanner.nextLine());

        // TODO: if / else if / else — print Grade: A/B/C/F
        //   A: score >= 90
        //   B: score >= 80
        //   C: score >= 70
        //   F: otherwise
        //   (branch order matters — first true wins)

        System.out.print("Day number (1-7): ");
        int day = Integer.parseInt(scanner.nextLine());

        // TODO: switch on day — print Monday..Sunday for 1..7
        //   use arrow form: case 1 -> System.out.println("Monday");
        //   default -> System.out.println("Not a valid day");

        scanner.close();
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| `if` / `else if` / `else` | Test conditions top to bottom; stop at the first `true` |
| `switch` (arrow form) | Match one value against a fixed set of cases; no `break` needed |
| `default` | Runs when nothing else matched |

## Steps

### Step 1 — Create `DecisionDemo.java`

**Why:** Every menu and validation check in Lab 2 branches with `if` or `switch`.

1. **New → File** → `DecisionDemo.java`.
2. Paste the starter.
3. Fill every `// TODO`. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac DecisionDemo.java
java DecisionDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac DecisionDemo.java
java DecisionDemo
```

**Verified (Windows)** — score `85`, day `3`:

```text
Score (0-100): 85
Grade: B
Day number (1-7): 3
Wednesday
```

## Expected result

Correct grade for your score and correct day name for your day number.

## If it fails

| Problem | Fix |
| ------- | --- |
| Wrong grade printed | Check branch order — the first `true` condition wins, so widest ranges must come last |
| `Not a valid day` for 1-7 | Confirm the `case` values match `1` through `7` exactly |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Grade and day name are both correct for your inputs | Pass / Fail |
| 2 | You can explain why branch order matters in `if`/`else if` | Pass / Fail |
