# Exercise 4 — Find the Highest and Lowest Salary

**Module 6** · Pre-lab practice · then open [`../lab6/LAB-6-GUIDE.md`](../lab6/LAB-6-GUIDE.md)
**Folder:** `examples/module-06-exercises/` ([setup](EXERCISES-INDEX.md))

## Goal

Create `SalaryExtremesDemo.java`. Use one salary comparator with `max` and
`min`, then handle each potentially empty result explicitly.

## Key idea

`max` and `min` return `Optional<Employee>` because an empty list has no
highest or lowest employee. `orElseThrow()` converts the optional result into
an `Employee` when this known sample is non-empty.

## Starter / reference (with line comments)

```java
import java.util.Comparator;
import java.util.List;

public class SalaryExtremesDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        // One comparator defines ascending salary order.
        Comparator<Employee> bySalary =
                Comparator.comparingDouble(Employee::salary);

        // max/min are terminal reductions and may have no result for empty input.
        Employee highest = employees.stream()
                .max(bySalary)
                .orElseThrow();

        Employee lowest = employees.stream()
                .min(bySalary)
                .orElseThrow();

        System.out.printf("Highest: %s - %.0f%n",
                highest.name(), highest.salary());
        System.out.printf("Lowest: %s - %.0f%n",
                lowest.name(), lowest.salary());
    }
}
```

## Steps

### Step 1 — Predict using the comparator

**Why:** A comparator is easier to trust when you can state the expected order
before the code runs.

List the employees in ascending salary order. The first should be the `min`
result and the last should be the `max` result.

### Step 2 — Compile and run

**Why:** One shared comparator proves `min` and `max` are opposite ends of the
same ordering.

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-06-exercises
javac Employee.java EmployeeData.java SalaryExtremesDemo.java
java SalaryExtremesDemo
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-06-exercises
javac Employee.java EmployeeData.java SalaryExtremesDemo.java
java SalaryExtremesDemo
```

**Expected output:**

```text
Highest: Diana - 90000
Lowest: Evan - 55000
```

### Step 3 — Observe the empty-input contract

**Why:** `Optional` exists because an empty source has no highest or lowest
employee.

Create an empty list temporarily:

```java
List<Employee> empty = List.of();
System.out.println(empty.stream().max(bySalary));
```

Expected:

```text
Optional.empty
```

Do not call `orElseThrow()` on that intentionally empty stream unless you also
catch the expected `NoSuchElementException`. Remove the temporary check after
you understand the result.

## Expected result

Diana is the maximum-salary employee and Evan is the minimum-salary employee.
You can explain why the terminal operations return `Optional<Employee>`.

## If it fails

| Problem | Fix |
| ------- | --- |
| Highest and lowest are reversed | Use `.max(bySalary)` for highest and `.min(bySalary)` for lowest |
| `Comparator` is unknown | Add `import java.util.Comparator;` |
| `NoSuchElementException` | Do not use `orElseThrow()` on an empty list |
| Salary compares as text | Use `comparingDouble(Employee::salary)`, not a formatted salary string |

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Highest output is Diana — 90000 | Pass / Fail |
| 2 | Lowest output is Evan — 55000 | Pass / Fail |
| 3 | The same comparator is reused for both reductions | Pass / Fail |
| 4 | You can explain the purpose of `Optional` here | Pass / Fail |
