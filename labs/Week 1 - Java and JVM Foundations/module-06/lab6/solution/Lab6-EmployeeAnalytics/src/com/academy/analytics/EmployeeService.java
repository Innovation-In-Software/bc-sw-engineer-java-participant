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
