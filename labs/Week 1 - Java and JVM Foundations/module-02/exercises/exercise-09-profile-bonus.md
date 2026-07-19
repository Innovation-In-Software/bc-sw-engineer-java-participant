# Exercise 9 — Personal Profile (bonus)

**Module 2** · Pre-lab practice · then open [`../lab2/LAB-2-GUIDE.md`](../lab2/LAB-2-GUIDE.md)  
**Folder:** `examples/module-02-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Formatted Output: Building a Console Table](../../../lab_diagrams/mod02-ex09-profile-bonus.png)

> **Optional:** practice aligned columns — same idea as Lab 2’s student list `printf` table.

## Goal

Create `PersonalProfile.java` that reads name, age, city, and hobby, then prints a simple two-column table with `printf` width specifiers.

## Starter / reference (with line comments)

```java
import java.util.Scanner;

public class PersonalProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        String age = scanner.nextLine();    // keep as String for simple table demo

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("Hobby: ");
        String hobby = scanner.nextLine();

        System.out.println();
        // %-12s = left-align in a 12-character field; %-20s = 20-character field
        System.out.printf("%-12s | %-20s%n", "Field", "Value");
        System.out.println("-------------|---------------");
        System.out.printf("%-12s | %-20s%n", "Name", name);
        System.out.printf("%-12s | %-20s%n", "Age", age);
        System.out.printf("%-12s | %-20s%n", "City", city);
        System.out.printf("%-12s | %-20s%n", "Hobby", hobby);

        scanner.close();
    }
}
```

| Format piece | Easy meaning |
| ------------ | ------------ |
| `%-12s` | String, **left**-aligned, width 12 |
| `%20s` | String, **right**-aligned, width 20 (optional style) |
| `\|` | Visual column separator (just a character you print) |

## Steps

### Step 1 — Create `PersonalProfile.java`

**Why:** Lab 2 display menu uses the same column-alignment trick for student rows.

1. **New → File** → `PersonalProfile.java`.
2. Paste the starter. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-02-exercises
javac PersonalProfile.java
java PersonalProfile
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-02-exercises
javac PersonalProfile.java
java PersonalProfile
```

**Verified (Windows)** — sample:

```text
Name: Aman
Age: 21
City: Toronto
Hobby: Coding

Field        | Value               
-------------|---------------
Name         | Aman                
Age          | 21                  
City         | Toronto             
Hobby        | Coding              
```

## Expected result

A readable two-column profile table with aligned fields.

## If it fails

| Problem | Fix |
| ------- | --- |
| Columns look ragged | Use the same width for every row (`%-12s`, `%-20s`) |
| Want numeric age | You may parse with `Integer.parseInt` — not required for this bonus |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Table prints with four fields aligned | Pass / Fail |
| 2 | You can explain what `%-12s` does in one sentence | Pass / Fail |
