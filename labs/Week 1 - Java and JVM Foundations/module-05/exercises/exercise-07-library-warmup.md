# Exercise 7 — Library Collections Warm-up

**Module 5** · Pre-lab practice · then open [`../lab5/LAB-5-GUIDE.md`](../lab5/LAB-5-GUIDE.md)  
**Folder:** `examples/module-05-exercises/` ([setup](EXERCISES-INDEX.md))

> **Bridge to Lab 5:** Coordinate two collections around one checkout rule without yet building the full library application.

## Goal

Create `LibraryWarmup.java` with:

- a `List<String>` of available titles;
- a `Map<String,String>` from member ID to borrowed title;
- a checkout operation that keeps both structures consistent.

## Starter / reference

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryWarmup {
    private final List<String> availableTitles =
            new ArrayList<>();
    private final Map<String, String> borrowedByMember =
            new HashMap<>();

    public LibraryWarmup() {
        availableTitles.add("Effective Java");
        availableTitles.add("Clean Code");
    }

    boolean checkout(String memberId, String title) {
        // Simplified rule: one active title per member.
        if (borrowedByMember.containsKey(memberId)) {
            return false;
        }

        // remove returns false when title is unavailable.
        if (!availableTitles.remove(title)) {
            return false;
        }

        // Update map only after list removal succeeds.
        borrowedByMember.put(memberId, title);
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

### Step 1 — Compile and run

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

### Step 2 — Test an unavailable title

Add before `printStatus()`:

```java
System.out.println(
        "Missing title: "
        + library.checkout("M102", "Unknown Book"));
```

Expected: `false`, and neither collection changes.

### Step 3 — Explain mutation order

Add to `notes.md`:

> The map is updated only after the title was successfully removed from the available list. Updating the map first could record a loan for an unavailable title and leave inconsistent state.

### Step 4 — Identify full-lab improvements

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

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | First checkout is `true`; duplicate member checkout is `false` | Pass / Fail |
| 2 | Final list and map match verified output | Pass / Fail |
| 3 | Unavailable-title test leaves state unchanged | Pass / Fail |
| 4 | You can state the checkout invariant | Pass / Fail |
