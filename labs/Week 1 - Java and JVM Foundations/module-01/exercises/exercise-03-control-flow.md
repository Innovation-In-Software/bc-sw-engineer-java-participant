# Exercise — Control Flow

**Module 1** · Pre-lab practice · finish all 8, then [`../lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md)  
**Folder:** `examples/module-01-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Control Flow with Decisions and Loops](../../../lab_diagrams/mod01-ex03-control-flow.png)

## Goal

Create `ControlFlow.java` using `if`, `for`, `while`, and `switch` with simple examples.

## Starter (fill in the TODOs)

Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
public class ControlFlow {
    public static void main(String[] args) {
        int number = 4;

        // TODO: if / else — print "even" when number is even, "odd" otherwise
        //   hint: number % 2 == 0 means even
        _____

        // TODO: for loop — print 1 through 5 (one number per line)
        //   hint: for (int i = 1; i <= 5; i++) { ... }
        _____

        // TODO: while loop — countdown from 3 to 1
        //   print "countdown " + count each time; decrease count so the loop ends
        int count = 3;
        _____

        // TODO: switch on day (value 2) — case 1 -> Monday, case 2 -> Tuesday
        //   default -> "Other day"; remember break after each case
        int day = 2;
        _____
    }
}
```

| Structure | Easy meaning |
| --------- | ------------ |
| `if` / `else` | Do A or B based on a condition |
| `for` | Loop with a counter |
| `while` | Loop while condition is true |
| `switch` | Jump to a matching case |

## Steps

### Step 1 — Create `ControlFlow.java`

**Why:** Real programs branch and repeat; these four structures are the basics.

1. Create `ControlFlow.java` with **New → File** under `module-01-exercises`.
2. Paste the starter, fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

| Command | Easy meaning |
| ------- | ------------ |
| `javac ControlFlow.java` | Compile |
| `java ControlFlow` | Run all four demos |

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac ControlFlow.java
java ControlFlow
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac ControlFlow.java
java ControlFlow
```

**Expected:** Even/odd line, numbers 1–5, a short countdown, and a day label.

**Verified (Windows):**

```text
even
1
2
3
4
5
countdown 3
countdown 2
countdown 1
Tuesday
```

## Expected result

All four control structures run and print clear output.

## If it fails

| Problem | Fix |
| ------- | --- |
| `illegal start of expression` near `_____` | Replace every blank with real Java — blanks are not valid code |
| Infinite loop on countdown | Decrease `count` inside the `while` body (`count--`) |
| Wrong day or fall-through in `switch` | Add `break;` after each `case` (except when you intend fall-through) |
| Always prints `odd` | Check `% 2 == 0` for even — `%` is remainder, not division |

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Code compiles and runs (or notes complete if analysis-only) | Pass / Fail |
| 2 | You can explain the result in one sentence | Pass / Fail |
