# Lab 6 Reference Solution — Employee Analytics System

Instructor reference only. Students should write these files themselves **after** completing Module 6 Exercises 1–7, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab6-EmployeeAnalytics`
* macOS / Linux: `~/java-bootcamp/examples/Lab6-EmployeeAnalytics`

Do not confuse with flat exercise sources in `examples/module-06-exercises/`.

**Participant path reminder:** IntelliJ opens `java-bootcamp`; compile/run from `Lab6-EmployeeAnalytics` (project root). Mark `src` as Sources Root.

## Pass criteria

| Path | Required |
| ---- | -------- |
| **Timed classroom** | Menus **1 → 8 → 9** with dashboard **Average Salary : 100680**; screenshots under `notes/screenshots/lab-6/` |
| **CORE complete** | All menus **1–9** work (2–7 may be homework after timed smoke) |
| **Extended** | Bonus menus **10–21** after CORE |

## What the starter leaves for students

Already given: `Employee`, `EmployeeData` (25-row seed), `Main` menu wiring.

**CORE TODOs (still throw `UnsupportedOperationException` until filled):**

| Menu | Methods |
| ---- | ------- |
| 1 | `displayAllEmployees` |
| 2 | `displayGroupedEmployees` |
| 3 | `displayReductions`, `displaySummaryStatistics`, `displayPartitionedEmployees` |
| 4 | `getTopPerformers`, `ReportService.displayTopPerformers` |
| 5 | `displayHighestPaidEmployeeOptional` |
| 6 | `getDepartmentStatistics`, `ReportService.displayDepartmentStatistics` |
| 7 | `displayActiveEmployees` |
| 8 | `displayDashboard` + `findTopPerformer`, `findDepartmentWithHighestAverageSalary`, `getTopSalaries` |

**Bonus / demo (menus 10–21):** starter prints `Bonus / full-path feature — implement after CORE` so explorers do not crash.

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

## Expected smoke transcript

Timed classroom path: menu `1` (list) → `8` (dashboard) → `9` (exit).

```text
Total Employees : 25
Employee List
...
=============================
Employee Analytics Dashboard
=============================
Employees : 25
Average Salary : 100680
Highest Salary : <seed max>
Lowest Salary : <seed min>
Departments : <distinct count>
Top Performer : <name> (Rating <n>)
Highest Paid Department : <department>
Top 5 Highest Salaries
1 <name> - <salary>
...
Active Employees : <count>
Inactive Employees : <count>
Thank You
```

**Verification anchor:** with the solution `EmployeeData` seed, **Average Salary : 100680** (printf `%.0f`).

### Dashboard fields (menu 8)

| Field | Source |
| ----- | ------ |
| Employees | `employees.size()` |
| Average / Highest / Lowest Salary | `summarizingDouble(Employee::getSalary)` |
| Departments | distinct department count |
| Top Performer | `findTopPerformer()` (rating, then salary) |
| Highest Paid Department | `findDepartmentWithHighestAverageSalary()` |
| Top 5 Highest Salaries | `getTopSalaries(5)` |
| Active / Inactive Employees | `filter(Employee::isActive)` counts |

## Common mistakes

| Mistake | Fix |
| ------- | --- |
| Trying to fill all ~30 TODOs in 45 min | CORE menus 1–9 only; prioritize 1+8+9 in class |
| Bonus menu crashes | Starter stubs print Bonus — implement after CORE |
| Wrong average | Use solution seed; `summarizingDouble` / `getAverage()` with `%.0f` |
| Mutating employees in streams | Prefer non-mutating pipelines for reports |
| Parallel stream before CORE | Exercise 8 / bonus only after menus 1–9 |

## Clean

```powershell
Remove-Item -Recurse -Force out   # PowerShell
# rm -rf out                      # bash
```
