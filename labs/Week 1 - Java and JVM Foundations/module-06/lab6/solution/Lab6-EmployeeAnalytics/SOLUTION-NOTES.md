# Lab 6 Reference Solution — Employee Analytics System

Instructor reference only. Students should write these files themselves **after** completing Module 6 Exercises 1–7, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab6-EmployeeAnalytics`
* macOS / Linux: `~/java-bootcamp/examples/Lab6-EmployeeAnalytics`

Do not confuse with flat exercise sources in `examples/module-06-exercises/`.

**Participant path reminder:** IntelliJ opens `java-bootcamp`; compile/run from `Lab6-EmployeeAnalytics` (project root).

## Files

| File | Role |
| ---- | ---- |
| `Employee.java` | Employee data model |
| `EmployeeData.java` | Sample dataset (25 employees) |
| `EmployeeService.java` | Stream pipelines and analytics |
| `ReportService.java` | Dashboard and business reports |
| `Main.java` | Menu-driven entry point |

All under `src/com/academy/analytics/`. Matches GUIDE **Expected files:** `examples/Lab6-EmployeeAnalytics/src/com/academy/analytics/*.java`

## How to compile and run

From this `Lab6-EmployeeAnalytics` directory (JDK 21 on `PATH`):

**Windows PowerShell:**

```powershell
javac -d out `
  src\com\academy\analytics\Employee.java `
  src\com\academy\analytics\EmployeeData.java `
  src\com\academy\analytics\EmployeeService.java `
  src\com\academy\analytics\ReportService.java `
  src\com\academy\analytics\Main.java
java -cp out com.academy.analytics.Main
```

**macOS / Linux:**

```bash
javac -d out src/com/academy/analytics/*.java
java -cp out com.academy.analytics.Main
```

Smoke path: menu `1` (list) → `8` (dashboard) → `9` (exit).

**Expected snippet:** `Average Salary : 100680` · `Thank You`

## Clean

```powershell
Remove-Item -Recurse -Force out   # PowerShell
# rm -rf out                      # bash
```
