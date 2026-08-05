# Lab 2 Reference Solution — Student Management System

Instructor reference only. Students should write these files themselves **after** completing Module 2 Exercises 1–7, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab2-JavaSyntax`
* macOS / Linux: `~/java-bootcamp/examples/Lab2-JavaSyntax`

Do not confuse with flat exercise sources in `examples/module-02-exercises/`.

**Participant path reminder:** IntelliJ opens `java-bootcamp`; guides stay in the participant course clone. Compile/run from `Lab2-JavaSyntax` (project root), not from `src/`.

## Pass criteria

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Project compiles to `out/` with JDK 21 | |
| 2 | Add / display / search / average / exit work | |
| 3 | Sample student `101` / `John` / `Java` / `91` produces average `91.00` | |
| 4 | Evidence under `notes/screenshots/lab-2/` | |

Timed path: `StudentManager` TODOs + core menus 1–5. Bonus menus 6–10 optional.

## Expected smoke transcript (core path)

Starter menu shows **1–10**; that is expected. Use only core choices for the timed path:

```text
Enter Choice : 1
Student ID : 101
Name : John
Course : Java
Marks : 91
Student Added Successfully.

Enter Choice : 2
... table row for 101 John Java 91.00 ...

Enter Choice : 4
Average Marks : 91.00

Enter Choice : 5
Thank You
```

Also verify Search (`3`) with `101` and a bad ID.

## What starter leaves for students

| File | Already done | Student fills |
| ---- | ------------ | ------------- |
| Package folders + `Main.java` | Menu loop 1–10 wired | Confirm only |
| `Student.java` | Fields, getters/setters, `display` | Skim — do not rewrite getters |
| `StudentManager.java` | Menu print, helpers `printStudentTable` / `findStudentIndex`, bonus stubs | `addStudent`, `displayStudents`, `searchStudent`, `calculateAverage` |

**Timed path:** skip GUIDE create Steps 1–5. Prefer helpers already in the starter — do not rebuild table formatting from scratch.

## Common mistakes

| Mistake | Fix |
| ------- | --- |
| Recreating packages/classes on timed path | Copy starter; fill TODOs only |
| Looping `i < students.length` | Loop `i < studentCount` |
| Mixing `nextInt` + `nextLine` | Prefer all-`nextLine` + parse |
| Ignoring starter menu lines 6–10 | Documented — optional; core is 1–5 |
| `*.java` glob fails in PowerShell | Name each source file in `javac` |
| Wrong main class | `java -cp out com.academy.student.Main` |

## Files

| File | Role |
| ---- | ---- |
| `src/com/academy/student/Student.java` | Student model (fields, getters, display, pass/fail) |
| `src/com/academy/student/StudentManager.java` | Array storage, add / display / search / average (+ bonus) |
| `src/com/academy/student/Main.java` | Menu-driven entry point |

Matches GUIDE **Expected files:** `examples/Lab2-JavaSyntax/src/com/academy/student/{Student,StudentManager,Main}.java`

## How to compile and run

From this `Lab2-JavaSyntax` directory (JDK 21 on `PATH`):

**Windows PowerShell:**

```powershell
javac -d out `
  src\com\academy\student\Student.java `
  src\com\academy\student\StudentManager.java `
  src\com\academy\student\Main.java
java -cp out com.academy.student.Main
```

**macOS / Linux:**

```bash
javac -d out src/com/academy/student/*.java
java -cp out com.academy.student.Main
```

Smoke path: add `101` / `John` / `Java` / `91` → display → search `101` → average → exit `5`.

**Expected snippet:** `Student Added Successfully.` · `Average Marks : 91.00` · `Thank You`

## Clean

```powershell
Remove-Item -Recurse -Force out   # PowerShell
# rm -rf out                      # bash
```
