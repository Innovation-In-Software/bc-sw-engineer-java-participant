# Lab 6 — Complete reference solution

> **Finished project.** Attempt the starter first, then compare.
>
> Guide: [`../LAB-6-GUIDE.md`](../LAB-6-GUIDE.md)

## Goal

**Employee analytics streams**

## How to run

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
# Copy this solution folder contents into your lab6 project, then:
cd Lab6-EmployeeAnalytics
# compile/run Main per LAB-6-GUIDE
```

## Complete Java sources (5 files)

### `Lab6-EmployeeAnalytics/src/com/academy/analytics/Employee.java`

```java
package com.academy.analytics;

public class Employee {

    private String employeeId;
    private String name;
    private String department;
    private double salary;
    private int experience;
    private int rating;
    private boolean active;

    public Employee(String employeeId, String name, String department, double salary,
                    int experience, int rating, boolean active) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
        this.rating = rating;
        this.active = active;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %s | $%.0f | %d yrs | Rating %d | %s",
                employeeId, name, department, salary, experience, rating,
                active ? "Active" : "Inactive");
    }
}
```

### `Lab6-EmployeeAnalytics/src/com/academy/analytics/EmployeeData.java`

```java
package com.academy.analytics;

import java.util.ArrayList;
import java.util.List;

public final class EmployeeData {

    private EmployeeData() {
    }

