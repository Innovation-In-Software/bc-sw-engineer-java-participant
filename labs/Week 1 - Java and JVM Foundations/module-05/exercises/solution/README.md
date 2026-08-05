# Module 5 exercise solutions (instructor only)

Complete reference implementations for the pre-lab exercises.

**Do not share with participants.** This folder is named `solution/` so `push-all.ps1` excludes it from the participant remote.

Flat folder + JDK 21 on `PATH`. `HashMap` iteration order is not guaranteed — prefer sorted / size / contains checks when grading.

## File map

| Exercise | File | Role |
| -------- | ---- | ---- |
| 1 Working with List | [`ArrayListDemo.java`](ArrayListDemo.java) | Runnable |
| 2 Working with Set | [`SetDemo.java`](SetDemo.java) | Runnable |
| 3 Working with Map | [`MapDemo.java`](MapDemo.java) | Runnable |
| 4 Sorted Collections | [`SortedMapDemo.java`](SortedMapDemo.java) | Runnable |
| 5 Safe Iteration | [`IteratorDemo.java`](IteratorDemo.java) | Runnable |
| 6 Choose the Right Collection | — | Analysis-only — `collection-choices.md` (no solution `.java`) |
| 7 Library Warm-up | [`LibraryWarmup.java`](LibraryWarmup.java) | Runnable |

## Compile and run (Windows PowerShell)

```powershell
javac ArrayListDemo.java SetDemo.java MapDemo.java SortedMapDemo.java IteratorDemo.java LibraryWarmup.java

java ArrayListDemo
java SetDemo
java MapDemo
java SortedMapDemo
java IteratorDemo
java LibraryWarmup
```

## Expected key output

| Demo | Key lines |
| ---- | --------- |
| `ArrayListDemo` | `Found Effective Java: true` · `Size: 3` · `0: Clean Architecture` · `1: Effective Java` · `2: Java Fundamentals` |
| `SetDemo` | `Added Java first time: true` · `Added Java second time: false` · `Unique count: 3` · `Contains Testing: true` · `Sorted view: [Databases, Java, Testing]` |
| `MapDemo` | `Java copies: 3` · `Updated Java copies: 5` · `Missing ISBN: 0` · `Sorted snapshot: {ISBN-JAVA=5, ISBN-TEST=4}` (raw `entrySet` order may vary) |
| `SortedMapDemo` | `TreeMap order: [Annihilation, Dune, The Hobbit]` · `First title: Annihilation` · `Last title: The Hobbit` (`HashMap order:` may vary) |
| `IteratorDemo` | `Remaining: [Java 21, Clean Code]` |
| `LibraryWarmup` | `Checkout success: true` · `Duplicate checkout: false` · `Available: [Clean Code]` · `Borrowed: {M101=Effective Java}` |

## Common mistakes

- Removing from a list inside a for-each — use `Iterator.remove()` as in `IteratorDemo`.
- Assuming `HashMap` key order is stable — grade `TreeMap` / values, not hash order.
- `List.remove(Object)` removes only the **first** matching element (`ArrayListDemo` keeps the second `"Java Fundamentals"`).

## Clean

```powershell
Remove-Item -Force *.class
```
