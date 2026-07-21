# Exercise 7 — Library Collections Warm-up

**Module 5** · Pre-lab practice · finish all 7 Pass, then OS how-to → [`../lab5/LAB-5-GUIDE.md`](../lab5/LAB-5-GUIDE.md)  
**Folder:** `examples/module-05-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Collections Warm-Up: Library Checkout Workflow](../../../lab_diagrams/mod05-ex07-library-warmup.png)

> **Bridge to Lab 5:** Coordinate two collections around one checkout rule without yet building the full library application.

## Goal

Create `LibraryWarmup.java` with:

- a `List<String>` of available titles;
- a `Map<String,String>` from member ID to borrowed title;
- a checkout operation that keeps both structures consistent.

## Starter (fill in the TODOs)

Paste this skeleton, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryWarmup {
    // TODO: declare availableTitles as ArrayList<String>
    private final List<String> availableTitles =
            _____;

    // TODO: declare borrowedByMember as HashMap<String, String>
    private final Map<String, String> borrowedByMember =
            _____;

    public LibraryWarmup() {
        // TODO: add "Effective Java" and "Clean Code" to availableTitles
        _____
        _____
    }

    boolean checkout(String memberId, String title) {
        // TODO: return false if member already has an active loan
        if (_____) {
            return false;
        }

        // TODO: return false when title is unavailable (remove returns false)
        if (_____) {
            return false;
        }

        // TODO: record the loan in borrowedByMember
        _____;
        return true;
    }

    void printStatus() {
        System.out.println(
                "Available: " + availableTitles);
        System.out.println(
                "Borrowed: " + borrowedByMember);
    }

    public static void main(String[] args) {
        LibraryWarmup library = new LibraryWarmup();

        System.out.println(
                "Checkout success: "
                + library.checkout(
                        "M101", "Effective Java"));

        System.out.println(
                "Duplicate checkout: "
                + library.checkout(
                        "M101", "Clean Code"));

        library.printStatus();
    }
}
```

## Invariant

After a successful checkout:

```text
title is NOT in availableTitles
AND
borrowedByMember.get(memberId) equals title
```

The method validates first, then mutates both structures in a controlled order.

## Steps

### Step 1 — Create `LibraryWarmup.java`

**Why:** Lab 5 coordinates multiple collections around domain rules — this warm-up previews that pattern.

1. **New → File** → `LibraryWarmup.java`.
2. Paste the starter.
3. Fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-05-exercises
javac LibraryWarmup.java
java LibraryWarmup
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-05-exercises
javac LibraryWarmup.java
java LibraryWarmup
```

**Verified (Windows):**

```text
Checkout success: true
Duplicate checkout: false
Available: [Clean Code]
Borrowed: {M101=Effective Java}
```

### Step 3 — Test an unavailable title

Add before `printStatus()`:

```java
System.out.println(
        "Missing title: "
        + library.checkout("M102", "Unknown Book"));
```

Expected: `false`, and neither collection changes.

### Step 4 — Explain mutation order

Add to `notes.md`:

> The map is updated only after the title was successfully removed from the available list. Updating the map first could record a loan for an unavailable title and leave inconsistent state.

### Step 5 — Identify full-lab improvements

This warm-up intentionally simplifies the domain. Lab 5 will improve it with:

- `Book` and `Member` objects instead of raw strings;
- immutable IDs;
- separate uniqueness sets;
- borrow/return history;
- search, sorting, and reports.

## Expected result

First checkout succeeds, the same member’s second checkout fails, and the title appears in exactly one current-state structure.

## If it fails

| Problem | Fix |
| ------- | --- |
| Title appears available and borrowed | Remove it from list before map update |
| Missing title enters the map | Check `availableTitles.remove(title)` result |
| Same member receives two active titles | Check `containsKey(memberId)` first |
| Map order differs with more entries | `HashMap` order is unspecified |
| `illegal start of expression` near `_____` | Replace every blank with real Java — blanks are not valid code |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | First checkout is `true`; duplicate member checkout is `false` | Pass / Fail |
| 2 | Final list and map match verified output | Pass / Fail |
| 3 | Unavailable-title test leaves state unchanged | Pass / Fail |
| 4 | You can state the checkout invariant | Pass / Fail |

---

## Next

Exercises 1–7 complete → open **one** OS how-to → [`../lab5/LAB-5-WINDOWS.md`](../lab5/LAB-5-WINDOWS.md) or [`../lab5/LAB-5-MACOS.md`](../lab5/LAB-5-MACOS.md) → then graded [`../lab5/LAB-5-GUIDE.md`](../lab5/LAB-5-GUIDE.md) (builds on these seven; separate folder `examples/Lab5-LibraryManagement/` with `src/com/academy/library/`).

Bring your Exercise 6 collection-choice notes and Exercise 7 invariant explanation to the Lab 5 core checkpoint.