    public static List<Employee> createSampleEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("E001", "John Smith", "IT", 165000, 12, 5, true));
        employees.add(new Employee("E002", "Alice Johnson", "Finance", 152000, 10, 5, true));
        employees.add(new Employee("E003", "David Lee", "Sales", 149000, 14, 4, true));
        employees.add(new Employee("E004", "Sarah Brown", "IT", 141000, 9, 5, true));
        employees.add(new Employee("E005", "Michael Chen", "Marketing", 138000, 11, 4, true));
        employees.add(new Employee("E006", "Emily Davis", "HR", 92000, 7, 4, true));
        employees.add(new Employee("E007", "Robert Wilson", "IT", 118000, 8, 4, true));
        employees.add(new Employee("E008", "Laura Martinez", "Finance", 99000, 6, 3, true));
        employees.add(new Employee("E009", "James Taylor", "Sales", 87000, 5, 3, true));
        employees.add(new Employee("E010", "Olivia Anderson", "Marketing", 76000, 4, 4, true));
        employees.add(new Employee("E011", "Daniel Thomas", "HR", 68000, 3, 3, true));
        employees.add(new Employee("E012", "Sophia Jackson", "IT", 132000, 13, 5, true));
        employees.add(new Employee("E013", "William White", "Finance", 105000, 9, 4, true));
        employees.add(new Employee("E014", "Ava Harris", "Sales", 94000, 6, 4, true));
        employees.add(new Employee("E015", "Ethan Clark", "Marketing", 72000, 2, 3, true));
        employees.add(new Employee("E016", "Mia Lewis", "HR", 61000, 2, 2, true));
        employees.add(new Employee("E017", "Noah Walker", "IT", 98000, 7, 4, true));
        employees.add(new Employee("E018", "Isabella Hall", "Finance", 84000, 5, 3, true));
        employees.add(new Employee("E019", "Liam Allen", "Sales", 58000, 1, 2, true));
        employees.add(new Employee("E020", "Charlotte Young", "Marketing", 54000, 1, 3, true));
        employees.add(new Employee("E021", "Benjamin King", "IT", 124000, 10, 4, true));
        employees.add(new Employee("E022", "Amelia Wright", "HR", 48000, 1, 2, false));
        employees.add(new Employee("E023", "Lucas Scott", "Finance", 112000, 8, 4, true));
        employees.add(new Employee("E024", "Harper Green", "Sales", 101000, 7, 5, true));
        employees.add(new Employee("E025", "Henry Adams", "Marketing", 89000, 6, 3, false));

        return employees;
    }
}
```

### `Lab6-EmployeeAnalytics/src/com/academy/analytics/EmployeeService.java`

```java
package com.academy.analytics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeService {

    private final List<Employee> employees;

    public EmployeeService(List<Employee> employees) {
        this.employees = new ArrayList<>(employees);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void displayAllEmployees() {
        System.out.println("Total Employees : " + employees.size());
        System.out.println("Employee List");
        employees.stream().forEach(System.out::println);
    }

    public void demonstrateLambdas() {
        System.out.println("--- Lambda Expressions ---");
        System.out.println("Names:");
        employees.forEach(employee -> System.out.println(employee.getName()));

        System.out.println("Salaries:");
        employees.forEach(employee -> System.out.printf("$%.0f%n", employee.getSalary()));

        System.out.println("Departments:");
        employees.forEach(employee -> System.out.println(employee.getDepartment()));
    }

    public void demonstrateFunctionalInterfaces() {
        Predicate<Employee> highEarner = employee -> employee.getSalary() > 100_000;
        Function<Employee, String> employeeSummary = employee ->
                employee.getName() + " (" + employee.getDepartment() + ")";
        Consumer<Employee> printRating = employee ->
                System.out.println(employee.getName() + " - Rating " + employee.getRating());
        Supplier<Employee> topSample = () -> employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);

        System.out.println("--- Functional Interfaces ---");
        System.out.println("High earners:");
        employees.stream().filter(highEarner).map(Employee::getName).forEach(System.out::println);

        System.out.println("Summaries:");
        employees.stream().map(employeeSummary).limit(5).forEach(System.out::println);

        System.out.println("Ratings (first 5):");
        employees.stream().limit(5).forEach(printRating);

        Employee sample = topSample.get();
        System.out.println("Supplier sample (highest paid): " + sample);
    }

    public void demonstrateStreamSources() {
        System.out.println("--- Stream Sources ---");
        System.out.println("From List:");
        employees.stream().map(Employee::getName).limit(5).forEach(System.out::println);

        Employee[] employeeArray = employees.toArray(new Employee[0]);
        System.out.println("From Array:");
        java.util.Arrays.stream(employeeArray).map(Employee::getName).limit(5).forEach(System.out::println);

        Set<Employee> employeeSet = new HashSet<>(employees);
        System.out.println("From Set:");
        employeeSet.stream().map(Employee::getName).limit(5).forEach(System.out::println);
    }

    public void displayHighSalaryEmployees() {
        System.out.println("Employees with salary > 80000:");
        employees.stream()
                .filter(employee -> employee.getSalary() > 80_000)
                .forEach(System.out::println);
    }

    public void displayItEmployees() {
        System.out.println("IT Department:");
        employees.stream()
                .filter(employee -> "IT".equalsIgnoreCase(employee.getDepartment()))
                .forEach(System.out::println);
    }

    public void displayActiveEmployees() {
        System.out.println("Active Employees:");
        employees.stream()
                .filter(Employee::isActive)
                .forEach(System.out::println);
    }

    public void displayFilteredItTopPerformers() {
        System.out.println("IT employees with salary > 90000 and rating >= 4:");
        employees.stream()
                .filter(employee -> "IT".equalsIgnoreCase(employee.getDepartment()))
                .filter(employee -> employee.getSalary() > 90_000)
                .filter(employee -> employee.getRating() >= 4)
                .forEach(System.out::println);
    }

    public void demonstrateMapping() {
        System.out.println("Mapped Names:");
        employees.stream().map(Employee::getName).limit(8).forEach(System.out::println);

        System.out.println("Mapped Salaries:");
        employees.stream().map(Employee::getSalary).limit(8).forEach(System.out::println);

        System.out.println("Mapped Departments:");
        employees.stream().map(Employee::getDepartment).limit(8).forEach(System.out::println);
    }

    public void demonstrateSorting() {
        System.out.println("Salary Ascending:");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .limit(5)
                .forEach(System.out::println);

        System.out.println("Salary Descending:");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(5)
                .forEach(System.out::println);

        System.out.println("Name Ascending:");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .limit(5)
                .forEach(System.out::println);

        System.out.println("Experience Descending:");
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getExperience).reversed())
                .limit(5)
                .forEach(System.out::println);
    }

    public void displayDistinctDepartments() {
        System.out.println("Unique Departments:");
        employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    public void displayTopAndNextSalaries() {
        Comparator<Employee> bySalaryDesc = Comparator.comparingDouble(Employee::getSalary).reversed();

        System.out.println("Top 5 Highest Salaries:");
        employees.stream()
                .sorted(bySalaryDesc)
                .limit(5)
                .forEach(employee -> System.out.printf("%s - $%.0f%n",
                        employee.getName(), employee.getSalary()));

        System.out.println("Next 5 Highest Salaries:");
        employees.stream()
                .sorted(bySalaryDesc)
                .skip(5)
                .limit(5)
                .forEach(employee -> System.out.printf("%s - $%.0f%n",
                        employee.getName(), employee.getSalary()));
    }

    public void displayCounts() {
        long total = employees.size();
        long itCount = employees.stream()
                .filter(employee -> "IT".equalsIgnoreCase(employee.getDepartment()))
                .count();
        long activeCount = employees.stream().filter(Employee::isActive).count();
        long highSalaryCount = employees.stream()
                .filter(employee -> employee.getSalary() > 100_000)
                .count();

        System.out.println("Total Employees : " + total);
        System.out.println("IT Employees : " + itCount);
        System.out.println("Active Employees : " + activeCount);
        System.out.println("Employees with Salary > 100000 : " + highSalaryCount);
    }

    public void displayReductions() {
        Optional<Double> highest = employees.stream().map(Employee::getSalary).reduce(Double::max);
        Optional<Double> lowest = employees.stream().map(Employee::getSalary).reduce(Double::min);
        double total = employees.stream().mapToDouble(Employee::getSalary).sum();
        double average = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);

        System.out.println("Highest Salary : " + highest.orElse(0.0));
        System.out.println("Lowest Salary : " + lowest.orElse(0.0));
        System.out.printf("Total Salary : %.0f%n", total);
        System.out.printf("Average Salary : %.0f%n", average);
    }

    public void demonstrateCollectors() {
        List<Employee> employeeList = employees.stream()
                .filter(Employee::isActive)
                .collect(Collectors.toList());

        Set<String> departments = employees.stream()
                .map(Employee::getDepartment)
                .collect(Collectors.toSet());

        Map<String, List<Employee>> byDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Collected active employees : " + employeeList.size());
        System.out.println("Collected departments : " + departments);
        System.out.println("Grouped by department keys : " + byDepartment.keySet());
    }

    public void displayGroupedEmployees() {
        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        grouped.forEach((department, departmentEmployees) -> {
            System.out.println(department);
            departmentEmployees.forEach(employee -> System.out.println("  " + employee.getName()));
        });
    }

    public void displayPartitionedEmployees() {
        Map<Boolean, List<Employee>> partitioned = employees.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary() > 100_000));

        System.out.println("Salary > 100000 (True):");
        partitioned.get(true).forEach(employee -> System.out.println("  " + employee.getName()));

        System.out.println("Salary <= 100000 (False):");
        partitioned.get(false).forEach(employee -> System.out.println("  " + employee.getName()));
    }

    public void displaySummaryStatistics() {
        DoubleSummaryStatistics stats = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Highest Salary : " + stats.getMax());
        System.out.println("Lowest Salary : " + stats.getMin());
        System.out.println("Average Salary : " + stats.getAverage());
        System.out.println("Total Salary : " + stats.getSum());
        System.out.println("Employee Count : " + stats.getCount());
    }

    public void displayHighestPaidEmployeeOptional() {
        Optional<Employee> highestPaid = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        highestPaid.ifPresentOrElse(
                employee -> System.out.println("Highest Paid Employee : " + employee.getName()
                        + " ($" + (int) employee.getSalary() + ")"),
                () -> System.out.println("No Employee Found")
        );
    }

    public Optional<Employee> findHighestPaidEmployee() {
        return employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
    }

    public Optional<Employee> findTopPerformer() {
        return employees.stream()
                .max(Comparator.comparingInt(Employee::getRating)
                        .thenComparingDouble(Employee::getSalary));
    }

    public List<Employee> getTopSalaries(int count) {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(count)
                .toList();
    }

    public List<Employee> getTopPerformers(int minimumRating) {
        return employees.stream()
                .filter(employee -> employee.getRating() >= minimumRating)
                .sorted(Comparator.comparingInt(Employee::getRating).reversed()
                        .thenComparing(Comparator.comparingDouble(Employee::getSalary).reversed()))
                .toList();
    }

    public Map<String, DoubleSummaryStatistics> getDepartmentStatistics() {
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summarizingDouble(Employee::getSalary)));
    }

    public Optional<Double> findSecondHighestSalary() {
        return employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    }

    public Optional<Employee> findEmployeeWithLongestName() {
        return employees.stream()
                .max(Comparator.comparingInt(employee -> employee.getName().length()));
    }

    public Optional<String> findDepartmentWithHighestAverageSalary() {
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public Map<String, Long> generateSalaryHistogram() {
        return employees.stream()
                .collect(Collectors.groupingBy(this::salaryBucket, Collectors.counting()));
    }

    public String collectEmployeeSummary() {
        Collector<Employee, StringBuilder, String> summaryCollector = Collector.of(
                StringBuilder::new,
                (builder, employee) -> builder.append(employee.getName())
                        .append("(")
                        .append(employee.getDepartment())
                        .append("), "),
                (left, right) -> left.append(right),
                StringBuilder::toString
        );

        return employees.stream().collect(summaryCollector);
    }

    private String salaryBucket(Employee employee) {
        double salary = employee.getSalary();
        if (salary < 60_000) {
            return "40K-60K";
        }
        if (salary < 80_000) {
            return "60K-80K";
        }
        if (salary < 100_000) {
            return "80K-100K";
        }
        return "100K+";
    }
}
```

### `Lab6-EmployeeAnalytics/src/com/academy/analytics/Main.java`

```java
package com.academy.analytics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService(EmployeeData.createSampleEmployees());
        ReportService reportService = new ReportService(employeeService);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            String choiceInput = scanner.nextLine().trim();

            if (choiceInput.isEmpty()) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println("----------------------------------");

            switch (choice) {
                case 1 -> employeeService.displayAllEmployees();
                case 2 -> reportService.displayEmployeesByDepartment();
                case 3 -> reportService.displaySalaryReport();
                case 4 -> reportService.displayTopPerformers();
                case 5 -> reportService.displayHighestSalary();
                case 6 -> reportService.displayDepartmentStatistics();
                case 7 -> reportService.displayActiveEmployees();
                case 8 -> reportService.displayDashboard();
                case 9 -> {
                    System.out.println("Thank You");
                    scanner.close();
                    return;
                }
                case 10 -> employeeService.demonstrateLambdas();
                case 11 -> employeeService.demonstrateFunctionalInterfaces();
                case 12 -> employeeService.demonstrateStreamSources();
                case 13 -> employeeService.displayHighSalaryEmployees();
                case 14 -> employeeService.displayFilteredItTopPerformers();
                case 15 -> employeeService.demonstrateMapping();
                case 16 -> employeeService.demonstrateSorting();
                case 17 -> employeeService.displayDistinctDepartments();
                case 18 -> employeeService.displayTopAndNextSalaries();
                case 19 -> employeeService.displayCounts();
                case 20 -> employeeService.demonstrateCollectors();
                case 21 -> reportService.displayBonusInsights();
                default -> System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }

    private static void displayMenu() {
        System.out.println("=====================================");
        System.out.println("Employee Analytics");
        System.out.println("=====================================");
        System.out.println("1 Display Employees");
        System.out.println("2 Employees By Department");
        System.out.println("3 Salary Report");
        System.out.println("4 Top Performers");
        System.out.println("5 Highest Salary");
        System.out.println("6 Department Statistics");
        System.out.println("7 Active Employees");
        System.out.println("8 Dashboard");
        System.out.println("9 Exit");
        System.out.println("10 Lambda Demo");
        System.out.println("11 Functional Interface Demo");
        System.out.println("12 Stream Sources Demo");
        System.out.println("13 High Salary Filter (>80000)");
        System.out.println("14 IT High Performers Filter");
        System.out.println("15 Mapping Demo");
        System.out.println("16 Sorting Demo");
        System.out.println("17 Distinct Departments");
        System.out.println("18 Top/Next 5 Salaries");
        System.out.println("19 Employee Counts");
        System.out.println("20 Collectors Demo");
        System.out.println("21 Bonus Insights");
        System.out.print("Choice : ");
    }
}
```

### `Lab6-EmployeeAnalytics/src/com/academy/analytics/ReportService.java`

```java
package com.academy.analytics;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ReportService {

    private final EmployeeService employeeService;

    public ReportService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void displayDashboard() {
        List<Employee> employees = employeeService.getEmployees();
        DoubleSummaryStatistics stats = employees.stream()
                .collect(java.util.stream.Collectors.summarizingDouble(Employee::getSalary));

        long departmentCount = employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .count();

        long activeCount = employees.stream().filter(Employee::isActive).count();
        long inactiveCount = employees.size() - activeCount;

        Optional<Employee> topPerformer = employeeService.findTopPerformer();
        Optional<String> highestPaidDepartment = employeeService.findDepartmentWithHighestAverageSalary();
        List<Employee> topSalaries = employeeService.getTopSalaries(5);

        System.out.println("=============================");
        System.out.println("Employee Analytics Dashboard");
        System.out.println("=============================");
        System.out.println("Employees : " + employees.size());
        System.out.printf("Average Salary : %.0f%n", stats.getAverage());
        System.out.printf("Highest Salary : %.0f%n", stats.getMax());
        System.out.printf("Lowest Salary : %.0f%n", stats.getMin());
        System.out.println("Departments : " + departmentCount);

        topPerformer.ifPresent(employee ->
                System.out.println("Top Performer : " + employee.getName() + " (Rating " + employee.getRating() + ")"));

        highestPaidDepartment.ifPresent(department ->
                System.out.println("Highest Paid Department : " + department));

        System.out.println("Top 5 Highest Salaries");
        for (int i = 0; i < topSalaries.size(); i++) {
            Employee employee = topSalaries.get(i);
            System.out.printf("%d %s - %.0f%n", i + 1, employee.getName(), employee.getSalary());
        }

        System.out.println("Active Employees : " + activeCount);
        System.out.println("Inactive Employees : " + inactiveCount);
    }

    public void displayEmployeesByDepartment() {
        employeeService.displayGroupedEmployees();
    }

    public void displaySalaryReport() {
        employeeService.displayReductions();
        System.out.println();
        employeeService.displaySummaryStatistics();
        System.out.println();
        employeeService.displayPartitionedEmployees();
    }

    public void displayTopPerformers() {
        System.out.println("Top Performers (Rating >= 4):");
        employeeService.getTopPerformers(4).forEach(System.out::println);
    }

    public void displayHighestSalary() {
        employeeService.displayHighestPaidEmployeeOptional();
    }

    public void displayDepartmentStatistics() {
        Map<String, DoubleSummaryStatistics> stats = employeeService.getDepartmentStatistics();
        stats.forEach((department, departmentStats) -> {
            System.out.println(department);
            System.out.printf("  Count   : %d%n", departmentStats.getCount());
            System.out.printf("  Average : %.0f%n", departmentStats.getAverage());
            System.out.printf("  Max     : %.0f%n", departmentStats.getMax());
            System.out.printf("  Min     : %.0f%n", departmentStats.getMin());
        });
    }

    public void displayActiveEmployees() {
        employeeService.displayActiveEmployees();
    }

    public void displayBonusInsights() {
        System.out.println("--- Bonus Insights ---");

        employeeService.findSecondHighestSalary().ifPresentOrElse(
                salary -> System.out.printf("Second Highest Salary : %.0f%n", salary),
                () -> System.out.println("Second Highest Salary : Not available")
        );

        employeeService.findEmployeeWithLongestName().ifPresent(employee ->
                System.out.println("Longest Name : " + employee.getName()));

        employeeService.findDepartmentWithHighestAverageSalary().ifPresent(department ->
                System.out.println("Highest Average Salary Department : " + department));

        System.out.println("Salary Histogram:");
        employeeService.generateSalaryHistogram().forEach((bucket, count) ->
                System.out.println(bucket + " : " + count));

        System.out.println("Custom Collector Summary:");
        System.out.println(employeeService.collectEmployeeSummary());
    }
}
```

## Notes

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


