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
        // ... add 20–30 total across IT, HR, Finance, Sales, Marketing
        // Include at least one inactive (active = false)
        employees.add(new Employee("E003", "David Lee", "IT", 149000, 11, 5, true));
        employees.add(new Employee("E004", "Sarah Brown", "Sales", 141000, 10, 5, true));
        employees.add(new Employee("E005", "Michael Chen", "Marketing", 138000, 9, 5, true));

        employees.add(new Employee("E006", "Robert Kim", "IT", 130000, 9, 4, true));
        employees.add(new Employee("E007", "Jennifer Patel", "IT", 118000, 8, 4, true));
        employees.add(new Employee("E008", "Daniel Wright", "IT", 96000, 6, 3, true));

        employees.add(new Employee("E009", "Laura Martinez", "Finance", 128000, 9, 4, true));
        employees.add(new Employee("E010", "Kevin Anderson", "Finance", 108000, 7, 4, true));
        employees.add(new Employee("E011", "Rachel Thompson", "Finance", 89000, 5, 3, true));
        employees.add(new Employee("E012", "Brian Walker", "Finance", 71000, 3, 2, true));

        employees.add(new Employee("E013", "Emily Davis", "Sales", 120000, 8, 4, true));
        employees.add(new Employee("E014", "Chris Turner", "Sales", 99000, 6, 3, true));
        employees.add(new Employee("E015", "Megan Foster", "Sales", 82000, 4, 3, true));
        employees.add(new Employee("E016", "Tyler Coleman", "Sales", 64000, 2, 2, true));

        employees.add(new Employee("E017", "Olivia Bennett", "Marketing", 112000, 8, 4, true));
        employees.add(new Employee("E018", "Nathan Ross", "Marketing", 94000, 6, 3, true));
        employees.add(new Employee("E019", "Grace Powell", "Marketing", 77000, 4, 2, true));
        employees.add(new Employee("E020", "Justin Reed", "Marketing", 59000, 2, 2, true));

        employees.add(new Employee("E021", "Amanda Hayes", "HR", 90000, 6, 3, true));
        employees.add(new Employee("E022", "Samuel Price", "HR", 68000, 4, 3, true));
        employees.add(new Employee("E023", "Victoria Long", "HR", 62000, 3, 2, true));
        employees.add(new Employee("E024", "Derek Simmons", "HR", 57000, 2, 2, false));
        employees.add(new Employee("E025", "Patricia Owens", "HR", 48000, 1, 1, false));


        return employees;
    }
}