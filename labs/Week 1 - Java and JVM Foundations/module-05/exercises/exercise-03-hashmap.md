# Exercise 3 — Working with `HashMap`

**Module 5** · Pre-lab practice · finish all 7 Pass, then OS how-to → [`../lab5/LAB-5-GUIDE.md`](../lab5/LAB-5-GUIDE.md)  
**Folder:** `examples/module-05-exercises/` ([setup](EXERCISES-INDEX.md))

![Java Collections: HashMap and TreeMap](../../../lab_diagrams/mod05-ex03-hashmap.png)

## Goal

Create `MapDemo.java` using ISBN-like strings as keys and copy counts as values. Practice put, get, update, remove, default lookup, and entry iteration.

## Starter (fill in the TODOs)

Paste this skeleton, then replace each `_____` and `// TODO` with working code. Do **not** leave TODOs in your finished file.

```java
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        // TODO: declare Map<String, Integer> copies as new HashMap<>()
        Map<String, Integer> copies = _____;

        // TODO: put three ISBN → copy-count mappings
        //   key = String ISBN, value = Integer count
        //   copies.put("ISBN-JAVA", 3);   // NOT put(3, "ISBN-JAVA")
        //   "ISBN-JAVA" -> 3, "ISBN-CLEAN" -> 2, "ISBN-TEST" -> 4
        _____
        _____
        _____

        System.out.println(
                "Java copies: " + copies.get("ISBN-JAVA"));

        // TODO: update "ISBN-JAVA" to 5 (same key replaces old value)
        _____

        // TODO: remove "ISBN-CLEAN"
        _____

        System.out.println(
                "Updated Java copies: "
                + copies.get("ISBN-JAVA"));
        // TODO: Missing ISBN blank — use getOrDefault so absent keys print 0, not null
        //   copies.getOrDefault("ISBN-MISSING", 0)
        System.out.println(
                "Missing ISBN: "
                + _____);

        // TODO: iterate entrySet — print each key -> value on its own line
        for (Map.Entry<String, Integer> entry
                : copies.entrySet()) {
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue());
        }

        // TODO: print deterministic key-sorted snapshot with new TreeMap<>(copies)
        System.out.println(
                "Sorted snapshot: " + _____);
    }
}
```

## Operation guide

| Operation | Result |
| --------- | ------ |
| `put(key, value)` | **Adds** if key is new; **updates** if key already exists |
| `get(key)` | Value, or `null` if absent |
| `getOrDefault(key, default)` | Value, or your fallback when the key is absent |
| `remove(key)` | Removes mapping |
| `entrySet()` | Key-value entries for iteration |

**Type order matters:** `Map<String, Integer>` means `put(String key, Integer value)` — ISBN first, count second.

Map keys are unique; values do not need to be unique.

## Steps

### Step 1 — Create `MapDemo.java`

**Why:** Lab 5 maps book IDs to members and tracks copy counts with `Map`.

1. **New → File** → `MapDemo.java`.
2. Paste the starter.
3. Fill every `_____` / `// TODO`. Save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-05-exercises
javac MapDemo.java
java MapDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-05-exercises
javac MapDemo.java
java MapDemo
```

**Verified values (entry order may differ):**

```text
Java copies: 3
Updated Java copies: 5
Missing ISBN: 0
ISBN-TEST -> 4
ISBN-JAVA -> 5
Sorted snapshot: {ISBN-JAVA=5, ISBN-TEST=4}
```

### Step 3 — Explain replacement

`put("ISBN-JAVA", 5)` does not create a duplicate key. It changes that key’s value from `3` to `5`.

### Step 4 — Fill the “Missing ISBN” blank (`get` vs `getOrDefault`)

**Why this trips people up:** `get` and `getOrDefault` look similar, but they behave differently when the key is **not** in the map.

| Call | Key missing? | What prints |
| ---- | ------------ | ----------- |
| `copies.get("ISBN-MISSING")` | yes | `null` |
| `copies.getOrDefault("ISBN-MISSING", 0)` | yes | `0` |
| `copies.get("ISBN-JAVA")` | no (key exists) | `5` (the real value) |

**Do this:**

1. In the starter blank for `Missing ISBN:`, put:

```java
copies.getOrDefault("ISBN-MISSING", 0)
```

so the line becomes:

```java
System.out.println(
        "Missing ISBN: "
        + copies.getOrDefault("ISBN-MISSING", 0));
```

2. Optionally, for learning only, temporarily add:

```java
System.out.println(copies.get("ISBN-MISSING")); // prints null
```

then **delete** that temporary line before you finish.

**Expected line in the program output:**

```text
Missing ISBN: 0
```

Not `Missing ISBN: null`.

## Expected result

The Java count updates to `5`, the clean-code key is removed, and the sorted snapshot contains two mappings.

## If it fails

| Problem | Fix |
| ------- | --- |
| `incompatible types: int cannot be converted to String` | Arguments are swapped — use `put("ISBN-JAVA", 3)`, not `put(3, "ISBN-JAVA")` |
| `Missing ISBN: null` | Blank used `get`; switch to `getOrDefault(..., 0)` |
| Expected exact `HashMap` order | Only the `TreeMap` snapshot has sorted-key order |
| Missing lookup causes unboxing NPE | Use `getOrDefault` or test `containsKey` |
| Duplicate ISBN appears | A map cannot hold duplicate equal keys; `put` replaces |
| `illegal start of expression` near `_____` | Replace every blank with real Java — blanks are not valid code |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Java count changes from `3` to `5` | Pass / Fail |
| 2 | Missing ISBN safely reports `0` | Pass / Fail |
| 3 | You can explain key uniqueness and unspecified order | Pass / Fail |
