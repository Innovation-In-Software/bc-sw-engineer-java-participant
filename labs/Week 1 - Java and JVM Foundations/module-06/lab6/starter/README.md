# Lab 6 starter — 45-minute timed path

`Employee` and `EmployeeData` are given. Fill stream pipelines in `EmployeeService` / `ReportService`. Do **not** open `../solution/` first.

## Activity card

| | |
| --- | --- |
| **Objective** | Complete filter/map/group/reduce TODOs + dashboard |
| **Skills practiced** | Stream pipelines, Collectors, Optional, menu wiring |
| **Expected outcome** | Menu 1 → 8 dashboard Average Salary **100680** → 9 Thank You |
| **Estimated time** | ~45 minutes |
| **Files** | Packaged suite under `Lab6-EmployeeAnalytics/src/com/academy/analytics/` |

**Boilerplate reduced:** Domain model + seed data + menu `Main` are given — focus on service/report stream TODOs.

Pacing: [`../../PACING.md`](../../PACING.md) · Full steps: [`../LAB-6-GUIDE.md`](../LAB-6-GUIDE.md)

## Target copy path

`~/java-bootcamp/examples/Lab6-EmployeeAnalytics/`

### Windows PowerShell

```powershell
$src = "<path-to-course-repo>\labs\Week 1 - Java and JVM Foundations\module-06\lab6\starter\Lab6-EmployeeAnalytics"
$dst = "$env:USERPROFILE\java-bootcamp\examples\Lab6-EmployeeAnalytics"
New-Item -ItemType Directory -Force -Path $dst | Out-Null
Copy-Item "$src\*" $dst -Recurse -Force
cd $dst
```

### macOS / bash

```bash
SRC="<path-to-course-repo>/labs/Week 1 - Java and JVM Foundations/module-06/lab6/starter/Lab6-EmployeeAnalytics"
DST="$HOME/java-bootcamp/examples/Lab6-EmployeeAnalytics"
mkdir -p "$DST"
cp -R "$SRC"/. "$DST"/
cd "$DST"
```

## 45-minute checklist (ordered TODOs)

1. Implement `displayAllEmployees` + `displayActiveEmployees`.
2. Implement filters: high salary, IT, IT top performers.
3. Implement `displayReductions`, `displaySummaryStatistics`, `getTopSalaries`.
4. Implement `findTopPerformer`, `findDepartmentWithHighestAverageSalary`.
5. Implement `ReportService.displayDashboard` (menu 8).
6. Smoke test menus 1 → 8 → 9; evidence under `notes/screenshots/lab-6/`.

## Smoke test

```powershell
javac -d out `
  src\com\academy\analytics\Employee.java `
  src\com\academy\analytics\EmployeeData.java `
  src\com\academy\analytics\EmployeeService.java `
  src\com\academy\analytics\ReportService.java `
  src\com\academy\analytics\Main.java
java -cp out com.academy.analytics.Main
```

Interactive path: `1` (list) → `8` (dashboard) → `9` (exit).

**Expected output snippet:**

```text
Total Employees : 25
...
Average Salary : 100680
...
Thank You
```

## Timed-path Pass criteria

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Project compiles | |
| 2 | Menu 1 + dashboard (8) produce expected stats | |
| 3 | Evidence under `notes/screenshots/lab-6/` | |

> Full GUIDE steps (all demos / bonus) remain for homework / extended work.
