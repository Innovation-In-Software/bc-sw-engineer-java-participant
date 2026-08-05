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
