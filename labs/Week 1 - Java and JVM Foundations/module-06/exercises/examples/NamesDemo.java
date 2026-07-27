import java.util.List;

public class NamesDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        // map changes the element type: Employee -> String.
        // Employee::name is equivalent to employee -> employee.name().
        List<String> names = employees.stream()
                .map(employee -> employee.name().toUpperCase())
                .toList();

        System.out.println("Employee names:");
        names.forEach(System.out::println);
    }
}