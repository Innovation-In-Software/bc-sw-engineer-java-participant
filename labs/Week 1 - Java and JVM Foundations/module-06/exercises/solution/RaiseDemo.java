import java.util.List;

public class RaiseDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        List<Double> proposedSalaries = employees.stream()
                .map(employee -> employee.salary() * 1.10)
                .toList();

        System.out.println("Proposed salaries:");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            double proposed = proposedSalaries.get(i);
            System.out.printf("%s: %.2f -> %.2f%n",
                    employee.name(), employee.salary(), proposed);
        }

        System.out.printf("Alice original salary: %.2f%n",
                employees.get(0).salary());
    }
}
