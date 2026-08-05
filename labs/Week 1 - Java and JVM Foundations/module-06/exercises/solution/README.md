# Module 6 exercise solutions (instructor only)

Complete reference implementations for the pre-lab exercises.

**Do not share with participants.** This folder is named `solution/` so `push-all.ps1` excludes it from the participant remote.

Flat folder + JDK 21 on `PATH`. Shared sample data: `Employee` + `EmployeeData.sample()` (Alice/Bob/Charlie/Diana/Evan).

## File map

| Exercise | File(s) | Role |
| -------- | ------- | ---- |
| 1 Lambda and Functional Interface | [`Employee.java`](Employee.java), [`EmployeeData.java`](EmployeeData.java), [`SalaryCheck.java`](SalaryCheck.java), [`LambdaDemo.java`](LambdaDemo.java) | `LambdaDemo` runnable |
| 2 Filter by Salary | [`FilterSalaryDemo.java`](FilterSalaryDemo.java) | Runnable |
| 3 List All Names | [`NamesDemo.java`](NamesDemo.java) | Runnable |
| 4 Highest and Lowest Salary | [`SalaryExtremesDemo.java`](SalaryExtremesDemo.java) | Runnable |
| 5 Map a 10% Raise | [`RaiseDemo.java`](RaiseDemo.java) | Runnable |
| 6 Count by Department | [`DepartmentCountDemo.java`](DepartmentCountDemo.java) | Runnable |
| 7 HR Department Names | [`HrNamesDemo.java`](HrNamesDemo.java) | Runnable |
| 8 `parallelStream` Bonus | [`ParallelStreamDemo.java`](ParallelStreamDemo.java) | Runnable |

No analysis-only exercises (every exercise has Java). Supporting types have no `main`.

## Compile and run (Windows PowerShell)

```powershell
javac Employee.java EmployeeData.java SalaryCheck.java LambdaDemo.java FilterSalaryDemo.java NamesDemo.java SalaryExtremesDemo.java RaiseDemo.java DepartmentCountDemo.java HrNamesDemo.java ParallelStreamDemo.java

java LambdaDemo
java FilterSalaryDemo
java NamesDemo
java SalaryExtremesDemo
java RaiseDemo
java DepartmentCountDemo
java HrNamesDemo
java ParallelStreamDemo
```

## Expected key output

| Demo | Key lines |
| ---- | --------- |
| `LambdaDemo` | `Employee: Alice` · `Anonymous result: true` · `Lambda result: true` |
| `FilterSalaryDemo` | `Employees above 60000:` · `Alice - 72000` · `Bob - 65000` · `Charlie - 80000` · `Diana - 90000` · `Source size: 5` · `Filtered size: 4` |
| `NamesDemo` | `Employee names:` then `Alice` … `Evan` |
| `SalaryExtremesDemo` | `Highest: Diana - 90000` · `Lowest: Evan - 55000` |
| `RaiseDemo` | `Alice: 72000.00 -> 79200.00` … `Evan: 55000.00 -> 60500.00` · `Alice original salary: 72000.00` |
| `DepartmentCountDemo` | `Finance: 1` · `HR: 2` · `IT: 2` (TreeMap order) |
| `HrNamesDemo` | `HR names: [Alice, Charlie]` |
| `ParallelStreamDemo` | `Sequential count: 4` · `Parallel count: 4` · `Timing conclusion: none from one tiny run` (ns / processor count vary) |

## Common mistakes

- Mutating source employees in the raise demo — solution maps to new doubles; Alice’s original stays `72000.00`.
- Forgetting to compile `Employee` / `EmployeeData` with each demo.
- Treating one tiny `parallelStream` timing as proof of speedup — counts must match; timings are not conclusive.

## Clean

```powershell
Remove-Item -Force *.class
```
