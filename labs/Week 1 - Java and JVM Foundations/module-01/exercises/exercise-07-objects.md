# Exercise — Objects and Classes

**Module 1** · Pre-lab practice · finish all 8, then [`../lab1/LAB-1-GUIDE.md`](../lab1/LAB-1-GUIDE.md)  
**Folder:** `examples/module-01-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Classes, Objects, and References](../../../lab_diagrams/mod01-ex07-objects.png)

## Goal

Create `Person.java` with fields, a constructor, and a method; instantiate in `main`.

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```text
Aman is 21 years old
```

Then follow **Steps** to create your own file.


## Starter (fill in the TODOs)

Paste this skeleton, then replace each `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
public class Person {
    // TODO: declare two instance fields — String name and int age
    _____

    // TODO: constructor — assign parameters to fields using this.name / this.age
    public Person(String name, int age) {
        _____
    }

    // TODO: print "<name> is <age> years old" using the fields
    public void display() {
        _____
    }

    public static void main(String[] args) {
        // TODO: create a Person with name "Aman" and age 21, then call display()
        _____
    }
}
```

| Idea | Easy meaning |
| ---- | ------------ |
| Class | Blueprint (`Person`) |
| Object | One instance created with `new` |
| Field | Data stored in the object (`name`, `age`) — on the **heap** |
| Reference | Variable `person` points to the object — reference lives on the **stack** |

## Steps

### Step 1 — Create `Person.java`

**Why:** Objects group data + behavior; this is the core OOP starting point.

1. Create `Person.java` with **New → File** under `module-01-exercises`.
2. Paste the starter, fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

| Command | Easy meaning |
| ------- | ------------ |
| `javac Person.java` | Compile class + `main` |
| `java Person` | Run `main`, create object, print |

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises
javac Person.java
java Person
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-01-exercises
javac Person.java
java Person
```

**Expected:** Something like `Aman is 21 years old`.

**Verified (Windows):**

```text
Aman is 21 years old
```

## Expected result

Object prints; fields live on the heap and the reference on the stack.

## If it fails

| Problem | Fix |
| ------- | --- |
| `illegal start of expression` near `_____` | Replace every blank with real Java — blanks are not valid code |
| Fields stay null / zero | Constructor must assign `this.name = name` and `this.age = age` |
| `cannot find symbol` on `display()` | Call on the object: `person.display();` — not `Person.display()` unless static |
| Class/file name mismatch | File must be `Person.java` with `public class Person` |

## Pass criteria

_Mark each row **Pass** or **Fail** in your lab notes (GitHub markdown files are not interactive checklists)._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Code compiles and runs (or notes complete if analysis-only) | Pass / Fail |
| 2 | You can explain the result in one sentence | Pass / Fail |
