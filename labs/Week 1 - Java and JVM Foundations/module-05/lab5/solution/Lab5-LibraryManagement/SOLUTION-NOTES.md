# Lab 5 Reference Solution — Library Management System

Instructor reference only. Students should write these files themselves **after** completing Module 5 Exercises 1–7, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab5-LibraryManagement`
* macOS / Linux: `~/java-bootcamp/examples/Lab5-LibraryManagement`

Do not confuse with flat exercise sources in `examples/module-05-exercises/`.

**Participant path reminder:** IntelliJ opens `java-bootcamp`; compile/run from `Lab5-LibraryManagement` (project root).

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

Smoke path: add book `101` / category `Programming` → register member `1` → borrow → reports → exit.

**Expected snippet:** `Book Borrowed Successfully` · `Most Popular Category : Programming` · `Thank You`

## Clean

```powershell
Remove-Item -Recurse -Force out   # PowerShell
# rm -rf out                      # bash
# also remove library-report.txt if export was run
```
