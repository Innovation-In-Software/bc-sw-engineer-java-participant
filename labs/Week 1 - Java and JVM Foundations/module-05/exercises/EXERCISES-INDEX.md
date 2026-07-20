# Module 5 — Pre-Lab Exercises

> **Start here for Module 5:** [`../README.md`](../README.md) · **Which file when?** [`../../../_PARTICIPANT-FILE-GUIDE.md`](../../../_PARTICIPANT-FILE-GUIDE.md)

**Module:** 5 — Java Collections Framework  
**Source:** Module 5 slides: Lab Overview (Java Collections)  
**Next (after all 7 exercises):** OS how-to → [`../lab5/LAB-5-WINDOWS.md`](../lab5/LAB-5-WINDOWS.md) or [`../lab5/LAB-5-MACOS.md`](../lab5/LAB-5-MACOS.md) → then [`../lab5/LAB-5-GUIDE.md`](../lab5/LAB-5-GUIDE.md)

> **When:** Complete these exercises **after the module slides** and **before** the full lab.  
> **Gate for Lab 5:** All **seven** exercises must be Pass.  
> **JDK:** 21 · **IDE:** IntelliJ Community (primary) or VS Code (optional).  
> Keep practice separate from the graded lab (`examples/Lab5-LibraryManagement/`).  
> `HashSet` and `HashMap` iteration order is unspecified; do not grade exact printed order.

## Already covered — do not redo

| Topic | Where you did it |
| ----- | ---------------- |
| Arrays and loops | Modules 1–2 |
| Classes, encapsulation, interfaces | Module 3 |
| Memory and object references | Module 4 |

Module 5 focuses on **choosing and operating collections**: ordered sequences, unique values, key-value lookup, safe iteration, and combining structures around domain rules.

## Collection decision guide

| Need | Interface | Typical implementation | Library example |
| ---- | --------- | ---------------------- | --------------- |
| Ordered, indexed items; duplicates allowed | `List` | `ArrayList` | Book catalog |
| Unique values | `Set` | `HashSet` | Registered book IDs |
| Unique values in sorted order | `Set` | `TreeSet` | Sorted categories |
| Key → value lookup | `Map` | `HashMap` | Book ID → member ID |
| Sorted keys | `Map` | `TreeMap` | Category → count report |

Prefer declaring the **interface** on the left:

```java
List<String> titles = new ArrayList<>();
Set<String> ids = new HashSet<>();
Map<String, Integer> copies = new HashMap<>();
```

## Workspace

| Item | Windows | macOS |
| ---- | ------- | ----- |
| Lab 0 workspace | `%USERPROFILE%\java-bootcamp` | `~/java-bootcamp` |
| Exercises folder | `%USERPROFILE%\java-bootcamp\examples\module-05-exercises` | `~/java-bootcamp/examples/module-05-exercises` |
| Shell | IntelliJ **Terminal** (PowerShell) | IntelliJ **Terminal** (zsh) |

### Setup — create the folder once

**Windows (PowerShell):**

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path examples\module-05-exercises | Out-Null
cd examples\module-05-exercises
pwd
```

**macOS (zsh/bash):**

```bash
cd ~/java-bootcamp
mkdir -p examples/module-05-exercises
cd examples/module-05-exercises
pwd
```

### IntelliJ file creation

Use **New → File**, enter the complete `.java` filename, save, and compile from the IntelliJ Terminal. Ignore the yellow *outside of module source root* banner. Do not mark the hyphenated exercises folder as Sources Root.

## Exercise index

Numbered to match the order these topics appear in the Module 5 slides — work in order.

| # | Exercise | New collection skill | File |
| - | -------- | -------------------- | ---- |
| 1 | Working with List | Ordered CRUD, index access, duplicates | [`exercise-01-arraylist.md`](exercise-01-arraylist.md) |
| 2 | Working with Set | Uniqueness and sorted views | [`exercise-02-hashset.md`](exercise-02-hashset.md) |
| 3 | Working with Map | Key-value CRUD and `entrySet` | [`exercise-03-hashmap.md`](exercise-03-hashmap.md) |
| 4 | Sorted Collections: TreeMap | Sorted keys, `firstKey()` / `lastKey()` | [`exercise-04-sorted-collections.md`](exercise-04-sorted-collections.md) |
| 5 | Safe Iteration | Remove through `Iterator` | [`exercise-05-iteration.md`](exercise-05-iteration.md) |
| 6 | Choose the Right Collection | Match requirements to structures | [`exercise-06-choose-collection.md`](exercise-06-choose-collection.md) |
| 7 | Library Warm-up | Coordinate a `List` and `Map` | [`exercise-07-library-warmup.md`](exercise-07-library-warmup.md) |

Work in order. Keep practice sources separate from the graded lab submission.

When all **seven** Pass criteria are **Pass**, open your OS how-to and then [`../lab5/LAB-5-GUIDE.md`](../lab5/LAB-5-GUIDE.md). Do not start Lab 5 GUIDE Steps mid-exercise list.
