# Exercise 1 — Personal Details

**Module 2** · Pre-lab practice · then open [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md)  
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

> **Not a repeat of Module 1:** Module 1 used hard-coded variables. Here you **read** name, age, and city from the console with `Scanner`.

## Goal

Create `PersonalDetails.java` that prompts for name (`String`), age (`int`), and city (`String`), then prints a formatted greeting.

## Starter / reference (with line comments)

```java
import java.util.Scanner;   // Scanner lives in java.util — must import it

public class PersonalDetails {
    public static void main(String[] args) {
        // One Scanner reading from the keyboard (System.in)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");   // print = no newline after prompt
        String name = scanner.nextLine();        // read whole line as text

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();             // read an int; leaves '\n' in the buffer
        scanner.nextLine();                      // consume that leftover newline (important!)

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();        // now reads the city, not an empty line

        // %s = string, %d = int, %n = platform newline
        System.out.printf("Hello, %s! You are %d years old and live in %s.%n",
                name, age, city);

        scanner.close();                         // good habit when you own the Scanner
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| `Scanner(System.in)` | Reads what you type in the terminal |
| `nextLine()` | Whole line as `String` (includes spaces) |
| `nextInt()` | Next integer token — **does not** consume the Enter key’s newline |
| Extra `nextLine()` after `nextInt()` | Clears the leftover newline so the next `nextLine()` works |
| `printf` + `%s` / `%d` | Insert values into a format string |

## Steps

### Step 1 — Create `PersonalDetails.java`

**Why:** Practice interactive input — Lab 2’s menu app uses the same `Scanner` idea.

1. Right-click `module-02-exercises` → **New → File** (not Java Class).
2. Name it exactly `PersonalDetails.java`.
3. Paste the starter code above. Save (**Ctrl+S** / **⌘S**).

Ignore any yellow *outside of the module source root* banner.

### Step 2 — Compile and run

**Why:** Confirm prompts appear and the greeting uses your typed values.

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac PersonalDetails.java
java PersonalDetails
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac PersonalDetails.java
java PersonalDetails
```

Type answers when prompted (example: `Aman`, `21`, `Toronto`).

**Verified (Windows)** — sample session:

```text
Enter your name: Aman
Enter your age: 21
Enter your city: Toronto
Hello, Aman! You are 21 years old and live in Toronto.
```

### Step 3 — See the leftover-newline bug (optional)

**Why:** Lab 2 warns about mixing `nextInt()` / `nextDouble()` with `nextLine()`.

Temporarily **delete** the `scanner.nextLine();` line after `nextInt()`, recompile, and run again. After you enter age, the city prompt often appears to skip — the leftover `\n` is read as an empty city.

## Expected result

Program prompts for three values and greets with all three.

## If it fails

| Problem | Fix |
| ------- | --- |
| City skipped / empty | Add `scanner.nextLine()` after `nextInt()` |
| `InputMismatchException` | Age must be a whole number (e.g. `21`, not `twenty`) |
| `cannot find symbol Scanner` | Add `import java.util.Scanner;` at the top |

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Code compiles and runs; greeting shows name, age, city | Pass / Fail |
| 2 | You can explain why an extra `nextLine()` is needed after `nextInt()` | Pass / Fail |
