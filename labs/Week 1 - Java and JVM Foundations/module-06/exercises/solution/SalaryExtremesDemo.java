import java.util.Comparator;
import java.util.List;

public class SalaryExtremesDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.sample();

        Comparator<Employee> bySalary =
                Comparator.comparingDouble(Employee::salary);

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
