# Lab 5 Reference Solution — Library Management System

Instructor reference only. Students should write these files themselves **after** completing Module 5 Exercises 1–7, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab5-LibraryManagement`
* macOS / Linux: `~/java-bootcamp/examples/Lab5-LibraryManagement`

Do not confuse with flat exercise sources in `examples/module-05-exercises/`.

**Participant path reminder:** IntelliJ opens `java-bootcamp`; compile/run from `Lab5-LibraryManagement` (project root). Mark `src` as Sources Root.

## Pass criteria

| Path | Required |
| ---- | -------- |
| **Timed (~45 min)** | `borrowBook` + `returnBook` + `displaySummaryReport` / `findMostPopularCategory`; smoke path below; evidence under `notes/screenshots/lab-5/` |
| **Full / extended** | Timed criteria plus search/sort polish; optional history, top borrowed, **export**, **performance** bonuses |

## What the starter leaves for students

Already given: `Book`, `Member`, `BorrowRecord`, `BookComparator`, `Main`, add/register/display helpers, category insights, history/top-borrowed display helpers.

**Core TODOs (must implement — still throw until filled):**

* `LibraryService.borrowBook`
* `LibraryService.returnBook`
* `ReportService.displaySummaryReport`
* `ReportService.findMostPopularCategory`

**Bonus stubs (print message — do not crash timed explorers):**

* `exportReportToFile` / menu 17 Export Report
* `runPerformanceComparison` / menu 14

## Files

| File | Role |
| ---- | ---- |
| `Book.java` | Book model (`Comparable` by title) |
| `Member.java` | Member model |
| `BorrowRecord.java` | Borrow history entry |
| `BookComparator.java` | Price (and multi-field) sorting |
| `LibraryService.java` | Catalog, loans (`HashMap`), borrow/return |
| `ReportService.java` | Summary / popular category / export |
| `Main.java` | Menu-driven entry point |

All under `src/com/academy/library/`. Matches GUIDE **Expected files:** `examples/Lab5-LibraryManagement/src/com/academy/library/*.java`

## How to compile and run

From this `Lab5-LibraryManagement` directory (JDK 21 on `PATH`):

**Windows PowerShell:**

```powershell
javac -d out `
  src\com\academy\library\Book.java `
  src\com\academy\library\Member.java `
  src\com\academy\library\BorrowRecord.java `
  src\com\academy\library\BookComparator.java `
  src\com\academy\library\ReportService.java `
  src\com\academy\library\LibraryService.java `
  src\com\academy\library\Main.java
java -cp out com.academy.library.Main
```

**macOS / Linux:**

```bash
javac -d out src/com/academy/library/*.java
java -cp out com.academy.library.Main
```

## Expected smoke transcript

Interactive path (prompts in order):

1. Menu `1` → Book ID `101`, Title `Java Basics`, Author `Aman`, Category `Programming`, **Price `55`**
2. Menu `2` → Member ID `1`, Name `Riya`, Email `riya@test.com`, Phone `9999999999`
3. Menu `6` → Book `101`, Member `1`
4. Menu `10` → Reports
5. Menu `7` → Book `101` (optional)
6. Menu `11` → Exit

```text
Book Added Successfully
Member Registered Successfully
Book Borrowed Successfully
Reports
Books : 1
Borrowed : 1
Available : 0
Members : 1
Most Popular Category : Programming
Thank You
```

## Common mistakes

| Mistake | Fix |
| ------- | --- |
| Borrow without checking `borrowRecords` | Reject if book already loaned |
| Forget `setAvailable(false/true)` | Keep Map and `Book.available` in sync |
| Popular category from empty TreeMap | Return `"N/A"` when no categories |
| Menu 17 crashes timed path | Starter export is a Bonus stub — implement later |
| Compiling with wrong cwd | Run `javac` / `java` from `Lab5-LibraryManagement` |

## Clean

```powershell
Remove-Item -Recurse -Force out   # PowerShell
# rm -rf out                      # bash
# also remove library-report.txt if export was run
```
