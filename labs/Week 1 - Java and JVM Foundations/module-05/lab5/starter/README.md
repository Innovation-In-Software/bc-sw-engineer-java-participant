# Lab 5 starter — 45-minute timed path

Domain classes (`Book`, `Member`, `BorrowRecord`, `BookComparator`) and `Main` are mostly given. Fill `borrowBook` / `returnBook` / report TODOs. Do **not** open `../solution/` first.

## Activity card

| | |
| --- | --- |
| **Objective** | Complete borrow/return Map invariants + report TODOs |
| **Skills practiced** | List catalog + Map loans + summary / popular category |
| **Expected outcome** | Smoke path prints Borrowed / Popular Category / Thank You |
| **Estimated time** | ~45 minutes |
| **Files** | Packaged suite under `Lab5-LibraryManagement/src/com/academy/library/` |

**Boilerplate reduced:** Domain models, menu `Main`, and add/register helpers are given — focus on loan Map logic and reports.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-5-GUIDE.md`](../LAB-5-GUIDE.md)

## Target copy path

`~/java-bootcamp/examples/Lab5-LibraryManagement/`

### Windows PowerShell

```powershell
$src = "<path-to-course-repo>\labs\Week 1 - Java and JVM Foundations\module-05\lab5\starter\Lab5-LibraryManagement"
$dst = "$env:USERPROFILE\java-bootcamp\examples\Lab5-LibraryManagement"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
Copy-Item "$src\*" $dst -Recurse -Force
cd $dst
```

### macOS / bash

```bash
SRC="<path-to-course-repo>/labs/Week 1 - Java and JVM Foundations/module-05/lab5/starter/Lab5-LibraryManagement"
DST="$HOME/java-bootcamp/examples/Lab5-LibraryManagement"
mkdir -p "$DST"
cp -R "$SRC"/. "$DST"/
cd "$DST"
```

## 45-minute checklist (ordered TODOs)

1. Skim domain models + given `addBook` / `registerMember`.
2. Implement `LibraryService.borrowBook`.
3. Implement `LibraryService.returnBook`.
4. Implement `ReportService.displaySummaryReport`, `findMostPopularCategory` (export optional).
5. Smoke test; evidence under `notes/screenshots/lab-5/`.

## Smoke test

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

Interactive path: add book `101` / category `Programming` → register member `1` → borrow → reports → exit.

**Expected output snippet:**

```text
Book Borrowed Successfully
Reports
Books : 1
Borrowed : 1
...
Most Popular Category : Programming
Thank You
```

## Timed-path Pass criteria

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Project compiles | |
| 2 | Borrow / return / reports work | |
| 3 | Evidence under `notes/screenshots/lab-5/` | |

> Full GUIDE steps remain for homework / extended work.
