# Exercise 4 — Sorted Collections: `TreeMap`

**Module 5** · Pre-lab practice · then open [`../lab5/LAB-5-GUIDE.md`](../lab5/LAB-5-GUIDE.md)  
**Folder:** `examples/module-05-exercises/` ([setup](EXERCISES-INDEX.md))

> **Builds on Exercise 2:** You already used `new TreeSet<>(...)` to get a sorted view of a `Set`. `TreeMap` applies the same idea to key-value pairs.

## Goal

Create `SortedMapDemo.java`, store book prices in a `HashMap`, then build a `TreeMap` from it and compare iteration order.

## Starter / reference

```java
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        Map<String, Double> prices = new HashMap<>();
        prices.put("The Hobbit", 12.99);
        prices.put("Dune", 15.50);
        prices.put("Annihilation", 9.99);

        // HashMap order is unspecified.
        System.out.println("HashMap order: " + prices.keySet());

        // TreeMap sorts keys in natural (alphabetical) order.
        Map<String, Double> sortedPrices = new TreeMap<>(prices);
        System.out.println("TreeMap order: " + sortedPrices.keySet());

        // A TreeMap also gives you the smallest and largest key directly.
        TreeMap<String, Double> tree = new TreeMap<>(prices);
        System.out.println("First title: " + tree.firstKey());
        System.out.println("Last title: " + tree.lastKey());
    }
}
```

## `HashMap` vs `TreeMap`

| Property | `HashMap` | `TreeMap` |
| -------- | --------- | --------- |
| Key order | Unspecified | Natural sorted order (or a `Comparator`) |
| Lookup cost | Fast average-case | Tree-based, typically `O(log n)` |
| Extra methods | None beyond `Map` | `firstKey()`, `lastKey()`, `headMap()`, `tailMap()` |
| Use here | General-purpose lookup | A price list you want printed in order |

## Steps

### Step 1 — Create `SortedMapDemo.java`

Paste the starter code and save.

### Step 2 — Compile and run

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-05-exercises
javac SortedMapDemo.java
java SortedMapDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-05-exercises
javac SortedMapDemo.java
java SortedMapDemo
```

**Verified (Windows):**

```text
HashMap order: [Dune, The Hobbit, Annihilation]
TreeMap order: [Annihilation, Dune, The Hobbit]
First title: Annihilation
Last title: The Hobbit
```

(Your `HashMap order` line may print the three titles in a different sequence — that is expected and is exactly the point of Step 3.)

### Step 3 — Explain what is deterministic

Add to `notes.md`:

> `TreeMap` keys always iterate in sorted order — that part is guaranteed. `HashMap` key order is not a contract; it may differ between runs or JDK versions, so never depend on it for display order.

## Expected result

`TreeMap` prints titles alphabetically and reports the correct first/last title; `HashMap` order is not relied upon anywhere in your notes.

## If it fails

| Problem | Fix |
| ------- | --- |
| `cannot find symbol firstKey` | Declare the variable as `TreeMap<String, Double>`, not the `Map` interface, to use `TreeMap`-only methods |
| Both maps print the same order | Not a bug — with only 3 short keys this can coincidentally happen; trust the guarantee, not one run's output |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | `TreeMap` prints titles in alphabetical order | Pass / Fail |
| 2 | `firstKey()` / `lastKey()` print the correct titles | Pass / Fail |
| 3 | You can explain why `HashMap` order should never be relied upon | Pass / Fail |
