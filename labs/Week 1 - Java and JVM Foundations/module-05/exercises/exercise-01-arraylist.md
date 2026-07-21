# Exercise 1 — Working with `ArrayList`

**Module 5** · Pre-lab practice · finish all 7 Pass, then OS how-to → [`../lab5/LAB-5-GUIDE.md`](../lab5/LAB-5-GUIDE.md)  
**Folder:** `examples/module-05-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Collections: Working with ArrayList](../../../lab_diagrams/mod05-ex01-arraylist.png)

## Goal

Create `ArrayListDemo.java` and practice ordered CRUD: add, update, search, remove, index access, and iteration.

## Starter (fill in the TODOs)

Paste this skeleton, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // TODO: declare List<String> books as new ArrayList<>()
        List<String> books = _____;

        // TODO: add four titles — include "Java Fundamentals" twice (duplicate allowed)
        //   "Java Fundamentals", "Clean Code", "Effective Java", "Java Fundamentals"
        _____
        _____
        _____
        _____

        // TODO: replace the value at index 1 with "Clean Architecture"
        _____

        // TODO: search — does books contain "Effective Java"?
        boolean found = _____;

        // TODO: remove the first "Java Fundamentals" only (not removeIf)
        _____

        System.out.println(
                "Found Effective Java: " + found);
        System.out.println("Size: " + books.size());

        // TODO: print index and title for each element
        for (int i = 0; i < books.size(); i++) {
            System.out.printf(
                    "%d: %s%n", i, _____);
        }
    }
}
```

## Operation guide

| Operation | Purpose | Important detail |
| --------- | ------- | ---------------- |
| `add(value)` | Append | Preserves insertion order |
| `get(index)` | Read by position | Index begins at `0` |
| `set(index, value)` | Replace | Does not change list size |
| `contains(value)` | Search | Uses `equals` |
| `remove(value)` | Remove first match | Returns whether removal occurred |
| `size()` | Number of elements | Duplicates count separately |

## Steps

### Step 1 — Create `ArrayListDemo.java`

**Why:** Lab 5 stores ordered book catalogs in `List` structures.

1. **New → File** → `ArrayListDemo.java`.
2. Paste the starter.
3. Fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-05-exercises
javac ArrayListDemo.java
java ArrayListDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-05-exercises
javac ArrayListDemo.java
java ArrayListDemo
```

**Verified (Windows):**

```text
Found Effective Java: true
Size: 3
0: Clean Architecture
1: Effective Java
2: Java Fundamentals
```

### Step 3 — Trace the changes

Add to `notes.md`:

```text
After adds:  [Java Fundamentals, Clean Code, Effective Java, Java Fundamentals]
After set:   [Java Fundamentals, Clean Architecture, Effective Java, Java Fundamentals]
After remove:[Clean Architecture, Effective Java, Java Fundamentals]
```

### Step 4 — Run an index failure experiment

Temporarily add:

```java
System.out.println(books.get(99));
```

Run and observe `IndexOutOfBoundsException`. Remove the line afterward.

**Why:** A list grows dynamically, but every accessed index must still be between `0` and `size() - 1`.

## Expected result

The final list has three ordered entries. One duplicate remains because only the first matching title was removed.

## If it fails

| Problem | Fix |
| ------- | --- |
| `ArrayList` cannot be found | Add both `java.util` imports |
| Wrong item replaced | `set(1, ...)` targets the second item |
| Both duplicate titles removed | Use `remove(value)`, not `removeIf` |
| `illegal start of expression` near `_____` | Replace every blank with real Java — blanks are not valid code |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Final size is `3` and order matches verified output | Pass / Fail |
| 2 | You can explain why one duplicate remains | Pass / Fail |
| 3 | You can state the valid index range | Pass / Fail |
